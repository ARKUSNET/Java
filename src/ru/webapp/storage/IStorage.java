package ru.webapp.storage;

import ru.webapp.model.Resume;

import java.util.Collection;

/**
 * Created by Айслу on 11.09.2016.
 */
public interface IStorage {
    void Clear();
    void save(Resume r);
    void  update(Resume r);
    Resume load(String uuid);
    void delete(String uuid);
    Collection<Resume> getAllSorted();
    int size=0;
}
