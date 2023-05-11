package register;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SignupPage;

import static org.testng.Assert.assertEquals;

public class RegisterTests extends BaseTests {

    @Test
    public void testSignupSuccessfully() {
        SignupPage signupPage = homePage.clickSignupLogin();
        signupPage.clickParent();
        signupPage.clickSignUp();


        signupPage.setFirstNameField("Ziad");
        signupPage.setLastNameField("Alaa");
        signupPage.setEmailField("ziad@test.com");
        signupPage.setPassword("12345678");
        signupPage.setChildNameField("Test Child");
        signupPage.setChildPhoneField("0101010");
        signupPage.setChildPasswordField("12345678");
        signupPage.clickRegisterButton();

        assertEquals(signupPage.getAlertText(),
                "Sign up successfully");
    }

    @Test
    public void testSignupFailed() {
        SignupPage signupPage = homePage.clickSignupLogin();
        signupPage.clickParent();
        signupPage.clickSignUp();


        signupPage.setFirstNameField("Ziad");
        signupPage.setLastNameField("Alaa");
        signupPage.setEmailField("ziad@test.com");
        signupPage.setPassword("12345678");
        signupPage.setChildNameField("Test Child");
        signupPage.setChildPhoneField("0101010");
        signupPage.setChildPasswordField("12345678");
        signupPage.clickRegisterButton();

        assertEquals(signupPage.getAlertText(),
                "There Error, message: Parrent Phone is already in use!");
    }
}
