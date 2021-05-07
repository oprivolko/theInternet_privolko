package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ForgotPasswordPage {
    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailField = By.id("email");
    private By retrievePasswordButton = By.xpath("//button[@id='form_submit']");


    public InternalErrorPage submitEmail() {
        driver.findElement(emailField).sendKeys("email@test.com");
        driver.findElement(retrievePasswordButton).click();

        return new InternalErrorPage(driver);
    }


    public class InternalErrorPage {
        private WebDriver driver;

        public InternalErrorPage(WebDriver driver) {
            this.driver = driver;
        }

        public String getErrorText() {
            return driver.findElement(By.xpath("//*[text()='Internal Server Error']")).getText();

        }
    }

}
