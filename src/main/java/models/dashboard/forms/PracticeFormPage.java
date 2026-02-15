package models.dashboard.forms;

import common.BasePage;
import common.JavaScriptUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormPage extends FormsPage {

    private static final By maleGenderRadioButton = By.id("gender-radio-1");

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMaleGenderRadioButtonSelected() {
        return findElement(maleGenderRadioButton).isSelected();
    }

    public void selectMaleGender() {
        //clickElement(maleGenderRadioButton);
        JavaScriptUtility.clickElementJS(driver,maleGenderRadioButton);
    }

}
