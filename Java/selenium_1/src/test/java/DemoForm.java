import Pages.DemoFormPage;
import Pages.Initialization;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.util.Random;

public class DemoForm extends Initialization {

    public void InputTest() {
        driver.get("https://google.com");
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Cheese!");
        element.submit();

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith("cheese!");
            }
        });

        System.out.println("Page title is:" + driver.getTitle());
    }

    @Test
    public void checkMessage() {
        String inputMessage = "Test Message";
        String resultMessage = new DemoFormPage(driver).OneField(inputMessage);

        Assertions.assertThat(inputMessage.equals(resultMessage));
    }

    @Test
    public void sumTwoNumbers() {
        Random random = new Random();

        int digitOne = random.nextInt(100) - 50;
        int digitTwo = random.nextInt(100) - 25;
        int sumResult = digitOne + digitTwo;
        int actualResults = new DemoFormPage(driver).SumNumbers(digitOne, digitTwo);

        Assertions.assertThat(actualResults).isEqualTo(sumResult);
    }
}