package login;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

    @Test
    public void testFailedLogin(){
        LoginPage loginPage = homePage.clickSignup();
        loginPage.clickParent();
        loginPage.setPhone("test");
        loginPage.setPassword("test1234");
        loginPage.clickLoginButton();
        assertEquals(loginPage.getAlertText(),
                "your username or password is wrong, please try again.");
    }

    @Test
    public void testSuccessLogin(){
        LoginPage loginPage = homePage.clickSignup();
        loginPage.clickParent();
        loginPage.setPhone("ziad@test.com");
        loginPage.setPassword("12345678");
        loginPage.clickLoginButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean isUrlCorrect = wait.until(ExpectedConditions.urlToBe("http://smartwallet.byethost10.com/dashboard.html"));
        Assert.assertTrue(isUrlCorrect);
    }
}
