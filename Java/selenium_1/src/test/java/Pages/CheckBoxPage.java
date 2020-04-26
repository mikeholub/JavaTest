package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage extends Page {

    public CheckBoxPage (WebDriver driver) {
        super(driver, "https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    public String TestCheckBox () {
        driver.findElement(By.id("isAgeSelected")).click();

        return driver.findElement(By.id("txtAge")).getText();
    }

    public boolean TestDisplayCheckBox () {
        driver.findElement(By.id("isAgeSelected"));

        return driver.findElement(By.id("txtAge")).isDisplayed();
    }

    public void ClickCheckbox (String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public void ClickButton () {
        driver.findElement(By.id("check1")).click();
    }

    public String GetButtonText () {
        return driver.findElement(By.id("check1")).getAttribute("value");
    }
}