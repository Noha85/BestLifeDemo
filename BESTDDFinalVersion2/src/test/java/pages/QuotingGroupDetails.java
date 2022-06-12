package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.QuotingCustomerScreen_Locators;
import com.utility.QuotingGroupDetails_Locators;

public class QuotingGroupDetails extends QuotingGroupDetails_Locators {
	
	public QuotingGroupDetails (WebDriver browserObject){
		
		this.browserObject = browserObject;
	}
	
	public void navigatetoNewQuotingGroupDetailsScreen()
	{
		browserObject.findElement(NavigateToQuoteGroupDetailsBtn).click();
		WebDriverWait  wait = new WebDriverWait(browserObject, 10);
		wait.until(ExpectedConditions.titleContains("Customer Details"));
	}
	
	public void selectCoverage (String [] selections)
	{

		if (selections[0].equalsIgnoreCase("Select All"))
				browserObject.findElement(QuoteCoverageSelectAllCheckBox).click();
		else 
		{
		List <WebElement> AllCheckboxes = browserObject.findElements(By.xpath("//input[@type='checkbox']"));
		List <WebElement> Alllabels = browserObject.findElements(By.xpath("//*[@id=\"ctl00_DefaultContent_uxCoverageLineCheckBoxList\"]/tbody/tr[*]/td/label"));

		for (int i=0;i>selections.length;i++)
		{
			for (int j=0;j>Alllabels.size();j++)
			{
				if (Alllabels.get(j).getText().equalsIgnoreCase(selections[i]))
					AllCheckboxes.get(j+1).click();
				
			}

			
		}
		
	}
	}
}
