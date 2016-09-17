package ru.webapp.storage;

import ru.webapp.model.Resume;

import java.util.Collection;
import java.util.List;

/**
 * Created by Айслу on 16.09.2016.
 */
public class CollectionStorage extends AbstractStorage {
    @Override
    public void Clear() {

    }

    @Override
    protected void doClear() {

    }

    @Override
    protected boolean exist(String uuid) {
        return false;
    }

    @Override
    public void update(Resume r) {

    }

    @Override
    protected void doUpdate(Resume r) {

    }

    @Override
    public Resume load(String uuid) {
        return null;
    }

    @Override
    protected Resume doLoad(String uuid) {
        return null;
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    protected void doDelete(String uuid) {

    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    protected List<Resume> doGetAll() {
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
