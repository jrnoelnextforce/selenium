package dashboard.widgets;

import base.BaseTest;
import models.dashboard.widgets.SelectMenuPage;
import org.testng.Assert.*;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import java.util.List;

public class WidgetsTest extends BaseTest {

    @Test
    public void shouldMultiSelectMenuItems() {
        SelectMenuPage selectMenuPage = dashboardPage.navigateToWidgetsCard().clickSelectMenu();
        selectMenuPage.selectStandardMultiSelectOption("Volvo","Opel");
        selectMenuPage.selectStandardMultiSelectOption(3);

        List<String> selectedOptions = selectMenuPage.getSelectedStandardMultiSelectOptions();
        assertTrue(selectedOptions.contains("Volvo"), "Volvo should be selected in the multi-select menu.");
        assertTrue(selectedOptions.contains("Opel"), "Opel should be selected in the multi-select menu.");
        assertTrue(selectedOptions.contains("Audi"), "Audi should be selected in the multi-select menu.");
    }


}
