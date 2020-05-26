package com.pages;

import org.openqa.selenium.By;
import utils.PageBase;

public class PayGradesPage extends PageBase {

    private static By AdminJob = By.id("menu_admin_Job");
    private static By AdminPayGrades = By.id("menu_admin_viewPayGrades");
    private static By AddButton = By.id("btnAdd");
    private static By txtname = By.id("payGrade_name");
    private static By ButtonSave= By.id("btnSave");
//    private static By DeleteButton= By.id("btnDelete");
    private static By HrmPayGrade = By.xpath("//*[@id=\"search-results\"]/div[1]/h1");




    public static void ClickAddButton(){
        getDriver().findElement(AddButton).click();

    }

//    public static void ClickDeleteButton(){
//        getDriver().findElement(DeleteButton).click();
//
//    }

    public static void setname(String name) {
        getDriver().findElement(txtname).sendKeys(name);

    }


    public static void ClickButtonSave(){
        getDriver().findElement(ButtonSave).click();

    }
    public static void ClickAdminJob() {
        getDriver().findElement(AdminJob).click();

    }
    public static void ClickAdminPayGrades() {
        getDriver().findElement(AdminPayGrades).click();

    }
    public static boolean isHrmJPayGradePageDisplayed() {
        return getDriver().findElement(HrmPayGrade).isDisplayed();

    }

}
