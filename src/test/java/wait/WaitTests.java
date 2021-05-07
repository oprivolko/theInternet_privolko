package wait;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;

public class WaitTests extends BaseTests {
    @Test
    public void testWaits(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickDynamicLoadingPage();
        DynamicLoadingPage.Example1Page  example1Page = dynamicLoadingPage.clickExample1();


        example1Page.clickStartButton();
        Assert.assertEquals(example1Page.getFinishText(), "Hello World!", "wrong finish text");
    }

}
