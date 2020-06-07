package model.data;

import org.junit.jupiter.api.*;
import javax.validation.*;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.*;

public class SkillTest {
    private static Validator validator;

    @BeforeAll
    public static void setup() {
        // build the validator factory
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void test() {
        Skill skill = new Skill();
        skill.setName("");
        Set<ConstraintViolation<Skill>> constraintViolations = validator.validate(skill);
        assertEquals(1, constraintViolations.size());
        assertEquals("size must be between 1 and 20", constraintViolations.iterator().next().getMessage());
    }
}
