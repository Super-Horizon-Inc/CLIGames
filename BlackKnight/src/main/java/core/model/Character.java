package core.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)


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

    public int getId() {
        return this.id;
    }

    public int setId(int id) {
        return this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public int getHealth() {
        return this.health;
    }

    public int setHealth(int health) {
        return this.health = health;
    }

    public short getLevel() {
        return this.characterLevel;
    }

    public short setLevel(short characterLevel) {
        return this.characterLevel = characterLevel;
    }

    public int getMapId() {
        return this.mapId;
    }

    public int setMapId(int mapId) {
        return this.mapId = mapId;
    }

    public String getImage() {
        return this.image;
    }

    public String setImage(String image) {
        return this.image = image;
    }

    public String getPosition() {
        return this.position;
    }

    public String setPosition(String position) {
        return this.position = position;
    }

    public String getType() {
        return this.type;
    }

    public String setType(String type) {
        return this.type = type;
    }

    public boolean getState() {
        return this.state;
    }

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