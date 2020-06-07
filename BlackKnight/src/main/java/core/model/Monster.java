package core.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * A class for Monsters of the game.
 */
@Entity
public class Monster extends Character {

    private boolean type;

    /**
     * Getter method for type field.
     * @return a boolean(true/false) = (visible/invisible) which is Monster type.
     */
    public boolean getType() {
        return this.type;
    }

    /**
     * Setter method for type field. This method can also be used as a combination of getter and setter.
     * @param type boolean(true/false) = (visible/invisible) which is assigned to Monster type.
     * @return First, assign type parameter to Monster type. Then, return a boolean which is Monster type.
     */
    public boolean setType(boolean type) {
        return this.type = type;
    }

}
