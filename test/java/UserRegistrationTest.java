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
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastNameValidation("Dale");
        Assertions.assertTrue(result);
    }

    @Test
    void givenLastName_WhenNotValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastNameValidation("dh");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.emailValidation("kalp.gh@mail.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.emailValidation("kalp.@@com");
        Assertions.assertFalse(result);
    }

    @Test
    void givenPhoneNo_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.phoneNoValidation("91 8892829299");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPhoneNo_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.phoneNoValidation("875456666");
        Assertions.assertFalse(result);
    }

    @Test
    void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.passwordValidation("Asdf@12344");
        Assertions.assertTrue(result);
    }

    @Test
    void givenPassword_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.passwordValidation("adgggghh");
        Assertions.assertFalse(result);
    }
}
