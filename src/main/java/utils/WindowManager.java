package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.json.JsonOutput;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }


    public WindowManager() {}


    public void goBack() {
        navigate.back();
    }


    public void goForward() {
        navigate.forward();
    }

    public void refresh() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }


    public void switchToTab(String tabTitle){
        Set<String> windows = driver.getWindowHandles();

        System.out.println("# of tabs: " + windows.size());
        System.out.println("tabs titles:");
        windows.forEach(System.out::println);

        for (String window : windows){

            System.out.println("switching to tab " + window);
            driver.switchTo().window(window);

            System.out.println("tab title is " + driver.getTitle());

            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }

}