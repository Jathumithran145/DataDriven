package com.pages;

import org.openqa.selenium.By;
import utils.PageBase;


public class JathuDashBoad extends PageBase {
    private static By DashAdmin = By.id("menu_admin_viewAdminModule");
    private static By DashUserManagenment = By.id("menu_admin_UserManagement");
    private static By DashUser = By.id("menu_admin_viewSystemUsers");
    private static By DashAdd = By.id("btnAdd");
    private static By HrmDashboard =By.className("head");








    public static void ClickAdmin(){
        getDriver().findElement(DashAdmin).click();
    }
    public static void ClickUserManagenment(){
        getDriver().findElement(DashUserManagenment).click();
    }
    public static void ClickUser(){
        getDriver().findElement(DashUser).click();
    }
    public static void ClickAdd(){
        getDriver().findElement(DashAdd).click();
    }
    public static boolean isHrmDashboardPageDisplayed() {
        return getDriver().findElement(HrmDashboard).isDisplayed();

    }



}

