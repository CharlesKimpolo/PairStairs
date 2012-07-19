package twza_pairstairs_kimpolo.domain.model;

import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.Assert.assertTrue;

public class PairStairsParticipantTest {

    @Test
    public void should_ensure_mandatory_fields_are_not_null_or_blank() {
        PairStairsParticipant pairStairsParticipant = new PairStairsParticipant("");
        Map<String, ConstraintViolation<PairStairsParticipant>> violationsMap = validate(pairStairsParticipant);
        assertTrue(violationsMap.get("name").getMessageTemplate().contains("NotEmpty"));
    }

    private <T> Map<String, ConstraintViolation<T>> validate(T user) {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Map<String, ConstraintViolation<T>> violations = new HashMap<String, ConstraintViolation<T>>();
        for (ConstraintViolation<T> violation : validator.validate(user)) {
            violations.put(violation.getPropertyPath().toString(), violation);
        }
        return violations;
    }
}
