import com.userregistration.UserRegistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstNameValidation("Kailash");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.firstNameValidation("ka");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastNameValidation("Dale");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.lastNameValidation("dh");
        Assert.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.emailValidation("kalp.gh@mail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.emailValidation("kalp.@@com");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhoneNo_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.phoneNoValidation("97 8989898989");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNo_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.phoneNoValidation("875456666");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.passwordValidation("Asdf@12344");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotValid_ShouldReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.passwordValidation("dddddd");
        Assert.assertFalse(result);
    }
}
