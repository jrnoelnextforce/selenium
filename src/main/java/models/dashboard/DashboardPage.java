package models.dashboard;

import common.BasePage;
import models.dashboard.forms.FormsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static common.JavaScriptUtility.scrollToElementJS;

public class DashboardPage extends BasePage {

    private static final By formsCard = By.xpath("//div[@class='card-body']/h5[text()='Forms']");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public FormsPage navigateToFormsCard() {
        scrollToElementJS(driver,formsCard);
        clickElement(formsCard);
        return new FormsPage(driver);
    }
}
