package common;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public final class PageUtil {

    private PageUtil() {
        // Private constructor to prevent instantiation
    }

    public static void navigateToUrl(@NonNull WebDriver driver, String url) {
        driver.get(url);
    }

    public static String getCurrentUrl(@NonNull WebDriver driver) {
        return driver.getCurrentUrl();
    }

    public static void selectOptionByVisibleText(@NonNull WebDriver driver, By selectLocator, String visibleText) {
        Select select = new Select(driver.findElement(selectLocator));
        select.selectByVisibleText(visibleText);
    }

    public static void selectOptionByIndex(@NonNull WebDriver driver, By selectLocator, int index) {
        Select select = new Select(driver.findElement(selectLocator));
        select.selectByIndex(index);
    }

    public static void deselectOptionByVisibleText(@NonNull WebDriver driver, By selectLocator, String visibleText) {
        Select select = new Select(driver.findElement(selectLocator));
        select.deselectByVisibleText(visibleText);
    }

    public static void deselectOptionByIndex(@NonNull WebDriver driver, By selectLocator, int index) {
        Select select = new Select(driver.findElement(selectLocator));
        select.deselectByIndex(index);
    }

    private static WebDriver.TargetLocator switchTo(WebDriver driver) {
        return driver.switchTo();
    }

    public static String getAlertText(WebDriver driver) {
        return switchTo(driver).alert().getText();
    }

    public static void acceptAlert(WebDriver driver) {
        switchTo(driver).alert().accept();
    }

    public static void dismissAlert(WebDriver driver) {
        switchTo(driver).alert().dismiss();
    }

    public static void sendKeysToAlert(WebDriver driver, String text) {
        switchTo(driver).alert().sendKeys(text);
    }

}
