package pages;

import org.openqa.selenium.*;

public class LargeAndDeepDomPage {

    private WebDriver driver;
    private By tableLocator = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver) {
        this.driver = driver;
    }

public void scrollToTable(){
    WebElement table = driver.findElement(tableLocator);
    String script = "arguments[0].scrollIntoView()";
    ((JavascriptExecutor)driver).executeScript(script, table);


}





}
