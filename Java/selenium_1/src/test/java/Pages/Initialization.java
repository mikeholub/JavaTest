package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

abstract public class Initialization {
    protected WebDriver driver;

    @BeforeClass
    protected void setup () {
        System.setProperty("webdriver.gecko.driver", "c:/Users/Mikalai_Holub/Java/selenium_1/driver/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterClass
    protected void close () {
        driver.quit();
    }

}
