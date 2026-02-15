package models.dashboard.elements;

import models.dashboard.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage extends DashboardPage {

    private static final By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public WebTablesPage clickWebTables() {
        clickElement(webTablesMenuItem);
        return new WebTablesPage(driver);
    }
}
