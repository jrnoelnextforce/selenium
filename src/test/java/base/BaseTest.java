package base;

import common.BasePage;
import models.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    private String url = "https://www.saucedemo.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        loginPage = new LoginPage(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        try{
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Exception during driver teardown: " + e.getMessage());
        }
    }
}
