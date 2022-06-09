package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.QuotingAgentsScreen_Locators;

public class QuotingAgentsScreen extends QuotingAgentsScreen_Locators {
	
	public QuotingAgentsScreen(WebDriver browserObject){
		
		this.browserObject = browserObject;
	}
	
	WebDriverWait  wait;
	
	private void AssignQuotingAndSalesAgent (String AgentName)
	{
		wait = new WebDriverWait(browserObject, 10);
		WebElement AgentName_txt =browserObject.findElement(AgentName_text);
		AgentName_txt.click();
		AgentName_txt.sendKeys(AgentName);
		browserObject.findElement(Search_btn).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		browserObject.findElement(AssignAsQuotingAgent_btn).click();

		wait.until(ExpectedConditions.textToBePresentInElementLocated(QuotingAgentName, AgentName));
		browserObject.findElement(AssignAsSalesAgent_btn).click();

		wait.until(ExpectedConditions.textToBePresentInElementLocated(SalesAgentName, AgentName));
	}
	
	public void AddNewQuotingAndSalesAgent (String agentName)
	{
		wait = new WebDriverWait(browserObject, 10);
		AssignQuotingAndSalesAgent(agentName);
		browserObject.findElement(Next_btn).click();
		
		wait.until(ExpectedConditions.titleContains("Agents Assignment"));
	}

	public void EditQuotingAndSalesAgent (String AgentName)
	{
		wait = new WebDriverWait(browserObject, 10);
		//AssignQuotingAndSalesAgent(AgentName);
		browserObject.findElement(Done_btn).click();
		
		wait.until(ExpectedConditions.titleContains("Customer Quotes"));
	}

}
