package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HiasMenuLocators {
	
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
	
	//HiasLogin Page Locators
	public String URL = "http://10.1.22.181/HIAS_P3/loblogonview.aspx?ReturnUrl=%2fHIAS_P3%2fpolicyadministration%2fpolicymanagement%2fcustomersview.aspx";
	public By Usernamepath = By.xpath("//input[@id='ctl00_DefaultContent_uxUserNameField']");
	public By Passwordpath = By.xpath("//input[@type='password']");
	public By titlee = By.className("pagetitle");
	
	


	
	
	}
