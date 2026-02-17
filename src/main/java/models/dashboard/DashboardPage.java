package models.dashboard;

import common.BasePage;
import models.dashboard.alertframewindows.AlertsFrameWindowsPage;
import models.dashboard.elements.ElementsPage;
import models.dashboard.forms.FormsPage;
import models.dashboard.widgets.WidgetsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static common.JavaScriptUtility.scrollToElementJS;

public class DashboardPage extends BasePage {

    private static final By formsCard = By.xpath("//div[@class='card-body']/h5[text()='Forms']");
    private static final By elementsCard = By.xpath("//div[@class='card-body']/h5[text()='Elements']");
    private static final By widgetsCard = By.xpath("//div[@class='card-body']/h5[text()='Widgets']");
    private static final By alertsFrameWindowsCard = By.xpath("//div[@class='card-body']/h5[text()='Alerts, Frame & Windows']");

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public FormsPage navigateToFormsCard() {
        scrollToElementJS(driver,formsCard);
        clickElement(formsCard);
        return new FormsPage(driver);
    }

    public ElementsPage navigateToElementsCard() {
        scrollToElementJS(driver, elementsCard);
        clickElement(elementsCard);
        return new ElementsPage(driver);
    }

    public WidgetsPage navigateToWidgetsCard() {
        scrollToElementJS(driver, widgetsCard);
        clickElement(widgetsCard);
        return new WidgetsPage(driver);
    }

    public AlertsFrameWindowsPage navigateToAlertsFrameWindowsCard() {
        scrollToElementJS(driver, alertsFrameWindowsCard);
        clickElement(alertsFrameWindowsCard);
        return new AlertsFrameWindowsPage(driver);
    }
}
