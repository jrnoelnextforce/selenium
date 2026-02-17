package dashboard.alertsframewidows;

import base.BaseTest;
import common.PageUtil;
import models.dashboard.alertframewindows.AlertsPage;
import models.dashboard.alertframewindows.FramesPage;
import models.dashboard.alertframewindows.ModalDialogsPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
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

    @Test
    public void shouldHandleAlerts() {
        String expectedAlertText = "You clicked a button";
        AlertsPage alertsPage = dashboardPage.navigateToAlertsFrameWindowsCard().clickAlerts();
        alertsPage.clickAlertButton();
        assertEquals(PageUtil.getAlertText(driver), expectedAlertText, " \n The alert text should match the expected text after clicking the alert button. \n ");
        PageUtil.acceptAlert(driver);
    }

    @Test
    public void shouldHandlePrompts() {
        String inputText = "Test Input";
        String expectedPromptResult = "You entered " + inputText;
        AlertsPage alertsPage = dashboardPage.navigateToAlertsFrameWindowsCard().clickAlerts();
        alertsPage.clickPromptButton();
        PageUtil.sendKeysToAlert(driver, inputText);
        PageUtil.acceptAlert(driver);
        String actualPromptResult = alertsPage.getPromptResultText();
        assertEquals(actualPromptResult, expectedPromptResult, " \n The prompt result text should match the expected text after entering input and accepting the prompt. \n ");
    }

    @Test
    public void shouldHandleFrames() {
        String expectedFrameText = "This is a sample page";
        FramesPage framesPage = dashboardPage.navigateToAlertsFrameWindowsCard().clickFrames();
        String actualFrameText = framesPage.getFramesText();
        assertEquals(actualFrameText, expectedFrameText, " \n The text inside the frame should match the expected text. \n ");
        String backToMainContentText = framesPage.getDefaultContentHeaderText();
        String expectedMainContentHeaderText = "Frames";
        assertEquals(backToMainContentText, expectedMainContentHeaderText, " \n After switching back to the main content, the header text should match the expected text. \n ");
    }

}
