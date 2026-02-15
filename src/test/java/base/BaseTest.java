package base;

import common.BasePage;
import common.PageUtil;
import models.dashboard.DashboardPage;
import models.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    private static final String DEMOQA_URL = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //loginPage = new LoginPage(driver);

    }

    @BeforeMethod
    public void loadApplication() {
        PageUtil.navigateToUrl(driver, DEMOQA_URL);
        dashboardPage = new DashboardPage(driver);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        try{
            if (driver != null) {
                Thread.sleep(2000);
                driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Exception during driver teardown: " + e.getMessage());
        }
    }
}
