package models.dashboard.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinksPage extends ElementsPage {

    private static final By notFoundLink = By.id("invalid-url");
    private static final By responseCodeText = By.id("linkResponse");

    public LinksPage(WebDriver driver) {
        super(driver);
    }

    public void clickNotFoundLink() {
        clickElement(notFoundLink);
    }

    public String getResponseCodeText() {
        return findElement(responseCodeText).getText();
    }

}
