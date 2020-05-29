package core.model;

import javax.persistence.Entity;
import java.util.List;

@Entity
/**
 * A class for main character of the game.
 */
public class MainCharacter extends Character {
    private List<Skill> skills;
    private int gold;

    /**
     * Getter method for skills.
     * @return a List of skills that main character has.
     */
    public List<Skill> getSkill() {
        return this.skills;
    }

    /**
     * Setter method for skills.
     * @param skill a new skill which will be added to skill list.
     * @return true if new skill is added, false otherwise.
     */
    public boolean setSkill(Skill skill) {
        return this.skills.add(skill);
    }

    /**
     * Getter method for gold field.
     * @return an integer number which is MainCharacter gold.
     */
    public int getGold() {
        return this.gold;
    }

    /**
     * Setter method for gold field. This method can also be used as a combination getter and setter.
     * @param gold an integer number which is assigned to MainCharacter gold.
     * @return First, assign gold parameter to MainCharacter gold. Then, return an integer which is MainCharacter gold.
     */
    public int setGold(int gold) {
        return this.gold = gold;
    }
}
