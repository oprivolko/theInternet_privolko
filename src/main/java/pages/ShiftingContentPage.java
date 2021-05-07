package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ShiftingContentPage {
    private WebDriver driver;

    public ShiftingContentPage(WebDriver driver) {

        this.driver = driver;
    }


    private WebElement clickLink(String linkText) {

        return driver.findElement(By.linkText(linkText));

    }

    public ShiftingContentMenuPage clickShiftingContentMenu() {
        clickLink("Example 1: Menu Element").click();
        return new ShiftingContentMenuPage(driver);
    }



    public class ShiftingContentMenuPage {

        private WebDriver driver;

        public ShiftingContentMenuPage(WebDriver driver) {

            this.driver = driver;
        }


        public int countLiLinks() {
            List<WebElement> liLinks = driver.findElements(By.tagName("li"));

            for (WebElement link : liLinks) {
                System.out.println(link.getText());
            }

            return liLinks.size();
        }
    }

}