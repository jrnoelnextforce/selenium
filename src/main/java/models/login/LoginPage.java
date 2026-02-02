package models.login;

import common.BasePage;
import locators.login.LoginLocators;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        enterText(LoginLocators.usernameField, username);
    }

    public void enterPassword(String password) {
        enterText(LoginLocators.passwordField,password);
    }

    public void clickLoginButton() {
        clickElement(LoginLocators.loginButton);
    }




}
