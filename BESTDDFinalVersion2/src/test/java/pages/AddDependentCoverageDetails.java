package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.AddDependentCoverageDetails_Locators;

public class AddDependentCoverageDetails extends AddDependentCoverageDetails_Locators{
	
public AddDependentCoverageDetails (WebDriver browserObject){
		
		this.browserObject = browserObject;
	}
	
	public void Add_New_DependentCoverage(String CustNo, String PrimaryMemNo, String effDate, String WaitingPer, String majorEffDate, String EnrollmentReason) throws InterruptedException  
	{
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		
		assertEquals(browserObject.findElement(DependentCovCust_Text).getAttribute("value"), CustNo);
		assertEquals(browserObject.findElement(DependentCovPMember_Text).getAttribute("value"), PrimaryMemNo);
				
		add_Input_Date(browserObject,effDate, DependentCovEffectiveDate_Text);
		browserObject.findElement(DependentCovEffectiveDate_Text).sendKeys(Keys.TAB);
		//wait.until(ExpectedConditions.stalenessOf(browserObject.findElement(DependentCovPlanSelection_Text))); 
		Thread.sleep(2000);	
		//wait.until(ExpectedConditions.attributeContains(browserObject.findElement(DependentCovPlanSelection_Text), "value", Network));   
		browserObject.findElement(DependentCovWaitingPeriod_Text).sendKeys(WaitingPer);
		add_Input_Date(browserObject,majorEffDate, DependentCovMajorEffectiveDate_Text);
		Select EnrollmentReasons = new Select(browserObject.findElement(DependentCovEnrolReason_List));
		EnrollmentReasons.selectByVisibleText(EnrollmentReason);
		
		browserObject.findElement(DependentCovDone_btn).click();
		
		wait.until(ExpectedConditions.titleContains("Dependent Details"));
		
	}

}
