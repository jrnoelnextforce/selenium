package common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility {

    private JavaScriptUtility () {}

    public static void scrollToElementJS(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        String scrollScript = "arguments[0].scrollIntoView(true);";
        ((JavascriptExecutor) driver).executeScript(scrollScript, element);
    }

    public static void clickElementJS(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        String clickScript = "arguments[0].click();";
        ((JavascriptExecutor) driver).executeScript(clickScript, element);
    }
}
