package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    private By phoneField = By.name("phone");
    private By passwordField = By.name("password");
    private By loginButton = By.linkText("Sign in");
    private By chart = By.cssSelector(".chart h4");

public LoginPage(WebDriver driver){
    this.driver = driver;
}

public void clickParent(){
    driver.findElement(By.linkText("I'm a parent")).click();
}

    public void setPhone(String phone){
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public String getChartTitle(){
        String chartTitle =  driver.findElement(chart).getText();
        return chartTitle;
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
