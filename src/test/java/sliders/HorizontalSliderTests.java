package sliders;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;

public class HorizontalSliderTests extends BaseTests {
    @Test
    public void testSliders(){
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSliderPage();
        Assert.assertEquals(horizontalSliderPage.clickSlider(), 4, "wrong slider value");
    }
}
