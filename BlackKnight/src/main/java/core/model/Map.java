package core.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.*;

/**
 * A class for Maps of the game.
 */
@Entity
public class Map {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Size(min = 1, max = 20)
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable (
            name = "Map_Characters",
            joinColumns = @JoinColumn(name = "Map_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "Character_Id", referencedColumnName = "Id")
    )
    private Set<Character> characters;

    /**
     * Getter method for id field.
     * @return an integer number which is Map id.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Setter method for id field. This method can also be used as a combination of getter and setter.
     * @param id an integer number which is assigned to Map id.
     * @return First, assign id parameter to Map id. Then, return an integer which is Map id.
     */
    public int setId(int id) {
        return this.id = id;
    }

    /**
     * Getter method for name field.
     * @return a string which is Map name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Setter method for name field. This method can also be used as a combination of getter and setter.
     * @param name a string which is assigned to Map name.
     * @return First, assign name parameter to Map name. Then, return a string which is Map name.
     */
    public String setName(String name) {
        return this.name = name;
    }

    /**
     * Getter method for characters field.
     * @return a Set of characters that Map has.
     */
    public Set<Character> getCharacter() {
        return this.characters;
    }

    /**
     * Setter method for characters field.
     * @param character a new Character which will be added to characters set.
     * @return true if new Character is added, false otherwise.
     */
    public boolean setCharacter(Character character) {
        if (this.characters == null) {
            this.characters = new HashSet<Character>();
        }
        return this.characters.add(character);
    }
}
