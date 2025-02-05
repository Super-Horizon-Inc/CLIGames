package model.entity;

import org.hibernate.annotations.DiscriminatorFormula;
import javax.persistence.*;
import java.util.*;
import javax.validation.constraints.*;

/**
 * An abstract class for holding common fields, and actions of MainCharacter and Monster classes.
 */
@Entity
// Hibernate Hierarchy Mapping per Table Association Annotations Example
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorFormula("case when gold is null then 'MainCharacter' else 'Monster' end")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @PositiveOrZero
    private Short health;

    @Positive
    private Short characterLevel;

    @Size(min = 1, max = 50)
    private String name;

    @NotNull
    private Position position;

    @NotNull
    private String image;

    // Hibernate One-to-Many Association on Join Table Annotations Example
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Character_Weapons",
            joinColumns = @JoinColumn(name = "Character_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "Weapon_Id", referencedColumnName = "Id")
    )
    private Set<Weapon> weapons;

    public Character() {
        // used to set default values since Hibernate nor JPA supports setting column default value
        this.health = (short)100;
    }

    /**
     * Getter method for id field.
     * @return an integer number which is Character id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter method for id field. This method can also be used as a combination of getter and setter.
     * @param id an integer number which is assigned to Character id.
     * @return First, assign id parameter to Character id. Then, return an integer which is Character id.
     */
    public int setId(int id) {
        return this.id = id;
    }

    /**
     * Getter method for name field.
     * @return a string which is Character name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for name field. This method can also be used as a combination of getter and setter.
     * @param name a string which is assigned to Character name.
     * @return First, assign name parameter to Character name. Then, return a string which is Character name.
     */
    public String setName(String name) {
        return this.name = name;
    }

    /**
     * Getter method for health field.
     * @return an integer number which is Character health.
     */
    public Short getHealth() {
        return this.health;
    }

    /**
     * Setter method for health field. This method can also be used as a combination of getter and setter.
     * @param health an integer number which is assigned to Character health.
     * @return First, assign health parameter to Character health. Then, return an integer which is Character health.
     */
    public Short setHealth(short health) {
        return this.health = health;
    }

    /**
     * Getter method for characterLevel field.
     * @return a short number which is Character level.
     */
    public Short getCharacterLevel() {
        return this.characterLevel;
    }

    /**
     * Setter method for characterLevel field. This method can also be used as a combination of getter and setter.
     * @param characterLevel a short number which is assigned to Character level.
     * @return First, assign characterLevel parameter to Character characterLevel. Then, return an integer which is Character level.
     */
    public Short setCharacterLevel(short characterLevel) {
        return this.characterLevel = characterLevel;
    }

    /**
     * Getter method for image field.
     * @return a string URL which is address of Character image.
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Setter method for image field. This method can also be used as a combination of getter and setter.
     * @param image a string URL which is assigned to Character image.
     * @return First, assign image parameter to Character image. Then, return a string URL which is address of Character image.
     */
    public String setImage(String image) {
        return this.image = image;
    }

    /**
     * Getter method for position field.
     * @return an object which is Character position.
     */
    public Position getPosition() {
        return this.position;
    }

    /**
     * Setter method for position field. This method can also be used as a combination of getter and setter.
     * @param position an object which is assigned to Character position.
     * @return First, assign position parameter to Character position. Then, return an object which is Character position. The string contains of 2 coordinates separated by a comma.
     */
    public Position setPosition(Position position) {
        return this.position = position;
    }

    /**
     * Getter method for weapons field.
     * @return a Set of weapons that Character has.
     */
    public Set<Weapon> getWeapons() {
        return this.weapons;
    }

    /**
     * Setter method for weapons field.
     * @param weapon a new Weapon which will be added to weapons set.
     * @return true if new Weapon is added, false otherwise.
     */
    public Boolean setWeapons(Weapon weapon) {
        if(this.weapons == null) {
            this.weapons = new HashSet<Weapon>();
        }
        return this.weapons.add(weapon);
    }
    
}