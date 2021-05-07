package forgotPassword;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testForgottenEmail() {
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPasswordPage();
        ForgotPasswordPage.InternalErrorPage internalErrorPage = forgotPasswordPage.submitEmail();

        Assert.assertEquals(internalErrorPage.getErrorText(), "Internal Server Error", "wrong error message");

    }
}
