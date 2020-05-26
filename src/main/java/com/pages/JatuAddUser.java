package com.pages;


import org.openqa.selenium.By;
import utils.PageBase;

public class JatuAddUser extends PageBase {

    private static By AddUserEmployeName = By.id("systemUser_employeeName_empName");
    private static By AddUserName = By.id("systemUser_userName");
    // private static By AddStatus = By.id("systemUser_status");
    private static By AddPassword = By.id("systemUser_password");
    private static By AddConformPassword = By.id("systemUser_confirmPassword");
    private static By AddClick = By.id("btnSave");
    private static By HrmAddUserheader =By.xpath("//*[@id=\"systemUser-information\"]/a");

    public static void UserEmployeName ( String jathu){
        getDriver().findElement(AddUserEmployeName).sendKeys(jathu);
    }
    public static void UserUserName (String Name) {
        getDriver().findElement(AddUserName).sendKeys(Name);
    }

//    public static Void UserStatus ( String ) {
//        getDriver().fi ndElement(AddStatus).sendKeys();
//    }

    public static void UserAddpassword ( String Password) {
        getDriver().findElement(AddPassword).sendKeys(Password);
    }
    public static void UserAddConformPassword ( String ConformPassword) {
        getDriver().findElement(AddConformPassword).sendKeys(ConformPassword);
    }
    public static void UserAddClick(){
        getDriver().findElement(AddClick).click();

    }
    public static boolean isHrmAddUserPageDisplayed() {
        return getDriver().findElement(HrmAddUserheader).isDisplayed();

    }

}

