package locators.login;

import org.openqa.selenium.By;

public class LoginLocators {
    /*public static final By usernameField = By.name("username");
    public static final By passwordField = By.name("password");
    public static final By loginButton = By.tagName("button");*/

    public static final By usernameField = By.id("user-name");
    public static final By passwordField = By.id("password");
    public static final By loginButton = By.id("login-button");
    public static final By errorMessage = By.cssSelector("h3[data-test='error']");

}
