/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xtesoft.samples.services;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

/**
 *
 * @author xtecuan
 */
public class BaseService<T> {

    private Class<T> type;

    @PersistenceContext
    protected EntityManager entityManager;

    public BaseService() {
    }

    public BaseService(Class<T> type) {
        this.type = type;
    }

    public Class<T> getType() {
        return type;
    }

    public void setType(Class<T> type) {
        this.type = type;
    }

    @Transactional
    public T save(T entity) {
        this.entityManager.persist(entity);
        this.entityManager.flush();
        this.entityManager.refresh(entity);
        return entity;
    }

    @Transactional
    public T update(T entity) {
        return this.entityManager.merge(entity);
    }

    @Transactional
    public T find(Long id) {
        if (id == null) {
            return null;
        }
        return this.entityManager.find(this.type, id);
    }

    @Transactional
    public T find(Class<T> type, Object id) {
        if (id == null) {
            return null;
        }
        return this.entityManager.find(type, id);
    }

    @Transactional
    public void delete(Long id) {

        T entity = this.find(id);

        this.entityManager.remove(entity);

        this.entityManager.flush();
    }

}
