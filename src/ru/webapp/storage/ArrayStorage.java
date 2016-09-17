package ru.webapp.storage;

import ru.webapp.WebAppException;
import ru.webapp.model.Resume;
import sun.rmi.runtime.Log;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Айслу on 12.09.2016.
 */
public class ArrayStorage extends AbstractStorage {
    private static final int LIMIT = 100;
    private Resume[] array = new Resume[LIMIT];
    private int size;

    @Override
    protected void doClear() {
        Arrays.fill(array, null);
        size = 0;
    }

    @Override
    protected boolean exist(String uuid) {
        return  getIndex(uuid) != -1;
    }

    @Override
    protected void doUpdate(Resume r) {
        int idx = getIndex(r.getUuid());
        if(idx == -1) throw new WebAppException("Resume " + r.getUuid() + "not exist", r);
        array[idx] = r;
    }

    @Override
    protected Resume doLoad(String uuid) {
        int idx = getIndex(uuid);
        return array[idx];
    }

    @Override
    protected void doDelete(String uuid) {
        int idx = getIndex(uuid);
        int numMoved = size - idx -1;
        if(numMoved > 0)
            System.arraycopy(array, idx + 1, array, idx, numMoved);
        array[--size] = null; // clear to let GC do its work
    }

    @Override
    protected void doSave(Resume r) {
        array[size++] = r;
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

    @Override
    protected List<Resume> doGetAll() {
        return Arrays.asList(Arrays.copyOf(array, size));
    }
}
