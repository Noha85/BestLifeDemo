package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.QuotingCustomerScreen_Locators;

public class QuotingCustomerScreen extends QuotingCustomerScreen_Locators {
	
	public QuotingCustomerScreen (WebDriver browserObject){
		
		this.browserObject = browserObject;
	}
	
	public void navigatetoNewQuoteAgentsScreen()
	{
		browserObject.findElement(AddNewCustomerQuote_btn).click();
		WebDriverWait  wait = new WebDriverWait(browserObject, 10);
		wait.until(ExpectedConditions.titleContains("Customer Agents"));
	}
	
	public void searchCustomer(String CustomerNumber)
	{
		WebDriverWait  wait = new WebDriverWait(browserObject, 10);
		browserObject.findElement(CustomerNumber_text).sendKeys(CustomerNumber);
		browserObject.findElement(Search_btn).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			browserObject.findElement(CustomerQuotes_link).click();
			wait.until(ExpectedConditions.titleContains("Customer Quotes"));
			
	}

}
