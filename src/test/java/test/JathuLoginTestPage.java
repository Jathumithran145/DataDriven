package test;

import com.pages.JathuDashBoad;
import com.pages.JathuLogin;
import com.pages.JatuAddUser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class JathuLoginTestPage extends TestBase {

    @Test
    public void LoginTest(){
        softAssert = new SoftAssert();
       softAssert.assertTrue(JathuLogin.isHrmLoginPageDisplayed(), "Login Page is not Displayed");
        JathuLogin.SetUserName("Admin");
        JathuLogin.Setpass("admin123");
        JathuLogin.ClickLogin();

        softAssert.assertTrue(JathuDashBoad.isHrmDashboardPageDisplayed(), "DashBoard Page is not Displayed");
        JathuDashBoad.ClickAdmin();
        JathuDashBoad.ClickUserManagenment();
        JathuDashBoad.ClickUser();

        softAssert.assertTrue(JatuAddUser.isHrmAddUserPageDisplayed(), "Add User Page is not Displayed");
        JathuDashBoad.ClickAdd();

        /**
         * Add User Page......
         */

        JatuAddUser.UserEmployeName("Arunsabari");
        JatuAddUser.UserUserName("John Smith");
        JatuAddUser.UserAddpassword("admin123");
        JatuAddUser.UserAddConformPassword("admin123");
        JatuAddUser.UserAddClick();



    }

}
