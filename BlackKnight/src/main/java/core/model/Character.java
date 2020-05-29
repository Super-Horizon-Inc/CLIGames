package core.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
/**
 * An abstract class for holding common fields, actions of MainCharacter and Monster.
 */
public abstract class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int health;
    private short characterLevel;
    private String name;
    private String position;
    private String type;
    private String image;
    private boolean state;
    private int mapId;
//    @OneToMany(cascade = CascadeType.ALL)
//    private List<Weapon> weapons;

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
    public int getHealth() {
        return this.health;
    }

    /**
     * Setter method for health field. This method can also be used as a combination getter and setter.
     * @param health an integer number which is assigned to Character health.
     * @return First, assign health parameter to Character health. Then, return an integer which is Character health.
     */
    public int setHealth(int health) {
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
     * Getter method for mapId field.
     * @return an integer number which is id of Map where Character is currently in.
     */
    public int getMapId() {
        return this.mapId;
    }

    /**
     * Setter method for mapId field. This method can also be used as a combination getter and setter.
     * @param mapId an integer number which is assigned to Character mapId.
     * @return First, assign mapId parameter to Character mapId. Then, return an integer which is id of Map where Character is currently in.
     */
    public int setMapId(int mapId) {
        return this.mapId = mapId;
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
     * @param type an integer number which is assigned to Character type.
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
    
/*
    public List<Weapon> getWeapons() {
        return this.weapons;
    }

    public boolean setWeapon(Weapon weapon) {
        return this.weapons.add(weapon);
    }

 */

}