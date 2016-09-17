package ru.webapp.storage;

import ru.webapp.WebAppException;
import ru.webapp.model.Resume;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/**
 * Created by Айслу on 16.09.2016.
 */
abstract public class AbstractStorage implements IStorage {
    protected Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void Clear() {
         logger.info("Delete all resumes");
        doClear();
    }

    protected abstract void doClear();

    protected abstract boolean exist(String uuid);

    @Override
    public void update(Resume r) {
        logger.info("Update resume with " + r.getUuid());
        if(!exist(r.getUuid())){
            throw new WebAppException("Resume " + r.getUuid() + "not exist", r);
        }
        doUpdate(r);
    }

    protected abstract void doUpdate(Resume r);

    @Override
    public Resume load(String uuid) {
        logger.info("Load resume with uuid = " + uuid);
        if(!exist(uuid)){
            throw new WebAppException("Resume " + uuid + "not exist", uuid);
        }
        return doLoad(uuid);
    }

    protected abstract Resume doLoad(String uuid);

    @Override
    public void delete(String uuid) {
        logger.info("Delete resume with uuid = " + uuid);
        if(!exist(uuid)){
            throw new WebAppException("Resume " + uuid + "not exist", uuid);
        }
        doDelete(uuid);
    }

    protected abstract void doDelete(String uuid);

    @Override
    public Collection<Resume> getAllSorted() {
        logger.info("getAllSorted");
        List<Resume> list = doGetAll();
        Collections.sort(list);
        return list;
        //return Collections.singletonList(new Resume());
    }

    protected abstract List<Resume> doGetAll();

    public abstract int size();

   @Override
    public void save(Resume r) {
         logger.info("Save resume with uuid = " + r.getUuid());
        if(exist(r.getUuid())){
            throw new WebAppException("Resume " + r.getUuid() + "already exist", r);
        }
        doSave(r);
    }

    protected abstract void doSave(Resume r);
}
