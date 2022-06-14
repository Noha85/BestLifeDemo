package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrimaryMemberACHSetupScreen_Locators {
	
	public WebDriver browserObject ;
	public By PrimaryNumber = By.id("ctl00_DefaultContent_uxPrimaryNumberField");
	public By PrimaryNumSearch_btn = By.id("ctl00_DefaultContent_uxSearchCommand");
	public By Prim_ACH_Btn = By.id("ctl00_DefaultContent_uxPrimaryACHCommand");
	public By Rout_num = By.id("ctl00_DefaultContent_uxACHSetup_uxABANumberField");
	public By bnk_Lookup_Btn=By.xpath("//input[@value='Bank Lookup']");
	public By Bnk_name = By.xpath("//input[@value='Scrambeld Bank Name']");
	public By Acct_num = By.id("ctl00_DefaultContent_uxACHSetup_uxAccountNumberField");
	public By Acct_Type_DDL = By.id("ctl00_DefaultContent_uxACHSetup_uxAccountTypeList");
	public By ACH_Status_DDL = By.id("ctl00_DefaultContent_uxACHSetup_uxAchStatusList");
	public By Issigned_chk = By.id("ctl00_DefaultContent_uxACHSetup_uxIsSigned");
	public By Sign_dt = By.id("ctl00_DefaultContent_uxACHSetup_uxSignDateField_uxDateField");
	public By Recurr_Amt = By.id("ctl00_DefaultContent_uxACHSetup_uxRecurringAmountField");
	public By Monthly_ACH_debit_dt_tbl = By.xpath("//*[@id=\"ctl00_DefaultContent_uxACHSetup_uxMonthlyACHDebitDateCalendar\"]");
	public By Next_sch_debit_dt = By.id("ctl00_DefaultContent_uxACHSetup_uxNextACHDateField_uxDateField");
	public By Save_ACH_Btn = By.id("ctl00_DefaultContent_uxACHSetup_uxSaveCommand");
	public By Done_ACH_Btn = By.id("ctl00_DefaultContent_uxACHSetup_uxDoneCommand");
	public By popup_Ok_Btn = By.xpath("//*[@id=\"ctl00_DefaultContent_uxACHSetup_uxACHSetupSaveConfirmationYesCommand\"]");

}
