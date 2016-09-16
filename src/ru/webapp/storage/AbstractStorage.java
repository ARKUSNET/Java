package ru.webapp.storage;

import ru.webapp.model.Resume;

import java.util.logging.Logger;

/**
 * Created by Айслу on 16.09.2016.
 */
abstract public class AbstractStorage implements IStorage {
    protected Logger logger = Logger.getLogger(getClass().getName());

    @Override
    public void save(Resume r) {
        logger.info("Save resume with uuid = " + r.getUuid());
        // TODO try to move exception treatment
        doSave(r);
    }

    protected abstract void doSave(Resume r);
}
