package pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.utility.PrimaryMemberACHSetupScreen_Locators;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;


public class PrimaryMemberACHSetupScreen extends PrimaryMemberACHSetupScreen_Locators{
	JavascriptExecutor executor;
public PrimaryMemberACHSetupScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}

public void search(String PrimaryMemberNum) 
{
	WebDriverWait wait = new WebDriverWait(browserObject, 10);
	browserObject.findElement(PrimaryNumber).sendKeys(PrimaryMemberNum);
	browserObject.findElement(PrimaryNumSearch_btn).click();
	wait.until(ExpectedConditions.titleContains("Customers"));
}

public void Navigate_to_PrimaryACHSetup_Screen() 
{
	WebDriverWait wait = new WebDriverWait(browserObject, 10);
	browserObject.findElement(Prim_ACH_Btn).click();
	wait.until(ExpectedConditions.titleContains("Primary ACH"));
}




@SuppressWarnings("unused")
public void Add_Member_ACH_Setup (String RoutingNum , String AccountNum , String AccountType ,String ACHStatus ,String Signed, String SignDate, String RecurringAmt,String MonthlyACHDebitDate) throws InterruptedException 
{
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	browserObject.findElement(Rout_num).sendKeys(RoutingNum);

	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	WebDriverWait wait = new WebDriverWait(browserObject, 20);
	wait.until(ExpectedConditions.elementToBeClickable(bnk_Lookup_Btn));
	browserObject.findElement(bnk_Lookup_Btn).click();

	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	// Assert matching bank name is retrieved successfully
	WebElement bnk_text = browserObject.findElement(By.id("ctl00_DefaultContent_uxACHSetup_uxBankNameField"));
	String b_text=bnk_text.getAttribute("value");
	Assert.assertNotNull(b_text);

	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	browserObject.findElement(Acct_num).sendKeys(AccountNum);

	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	//wait = new WebDriverWait(browserObject, 100);
	//wait.until(ExpectedConditions.elementToBeClickable(Acct_Type_DDL));
	browserObject.findElement(Acct_Type_DDL).click();
	browserObject.findElement(Acct_Type_DDL).sendKeys(AccountType);

	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	wait = new WebDriverWait(browserObject, 100);
	wait.until(ExpectedConditions.elementToBeClickable(ACH_Status_DDL));
	browserObject.findElement(ACH_Status_DDL).click();
	browserObject.findElement(ACH_Status_DDL).sendKeys(ACHStatus);

	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	if (Signed.equalsIgnoreCase("1"))
  	{
	wait = new WebDriverWait(browserObject, 100);
	wait.until(ExpectedConditions.elementToBeClickable(Issigned_chk));
	browserObject.findElement(Issigned_chk).click();

	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}

	browserObject.findElement(Issigned_chk).sendKeys(Keys.TAB);
	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	
	SignDate = SignDate.replaceAll("/", "");
	browserObject.findElement(Sign_dt).sendKeys(Keys.HOME + SignDate);
	browserObject.findElement(Sign_dt).sendKeys(SignDate);


	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	
	browserObject.findElement(Sign_dt).sendKeys(Keys.TAB);
	browserObject.findElement(Recurr_Amt).sendKeys(RecurringAmt);

	try {
	Thread.sleep(3000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	
	browserObject.findElement(Recurr_Amt).sendKeys(Keys.TAB);
//browserObject.findElement(Monthly_ACH_debit_dt_tbl).click();

//List<WebElement> calRows= browserObject.findElements(By.xpath("//*[@id=\"ctl00_DefaultContent_uxACHSetup_uxMonthlyACHDebitDateCalendar\"]"));
	WebElement dataWidget = browserObject.findElement(Monthly_ACH_debit_dt_tbl);

	List <WebElement>allLinks=dataWidget.findElements(By.tagName("a"));

	for(WebElement link:allLinks){
	if(link.getText().equalsIgnoreCase(MonthlyACHDebitDate))
	{
		link.click();
		break;
	 }
	
	}

	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}


	wait = new WebDriverWait(browserObject, 100);
	wait.until(ExpectedConditions.elementToBeClickable(Save_ACH_Btn));
	browserObject.findElement(Save_ACH_Btn).click();



	String parentWindow = browserObject.getWindowHandle();

	try 
	{
	Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
	}
	
	catch (IOException e) {
	e.printStackTrace();
	}
	
	try {
	Thread.sleep(2000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	
	wait = new WebDriverWait(browserObject, 100);
	wait.until(ExpectedConditions.elementToBeClickable(popup_Ok_Btn));
	browserObject.findElement(popup_Ok_Btn).click();
	System.out.println("ok btn clicked");
    	
        //Close child window
    	System.out.println("pop up window closed");
    	try {
    		Thread.sleep(2000);
    	} catch (InterruptedException e) {
    		// TODO Auto-generated catch block
    		e.printStackTrace();
    	} 
    	wait = new WebDriverWait(browserObject, 200);
    	wait.until(ExpectedConditions.elementToBeClickable(Done_ACH_Btn));
    	browserObject.findElement(Done_ACH_Btn).click();


    	try {
	Thread.sleep(3000);
    	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
    	}
  	}
	else 
	{
		wait = new WebDriverWait(browserObject, 100);
		wait.until(ExpectedConditions.elementToBeClickable(Issigned_chk));
		browserObject.findElement(Issigned_chk).click();

		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		browserObject.findElement(Issigned_chk).sendKeys(Keys.TAB);
		try {
		Thread.sleep(2000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		
		SignDate = SignDate.replaceAll("/", "");
		browserObject.findElement(Sign_dt).sendKeys(Keys.HOME + SignDate);
		browserObject.findElement(Sign_dt).sendKeys(SignDate);
		browserObject.findElement(Sign_dt).sendKeys(Keys.ENTER);
		
	/*	try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		*/


		wait = new WebDriverWait(browserObject, 200);
		wait.until(ExpectedConditions.elementToBeClickable(Save_ACH_Btn));
		browserObject.findElement(Save_ACH_Btn).click();

		String parentWindow = browserObject.getWindowHandle();

		try 
		{
		Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
		}
		
		catch (IOException eq) {
		eq.printStackTrace();
		}
		
		try {
		Thread.sleep(2000);
		} catch (InterruptedException eq) {
		// TODO Auto-generated catch block
		eq.printStackTrace();
		}
		
		wait = new WebDriverWait(browserObject, 100);
		wait.until(ExpectedConditions.elementToBeClickable(popup_Ok_Btn));
		browserObject.findElement(popup_Ok_Btn).click();
		System.out.println("ok btn clicked");
	    	
	        //Close child window
	    	System.out.println("pop up window closed");
	    	try {
	    		Thread.sleep(2000);
	    	} catch (InterruptedException eq) {
	    		// TODO Auto-generated catch block
	    		eq.printStackTrace();
	    	} 
	    	wait = new WebDriverWait(browserObject, 200);
	    	wait.until(ExpectedConditions.elementToBeClickable(Done_ACH_Btn));
	    	browserObject.findElement(Done_ACH_Btn).click();


	    	try {
		Thread.sleep(3000);
	    	} catch (InterruptedException eq) {
		// TODO Auto-generated catch block
		eq.printStackTrace();
	    	}
		}
		
	}
  }
