package common;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.WebDriver;

import java.sql.DriverManager;

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

}
