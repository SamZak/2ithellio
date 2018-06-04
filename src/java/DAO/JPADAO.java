/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Samib
 */
public abstract class JPADAO<T> implements DAO<T> {

    static final String nomPU = "2ithellioPU";
    static final EntityManagerFactory emf = Persistence.createEntityManagerFactory(nomPU);
    static final EntityManager em = emf.createEntityManager();

    public JPADAO() {
    }

    public boolean create(T obj) {
        final EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(obj);
            et.commit();
        } catch (Exception ex) {
            et.rollback();
            return false;
        }
        return true;
    }

    public T find(Integer id, Class c) {
        Class u = this.getClass();
        T obj = (T) em.find(c, id);

        return (obj);
    }

    public boolean update(T obj) {
        final EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.persist(obj);
            em.merge(obj);
            et.commit();
        } catch (Exception ex) {
            et.rollback();
            return false;
        }

        return true;
    }

    public boolean delete(T obj) {
        final EntityTransaction et = em.getTransaction();
        try {
            et.begin();
            em.remove(obj);
            et.commit();
        } catch (Exception ex) {
            et.rollback();
            return false;
        }

        return true;
    }

    public boolean deleteAll() {
        final EntityTransaction et = em.getTransaction();
        for (T obj : this.findAll()) {
            try {
                et.begin();
                em.remove(obj);
                et.commit();
            } catch (Exception ex) {
                et.rollback();
                return false;
            }
        }

        return true;
    }

    public void close() {
        em.close();
        emf.close();
    }
}
