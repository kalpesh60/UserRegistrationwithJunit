import com.userregistration.UserRegistration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstNameValidation("Kailash");
        Assertions.assertTrue(result);
    }

    @Test
    void givenFirstName_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstNameValidation("ka");
        Assertions.assertTrue(result);
    }
}
