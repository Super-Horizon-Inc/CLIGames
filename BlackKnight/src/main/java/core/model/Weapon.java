package core.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String name;
    private String type;
//    private int characterId;
//    private MainCharacter character;

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

    public String getType() {
        return this.type;
    }

    public String setType(String type) {
        return this.type = type;
    }
/*
    public int getCharacterId() {
        return this.characterId;
    }

    public int setCharacterId(int characterId) {
        return this.characterId = characterId;
    }

    public MainCharacter getCharacter() {
        return this.character;
    }

    public MainCharacter setCharacter() {
        return this.character = character;
    }

 */

}
