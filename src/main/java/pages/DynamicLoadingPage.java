package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }


    private By example1 = By.linkText("Example 1: Element on page that is hidden");

    public Example1Page clickExample1() {
        driver.findElement(example1).click();
        return new Example1Page(driver);

    }


    public class Example1Page {
        private WebDriver driver;
        private By startButton = By.cssSelector("#start button");
        private By loadingIndicator = By.id("loading");
        private By finishText = By.id("finish");


        public Example1Page(WebDriver driver) {
            this.driver = driver;
        }


        public void clickStartButton() {
            driver.findElement(startButton).click();
            WebDriverWait wait = new WebDriverWait(driver, 7);
            wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
        }


        public String getFinishText() {
            return driver.findElement(finishText).getText();

        }


    }


}
