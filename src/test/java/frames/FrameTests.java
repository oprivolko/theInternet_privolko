package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WisiwigEditorPage;

public class FrameTests extends BaseTests {
    @Test
    public void testEditor(){
        WisiwigEditorPage wisiwigEditorPage = homePage.clickWysiwygEditorPage();
        wisiwigEditorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "world! ";
        wisiwigEditorPage.sendTextToTextArea(text1);
        wisiwigEditorPage.setIncreaseIndent();
        wisiwigEditorPage.sendTextToTextArea(text2);

        Assert.assertEquals(wisiwigEditorPage.getTextAreaContent(), text1 + text2, "wrong text in text area");
    }

}
