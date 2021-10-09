package com.amr.project.service.impl;


import com.amr.project.service.abstracts.ReadWriteService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public abstract class ReadWriteServiceImpl<T, ID> implements ReadWriteService<T, ID> {

    private final ReadWriteService<T, ID> readWriteDao;

    private ReadWriteServiceImpl(ReadWriteService<T, ID> readWriteDao) {
        this.readWriteDao = readWriteDao;
    }

    @Override
    @Transactional
    public void persist(T entity) {
        readWriteDao.persist(entity);
    }

    @Override
    @Transactional
    public void update(T entity) {
        readWriteDao.update(entity);
    }

    @Override
    @Transactional
    public void delete(T entity) {
        readWriteDao.delete(entity);
    }

    @Override
    @Transactional
    public void deleteByKeyCascadeEnable(Class<T> clazz, ID id) {
        readWriteDao.deleteByKeyCascadeEnable(clazz, id);
    }

    @Override
    @Transactional
    public void deleteByKeyCascadeIgnore(ID id) {
        readWriteDao.deleteByKeyCascadeIgnore(id);
    }

    @Override
    public boolean existsById(Class<T> clazz, ID id) {
        return readWriteDao.existsById(clazz, id);
    }

    @Override
    public Optional<T> getByKey(Class<T> clazz, ID id) {
        return readWriteDao.getByKey(clazz, id);
    }

    @Override
    public List<T> getAll(Class<T> clazz) {
        return readWriteDao.getAll(clazz);
    }
}
