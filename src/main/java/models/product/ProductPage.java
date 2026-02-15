package models.product;

import common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private static final By productHeaderTitle = By.cssSelector("span.title");

    public boolean isProductHeaderTitleDisplayed() {
        return findElement(productHeaderTitle).isDisplayed();
    }


}
