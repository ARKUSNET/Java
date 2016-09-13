package ru.webapp.storage;

import ru.webapp.model.Resume;

import java.util.Collection;

/**
 * Created by Айслу on 12.09.2016.
 */
public class ArrayStorage implements IStorage {
    private static final int LIMIT = 100;

    private Resume[] array = new Resume[LIMIT];
    int idx = 0;

    @Override
    public void Clear() {

    }

    @Override
    public void save(Resume r) {
        int idx = -1;
        for(int i = 0; i < LIMIT; i++){
            Resume resume = array[i];
            if(resume != null){
                if(r.equals(resume)){
                    throw new IllegalStateException("Already present");
                }
            } else  if (idx == -1){
                idx = i;
            }
        }
        array[idx] = r;
        for(int i = 0; i < LIMIT; i++){
            if(array[i] == null){
                array[i] = r;
            }
        }
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
}
