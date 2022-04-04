package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DependentsScreen_Locators extends Base {
	
	public WebDriver browserObject ;

	public By AddDependent_btn = By.id("ctl00_DefaultContent_uxAddCommand");
	public By Dependents_table = By.id("ctl00_DefaultContent_uxDependentsList");
	public By Dependents_table_rows = By.tagName("tr");
	public By DependentFName_column = By.cssSelector("[id$=uxFirstNameCommand]");
	public By Dependent_columns = By.tagName("td");	
	public By Dependents_Pages_row = By.xpath("//*[@id=\"ctl00_DefaultContent_uxDependentsList\"]/tbody/tr[12]/td/table/tbody/tr");	
	public By Dependent_page_Link = By.tagName("td");
	public By TopDependentFName_column = By.id("ctl00_DefaultContent_uxDependentsList_ctl02_uxFirstNameCommand");
}
