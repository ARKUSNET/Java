package ru.webapp.storage;

import ru.webapp.model.Resume;

import java.util.Collection;

/**
 * Created by Айслу on 16.09.2016.
 */
public class MapStorageTest extends AbstractStorage {

    @Override
    public void Clear() {

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

    @Override
    protected void doSave(Resume r) {

    }
}
