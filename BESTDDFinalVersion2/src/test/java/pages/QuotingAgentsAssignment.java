package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.QuotingAgentsAssignment_Locators;

public class QuotingAgentsAssignment extends QuotingAgentsAssignment_Locators {
	
	public QuotingAgentsAssignment(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	
	public void AddQuotingAgentAssignment ()
	{
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		browserObject.findElement(Next_btn).click();
		
		wait.until(ExpectedConditions.titleContains("Customer Details"));
	}
	
	public void EditQuotingAgentAssignment ()
	{
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		browserObject.findElement(Done_btn).click();
		
		wait.until(ExpectedConditions.titleContains("Customer Quotes"));
	}
}
