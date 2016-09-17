package ru.webapp.storage;

import ru.webapp.model.Resume;

import java.util.*;

/**
 * Created by Айслу on 16.09.2016.
 */
public class MapStorage extends AbstractStorage {
   private Map<String, Resume> map = new HashMap<>();

    @Override
    protected void doClear() {
        map.clear();
    }

    @Override
    protected boolean exist(String uuid) {
        return map.get(uuid) != null;
    }

    @Override
    protected void doUpdate(Resume r) {
        map.put(r.getUuid(), r);
    }

    @Override
    protected Resume doLoad(String uuid) {
        return map.get(uuid);
    }

    @Override
    protected void doDelete(String uuid) {
        map.remove(uuid);
    }

    @Override
    protected List<Resume> doGetAll() {
        return new ArrayList<>(map.values());
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    protected void doSave(Resume r) {
        map.put(r.getUuid(), r);
    }
}
