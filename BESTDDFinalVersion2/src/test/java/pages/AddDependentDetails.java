package pages;

import static org.testng.Assert.assertEquals;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.AddDependentDetails_Locators;

public class AddDependentDetails extends AddDependentDetails_Locators{

	public AddDependentDetails (WebDriver browserObject){
		
		this.browserObject = browserObject;
	}
	
	public void Add_New_Dependent(String firstName, String lastName, String Relation, String Age, String Gender, String Eligible, String EligibleReason, String Proofdate) throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		browserObject.findElement(DependentFirstName_Text).sendKeys(firstName);
		assertEquals(browserObject.findElement(DependentLastName_Text).getAttribute("value"), lastName);
		if (Relation.equalsIgnoreCase("child"))
		{
			Select Relation_List = new Select(browserObject.findElement(DependentRelationship_list));
			Relation_List.selectByValue("Child");
		}
		else if (Relation.equalsIgnoreCase("spouse"))
		{
			Select Relation_List = new Select(browserObject.findElement(DependentRelationship_list));
			Relation_List.selectByValue("Spouse");
		}

		//wait.until(ExpectedConditions.visibilityOfElementLocated(DependentEligible_radio));
		Thread.sleep(2000);
		WebElement age = browserObject.findElement(DependentAge_Text);
		age.click();
		age.sendKeys(Age, Keys.TAB);


		if (Gender.equalsIgnoreCase("male"))
		{
			browserObject.findElement(DependentMale_radio).click();
		}
		else if (Gender.equalsIgnoreCase("female"))
		{
			browserObject.findElement(DependentFemale_radio).click();
		}
		
		if(Relation.equalsIgnoreCase("child"))
		{
		if(Eligible.equalsIgnoreCase("yes"))
		{
			browserObject.findElement(DependentEligible_radio).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(DependentEligibleReasons_list));
			Select EligibileReasons = new Select(browserObject.findElement(DependentEligibleReasons_list));
			
			if(EligibleReason.equalsIgnoreCase("Under Age"))
			{
				EligibileReasons.selectByValue("1");
			}
				
			else if(EligibleReason.equalsIgnoreCase("Full-Time Student"))
			{
				EligibileReasons.selectByValue("2");	
				Thread.sleep(2000);
				add_Input_Date(browserObject,Proofdate,DependentProofdate_Text);
			}
			else if(EligibleReason.equalsIgnoreCase("Disability"))
			{
				EligibileReasons.selectByValue("3");			
				//wait.until(ExpectedConditions.visibilityOf((browserObject.findElement(DependentProofdate_Text))));
				//wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(browserObject.findElement(DependentProofdate_Text), "disabled", "disabled")));
				Thread.sleep(2000);
				add_Input_Date(browserObject,Proofdate,DependentProofdate_Text);
			}
				
		}
		else if (Eligible.equalsIgnoreCase("no"))
		{
			browserObject.findElement(DependentInEligible_radio).click();	
			wait.until(ExpectedConditions.visibilityOfElementLocated(DependentInEligibleReasons_list));
			Select EligibileReasons = new Select(browserObject.findElement(DependentInEligibleReasons_list));
			
			if(EligibleReason.equalsIgnoreCase("Married"))
			{
				EligibileReasons.selectByValue("1");
			}
			else if(EligibleReason.equalsIgnoreCase("Over Age"))
			{
				EligibileReasons.selectByValue("2");	
			}
			else if(EligibleReason.equalsIgnoreCase("Ineligible Relationship"))
			{
				EligibileReasons.selectByValue("3");
			}
				
		}
		}
		
		System.out.println(browserObject.findElement(DependentBirthdate_Text).getText());

		assertEquals(browserObject.findElement(DependentStatus_text).getAttribute("Value"), "Active");
		
		browserObject.findElement(DepententDone_btn).click();
		
		wait.until(ExpectedConditions.not(ExpectedConditions.titleContains("Details")));
		
	}
	

	
	
}
