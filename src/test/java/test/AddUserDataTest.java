package test;

import com.pages.DashboardPage;
import com.pages.JathuDashBoad;
import com.pages.JatuAddUser;
import com.pages.LoginPage;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.TestBase;

public class AddUserDataTest extends TestBase {
    @Test(priority = 1,dataProviderClass = AddUserData.class, dataProvider = "AddUserTestData")

    public void AddUserDataDrivenTest( String EmployeName , String UserName , String  Addpassword , String ConformPassword ) {
//        softAssert = new SoftAssert();
//        softAssert.assertTrue(JathuDashBoad.isHrmDashboardPageDisplayed(), "DashBoard Page is not Displayed");

        JathuDashBoad.ClickAdmin();
        JathuDashBoad.ClickUserManagenment();
        JathuDashBoad.ClickUser();
        softAssert.assertTrue(JatuAddUser.isHrmAddUserPageDisplayed(), "Add User Page is not Displayed");
        JathuDashBoad.ClickAdd();



        JatuAddUser.UserEmployeName(EmployeName);
        JatuAddUser.UserUserName(UserName);
        JatuAddUser.UserAddpassword(Addpassword);
        JatuAddUser.UserAddConformPassword(ConformPassword);
        JatuAddUser.UserAddClick();

    }
}
