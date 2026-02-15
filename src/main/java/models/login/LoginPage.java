package models.login;

import common.BasePage;
import locators.login.LoginLocators;
import models.product.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

     public LoginPage(WebDriver driver) {
        super(driver);
    }

    private static final By usernameField = By.id("user-name");
    private static final By passwordField = By.id("password");
    private static final By loginButton = By.id("login-button");
    private static final By errorMessage = By.cssSelector("h3[data-test='error']");

    public void enterUsername(String username) {
        enterText(usernameField, username);
    }

    public void enterPassword(String password) {
        enterText(passwordField,password);
    }

    public ProductPage clickLoginButton() {
        clickElement(loginButton);
        return new ProductPage(driver);
    }

    public ProductPage logIntoApplication(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage() {
        return findElement(errorMessage).getText();
    }

}
