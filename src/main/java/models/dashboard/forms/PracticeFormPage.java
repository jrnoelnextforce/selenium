package models.dashboard.forms;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static common.JavaScriptUtility.*;

public class PracticeFormPage extends FormsPage {

    private static final By maleGenderRadioButton = By.id("gender-radio-1");
    private static final By sportsHobbiesCheckbox = By.id("hobbies-checkbox-1");
    private static final By readingHobbiesCheckbox = By.id("hobbies-checkbox-2");
    private static final By musicHobbiesCheckbox = By.id("hobbies-checkbox-3");

    public PracticeFormPage(WebDriver driver) {
        super(driver);
    }

    public boolean isMaleGenderRadioButtonSelected() {
        return findElement(maleGenderRadioButton).isSelected();
    }

    public void selectMaleGender() {
        clickElement(maleGenderRadioButton);
        //clickElementJS(driver,maleGenderRadioButton);
    }

    public void selectSportsHobbies() {
        if (!findElement(sportsHobbiesCheckbox).isSelected()) {
            scrollToElementJS(driver,sportsHobbiesCheckbox);
            clickElement(sportsHobbiesCheckbox);
        }
    }

    public void deselectSportsHobbies() {
        if (findElement(sportsHobbiesCheckbox).isSelected()) {
            scrollToElementJS(driver,sportsHobbiesCheckbox);
            clickElement(sportsHobbiesCheckbox);
        }
    }

    public boolean isSportsHobbiesSelected() {
        return findElement(sportsHobbiesCheckbox).isSelected();
    }

    public void selectReadingHobbies() {
        if (!findElement(readingHobbiesCheckbox).isSelected()) {
            scrollToElementJS(driver,readingHobbiesCheckbox);
            clickElement(readingHobbiesCheckbox);
        }
    }

    public void deselectReadingHobbies() {
        if (findElement(readingHobbiesCheckbox).isSelected()) {
            scrollToElementJS(driver,readingHobbiesCheckbox);
            clickElement(readingHobbiesCheckbox);
        }
    }

    public boolean isReadingHobbiesSelected() {
        return findElement(readingHobbiesCheckbox).isSelected();
    }

    public void selectMusicHobbies() {
        if (!findElement(musicHobbiesCheckbox).isSelected()) {
            scrollToElementJS(driver,musicHobbiesCheckbox);
            clickElement(musicHobbiesCheckbox);
        }
    }

    public void deselectMusicHobbies() {
        if (findElement(musicHobbiesCheckbox).isSelected()) {
            scrollToElementJS(driver,musicHobbiesCheckbox);
            clickElement(musicHobbiesCheckbox);
        }
    }

    public boolean isMusicHobbiesSelected() {
        return findElement(musicHobbiesCheckbox).isSelected();
    }

}
