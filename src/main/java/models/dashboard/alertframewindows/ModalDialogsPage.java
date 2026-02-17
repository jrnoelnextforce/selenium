package models.dashboard.alertframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModalDialogsPage extends AlertsFrameWindowsPage {

    private static final By largeModalButton = By.id("showLargeModal");
    private static final By largeModalText = By.xpath("//div/p[contains(text(),'Lorem Ipsum')]");
    private static final By largeModalCloseButton = By.id("closeLargeModal");

    public ModalDialogsPage(WebDriver driver) {
        super(driver);
    }

    public void clickLargeModalButton() {
        clickElement(largeModalButton);
    }

    public String getLargeModalText() {
        return findElement(largeModalText).getText();
    }

    public void clickLargeModalCloseButton() {
        clickElement(largeModalCloseButton);
    }


}
