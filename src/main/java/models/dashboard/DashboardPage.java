package models.dashboard;

import common.BasePage;
import locators.dashboard.DashboardLocators;
import models.dashboard.forms.FormsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static common.JavaScriptUtility.scrollToElement;

public class DashboardPage extends BasePage {

    private static final By formsCard = By.xpath("//div[@class='card-body']/h5[text()='Forms']");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    /*public WebElement getHeaderTitle() {
        return findElement(DashboardLocators.headerTitle);
    }*/

    public FormsPage navigateToFormsCard() {
        scrollToElement(driver,formsCard);
        clickElement(formsCard);
        return new FormsPage(driver);
    }
}
