package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WisiwigEditorPage {
    private WebDriver driver;
    private String frameId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.xpath(".//button[@title='Increase indent']");

    public WisiwigEditorPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clearTextArea() {
        switchToTextArea();
        driver.findElement(textArea).clear();
        switchToMainPage();
    }


    public void switchToTextArea() {
        driver.switchTo().frame(frameId);
    }

    public void switchToMainPage() {
        driver.switchTo().parentFrame();
    }

    public void sendTextToTextArea(String text){
        switchToTextArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainPage();
    }


    public void setIncreaseIndent(){
        driver.findElement(increaseIndentButton).click();
    }


    public String getTextAreaContent(){
        switchToTextArea();
        String text = driver.findElement(textArea).getText();
        switchToMainPage();
        return text;
    }

}