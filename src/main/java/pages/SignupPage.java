package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignupPage {

    private WebDriver driver;
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By emailField = By.id("Email Address");
    private By passwordField = By.id("password");
    private By childNameField = By.id("childname");
    private By childPhoneField = By.id("childphone");
    private By childPasswordField = By.id("childpassword");
    private By registerButton = By.linkText("Sign in");

    public SignupPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickParent(){
        driver.findElement(By.linkText("I'm a parent")).click();
    }

    public void clickSignUp(){
        driver.findElement(By.linkText("Sign Up")).click();
    }

    public void setFirstNameField(String first){
        driver.findElement(firstNameField).sendKeys(first);
    }

    public void setLastNameField(String last){
        driver.findElement(lastNameField).sendKeys(last);
    }

    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void setChildNameField(String childName){
        driver.findElement(childNameField).sendKeys(childName);
    }

    public void setChildPhoneField(String childPhone){
        driver.findElement(childPhoneField).sendKeys(childPhone);
    }

    public void setChildPasswordField(String childPassword){
        driver.findElement(childPasswordField).sendKeys(childPassword);
    }

    public void clickRegisterButton(){
        driver.findElement(registerButton).click();
    }

    public String getAlertText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        alert.accept();
        return alertText;
    }
}
