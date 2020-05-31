package core.model;

import org.hibernate.annotations.DiscriminatorFormula;
import javax.persistence.*;
import java.util.*;

@Entity
// Hibernate Hierarchy Mapping per Table Association Annotations Example
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorFormula("case when gold is null then 'MainCharacter' else 'Monster' end")
/**
 * An abstract class for holding common fields, actions of MainCharacter and Monster.
 */
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private short health;

    private short characterLevel;

    @Column(length = 50)
    private String name;

    @Column(length = 10)
    private String position;

    private String image;

    private boolean state;

    @Column(length = 20)
    private String type;

    // Hibernate One-to-Many Association on Join Table Annotations Example
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Character_Weapons",
            joinColumns = @JoinColumn(name = "Character_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "Weapon_Id", referencedColumnName = "Id")
    )
    private Set<Weapon> weapons;

    /**
     * Getter method for id field.
     * @return an integer number which is Character id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter method for id field. This method can also be used as a combination getter and setter.
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
     * Setter method for name field. This method can also be used as a combination getter and setter.
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
    public short getHealth() {
        return this.health;
    }

    /**
     * Setter method for health field. This method can also be used as a combination getter and setter.
     * @param health an integer number which is assigned to Character health.
     * @return First, assign health parameter to Character health. Then, return an integer which is Character health.
     */
    public short setHealth(short health) {
        return this.health = health;
    }

    /**
     * Getter method for characterLevel field.
     * @return a short number which is Character level.
     */
    public short getLevel() {
        return this.characterLevel;
    }

    /**
     * Setter method for characterLevel field. This method can also be used as a combination getter and setter.
     * @param characterLevel a short number which is assigned to Character level.
     * @return First, assign characterLevel parameter to Character characterLevel. Then, return an integer which is Character level.
     */
    public short setLevel(short characterLevel) {
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
     * Setter method for image field. This method can also be used as a combination getter and setter.
     * @param image a string URL which is assigned to Character image.
     * @return First, assign image parameter to Character image. Then, return a string URL which is address of Character image.
     */
    public String setImage(String image) {
        return this.image = image;
    }

    /**
     * Getter method for position field.
     * @return a string which is Character position. The string contains of 2 coordinates separated by a comma.
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * Setter method for position field. This method can also be used as a combination getter and setter.
     * @param position a string which is assigned to Character position.
     * @return First, assign position parameter to Character position. Then, return a string which is Character position. The string contains of 2 coordinates separated by a comma.
     */
    public String setPosition(String position) {
        return this.position = position;
    }

    /**
     * Getter method for type field.
     * @return a string which is Character type.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Setter method for type field. This method can also be used as a combination getter and setter.
     * @param type string which is assigned to Character type.
     * @return First, assign type parameter to Character type. Then, return a string which is Character type.
     */
    public String setType(String type) {
        return this.type = type;
    }

    /**
     * Getter method for state field.
     * @return a true/false (alive/dead) value which is Character state.
     */
    public boolean getState() {
        return this.state;
    }

    /**
     * Setter method for state field. This method can also be used as a combination getter and setter.
     * @param state a boolean which is assigned to Character state.
     * @return First, assign state parameter to Character state. Then, return a true/false (alive/dead) value which is Character state.
     */
    public boolean setState(boolean state) {
        return this.state = state;
    }
    

    public Set<Weapon> getWeapons() {
        return this.weapons;
    }

    public boolean setWeapon(Weapon weapon) {
        if(this.weapons == null) {
            this.weapons = new HashSet<Weapon>();
        }
        return this.weapons.add(weapon);
    }
}