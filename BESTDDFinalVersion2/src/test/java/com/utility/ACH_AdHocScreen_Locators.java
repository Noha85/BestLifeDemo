package com.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ACH_AdHocScreen_Locators {

	public WebDriver browserObject ;
	public By PrimaryNumber = By.id("ctl00_DefaultContent_uxPrimaryNumberField");
	public By PrimaryNumSearch_btn = By.id("ctl00_DefaultContent_uxSearchCommand");
	public By Prim_ACH_Btn = By.id("ctl00_DefaultContent_uxPrimaryACHCommand");
	public By AdHoc_btn = By.id("ctl00_DefaultContent_uxACHSetup_uxAccountACHSetupTabContainer_uxACHAdHocTab");
	public By AdHoc_act_DDL =By.id("ctl00_DefaultContent_uxACHSetup_uxAdHocActionsList");
	public By current_bal_due_tbl =By.id("ctl00_DefaultContent_uxACHSetup_uxAdHocDebitDateCalendar");
	public By current_bal_due=By.xpath("//*[@id=\"ctl00_DefaultContent_uxACHSetup_uxBalanceDueField_uxCurrencyField\"]/tbody/tr/td");
	public By pay_full_chk =By.id("ctl00_DefaultContent_uxACHSetup_uxBalanceDueCheck");
	public By pay_amt =By.id("ctl00_DefaultContent_uxACHSetup_uxPayAmountField");
	public By Submit_Adhoc_btn=By.id("ctl00_DefaultContent_uxACHSetup_uxAdHocSaveCommand");
	public By Done_Adhoc_btn=By.id("ctl00_DefaultContent_uxACHSetup_uxAdHocDoneCommand");
	public By Yes_popup_btn=By.id("ctl00_DefaultContent_uxACHSetup_uxAdHocACHTransactionConfirmationYesCommand");
	public By No_popup_btn=By.id("ctl00_DefaultContent_uxACHSetup_uxAdHocACHTransactionConfirmationNoCommand");
	public By Done_trans_btn=By.id("ctl00_DefaultContent_uxACHSetup_uxTransactionsDoneCommand");
	
}
