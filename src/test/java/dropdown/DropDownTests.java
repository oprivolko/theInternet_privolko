package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption(){
        DropdownPage dropdownPage = homePage.clickDropDownPage();

        String option = "Option 1";
        dropdownPage.selectFromDropDown(option);

        List<String> selectedOption = dropdownPage.getSelectedOption();
        Assert.assertEquals(selectedOption.size(), 1, "wrong # of selections");
        Assert.assertTrue(selectedOption.contains(option), "Option not selected");
    }
}
