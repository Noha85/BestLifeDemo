package pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;


import com.utility.PlanRateScreenLocators;


public class PlanRateScreen extends PlanRateScreenLocators{
	
	
	public PlanRateScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}


	public void navigatetoplanratepage() {

		browserObject.findElement(New_Plan_Rate_Table_Btn_PR).click();
	}
	
	public void searchforplan(String Formnumber)
	{
		browserObject.findElement(formnumberpath_PR).sendKeys(Formnumber);
		browserObject.manage().timeouts().implicitlyWait(50 ,TimeUnit.SECONDS) ;
		browserObject.findElement(Searchbtn_PR).click();
	}
	

	
	public void entercdcode(String x , String y)
	{

			try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		WebDriverWait wait = new WebDriverWait(browserObject, 100);
		WebElement element = wait.until(
		        ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ctl00_DefaultContent_uxCDCodeField']")));
		
		element.sendKeys(x);
		
		
		WebElement element1 = (new WebDriverWait(browserObject, 100))
				   .until(ExpectedConditions.presenceOfElementLocated(By.id("ctl00_DefaultContent_uxReenterCDCodeField")));
		element1.sendKeys(y);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

	
	public void selectPS(String PlanSchedule)
	{

		
		browserObject.findElement(PSchedulePath_PR).click();
		browserObject.findElement(PSchedulePath_PR).sendKeys(PlanSchedule);
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
	}
	
	public void clicknext()
	{
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		browserObject.manage().timeouts().implicitlyWait(200 ,TimeUnit.SECONDS) ;
		WebElement Next = (new WebDriverWait(browserObject, 50))
				   .until(ExpectedConditions.elementToBeClickable(By.id("ctl00_DefaultContent_uxNextCommand")));
		Next.click();
	
	}
	
	
	public String CheckCDisValid() {
		String ActualCDMessage = browserObject.findElement(CDTitle_PR).getText();
			
		return ActualCDMessage;
	}
	
	public void ClickClearCriteria()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browserObject.manage().timeouts().implicitlyWait(200 ,TimeUnit.SECONDS) ;
		WebElement Clear = (new WebDriverWait(browserObject, 50))
				   .until(ExpectedConditions.elementToBeClickable(By.id("ctl00_DefaultContent_uxPlansClearCriteriaCommand")));
		Clear.click();
	
	}
	
	public void ClickCancel()
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserObject.manage().timeouts().implicitlyWait(200 ,TimeUnit.SECONDS) ;
		WebElement Cancel = (new WebDriverWait(browserObject, 50))
				   .until(ExpectedConditions.elementToBeClickable(By.id("ctl00_DefaultContent_uxCancelCommand")));
		Cancel.click();
	
	}
	
	
	public void searchforcdcode(String CD) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browserObject.findElement(Cdpath_PR).sendKeys(CD);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		browserObject.findElement(src_path_PR).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserObject.findElement(cd_path_PR).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserObject.findElement(Rate_Summary_path_PR).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserObject.findElement(publish_checkbox_PR).click();
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		browserObject.findElement(Done_btn_PR).click();
		
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}


//SearchforPlan
	
	public String getPlanErrorMessage() {
		String ActualMessage = browserObject.findElement(PlaneError_PR).getText();
		
		return ActualMessage;
	}

	
//ValidateCDCODE
	
	public String getCDErreorMessage() {
		String ActualMessage = browserObject.findElement(CDCODEError_PR).getText();
		
		return ActualMessage;
	}
	

	
	
	
}
