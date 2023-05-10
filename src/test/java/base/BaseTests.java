package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {

    public WebDriver driver;
    protected HomePage homePage;

    protected WebDriver getDriver(){
        return driver;
    }

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chromer.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("http://smartwallet.byethost10.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
