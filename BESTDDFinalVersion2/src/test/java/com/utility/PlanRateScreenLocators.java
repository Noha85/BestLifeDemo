package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PlanRateScreenLocators {
	
	public WebDriver browserObject ;

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

}
