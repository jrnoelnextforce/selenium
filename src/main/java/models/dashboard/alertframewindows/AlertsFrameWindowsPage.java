package models.dashboard.alertframewindows;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsFrameWindowsPage extends BasePage {

    private static final By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");

    public AlertsFrameWindowsPage(WebDriver driver) {
        super(driver);
    }

    public ModalDialogsPage clickModalDialogs() {
        clickElement(modalDialogsMenuItem);
        return new ModalDialogsPage(driver);
    }


}
