package test;

import com.pages.JathuLogin;
import com.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class AddJobTitleTest extends TestBase {

    @Test(priority = 1,dataProviderClass = AddJobTitle.class, dataProvider = "AddJobTitleTest")
    public void AddJobTitleDrivenTest( String JobTitle , String JobDescription , String Note ) {
        softAssert = new SoftAssert();

        com.pages.AddJobTitle.ClickAdminJob();
        com.pages.AddJobTitle.ClickAdminJobTitle();


        com.pages.AddJobTitle.ClickAddButton();
        softAssert.assertTrue(com.pages.AddJobTitle.isHrmJobTitlePageDisplayed(), "AddJobTitle Page is not Displayed");

        com.pages.AddJobTitle.setJobTitle(JobTitle);
        com.pages.AddJobTitle.setJobDescription(JobDescription);
        com.pages.AddJobTitle.setNote(Note);
        com.pages.AddJobTitle.ClickButtonSave();






    }
}
