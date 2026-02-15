package dashboard;

import base.BaseTest;
import models.dashboard.forms.FormsPage;
import org.testng.annotations.Test;

public class DashboardTest extends BaseTest {

    @Test
    public void shouldScrollToFormsSection() {
        FormsPage formsPage = dashboardPage.navigateToFormsCard();
        // Add assertions here to verify that the forms section is visible after scrolling
    }
}
