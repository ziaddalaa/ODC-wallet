package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    private void clickLink(String linkText)
    {
        driver.findElement(By.linkText(linkText)).click();
    }

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickSignup(){
        clickLink("Sign up/login");
        return new LoginPage(driver);
    }

    public SignupPage clickSignupLogin(){
        clickLink("Sign up/login");
        return new SignupPage(driver);
    }
}
