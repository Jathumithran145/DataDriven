package test;

import com.pages.DashboardPage;

import com.pages.LoginPage;

import org.testng.annotations.Test;
import utils.TestBase;


public class LoginTest extends TestBase {


    @Test
    public void LoginTest() {


        LoginPage.setUserName("Admin");

        LoginPage.setPass("admin123");

        LoginPage.ClickLogin();

    }
    @Test(priority = 1,dataProviderClass = LoginData.class, dataProvider = "LoginTestData")
    public void LoginDataDrivenTest( String Username , String Password  ) {


        LoginPage.setUserName( Username);

        LoginPage.setPass(Password);

        LoginPage.ClickLogin();

    }

    }


