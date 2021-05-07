package base;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.EventReporter;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;


public class BaseTests {

    //private ChromeDriver driver;
    private EventFiringWebDriver driver;
    private String link = "http://the-internet.herokuapp.com/";
    public HomePage homePage;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        //driver = new EventFiringWebDriver();
        driver.manage().window().maximize();
        goHome();
        //setCookie();
        homePage = new HomePage(driver);
    }


    @BeforeMethod
    public void goHome() {
        driver.get(link);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }


    public void takeScreenshot(ITestResult result) throws IOException {
        TakesScreenshot camera = (TakesScreenshot) driver;
        File screenshot = camera.getScreenshotAs(OutputType.FILE);
        //System.out.println(screenshot.getAbsolutePath());
        com.google.common.io.Files.move(screenshot, new File("src/test/resources/screenshots/screenshot" + result.getName() + "png"));
    }

    @AfterMethod
    public void recordFailure(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot(result);
        }
    }


    private ChromeOptions getChromeOptions() {
        ChromeOptions options = new ChromeOptions();

        //убрать с браузера плашку "chrome is controlled by automated software"
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

        //запустить тест, не запуская на ui браузер
        options.setHeadless(true);
        return options;
    }


   /* private void setCookie() {
        Cookie cookie = new Cookie
                .Builder("Stormnet", "1234")
                .domain("the-internet.herokuapp.com/")
                .build();
        driver.manage().addCookie(cookie);
        driver.manage().deleteCookieNamed("optimizelyBuckets");
    }*/


}