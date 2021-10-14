package com.amr.project.dao.abstracts;

import java.util.List;
import java.util.Optional;

/**
 * Basic Dao interface
 *
 * @param <T>  Jpa Entity Class
 * @param <ID> Jpa Entity PRIMARY KEY Class
 * @author dubining
 */
public interface ReadWriteDao<T, ID> {
    /**
     * transitioning an instance from transient to persistent state
     *
     * @param entity Jpa Entity to persist
     */
    void persist(T entity);

    /**
     * update a persistent entity instance with new field values from a detached entity instance
     *
     * @param entity Jpa Entity to update
     */
    void update(T entity);

    /**
     * delete a persistent entity instance
     *
     * @param entity Jpa Entity to delete
     */
    void delete(T entity);

    /**
     * delete a persistent entity instance by PRIMARY KEY and all OneToOne relations
     *
     * @param clazz Jpa Entity Class
     * @param id    PRIMARY KEY
     */
    void deleteByKeyCascadeEnable(Class<T> clazz, ID id);

    /**
     * delete <b>only</b> persistent entity instance by PRIMARY KEY
     *
     * @param clazz Jpa Entity Class
     * @param id    PRIMARY KEY
     */
    void deleteByKeyCascadeIgnore(Class<T> clazz, ID id);

    /**
     * check if the entity exists by PRIMARY KEY
     *
     * @param clazz Jpa Entity Class
     * @param id    PRIMARY KEY
     * @return <b>true</b> if it exists and <b>false</b> otherwise
     */
    boolean existsById(Class<T> clazz, ID id);

    /**
     * get the entity by PRIMARY KEY
     *
     * @param clazz Jpa Entity Class
     * @param id    PRIMARY KEY
     * @return Optional with entity if it exists and empty Optional otherwise
     */
    Optional<T> getByKey(Class<T> clazz, ID id);

    /**
     * get all the entities
     * @param clazz Jpa Entity Class
     * @return List of entities
     */
    List<T> getAll(Class<T> clazz);
}
