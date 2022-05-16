package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerDetailsScreenLocators {
	
	public WebDriver browserObject ;
	//Customer Details Screen
	
	public By Add_Life_Customer_Btn1 = By.xpath("//input[@id='ctl00_DefaultContent_uxAddLifeCustomerCommand']");
	public By Search_Btn1 = By.name("ctl00$DefaultContent$uxSearchCommand");
	public By Customernum1 = By.name("ctl00$DefaultContent$uxCustomerNumberField");
	public By Customerlocation1 = By.xpath("//table[@id='ctl00_DefaultContent_uxCustomersList']//a[@id='ctl00_DefaultContent_uxCustomersList_ctl02_uxCustomerNumberCommand']");
	public By Cust_Cases_Tab1 = By.xpath("//a[@id='ctl00_DefaultContent_uxCustomerDetailsTabContainer_uxCustomerCasesTab']//span[@class='innerWrap']");
	public By Add_Life_Coverage_Btn1 = By.name("ctl00$DefaultContent$uxAddLifeCoverageCommand");
	public By CdCode_Path1 = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCarrierDivisionCodeField']");
	public By Search_Plan_Btn1 = By.id("ctl00_DefaultContent_uxLifeSearchCommand");
	public By Next_Btn1 = By.id("ctl00_DefaultContent_uxNextCommand");
	public By Case_Effective_Path1 = By.id("ctl00_DefaultContent_uxLifeCustomerCaseControl_uxCaseEffectiveDatesList");
	public By Case_Renewal_Path1 = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCustomerCaseControl_uxCaseRenewalDate']");
	public By Open_Enrollment_Path1 = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCustomerCaseControl_uxOpenEnrollmentDate']");
	public By Group_yes_path1 = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCustomerCaseControl_uxGroupMaintainsBeneficiaryList_0']");
	public By Group_no_path1 = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCustomerCaseControl_uxGroupMaintainsBeneficiaryList_1']");
	public By AT_Date_of_Event_path1 = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCustomerCaseControl_uxApplyBirthDateChanges_0']");
	public By AT_Date_of_Renewal_path1 = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCustomerCaseControl_uxApplyBirthDateChanges_1']");
	public By title_yes1 = By.xpath("//label[@for='ctl00_DefaultContent_uxLifeCustomerCaseControl_uxGroupMaintainsBeneficiaryList_0']");
	public By title_AT_Date_of_Event1 = By.xpath("//label[@for='ctl00_DefaultContent_uxLifeCustomerCaseControl_uxApplyBirthDateChanges_0']");
	public By Save_Btn1 = By.name("ctl00$DefaultContent$uxLifeCustomerCaseControl$uxSaveAndCloseBtn");
	public By title1 = By.className("pagetitle");		
	public By CustTitle1 = By.xpath("//div[@class='LifeCustomerCoveragePanel']//div//div[@class='pagetitledetail']");
	public String ActualYesResult1 = "Yes";
	public String ActualDOEResult1 = "At Date of Event";

}
