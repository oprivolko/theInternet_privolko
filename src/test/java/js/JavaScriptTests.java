package js;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LargeAndDeepDomPage;

public class JavaScriptTests extends BaseTests {
    @Test
    public  void testJS(){
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeepDomPage();
        largeAndDeepDomPage.scrollToTable();
    }
}
