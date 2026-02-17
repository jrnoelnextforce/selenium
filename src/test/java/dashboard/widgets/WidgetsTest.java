package dashboard.widgets;

import base.BaseTest;
import models.dashboard.widgets.DatePickerMenuPage;
import models.dashboard.widgets.SelectMenuPage;
import org.testng.Assert.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
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

    @Test
    public void shouldSelectDate() {
        String month = "May";
        String monthNumber = "05";
        String year = "2024";
        int day = 15;

        DatePickerMenuPage datePickerMenuPage = dashboardPage.navigateToWidgetsCard().clickDatePicker();
        datePickerMenuPage.clickSelectDatePickerInput();
        datePickerMenuPage.selectMonthFromDatePicker(month);
        datePickerMenuPage.selectYearFromDatePicker(year);
        datePickerMenuPage.clickDayFromDatePicker(day);

        String expectedDate = datePickerMenuPage.getSelectDatePickerInputValue();
        String actualDate = monthNumber + "/" + day + "/" + year;

        assertEquals(expectedDate, actualDate, "\n The selected date should be displayed in the input field in the format MM/DD/YYYY. " +
                "\n Expected date: " + actualDate + " " +
                "\n Actual date: " + expectedDate);
    }


}
