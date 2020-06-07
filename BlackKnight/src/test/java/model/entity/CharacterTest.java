package model.entity;

import org.junit.jupiter.api.*;
import javax.validation.*;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {

    private static Validator validator;
    private static Character character;
    private static Set<ConstraintViolation<Character>> constraintViolations;

    @BeforeAll
    public static void setup() {
        // build the validator factory
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void test() {

        // create a character and make sure it is valid
        this.createCharacter();
        this.constraintViolations = validator.validate(this.character);
        assertEquals(0, this.constraintViolations.size());

        // make sure that health can be only positive or zero
        this.testHealth();

        // make sure that characterLevel is only positive
        this.testCharacterLevel();

        // make sure that name has size from 1 and 50
        this.testName();

        // make sure that image is not null
        this.testImage();

    }

    private void testHealth() {
        this.character.setHealth((short)-1);
        this.constraintViolations = validator.validate(this.character);
        assertEquals("must be greater than or equal to 0", this.constraintViolations.iterator().next().getMessage());
        this.character.setHealth((short)100);
    }

    private void testCharacterLevel() {
        this.character.setCharacterLevel((short)-1);
        this.constraintViolations = validator.validate(this.character);
        assertEquals("must be greater than 0", this.constraintViolations.iterator().next().getMessage());
        this.character.setCharacterLevel((short)1);
    }

    private void testName() {
        this.character.setName("");
        this.constraintViolations = validator.validate(this.character);
        assertEquals("size must be between 1 and 50", this.constraintViolations.iterator().next().getMessage());
        this.character.setName("John Snow");
    }

    private void testImage() {
        this.character.setImage(null);
        this.constraintViolations = validator.validate(this.character);
        assertEquals("must not be null", this.constraintViolations.iterator().next().getMessage());
        this.character.setImage("no image yet");
    }

    private void createCharacter() {
        // create a character
        this.character = new Character();
        this.character.setHealth((short)100);
        this.character.setCharacterLevel((short)1);
        this.character.setName("John Snow");
        this.character.setPosition(new Position((byte)0, (byte)0));
        this.character.setImage("no image yet");
        this.character.setWeapons(new Weapon("Knife"));
    }

}
