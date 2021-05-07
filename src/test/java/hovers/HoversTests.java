package hovers;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

import java.util.Base64;

import static org.testng.Assert.assertTrue;

public class HoversTests extends BaseTests {

   @Test
    public void testHoverUser(){

        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.PictureCaption caption = hoversPage.hoverOverPicture(0);
        Assert.assertTrue(caption.captionIsDisplayed());
        Assert.assertEquals(caption.getHeaderText(), "name: user1", "wrong user title");
        Assert.assertEquals(caption.geLinkText(), "View profile", "wrong link text");
        Assert.assertEquals(caption.geLinkHref(), "/user/1", "wrong link href attr");
    }
}
