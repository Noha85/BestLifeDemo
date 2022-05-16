package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LifeCustomerPageLocators {
	
	public WebDriver browserObject ;

	//Create New Life Customer Page Locators
	
	public By Add_Life_Customer_Btn = By.xpath("//input[@id='ctl00_DefaultContent_uxAddLifeCustomerCommand']");
	public By Search_Btn = By.name("ctl00$DefaultContent$uxSearchCommand");
	public By Customernum = By.name("ctl00$DefaultContent$uxCustomerNumberField");
	public By Customername= By.name("ctl00$DefaultContent$uxCustomerInformationCustomerNameField");
	public By ZIPCodePath= By.xpath("//input[@id='ctl00_DefaultContent_uxCustomerInformationZipAddressZipCode_uxZipCodeField']");
	public By SICCodePath= By.name("ctl00$DefaultContent$uxSicCodeField");
	public By Enrollment_yes_path = By.xpath("//input[@id='ctl00_DefaultContent_uxAllowAgentToEditEnrollmentsList_0']");
	public By Enrollment_no_path = By.xpath("//input[@id='ctl00_DefaultContent_uxAllowAgentToEditEnrollmentsList_1']");
	public By title_yes = By.xpath("//input[@id='ctl00_DefaultContent_uxAllowAgentToEditEnrollmentsList_0']");
	public String ActualYesResult = "Yes";
	public String ActualHIASDefaultResult = "HIAS Default (Print and Mail)";
	public By Add_Classes_Btn = By.name("ctl00$DefaultContent$uxCustomerClassesAdd");
	public By Cust_List = By.name("ctl00$DefaultContent$uxCustomerClassesList");
	public By Waive_yes = By.xpath("//input[@id='ctl00_DefaultContent_uxIsWaiveInitialWaitingPeriodList_0']");
	public By Waive_no = By.xpath("//input[@id='ctl00_DefaultContent_uxIsWaiveInitialWaitingPeriodList_1']");
	public By Waive_yes_title = By.xpath("//label[@for='ctl00_DefaultContent_uxIsWaiveInitialWaitingPeriodList_0']");
	public By Primary = By.name("ctl00$DefaultContent$uxEmployerContributionPrimariesList");
	public By Dependent = By.name("ctl00$DefaultContent$uxEmployerContributionDependentsList");
	public By Cust_Class_Save_Close = By.name("ctl00$DefaultContent$uxEmployerContributionSaveBar$uxSaveAndClose");
	public By Report_HIAS_Default = By.xpath("//input[@id='ctl00_DefaultContent_uxCustomerPreferenceInReceivingInvoicesList_0']");
	public By Report_Suppress = By.xpath("//input[@id='ctl00_DefaultContent_uxCustomerPreferenceInReceivingInvoicesList_1']");
	public By HIAS_DEF_title = By.xpath("//label[@for='ctl00_DefaultContent_uxCustomerPreferenceInReceivingInvoicesList_0']");
	public By Email_Add = By.name("ctl00$DefaultContent$uxContactInformationEmailAddressField");
	public By Add_Cust_Divisions_Btn = By.id("ctl00_DefaultContent_uxCustomerDivisionsAdd");
	public By Division_Code = By.name("ctl00$DefaultContent$uxCustomerDivisionCodeDetailsField");
	public By Description = By.name("ctl00$DefaultContent$uxCustomerDivisionDescriptionDetailsField");
	public By Cust_Divisions_Save_Close = By.name("ctl00$DefaultContent$uxCustomerDivisionDetailSaveBar$uxSaveAndClose");
	public By Cust_Class_Details = By.xpath("//span[@id='ctl00_DefaultContent_uxCustomerDetailsValidationManager']//div//br");
	public By Done_Btn = By.name("ctl00$DefaultContent$uxDoneCommand");
	public By Ok_Btn = By.id("ctl00_DefaultContent_uxSuppressPrintAndMailOkCommand");
	public By Division_Chk_Box = By.xpath("//input[@id='ctl00_DefaultContent_uxReportMembersByDivision']");
	public By Cust_Details_title = By.className("pagetitle");
	public By titlee = By.className("pagetitle");
	

}
