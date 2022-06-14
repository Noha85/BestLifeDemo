package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuotingAgentsScreen_Locators {
	
	public WebDriver browserObject ;
	public By AgentName_text = By.id("ctl00_DefaultContent_uxAgentSearchNameField");
	public By Search_btn = By.id("ctl00_DefaultContent_uxSearchCommand");
	public By AssignAsQuotingAgent_btn = By.id(	"ctl00_DefaultContent_uxAgentsList_ctl02_uxAssignAsQuotingAgentCommand");
	public By AssignAsSalesAgent_btn = By.id(	"ctl00_DefaultContent_uxAgentsList_ctl02_uxAssignAsSalesAgentCommand");
	public By Done_btn = By.id("ctl00_DefaultContent_uxDoneCommand");
	public By QuotingAgentName = By.id("ctl00_DefaultContent_uxQuotingAgentNameField");
	public By SalesAgentName = By.id("ctl00_DefaultContent_uxSalesAgentNameField");
	public By Next_btn = By.id("ctl00_DefaultContent_uxNextCommand");

}
