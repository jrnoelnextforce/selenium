package models.dashboard.widgets;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static common.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends BasePage {

    private static final By selectMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");

    public WidgetsPage (WebDriver driver) {
        super(driver);
    }

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(driver, selectMenuItem);
        clickElement(selectMenuItem);
        return new SelectMenuPage(driver);
    }
}
