package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Locators_Repo {
	
	public WebDriver browserObject ;
	//Primary Member Menu 
	public By PrimaryMembers_HyberLink = By.id("ctl00_DefaultContent_uxCustomersList_ctl02_uxPrimaryMembersCommand");
	public By PrimaryMembers_Menu = By.id("ctl00_uxMenu_ctl38_lnkMenu");
	
	//LD Rate Management Menu Locators
	
	public By Rating = By.xpath("//*[@id=\"ctl00_uxMenun1\"]/table/tbody/tr/td/a");
	public By RateManagement = By.xpath("//a[@id=\"ctl00_uxMenu_ctl20_lnkMenu\"]");
	public By LDRateManagement = By.xpath("//a[@id='ctl00_uxMenu_ctl22_lnkMenu']");
	
	//Customer Menu Page Locators

		 Actions Action ;
		 public By Policies = By.xpath("//*[@id=\"ctl00_uxMenun1\"]/table/tbody/tr/td/a");
		 public By PolicyManagement = By.xpath("//a[@id='ctl00_uxMenu_ctl35_lnkMenu']");
		 public By Customers = By.xpath("//a[@id='ctl00_uxMenu_ctl36_lnkMenu']");


	
	//Add Rate Version Page Locators
	
	public By Effective_from_date_path = By.xpath("//input[@name='ctl00$DefaultContent$uxEffectiveFromDate']");
	public By Import_Btn = By.id("ctl00_DefaultContent_uxViewLoadFactorTableImportCommand");
	public By choosefile = By.className("chooseFileBtn");
	public By Upload_import_btn = By.xpath("//button[@id='ctl00_DefaultContent_uxUploadFileBtn']");
	//public By Upload_Ok_btn = By.name("ctl00$DefaultContent$uxOkCommand");
	public By Upload_Ok_btn = By.xpath("//input[@name='ctl00$DefaultContent$uxOkCommand']");
	public By Done_btn = By.name("ctl00$DefaultContent$uxViewLoadFactorTableDoneCommand");
	public By title = By.id("ctl00_DefaultContent_uxLifeDisabilityTabContainer_uxRateVersionsTabPanel_LifeRatingIdentifierUserControl_uxPlanNameCaption");
	public By importtitle = By.className("pagetitledetail");
	public By successfullyTitle = By.xpath("//span[@id='ctl00_DefaultContent_uxImportResult']");
	public By publish_checkbox = By.name("ctl00$DefaultContent$uxCanBePublished");
	
	
	// PlanRate Screen 
	public By New_Plan_Rate_Table_Btn_PR = By.id("ctl00_DefaultContent_uxLifeDisabilityTabContainer_uxPlansTabPanel_uxNewPlanRateTableBtn");
	public By formnumberpath_PR = By.xpath("//input[@name='ctl00$DefaultContent$uxSearchFormNumberField']");
	public By Searchbtn_PR = By.name("ctl00$DefaultContent$uxPlansSearchCommand");
	public By CD_PR = By.id("ctl00_DefaultContent_uxCDCodeField");
	public By RCD_PR = By.id("ctl00_DefaultContent_uxReenterCDCodeField");
	public By PSchedulePath_PR = By.name("ctl00$DefaultContent$uxPlanScheduleList");
	public By PlaneError_PR = By.id("ctl00_DefaultContent_uxSearchFormNumberMessage");
	public By CDCODEError_PR = By.xpath("//span[@class='errorvalidation']//div");
	public By CDTitle_PR = By.className("pagetitle");
	public By Cdpath_PR = By.id("ctl00_DefaultContent_uxLifeDisabilityTabContainer_uxPlansTabPanel_uxCarrierField");
	public By src_path_PR = By.name("ctl00$DefaultContent$uxLifeDisabilityTabContainer$uxPlansTabPanel$uxPlansSearchCommand");
	public By cd_path_PR = By.id("ctl00_DefaultContent_uxLifeDisabilityTabContainer_uxPlansTabPanel_uxPlansList_ctl02_uxRateVersionsCommand");
	public By Rate_Summary_path_PR = By.id("ctl00_DefaultContent_uxLifeDisabilityTabContainer_uxRateVersionsTabPanel_uxRateVersionsList_ctl02_uxRateSummaryCommand");
	public By publish_checkbox_PR = By.name("ctl00$DefaultContent$uxCanBePublished");
	public By Done_btn_PR = By.name("ctl00$DefaultContent$uxViewLoadFactorTableDoneCommand");
	
	
	//HiasLogin Page Locators
	public String URL = "http://10.1.22.181/HIAS_P3/loblogonview.aspx?ReturnUrl=%2fHIAS_P3%2fpolicyadministration%2fpolicymanagement%2fcustomersview.aspx";
	public By Usernamepath = By.xpath("//input[@id='ctl00_DefaultContent_uxUserNameField']");
	public By Passwordpath = By.xpath("//input[@type='password']");
	public By titlee = By.className("pagetitle");
	
	
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
