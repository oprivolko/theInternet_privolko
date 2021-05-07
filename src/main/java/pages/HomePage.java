package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    private WebElement clickLink (String linkText){

        return driver.findElement(By.linkText(linkText));
    }


    public LoginPage clickFormAuthentication (){
        clickLink("Form Authentication").click();
        return new LoginPage(driver);
    }


    public DropdownPage clickDropDownPage (){
        clickLink("Dropdown").click();
        return new DropdownPage(driver);
    }

    public HoversPage clickHovers (){
        clickLink("Hovers").click();
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPressesPage() {
        clickLink("Key Presses").click();
        return new KeyPressesPage(driver);
    }
    public AlertsPage clickJavaScriptAlerts() {
        clickLink("JavaScript Alerts").click();
        return new AlertsPage(driver);
    }


    public FileUploadPage clickFileUpload() {
        clickLink("File Upload").click();
        return new FileUploadPage(driver);
    }

    public EntryAdPage clickEntryAd() {
        clickLink("Entry Ad").click();
        return new EntryAdPage(driver);
    }

    public ShiftingContentPage clickShiftingContentPage() {
        clickLink("Shifting Content").click();
        return new ShiftingContentPage(driver);
    }

    public HorizontalSliderPage clickHorizontalSliderPage() {
        clickLink("Horizontal Slider").click();
        return new HorizontalSliderPage(driver);
    }

    public WisiwigEditorPage clickWysiwygEditorPage() {
        clickLink("WYSIWYG Editor").click();
        return new WisiwigEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPage() {
        clickLink("Dynamic Loading").click();
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDomPage clickLargeAndDeepDomPage() {
        clickLink("Large & Deep DOM").click();
        return new LargeAndDeepDomPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScrollPage() {
        clickLink("Infinite Scroll").click();
        return new InfiniteScrollPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindowsPage() {
        clickLink("Multiple Windows").click();
        return new MultipleWindowsPage(driver);
    }

    public ForgotPasswordPage clickForgotPasswordPage() {
        clickLink("Forgot Password").click();
        return new ForgotPasswordPage(driver);
    }

}
