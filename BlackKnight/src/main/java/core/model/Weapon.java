package core.model;

import javax.persistence.*;
import javax.validation.constraints.*;

/**
 * A class for Weapons of Characters of the game.
 */
@Entity
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //@Column(length = 20)
    @Size(min = 1, max = 20)
    private String name;

    //@Column(length = 10)
    @Size(min = 1, max = 20)
    private String type;

    /**
     * Getter method for id field.
     * @return an integer number which is Weapon id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter method for id field. This method can also be used as a combination of getter and setter.
     * @param id an integer number which is assigned to Weapon id.
     * @return First, assign id parameter to Weapon id. Then, return an integer which is Weapon id.
     */
    public int setId(int id) {
        return this.id = id;
    }

    /**
     * Getter method for name field.
     * @return a string which is Weapon name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for name field. This method can also be used as a combination of getter and setter.
     * @param name a string which is assigned to Weapon name.
     * @return First, assign name parameter to Weapon name. Then, return a string which is Weapon name.
     */
    public String setName(String name) {
        return this.name = name;
    }

    /**
     * Getter method for type field.
     * @return a string which is Weapon type.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter method for type field. This method can also be used as a combination of getter and setter.
     * @param type a string which is assigned to Weapon type.
     * @return First, assign name parameter to Weapon type. Then, return a string which is Weapon type.
     */
    public String setType(String type) {
        return this.type = type;
    }

}
