package core.model;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * A class for Skills of Main Character of the game.
 */
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min = 1, max = 20)
    private String name;

    public Skill() {

    }

    public Skill(String name)
    {
        this.name = name;
    }

    /**
     * Getter method for id field.
     * @return an integer number which is Skill id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter method for id field. This method can also be used as a combination of getter and setter.
     * @param id an integer number which is assigned to Skill id.
     * @return First, assign id parameter to Skill id. Then, return an integer which is Skill id.
     */
    public int setId(int id) {
        return this.id = id;
    }

    /**
     * Getter method for name field.
     * @return a string which is Skill name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for name field. This method can also be used as a combination of getter and setter.
     * @param name a string which is assigned to Skill name.
     * @return First, assign name parameter to Skill name. Then, return a string which is Skill name.
     */
    public String setName(String name) {
        return this.name = name;
    }
    
}
