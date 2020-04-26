package Pages;

import org.openqa.selenium.WebDriver;

public class Page {
    protected WebDriver driver;

    protected Page (WebDriver driver, String url){
        this.driver = driver;
        driver.get(url);
    }
}