package base;

import common.BasePage;
import common.PageUtil;
import models.dashboard.DashboardPage;
import models.login.LoginPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.FileHandler;

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

    @AfterMethod
    public void takeScreenshotOnFailure(ITestResult testResult) {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
            File destinationFile = new File(System.getProperty("user.dir") + "/resources/screenshots/" + java.time.LocalDate.now() + testResult.getName() + ".png");
            try {
                Files.copy(sourceFile.toPath(), destinationFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException("Failed to save screenshot: " + e.getMessage());
            }
            System.out.println("Screenshot location: " + destinationFile.getAbsolutePath());
        }
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
