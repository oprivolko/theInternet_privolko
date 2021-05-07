package fileUpload;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTests extends BaseTests {
    @Test
    public  void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("E://firstProject/chromedriver.exe");
        Assert.assertEquals(fileUploadPage.getUploadFiles(), "chromedriver.exe", "wrong upload");

    }

}
