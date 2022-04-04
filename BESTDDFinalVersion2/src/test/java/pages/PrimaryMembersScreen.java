package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.PrimaryMembersScreen_Locators;

public class PrimaryMembersScreen extends PrimaryMembersScreen_Locators{

	public PrimaryMembersScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}
	
	public void search(String PrimaryMemberNum) 
	{
		browserObject.findElement(PrimaryNumber).sendKeys(PrimaryMemberNum);
		browserObject.findElement(PrimaryNumSearch_btn).click();
	}
	
	public void selectPrimaryMember() 
	{
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		wait.until(ExpectedConditions.numberOfElementsToBe(PrimaryNum_tableRows, 2));
		browserObject.findElement(PrimaryNum_cell).click();
		wait.until(ExpectedConditions.titleContains("Primary Member Details"));
	}
}
