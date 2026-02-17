package models.dashboard.widgets;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static common.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends BasePage {

    private static final By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private static final By datePickerItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");

    public WidgetsPage (WebDriver driver) {
        super(driver);
    }

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(driver, selectMenuItem);
        clickElement(selectMenuItem);
        return new SelectMenuPage(driver);
    }

    public DatePickerMenuPage clickDatePicker() {
        scrollToElementJS(driver, datePickerItem);
        clickElement(datePickerItem);
        return new DatePickerMenuPage(driver);
    }
}
