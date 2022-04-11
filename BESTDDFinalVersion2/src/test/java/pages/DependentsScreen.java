package pages;

import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.DependentsScreen_Locators;

public class DependentsScreen extends DependentsScreen_Locators {
		
	public DependentsScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}
	
	public void Navigate_to_DependentsDetails_Screen ()
	{
		browserObject.findElement(AddDependent_btn).click();
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		wait.until(ExpectedConditions.titleContains("Dependent Details"));
	}
	
	public void Navigate_to_ExistingDependentsDetails_Screen (String depFirstName) throws InterruptedException
	{
	
		WebElement dependentRow = Find_Dependent(depFirstName);
		if (dependentRow != null)
			{
			dependentRow.click();
			WebDriverWait wait = new WebDriverWait(browserObject, 10);
			wait.until(ExpectedConditions.titleContains("Dependent Details"));
			return;
			}
		else
		{

			WebElement pagesRow = browserObject.findElement(Dependents_Pages_row);
			List<WebElement> pages =pagesRow.findElements(Dependent_page_Link);

				for (int i = 1 ; i<pages.size(); i++)
				{
					pagesRow = browserObject.findElement(Dependents_Pages_row);
					pages = pagesRow.findElements(Dependent_page_Link);
					System.out.println(pages.get(i).getAttribute("innerText"));
					pages.get(i).click();
					Thread.sleep(2000);
					dependentRow = Find_Dependent(depFirstName);
					if(dependentRow != null)
					{
						dependentRow.click();
						WebDriverWait wait = new WebDriverWait(browserObject, 10);
						wait.until(ExpectedConditions.titleContains("Dependent Details"));
						return;
						}
				}
		}

	}
	
	public boolean Verify_Dependent_Added_Successfully (String firstName, String lastName, String Gender, String Relation) throws InterruptedException 
	{
		boolean result;
		result = Verify_Dependent_Exist_InPage(firstName, lastName, Gender, Relation);
		if(result)
			return result;

		WebElement pagesRow = browserObject.findElement(Dependents_Pages_row);
		List<WebElement> pages =pagesRow.findElements(Dependent_page_Link);
		//System.out.println(pages.size());
			for (int i = 1 ; i<pages.size(); i++)
			{
				pagesRow = browserObject.findElement(Dependents_Pages_row);
				pages = pagesRow.findElements(Dependent_page_Link);
				System.out.println(pages.get(i).getAttribute("innerText"));
				pages.get(i).click();
				Thread.sleep(2000);
				result = Verify_Dependent_Exist_InPage(firstName, lastName, Gender, Relation);
				if(result)
					return result;
			}
			
		return result;
		
	}
	
	public boolean Verify_Dependent_Exist_InPage(String firstName, String lastName, String Gender, String Relation)
	{
		WebElement dependentsTable = browserObject.findElement(Dependents_table);
		List<WebElement> rows = dependentsTable.findElements(Dependents_table_rows);
		for(WebElement dependentRow : rows)
		{

			    List<WebElement> columns = dependentRow.findElements(Dependent_columns);
				if (columns.size()>0)
				{
					{if ( (columns.get(0).getAttribute("innerText").equalsIgnoreCase(lastName)) && (columns.get(1).getAttribute("innerText").equalsIgnoreCase(firstName))						
						&&(columns.get(3).getAttribute("innerText").equalsIgnoreCase(Gender)) && (columns.get(4).getAttribute("innerText").equalsIgnoreCase(Relation)) )
						return true;							
			}					
				}					
			}
		return false;
	}
	
	public WebElement Find_Dependent(String firstName)
	{
		WebElement dependentsTable = browserObject.findElement(Dependents_table);
		List<WebElement> rows = dependentsTable.findElements(Dependents_table_rows);
		for(WebElement dependentRow : rows)
		{
			try
			{
				WebElement depFnameCol = dependentRow.findElement(DependentFName_column);
				System.out.println(depFnameCol.getText());
				if (depFnameCol.getText().equalsIgnoreCase(firstName))
					return depFnameCol;
								}
			catch (NoSuchElementException e) {
		
					}						
			}					
							
         return null;
	}
}
