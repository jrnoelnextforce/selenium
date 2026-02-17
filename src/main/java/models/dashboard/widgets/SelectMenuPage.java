package models.dashboard.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static common.JavaScriptUtility.scrollToElementJS;

public class SelectMenuPage extends WidgetsPage {

    private static final By standardMultiSelect = By.id("cars");

    public SelectMenuPage(WebDriver driver) {
        super(driver);
    }

    public void selectStandardMultiSelectOption(String option) {
        scrollToElementJS(driver, standardMultiSelect);
        Select select = new Select(findElement(standardMultiSelect));
        select.selectByVisibleText(option);
    }

    public void selectStandardMultiSelectOption(String option1, String option2) {
        scrollToElementJS(driver, standardMultiSelect);
        Select select = new Select(findElement(standardMultiSelect));
        select.selectByVisibleText(option1);
        select.selectByVisibleText(option2);
    }

    public void selectStandardMultiSelectOption(int index) {
        scrollToElementJS(driver, standardMultiSelect);
        Select select = new Select(findElement(standardMultiSelect));
        select.selectByIndex(index);
    }

    public List<String> getSelectedStandardMultiSelectOptions() {
        scrollToElementJS(driver, standardMultiSelect);
        Select select = new Select(findElement(standardMultiSelect));
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        List<String> selectedOptionTexts = new ArrayList<>();
        for (WebElement option : selectedOptions) {
            selectedOptionTexts.add(option.getText());
        }
        return selectedOptionTexts;
    }





}
