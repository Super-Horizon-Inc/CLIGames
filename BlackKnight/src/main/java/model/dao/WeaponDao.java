package model.dao;

import java.io.Serializable;
import java.util.List;
import model.entity.Weapon;
import org.hibernate.Session;
import javax.persistence.criteria.CriteriaQuery;

public class WeaponDao extends AbstractDao<Weapon> {

    @Override
    public Weapon findById(final Serializable id) {
        return super.findById(id);
    }

    @Override
    public Serializable save(Weapon weapon) {
        return super.save(weapon);
    }

    @Override
    public void saveOrUpdate(Weapon weapon) {
        super.saveOrUpdate(weapon);
    }

    @Override
    public void delete(Weapon weapon) {
        super.delete(weapon);
    }

    @Override
    public void deleteAll() {
        super.deleteAll();
    }

    @Override
    public List<Weapon> findAll() {
        return super.findAll();
    }

}
