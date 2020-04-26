package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoFormPage  {
    private WebDriver driver;

    public DemoFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public String OneField (String message) {

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        WebElement inputField = driver.findElement(By.id("user-message"));
        inputField.sendKeys(message);

        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button"));
        submitButton.click();

        WebElement result = driver.findElement(By.id("display"));
        return result.getText();
    }

    public int SumNumbers (int numberOne, int numberTwo) {

        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement firstNumber = driver.findElement(By.id("sum1"));
        firstNumber.sendKeys(Integer.toString(numberOne));

        WebElement secondNumber = driver.findElement(By.id("sum2"));
        secondNumber.sendKeys(Integer.toString(numberTwo));

        WebElement sumButton = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div[2]/form/button"));
        sumButton.click();

        WebElement result = driver.findElement(By.id("displayvalue"));
        return Integer.parseInt(result.getText());
    }
}