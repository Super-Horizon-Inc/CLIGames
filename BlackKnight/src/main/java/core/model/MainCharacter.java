package core.model;

import javax.persistence.*;
import java.util.*;

/**
 * A class for Main Character of the game.
 */
@Entity
public class MainCharacter extends Character {

    private int gold;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Character_Skills",
            joinColumns = @JoinColumn(name = "Character_Id", referencedColumnName = "Id"),
            inverseJoinColumns = @JoinColumn(name = "Skill_Id", referencedColumnName = "Id")
    )
    private Set<Skill> skills;

    /**
     * Getter method for gold field.
     * @return an integer number which is MainCharacter gold.
     */
    public int getGold() {
        return this.gold;
    }

    /**
     * Setter method for gold field. This method can also be used as a combination of getter and setter.
     * @param gold an integer number which is assigned to MainCharacter gold.
     * @return First, assign gold parameter to MainCharacter gold. Then, return an integer which is MainCharacter gold.
     */
    public int setGold(int gold) {
        return this.gold = gold;
    }

    /**
     * Getter method for skills field.
     * @return a Set of skills that Main Character has.
     */
    public Set<Skill> getSkills() {
        return this.skills;
    }

    /**
     * Setter method for skills field.
     * @param skill a new Skill which will be added to skills set.
     * @return true if new Skill is added, false otherwise.
     */
    public boolean setSkills(Skill skill) {
        if(this.skills == null) {
            this.skills = new HashSet<Skill>();
        }
        return this.skills.add(skill);
    }

}
