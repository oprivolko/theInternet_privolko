package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.xpath("//input[@type='range']");
    private By sliderValue = By.xpath("//*[@id='range']");


    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement clickSlider() {
        WebElement webElement = driver.findElement(slider);
        Actions action = new Actions(driver);
        for (int i = 0; i < 3; i++) {
            action.click((WebElement) webElement).build().perform();
            action.sendKeys(Keys.ARROW_RIGHT).build().perform();
        }
        return driver.findElement(sliderValue);

    }


}


