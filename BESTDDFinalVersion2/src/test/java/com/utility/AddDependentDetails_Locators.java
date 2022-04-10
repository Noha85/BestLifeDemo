package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddDependentDetails_Locators extends Base{
	
	public WebDriver browserObject ;
	
	public By DependentFirstName_Text = By.id("ctl00_DefaultContent_uxFirstNameField");
	public By DependentLastName_Text = By.id("ctl00_DefaultContent_uxLastNameField");
	public By DependentRelationship_list = By.id("ctl00_DefaultContent_uxRelationshipsList");
	public By DependentAge_Text= By.id("ctl00_DefaultContent_uxAgeField");
	public By DependentBirthdate_Text=By.id("ctl00_DefaultContent_uxDateOfBirthField");
	public By DependentMale_radio = By.id("ctl00_DefaultContent_uxGenderList_1");
	public By DependentFemale_radio = By.id("ctl00_DefaultContent_uxGenderList_0");
	public By DependentEligible_radio = By.id("ctl00_DefaultContent_uxEligibleList_0");
	public By DependentInEligible_radio = By.id("ctl00_DefaultContent_uxEligibleList_1");
	public By DependentEligibleReasons_list = By.id("ctl00_DefaultContent_uxEligibleReasonsList");
	public By DependentInEligibleReasons_list = By.id("ctl00_DefaultContent_uxIneligibleReasonsList");
	public By DependentStatus_text = By.id("ctl00_DefaultContent_uxStatusField");
	public By DepententDone_btn = By.id("ctl00_DefaultContent_uxDependentDetailsDoneCommand");
	public By DependentProofdate_Text = By.id("ctl00_DefaultContent_uxProofDateField");
	public By DependentCases_Tab = By.id("ctl00_DefaultContent_uxDependentDetailsTabContainer_uxDependentCasesTab");
}
