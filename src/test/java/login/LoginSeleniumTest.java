package login;

import base.BaseTest;
import models.product.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSeleniumTest extends BaseTest {

    @Test
    public void shouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");

        ProductPage productPage = loginPage.clickLoginButton();
        Assert.assertTrue(productPage.isProductHeaderTitleDisplayed());
    }

    @Test
    public void shouldShowErrorMessageWithInvalidCredentials() {
        loginPage.enterUsername("invalid_user");
        loginPage.enterPassword("invalid_password");
        loginPage.clickLoginButton();

        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(loginPage.getErrorMessage(), expectedErrorMessage);
    }
}
