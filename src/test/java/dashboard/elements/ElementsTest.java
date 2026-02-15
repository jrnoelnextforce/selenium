package dashboard.elements;

import base.BaseTest;
import models.dashboard.elements.WebTablesPage;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class ElementsTest extends BaseTest {

    @Test
    public void shouldEditAgeAndSubmitRegistrationForm() {
        String email = "alden@example.com";
        String expectedAge = "20";
        WebTablesPage webTablesPage = dashboardPage.navigateToElementsCard().clickWebTables();
        webTablesPage.clickEditButtonForRow(email);
        webTablesPage.enterAgeInRegistrationModal(expectedAge);
        webTablesPage.clickSubmitButtonInRegistrationModal();
        assertEquals(webTablesPage.getAgeFromTableForEmail(email), expectedAge, " \n Age should be updated to " + expectedAge + " after editing and submitting the registration form. \n ");
    }

}
