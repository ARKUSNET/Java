package ru.webapp.storage;

import ru.webapp.WebAppException;
import ru.webapp.model.Resume;

import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Айслу on 12.09.2016.
 */
public class ArrayStorage implements IStorage {
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
    public void update(Resume r) {

    }

    @Override
    public Resume load(String uuid) {
        return null;
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    public int size() {
        return 0;
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
