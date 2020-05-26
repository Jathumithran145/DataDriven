package test;

import com.pages.LoginPage;
import org.testng.asserts.SoftAssert;

public class PageLogin {
    public static void login(){
      //  softAssert = new SoftAssert();
      //  softAssert.assertTrue(LoginPage.isHrmLoginPageDisplayed(), "HrmLogin Page Not Display");
        LoginPage.setUserName("Admin");
        LoginPage.setPass("admin123");
        LoginPage.ClickLogin();
    }
}
