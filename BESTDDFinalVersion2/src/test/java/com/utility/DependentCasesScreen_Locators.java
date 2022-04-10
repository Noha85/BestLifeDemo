package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DependentCasesScreen_Locators extends Base {
	
	public WebDriver browserObject ;
	
	public By Coverage_List = By.id("ctl00_DefaultContent_uxCoverageList");
	public By AddDependentCase_btn = By.id("ctl00_DefaultContent_uxDependentCasesAddCommand");
	public By DependentCases_tableRows = By.xpath("//*[@id=\"ctl00_DefaultContent_uxDependentCasesList\"]/tbody/tr");

}
