package core.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Map {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (
            name = "Map_Characters",
            joinColumns = @JoinColumn(name = "Map_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "Character_Id", referencedColumnName = "Id")
    )

    private Set<Character> characters;

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

    public Set<Character> getCharacter() {
        return characters;
    }

    public boolean setCharacter(Character character) {
        if (this.characters == null) {
            this.characters = new HashSet<Character>();
        }
        return this.characters.add(character);
    }
}
