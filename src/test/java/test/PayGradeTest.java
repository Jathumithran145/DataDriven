package test;

import com.pages.AddJobTitle;
import com.pages.JathuDashBoad;
import com.pages.JathuLogin;
import com.pages.PayGradesPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class PayGradeTest extends TestBase {

    @Test
    public void SavePayGradesTest() {
        softAssert = new SoftAssert();

        softAssert.assertTrue(JathuLogin.isHrmLoginPageDisplayed(), "Login Page is not Displayed");
        JathuLogin.SetUserName("Admin");
        JathuLogin.Setpass("admin123");
        JathuLogin.ClickLogin();
        softAssert.assertTrue(JathuDashBoad.isHrmDashboardPageDisplayed(), "DashBoard Page is not Displayed");

        JathuDashBoad.ClickAdmin();
        PayGradesPage.ClickAdminJob();
        PayGradesPage.ClickAdminPayGrades();
        softAssert.assertTrue(PayGradesPage.isHrmJPayGradePageDisplayed(), "JPayGrade Page is not Displayed");
        PayGradesPage.ClickAddButton();
        PayGradesPage.setname("Jathu");
        PayGradesPage.ClickButtonSave();

    }

}
