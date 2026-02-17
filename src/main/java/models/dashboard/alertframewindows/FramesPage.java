package models.dashboard.alertframewindows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage extends AlertsFrameWindowsPage {

    private static final By framesText = By.id("sampleHeading");
    private static final String iFrameBigBox = "frame1";
    private static final By defaultContentHeader = By.xpath("//div[@id='framesWrapper']/h1");

    private void switchToIFrame() {
        driver.switchTo().frame(iFrameBigBox);
    }

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public String getFramesText() {
        switchToIFrame();
        String frameText = findElement(framesText).getText();
        driver.switchTo().defaultContent();
        return frameText;
    }

    public String getDefaultContentHeaderText() {
        return findElement(defaultContentHeader).getText();
    }

}
