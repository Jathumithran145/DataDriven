package com.pages;

import org.openqa.selenium.By;
import utils.PageBase;

public class AddJobTitle extends PageBase {

    private static By AdminJob = By.id("menu_admin_Job");
    private static By AdminJobTitle = By.id("menu_admin_viewJobTitleList");
    private static By AddButton = By.id("btnAdd");
    private static By txtJobTitle = By.id("jobTitle_jobTitle");
    private static By txtNote = By.id("jobTitle_note");

    private static By txtJobDescription = By.id("jobTitle_jobDescription");
    private static By txtobSpecification = By.id("jobTitle_jobSpec");

    private static By DeleteButton = By.id("btnDelete");
    private static By JobTitleCheckBox = By.id("ohrmList_chkSelectAll");
    private static By ConForomOk = By.id("dialogDeleteBtn");




    private static By HrmJobTitle = By.xpath("//*[@id=\"search-results\"]/div[1]/h1");

   // private static By AddJobTitleHeader = By.xpath("//h1");


    private static By ButtonSave = By.id("btnSave");



    public static void ClickAdminJob() {
        getDriver().findElement(AdminJob).click();

    }
    public static void ClickAdminJobTitle() {
        getDriver().findElement(AdminJobTitle).click();

    }

    public static void ClickAddButton() {
        getDriver().findElement(AddButton).click();

    }

//    public static void ClickSaveButton() {
//        getDriver().findElement(SaveButton).click();
//
//    }



    public static void ClickDeleteButton() {
        getDriver().findElement(DeleteButton).click();

    }



    public static void ClickCheckBox() {
        getDriver().findElement(JobTitleCheckBox).click();

    }

       public static void ClickConForomOk() {
        getDriver().findElement(ConForomOk).click();

    }




//    public static boolean isDisplayAddJobTitleHeader() {
//        return getDriver().findElement(AddJobTitleHeader).isDisplayed();
//    }



    public static void setJobTitle(String JobTitle) {
        getDriver().findElement(txtJobTitle).sendKeys(JobTitle);

    }



    public static void setJobDescription(String Description) {
        getDriver().findElement(txtJobDescription).sendKeys(Description);

    }



    public static void ClickButtonpecifica() {
        getDriver().findElement(txtobSpecification).click();

    }



    public static void setNote(String Note) {
        getDriver().findElement(txtNote).sendKeys(Note);

    }



    public static void ClickButtonSave() {
        getDriver().findElement(ButtonSave).click();

    }
    public static boolean isHrmJobTitlePageDisplayed() {
        return getDriver().findElement(HrmJobTitle).isDisplayed();

    }
}
