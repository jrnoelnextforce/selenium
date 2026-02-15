package models.dashboard.elements;

import common.BasePage;
import models.dashboard.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends BasePage {

    private static final By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private static final By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public WebTablesPage clickWebTables() {
        clickElement(webTablesMenuItem);
        return new WebTablesPage(driver);
    }

    public LinksPage clickLinks() {
        clickElement(linksMenuItem);
        return new LinksPage(driver);
    }
}
