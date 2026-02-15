package dashboard.forms;

import base.BaseTest;
import models.dashboard.forms.PracticeFormPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FormsTest extends BaseTest {

    @Test
    public void shouldSelectMaleGenderRadioButton() {
        PracticeFormPage practiceFormPage = dashboardPage.navigateToFormsCard().clickPracticeForm();
        practiceFormPage.selectMaleGender();
        assertTrue(practiceFormPage.isMaleGenderRadioButtonSelected(), " \n Male radio button should be selected after clicking on it. \n ");
    }

    @Test
    public void shouldSelectAndDeselectSportsHobbiesCheckbox() {
        PracticeFormPage practiceFormPage = dashboardPage.navigateToFormsCard().clickPracticeForm();
        practiceFormPage.selectSportsHobbies();
        assertTrue(practiceFormPage.isSportsHobbiesSelected(), " \n Sports hobbies checkbox should be selected after clicking on it. \n ");
        practiceFormPage.deselectSportsHobbies();
        assertFalse(practiceFormPage.isSportsHobbiesSelected(), " \n Sports hobbies checkbox should be deselected after clicking on it again. \n ");
    }
}
