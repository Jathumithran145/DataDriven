package test;

import com.pages.AddJobTitle;
import com.pages.JathuDashBoad;
import com.pages.JathuLogin;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class JobTitleTEst extends TestBase {
    @Test
    public void SaveJobTitleTest() {
        softAssert = new SoftAssert();
        softAssert.assertTrue(JathuLogin.isHrmLoginPageDisplayed(), "Login Page is not Displayed");
        JathuLogin.SetUserName("Admin");
        JathuLogin.Setpass("admin123");
        JathuLogin.ClickLogin();
        softAssert.assertTrue(JathuDashBoad.isHrmDashboardPageDisplayed(), "DashBoard Page is not Displayed");

        JathuDashBoad.ClickAdmin();
        AddJobTitle.ClickAdminJob();
        AddJobTitle.ClickAdminJobTitle();
        softAssert.assertTrue(AddJobTitle.isHrmJobTitlePageDisplayed(), "JobTitle Page is not Displayed");

        AddJobTitle.ClickAddButton();
        //softAssert.assertTrue(AddJobTitle.isDisplayAddJobTitleHeader(), "JobAdd  Title is not Displayed");
        AddJobTitle.setJobTitle("QA Testing ");
        AddJobTitle.setJobDescription("Test jathu");
        AddJobTitle.setNote(" Noteed ");
        //AddJobTitle.ClickSaveButton();

    }
}
