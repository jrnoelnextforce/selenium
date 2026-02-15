package models.dashboard.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTablesPage extends ElementsPage {

    private static final By registrationModalAgeInputField = By.id("age");
    private static final By registrationModalSubmitButton = By.id("submit");

    public WebTablesPage(WebDriver driver) {
        super(driver);
    }

    public void clickEditButtonForRow(String email) {
        By editButtonLocator = By.xpath("//td[text()='" + email + "']/following-sibling::td//span[@title='Edit']");
        clickElement(editButtonLocator);
    }

    public void enterAgeInRegistrationModal(String age) {
        enterText(registrationModalAgeInputField, age);
    }

    public void clickSubmitButtonInRegistrationModal() {
        clickElement(registrationModalSubmitButton);
    }

    public String getAgeFromTableForEmail(String email) {
        By ageCellLocator = By.xpath("//td[text()='" + email + "']/preceding-sibling::td[1]");
        return findElement(ageCellLocator).getText();
    }

}
