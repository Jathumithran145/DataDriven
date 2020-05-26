package com.pages;

import org.openqa.selenium.By;
import utils.PageBase;

public class JathuLogin extends PageBase {
    private static By Username = By.name("txtUsername");
    private static By Passworld = By.id("txtPassword");
    private static By LoginClick = By.id("btnLogin");
    private static By HrmHeader =By.id("logInPanelHeading");

    public static void SetUserName( String jathu ){
        getDriver().findElement(Username).sendKeys(jathu);
    }
    public static void Setpass( String pass ){
        getDriver().findElement(Passworld).sendKeys(pass);
    }
    public static void ClickLogin(){
        getDriver().findElement(LoginClick).click();

    }
    public static boolean isHrmLoginPageDisplayed() {
        return getDriver().findElement(HrmHeader).isDisplayed();

    }
}

