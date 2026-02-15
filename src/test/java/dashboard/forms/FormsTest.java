package dashboard.forms;

import base.BaseTest;
import models.dashboard.forms.PracticeFormPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FormsTest extends BaseTest {

    @Test
    public void shouldSelectMaleGenderRadioButton() {
        PracticeFormPage practiceFormPage = dashboardPage.navigateToFormsCard().clickToPracticeForm();
        practiceFormPage.selectMaleGender();
        assertTrue(practiceFormPage.isMaleGenderRadioButtonSelected(), " \n Male radio button should be selected after clicking on it. \n ");
    }
}
