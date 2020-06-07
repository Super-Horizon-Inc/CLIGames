package model.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import model.entity.Character;
import org.hibernate.Session;
import javax.persistence.criteria.CriteriaQuery;

// this method is for implementing dao of hierarchy entities using Generic Wildcard
public class CharacterDao extends AbstractDao<Character> {

    @Override
    public Character findById(final Serializable id) {
        return super.findById(id);
    }

    @Override
    public Serializable save(Character character) {
        return super.save(character);
    }

    @Override
    public void saveOrUpdate(Character character) {
        super.saveOrUpdate(character);
    }

    @Override
    public void delete(Character character) {
        super.delete(character);
    }

    @Override
    public void deleteAll() {
        super.deleteAll();
    }

    @Override
    public List<Character> findAll() {
        return super.findAll();
    }

}
