import Pages.CheckBoxPage;
import Pages.Initialization;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Random;

public class CheckBoxTest extends Initialization {
    @Test
    public void checkboxTest () {
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
        String checkMessage = checkBoxPage.TestCheckBox();
        Boolean checkText = checkBoxPage.TestDisplayCheckBox();

        Assertions.assertThat(checkText).isEqualTo(true);
        Assertions.assertThat(checkMessage).isEqualTo("Success - Check box is checked");
    }

    @Test
    public void CheckMultipleBoxes () {
        Random random = new Random();
        int index = random.nextInt(4) + 1;
        String xmlCheckBox = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div[" + Integer.toString(index) + "]/label/input";
        CheckBoxPage checkBoxPage = new CheckBoxPage(driver);
        checkBoxPage.ClickCheckbox(xmlCheckBox);
        String buttonName = checkBoxPage.GetButtonText();
        Assertions.assertThat(buttonName).isEqualTo("Check All");

        checkBoxPage.ClickButton();
        buttonName = checkBoxPage.GetButtonText();
        Assertions.assertThat(buttonName).isEqualTo("Uncheck All");

        index = random.nextInt(4);
        xmlCheckBox = "/html/body/div[2]/div/div[2]/div[2]/div[2]/div[" + Integer.toString(index) + "]/label/input";

        checkBoxPage.ClickCheckbox(xmlCheckBox);
        buttonName = checkBoxPage.GetButtonText();
        Assertions.assertThat(buttonName).isEqualTo("Check All");

        checkBoxPage.ClickCheckbox(xmlCheckBox);
        buttonName = checkBoxPage.GetButtonText();
        Assertions.assertThat(buttonName).isEqualTo("Uncheck All");
    }
}