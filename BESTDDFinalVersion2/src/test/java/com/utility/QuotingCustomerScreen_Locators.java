package com.utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuotingCustomerScreen_Locators {
	
	public WebDriver browserObject ;
	public By AddNewCustomerQuote_btn = By.id("ctl00_DefaultContent_uxAddCommand");
	public By CustomerNumber_text = By.id("ctl00_DefaultContent_uxCustomerNumberField");
	public By Search_btn = By.id("ctl00_DefaultContent_uxSearchCommand");
	public By CustomerQuotes_link = By.id("ctl00_DefaultContent_uxCustomerList_ctl02_uxCustomerQuotesCommand");

}
