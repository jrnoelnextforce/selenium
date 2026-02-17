package models.dashboard.widgets;

import static common.PageUtil.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePickerMenuPage extends WidgetsPage {

    private static final By selectDatePickerInput = By.id("datePickerMonthYearInput");
    private static final By selectDateAndTimePickerInput = By.id("dateAndTimePickerInput");
    private static final By datePickerMonthDropDown = By.cssSelector(".react-datepicker__month-select");
    private static final By datePickerYearDropDown = By.cssSelector(".react-datepicker__year-select");

    private By datePickerDay(int day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickDayFromDatePicker(int day) {
        clickElement(datePickerDay(day));
    }

    public boolean isDayFromDatePickerDisplayed(int day) {
        return findElement(datePickerDay(day)).isDisplayed();
    }

    public DatePickerMenuPage(WebDriver driver) {
        super(driver);
    }

    public String getSelectDatePickerInputValue() {
        return findElement(selectDatePickerInput).getAttribute("value");
    }

    public void clickSelectDatePickerInput() {
        clickElement(selectDatePickerInput);
    }

    public void clickSelectDateAndTimePickerInput() {
        clickElement(selectDateAndTimePickerInput);
    }

    public String getSelectDateAndTimePickerInputValue() {
        return findElement(selectDateAndTimePickerInput).getAttribute("value");
    }

    public void selectMonthFromDatePicker(String month) {
        selectOptionByVisibleText(driver, datePickerMonthDropDown, month);
    }

    public void selectYearFromDatePicker(String year) {
        selectOptionByVisibleText(driver, datePickerYearDropDown, year);
    }


}
