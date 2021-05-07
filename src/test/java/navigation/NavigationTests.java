package navigation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigation(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        DynamicLoadingPage.Example1Page example1Page = dynamicLoadingPage.clickExample1();

        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refresh();
        getWindowManager().goTo("https://tut.by");
    }

    @Test
    public void testSwitchToTab(){
        homePage.clickMultipleWindowsPage().setClickHereLink();
        getWindowManager().switchToTab("New Window");
    }


}