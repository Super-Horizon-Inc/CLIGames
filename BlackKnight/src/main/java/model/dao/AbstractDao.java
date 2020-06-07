package model.dao;

import org.hibernate.Session;
import model.entity.Hibernate;
import org.hibernate.Transaction;

import javax.persistence.criteria.CriteriaQuery;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public abstract class AbstractDao<E> implements IDao<E> {

    private final Class<E> entityClass;

    public AbstractDao() {
//        for (Type test : ((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()) {
//            System.out.print(test);
//        }
        this.entityClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];


    }

    private Session getSession() {
        return Hibernate.getInstance().getSession();
    }

    // in java doc we should mention that we are defining id as final because we don't want to allow user
    // unintentionally reassign an id
    @Override
    public E findById(final Serializable id) {
        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();
        E entity = (E) session.get(this.entityClass, id);
        transaction.commit();
        return entity;
    }

    @Override
    public Serializable save(E entity) {
        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();
        Serializable serializable = session.save(entity);
        transaction.commit();
        return serializable;
    }

    @Override
    public void saveOrUpdate(E entity) {
        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(entity);
        transaction.commit();
    }

    @Override
    public void delete(E entity) {
        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();
        session.delete(entity);
        transaction.commit();
    }

    @Override
    public void deleteAll() {
        List<E> entities = this.findAll();
        for (E entity: entities) {
            this.getSession().delete(entity);
        }
    }

    @Override
    public List<E> findAll() {
        Session session = this.getSession();
        Transaction transaction = session.beginTransaction();
        CriteriaQuery entityQuery = session.getCriteriaBuilder().createQuery(this.entityClass);
        entityQuery.from(this.entityClass);
        List<E> entities = session.createQuery(entityQuery).getResultList();
        transaction.commit();
        return entities;
    }

}
