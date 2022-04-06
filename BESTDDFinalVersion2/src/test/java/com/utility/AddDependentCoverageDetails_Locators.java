package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddDependentCoverageDetails_Locators extends Base{
	
	public WebDriver browserObject;
	
	public By DependentCovCust_Text = By.id("ctl00_DefaultContent_uxCustomerIdentifierUserControl_uxCustomerNumberField");
	public By DependentCovPMember_Text = By.id("ctl00_DefaultContent_uxPrimaryMembersIdentifierUserControl_uxPrimaryMemberNumberField");
	public By DependentCovEffectiveDate_Text = By.id("ctl00_DefaultContent_uxEffectiveDateField");
	//public By DependentCovPlanSelection_Text= By.id("ctl00_DefaultContent_uxDentalPlanSelectionField");
    public By DependentCovWaitingPeriod_Text = By.id("ctl00_DefaultContent_uxMajorDentalWaitingPeriodMonthsField");
	public By DependentCovMajorEffectiveDate_Text = By.id("ctl00_DefaultContent_uxMajorDentalCoverageEffectiveDateField");
	public By DependentCovEnrolReason_List = By.id("ctl00_DefaultContent_uxEnrollmentDetailsUserControl_uxEnrollmentReasonsList");
	public By DependentCovDone_btn = By.id("ctl00_DefaultContent_uxDoneCommand");

}
