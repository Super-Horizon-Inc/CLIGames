package core.model;

public class Skill {
    private int id;
    private String name;
    private int characterId;
    private MainCharacter character;

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
}
