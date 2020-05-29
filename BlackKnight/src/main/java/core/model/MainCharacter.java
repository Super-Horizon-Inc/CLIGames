package core.model;

import javax.persistence.Entity;
import java.util.List;

@Entity

public class MainCharacter extends Character {
    private List<Skill> skills;
    private int gold;

    public List<Skill> getSkill() {
        return this.skills;
    }

    public boolean setSkill(Skill skill) {
        return this.skills.add(skill);
    }

    public int getGold() {
        return this.gold;
    }

    public int setGold(int gold) {
        return this.gold = gold;
    }
}
