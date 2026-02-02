package login;

import models.dashboard.DashboardPage;
import models.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginSeleniumTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
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

    @Test
    public void shouldLoginSuccessfullyWithValidCredentials() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();

        DashboardPage dashboardPage = new DashboardPage(driver);
        String headerText = dashboardPage.getHeaderTitle().getText();
        Assert.assertEquals(headerText, "Dashboard", "Login failed or Dashboard page not displayed.");
    }
}
