package product;

import base.BaseTest;
import models.product.ProductPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void shouldDisplayProductHeaderTitle() {
        ProductPage productPage = loginPage.logIntoApplication("standard_user","secret_sauce");
        assertTrue(productPage.isProductHeaderTitleDisplayed(), "Product header title should be displayed after successful login.");
    }
}
