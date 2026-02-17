package dashboard.alertsframewidows;

import base.BaseTest;
import models.dashboard.alertframewindows.ModalDialogsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsFrameWindowsTest extends BaseTest {

    @Test
    public void shouldHandleModalDialog() {
        ModalDialogsPage modalDialogsPage = dashboardPage.navigateToAlertsFrameWindowsCard().clickModalDialogs();
        modalDialogsPage.clickLargeModalButton();
        String actualModalText = modalDialogsPage.getLargeModalText();
        String expectedModalText = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
        assertEquals(actualModalText, expectedModalText, " \n The modal text should match the expected Lorem Ipsum text. \n ");
        modalDialogsPage.clickLargeModalCloseButton();
    }

}
