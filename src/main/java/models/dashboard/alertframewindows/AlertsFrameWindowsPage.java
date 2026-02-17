package models.dashboard.alertframewindows;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsFrameWindowsPage extends BasePage {

    private static final By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private static final By alertsMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");
    private static final By framesMenuItem = By.xpath("//li[@id='item-2']//span[text()='Frames']");

    public AlertsFrameWindowsPage(WebDriver driver) {
        super(driver);
    }

    public ModalDialogsPage clickModalDialogs() {
        clickElement(modalDialogsMenuItem);
        return new ModalDialogsPage(driver);
    }

    public AlertsPage clickAlerts() {
        clickElement(alertsMenuItem);
        return new AlertsPage(driver);
    }

    public FramesPage clickFrames() {
        clickElement(framesMenuItem);
        return new FramesPage(driver);
    }


}
