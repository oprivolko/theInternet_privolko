package modals;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class ModalTests extends BaseTests {
    @Test
    public void testModal() {

        EntryAdPage entryAdPage = homePage.clickEntryAd();
        Assert.assertEquals(entryAdPage.getTitle(), "THIS IS A MODAL WINDOW", "wrong modal title");
        entryAdPage.closeModal();
    }


}
