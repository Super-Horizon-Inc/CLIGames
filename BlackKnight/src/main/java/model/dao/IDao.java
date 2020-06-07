package model.dao;

import java.io.Serializable;
import java.util.List;

public interface IDao<T> {
    Serializable save(T entity);
    void saveOrUpdate(T entity);
    void delete(T entity);
    void deleteAll();
    List<T> findAll();
    T findById(Serializable id);
    //void open();
//    void openSession();
//    void openSessionWithTransaction();
//    void clear();
//    void flush();
    //void close();
//    void closeSession();
//    void closeSessionWithTransaction();
}
