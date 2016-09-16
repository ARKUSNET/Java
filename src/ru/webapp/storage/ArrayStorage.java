package ru.webapp.storage;

import ru.webapp.WebAppException;
import ru.webapp.model.Resume;
import sun.rmi.runtime.Log;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Айслу on 12.09.2016.
 */
public class ArrayStorage extends AbstractStorage {
    private static final int LIMIT = 100;
    //protected Logger LOGGER = Logger.getLogger(getClass().getName());
    private static Logger LOGGER = Logger.getLogger(ArrayStorage.class.getName());
    private Resume[] array = new Resume[LIMIT];
    private int size;

    @Override
    public void Clear(){
        LOGGER.info("Delete all resumes.");
        Arrays.fill(array, null);
        size = 0;
    }

    @Override
    public void save(Resume r) {
        LOGGER.info("Save resume with uuid = " + r.getUuid());
        int idx = getIndex(r.getUuid());
        if(idx != -1) {
            /*try {
                throw new WebAppException("Resume " + r.getUuid() + "already exist", r);
            } catch (WebAppException e) {
                LOGGER.log(Level.SEVERE, e.getMessage(), e);
            }*/
            throw  new WebAppException("Resume" + r.getUuid() + "already exist", r);
        }
        array[size++] = r;
    }

    @Override
    protected void doSave(Resume r) {

    }

    @Override
    public void update(Resume r) {
        LOGGER.info("Update resume with " + r.getUuid());
        int idx = getIndex(r.getUuid());
        if(idx == -1) throw new WebAppException("Resume " + r.getUuid() + "not exist", r);
        array[idx] = r;
    }

    @Override
    public Resume load(String uuid) {
        LOGGER.info("Load resume with uuid = " + uuid);
        int idx = getIndex(uuid);
        if(idx == -1) throw new WebAppException("Resume " + uuid + "not exist");
        return array[idx];
    }

    @Override
    public void delete(String uuid) {
        LOGGER.info("Delete resume with uuid = " + uuid);
        int idx = getIndex(uuid);
        if(idx == -1) throw new WebAppException("Resume " + uuid + "not exist");
        int numMoved = size - idx -1;
        if(numMoved > 0)
            System.arraycopy(array, idx + 1, array, idx, numMoved);
        array[--size] = null; // clear to let GC do its work
    }

    @Override
    public Collection<Resume> getAllSorted() {
        Arrays.sort(array, 0, size);
        return Arrays.asList(Arrays.copyOf(array, size));
    }

    @Override
    public int size() {
        return size;
    }

    private int getIndex(String uuid){
        for(int i = 0; i < LIMIT; i++){
            if(array[i] != null){
                if(array[i].getUuid().equals(uuid)){
                    return i;
                }
            }
        }
        return -1;
    }
}
