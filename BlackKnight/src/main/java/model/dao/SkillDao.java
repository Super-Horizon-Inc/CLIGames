package model.dao;

import java.io.Serializable;
import java.util.List;
import model.entity.Skill;
import org.hibernate.Session;
import javax.persistence.criteria.CriteriaQuery;

public class SkillDao extends AbstractDao<Skill> {

    @Override
    public Skill findById(final Serializable id) {
        return super.findById(id);
    }

    @Override
    public Serializable save(Skill skill) {
        return super.save(skill);
    }

    @Override
    public void saveOrUpdate(Skill skill) {
        super.saveOrUpdate(skill);
    }

    @Override
    public void delete(Skill skill) {
        super.delete(skill);
    }

    @Override
    public void deleteAll() {
        super.deleteAll();
    }

    @Override
    public List<Skill> findAll() {
        return super.findAll();
    }

}
