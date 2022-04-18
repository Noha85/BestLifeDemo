package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPrimaryMemberDetails_Locators extends Base{

	public WebDriver browserObject ;
	
	public By Add_Btn = By.id("ctl00_DefaultContent_uxAddMemberCommand");
	
	public By FirstName = By.id("ctl00_DefaultContent_uxFirstNameField");
	public By LastName = By.id("ctl00_DefaultContent_uxLastNameField");
	public By EmailAddress = By.id("ctl00_DefaultContent_uxEmailAddressField");
	public By Address = By.name("ctl00$DefaultContent$uxAddressOneField");
	public By ZIPCode = By.name("ctl00$DefaultContent$uxAddressZipCode$uxZipCodeField");
	public By Age= By.name("ctl00$DefaultContent$uxAgeField");
	public By Male = By.xpath("//input[@id='ctl00_DefaultContent_uxGendersList_1']");
	public By Female = By.xpath("//input[@id='ctl00_DefaultContent_uxGendersList_0']");
	public By MaritalStatus = By.id("ctl00_DefaultContent_uxMaritalStatusesList");
	public By MaleTitle = By.xpath("//label[@for='ctl00_DefaultContent_uxGendersList_1']");
	public String ActualMaleResult = "Male" ;
	public By mem_SSN = By.id("ctl00_DefaultContent_uxSSNField");
	public By EMP_Add_Row = By.id("ctl00_DefaultContent_uxEmployeeClassificationAddCommand");
	public By Sal_Add_Row = By.id("ctl00_DefaultContent_uxAnnualSalaryAddCommand");
	
	public By EMP_Class = By.id("ctl00_DefaultContent_uxEmployeeClassificationHistoryList_ctl02_uxEmployeeClassificationsList");
	public By EMP_Date_From = By.id("ctl00_DefaultContent_uxEmployeeClassificationHistoryList_ctl02_uxDateFromEmployeeClassificationField");
	
	public By salary = By.id("ctl00_DefaultContent_uxAnnualSalaryHistoryList_ctl02_uxAnnualSalaryField");
	public By Sal_Date_From = By.id("ctl00_DefaultContent_uxAnnualSalaryHistoryList_ctl02_uxDateFromEmployeeAnnualSalaryField");
	public By PMS_Done = By.id("ctl00_DefaultContent_uxPrimaryMemberDetailsDoneCommand");
	public By Conf_Yes = By.id("ctl00_DefaultContent_uxYesSavePrimaryConfirmationCommand");
	public By Primary_Member_Cases_Tab = By.id("ctl00_DefaultContent_uxPrimaryMemberDetailsTabContainer_uxPrimaryMemberCasesTab");
	public By Prim_num_field=By.xpath("//*[@id=\"ctl00_DefaultContent_uxPrimaryMemberNumberCaption\"]");
	public By HIAS_Default_Title = By.xpath("//label[@for='ctl00_DefaultContent_uxPrimaryPreferenceInReceivingInvoicesList_0']");
	
	public By Prim_Cases_tab=By.xpath("//*[@id=\"ctl00_DefaultContent_uxPrimaryMemberCasesUpdatePanel\"]/div[2]/div[1]/span/big/b");
	
	public By HIAS_Default_radio = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryPreferenceInReceivingInvoicesList_0']");
	public By Always_Print_radio = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryPreferenceInReceivingInvoicesList_1']");
	public By Suppress_radio  = By.xpath("//input[@id='ctl00_DefaultContent_uxPrimaryPreferenceInReceivingInvoicesList_2']");
	
	public String ActualHIASDefaultResult1 = "HIAS Default" ;
	public String ActualAlways_PrintResult = "Always Print and Mail" ;
	public By Always_Print_Title = By.xpath("//label[@for='ctl00_DefaultContent_uxPrimaryPreferenceInReceivingInvoicesList_1']");
	
	public String ActualMonthlyResult = "Monthly" ;
	public String ActualQuarterlyResult = "Quarterly" ;
	public String ActualSemiAnnuallyResult = "Semi-Annually" ;

	public By Monthly_Title = By.xpath("//label[@for='ctl00_DefaultContent_uxLifeCoverageInvoiceBillingCycleList_0']");
	public By Quarterly_Title = By.xpath("//label[@for='ctl00_DefaultContent_uxLifeCoverageInvoiceBillingCycleList_1']");
	public By SemiAnnually_Title = By.xpath("//label[@for='ctl00_DefaultContent_uxLifeCoverageInvoiceBillingCycleList_2']");
	
	public By Monthly_radio = By.xpath("////input[@id='ctl00_DefaultContent_uxLifeCoverageInvoiceBillingCycleList_0']");
	public By Quarterly_radio = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCoverageInvoiceBillingCycleList_1']");
	public By SemiAnnually_radio  = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCoverageInvoiceBillingCycleList_2']");
	public By Annually_radio  = By.xpath("//input[@id='ctl00_DefaultContent_uxLifeCoverageInvoiceBillingCycleList_3']");
	public By Pagetitle  = By.className("pagetitle");
		
	public By Dependents_button = By.id("ctl00_DefaultContent_uxDependentsListCommand");
	public By PrimaryMembers_HyperLink = By.linkText("Primary Members");
	public By prim_SSN= By.id("ctl00_DefaultContent_uxSsnField");
	public By PrimaryNumSearch_btn = By.id("ctl00_DefaultContent_uxSearchCommand");
	public By member_rows = By.tagName("tr");
	public By member_columns = By.tagName("td");
}
