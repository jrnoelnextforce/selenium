package models.dashboard.forms;

import common.BasePage;
import models.dashboard.DashboardPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends BasePage {

    private static final By practiceFormMenuItem = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");

    public FormsPage(WebDriver driver) {
        super(driver);
    }

    public PracticeFormPage clickPracticeForm() {
        clickElement(practiceFormMenuItem);
        return new PracticeFormPage(driver);
    }


}
