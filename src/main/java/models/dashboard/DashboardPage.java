package models.dashboard;

import common.BasePage;
import locators.dashboard.DashboardLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHeaderTitle() {
        return findElement(DashboardLocators.headerTitle);
    }
}
