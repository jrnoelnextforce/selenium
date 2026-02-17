package models.dashboard.alertframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage extends AlertsFrameWindowsPage {

    private static final By alertButton = By.id("alertButton");
    private static final By promptButton = By.id("promtButton");
    private static final By promptResultText = By.id("promptResult");

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    public void clickAlertButton() {
        clickElement(alertButton);
    }

    public void clickPromptButton() {
        clickElement(promptButton);
    }

    public String getPromptResultText() {
        return findElement(promptResultText).getText();
    }

}
