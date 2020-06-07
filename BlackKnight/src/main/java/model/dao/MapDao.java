package model.dao;

import java.io.Serializable;
import java.util.List;
import model.entity.Map;
import org.hibernate.Session;
import javax.persistence.criteria.CriteriaQuery;

public class MapDao extends AbstractDao<Map> {

    @Override
    public Map findById(final Serializable id) {
        return super.findById(id);
    }

    @Override
    public Serializable save(Map map) {
        return super.save(map);
    }

    @Override
    public void saveOrUpdate(Map map) {
        super.saveOrUpdate(map);
    }

    @Override
    public void delete(Map map) {
        super.delete(map);
    }

    @Override
    public void deleteAll() {
        super.deleteAll();
    }

    @Override
    public List<Map> findAll() {
        return super.findAll();
    }

}
