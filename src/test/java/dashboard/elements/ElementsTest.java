package dashboard.elements;

import base.BaseTest;
import models.dashboard.elements.LinksPage;
import models.dashboard.elements.WebTablesPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {

    @Test
    public void shouldEditAgeAndSubmitRegistrationForm() {
        String email = "kierra@example.com";
        String expectedAge = "20";
        WebTablesPage webTablesPage = dashboardPage.navigateToElementsCard().clickWebTables();
        webTablesPage.clickEditButtonForRow(email);
        webTablesPage.enterAgeInRegistrationModal(expectedAge);
        webTablesPage.clickSubmitButtonInRegistrationModal();
        String actualAge = webTablesPage.getAgeFromTableForEmail(email);
        //assertTrue( false, "Error Message");
        assertEquals(actualAge, expectedAge, " \n Age should be updated to " + expectedAge + " after editing and submitting the registration form. \n ");
    }

    @Test
    public void shouldDisplay404AndNotFoundAfterClickingNotFoundLink() {
        String expectedText = "Not Found";
        String expectedStatusCode = "404";
        LinksPage linksPage = dashboardPage.navigateToElementsCard().clickLinks();
        linksPage.clickNotFoundLink();
        String actualText = linksPage.getResponseCodeText();
        assertTrue(actualText.contains(expectedText) && actualText.contains(expectedStatusCode),
                " \n The text displayed after clicking the Not Found link should contain '" + expectedText + "' and '" + expectedStatusCode +"'. \n " +
                        "Actual result: " + actualText);
    }

}
