package ru.webapp.storage;

import ru.webapp.model.Resume;

import java.util.Collection;

/**
 * Created by Айслу on 12.09.2016.
 */
public class ArrayStorage implements IStorage {
    private Resume[] array = new Resume[100];

    @Override
    public void Clear() {

    }

    @Override
    public void save(Resume r) {

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
}