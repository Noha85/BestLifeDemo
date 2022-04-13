package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PrimaryMembersScreen_Locators {
	
	public WebDriver browserObject ;

	//public By PrimaryNumber = By.id("ctl00_DefaultContent_uxPrimaryNumberField");
	public By PrimaryNumber = By.id("ctl00_DefaultContent_uxPrimaryNumberField");
	public By PrimaryNumSearch_btn = By.id("ctl00_DefaultContent_uxSearchCommand");
	public By PrimaryNum_tableRows = By.xpath("//table[@id=\"ctl00_DefaultContent_uxPrimaryMembersList\"]/tbody/tr");
	public By PrimaryNum_cell = By.xpath("//table[@id=\"ctl00_DefaultContent_uxPrimaryMembersList\"]/tbody/tr[2]/td[1]");
	public By Dependents_cell = By.id("ctl00_DefaultContent_uxPrimaryMembersList_ctl02_uxDependentsCommand");
	public By prim_SSN= By.id("ctl00_DefaultContent_uxSsnField");
	public By PrimaryMemberCases = By.xpath ("//*[@id=\"ctl00_DefaultContent_uxPrimaryMemberDetailsTabContainer_uxPrimaryMemberCasesTab\"]/span/span");
	public By PMCases_drpdwn = By.id ("ctl00_DefaultContent_uxCoverageList");
	public By AddPrimaryMemberCase_btn = By.xpath("//*[@id=\"ctl00_DefaultContent_uxPrimaryCasesAddCommand\"]");
}
