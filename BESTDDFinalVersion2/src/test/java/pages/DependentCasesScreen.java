package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.DependentCasesScreen_Locators;

public class DependentCasesScreen extends DependentCasesScreen_Locators{

	public DependentCasesScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}
	
	public void Select_Coverage(String cov)
	{
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		wait.until(ExpectedConditions.stalenessOf(browserObject.findElement(Coverage_List)));
		Select coverageList = new Select(browserObject.findElement(Coverage_List));
		coverageList.selectByVisibleText(cov);
		
	}
	
	public void Navigate_to_DependentCoverageDetails_Screen()
	{
		browserObject.findElement(AddDependentCase_btn).click();
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		wait.until(ExpectedConditions.titleContains("Coverage Details"));
		
	}
	
	public boolean Verify_DependentCase_Added_Successfully()
	{
		List<WebElement> dependentCases =browserObject.findElements(DependentCases_tableRows);
		return (dependentCases.size()==2);
	}
	
}
