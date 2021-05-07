package shiftingContent;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShiftingContentPage;

public class ShiftingContentTests extends BaseTests {
    @Test
    public void testShiftingContentMenu(){
        ShiftingContentPage shiftingContentPage = homePage.clickShiftingContentPage();
        ShiftingContentPage.ShiftingContentMenuPage shiftingContentMenuPage =  shiftingContentPage.clickShiftingContentMenu();

        Assert.assertEquals(shiftingContentMenuPage.countLiLinks(),5, "wrong li number");
    }
}
