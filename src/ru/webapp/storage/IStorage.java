package ru.webapp.storage;

import ru.webapp.model.Resume;

import java.util.Collection;

/**
 * Created by a.kuspakov on 12.09.2016.
 */
public interface IStorage {
    void clear();
    void save(Resume r);
    void update(Resume r);
    Resume load(String uuid);
    void delete(String uuid);
    Collection<Resume> getAllSorted();
    int size();
}
