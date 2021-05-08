import com.userregistration.UserRegistration;
import com.userregistration.UserRegistrationException;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenNotValid_ShouldThrowException() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.firstNameValidation("ailash");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenNotValid_ShouldThrowException() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.lastNameValidation("ale");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldThrowException() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.emailValidation("@gh@mail.com");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPhoneNo_WhenNotValid_ShouldThrowException() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.phoneNoValidation("8989898989");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenNotValid_ShouldThrowException() {
        try {
            UserRegistration userRegistration = new UserRegistration();
            boolean result = userRegistration.passwordValidation("Asdf12344");
            Assert.assertTrue(result);
        }
        catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }
}