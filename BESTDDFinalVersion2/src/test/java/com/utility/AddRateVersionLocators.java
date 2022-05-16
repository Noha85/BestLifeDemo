package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRateVersionLocators extends Base {
	
	public WebDriver browserObject ;
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
}
