package pages;
import org.apache.commons.logging.Log;
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

import com.utility.ACH_AdHocScreen_Locators;

import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class ACHAdHocScreen extends ACH_AdHocScreen_Locators {
	//Adhoc test
	String P_amt;
  public ACHAdHocScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}

  public void search(String PrimaryNum) 
{
	WebDriverWait wait = new WebDriverWait(browserObject, 10);
	browserObject.findElement(PrimaryNumber).sendKeys(PrimaryNum);
	browserObject.findElement(PrimaryNumSearch_btn).click();
	wait.until(ExpectedConditions.titleContains("Customers"));
}

  public void Navigate_to_PrimaryACHSetup_Screen() 
{
	WebDriverWait wait = new WebDriverWait(browserObject, 200);
	browserObject.findElement(Prim_ACH_Btn).click();
	wait.until(ExpectedConditions.titleContains("Primary ACH"));
}

  public void Navigate_to_ACHAdHoc_Screen() 
{
	WebDriverWait wait = new WebDriverWait(browserObject, 200);
	browserObject.findElement(AdHoc_btn).click();
	wait.until(ExpectedConditions.titleContains("Primary ACH"));
}

@SuppressWarnings("deprecation")
  public void Add_AdHoc_Setup (String ActionType,String DebitDate,String PayAmt,String PayFullAmt) throws InterruptedException, ParseException 
{
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	WebDriverWait wait = new WebDriverWait(browserObject, 100);
	wait.until(ExpectedConditions.elementToBeClickable(AdHoc_act_DDL));
	browserObject.findElement(AdHoc_act_DDL).sendKeys(ActionType);
	//browserObject.findElement(AdHoc_act_DDL).sendKeys(Keys.TAB);
	
	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
  wait = new WebDriverWait(browserObject, 100);
  wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_DefaultContent_uxACHSetup_uxAdHocDebitDateCalendar")));
  WebElement dataWidget = browserObject.findElement(current_bal_due_tbl);
  List <WebElement>allLinks=dataWidget.findElements(By.tagName("a"));
  
  for(WebElement link:allLinks){
	if(link.getText().equalsIgnoreCase(DebitDate))
	{
		link.click();
		break;
	 }
	
  }
  
  if (PayFullAmt.equalsIgnoreCase("1"))
 {
	
 try {
	Thread.sleep(2000);
     } catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
   }
  wait = new WebDriverWait(browserObject, 100);
  browserObject.findElement(pay_amt).sendKeys(PayAmt);
  wait.until(ExpectedConditions.elementToBeSelected(pay_amt));

	}

   else
	{ 
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	wait = new WebDriverWait(browserObject, 200);
	wait.until(ExpectedConditions.elementToBeClickable(pay_full_chk));
	browserObject.findElement(pay_full_chk).click();
	
	

   try {
	Thread.sleep(2000);
     } catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
     }
  WebElement current_bal_due_amt=browserObject.findElement(By.xpath("//*[@id=\"ctl00_DefaultContent_uxACHSetup_uxBalanceDueField_uxCurrencyField\"]/tbody/tr/td"));
  String Curr_Amt=current_bal_due_amt.getText();
  WebElement Adhoc_PayAmt = browserObject.findElement(By.id("ctl00_DefaultContent_uxACHSetup_uxPayAmountField"));
  P_amt=Adhoc_PayAmt.getAttribute("value");
  Assert.assertEquals(P_amt, Curr_Amt);
	}
  wait = new WebDriverWait(browserObject, 100);
  wait.until(ExpectedConditions.elementToBeClickable(Submit_Adhoc_btn));
  browserObject.findElement(Submit_Adhoc_btn).click();

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
	e.printStackTrace();}

  wait = new WebDriverWait(browserObject, 100);
  wait.until(ExpectedConditions.elementToBeClickable(Yes_popup_btn));
  browserObject.findElement(Yes_popup_btn).click();

  try {
	Thread.sleep(2000);
     } catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} 
  wait = new WebDriverWait(browserObject, 100);
  wait.until(ExpectedConditions.elementToBeClickable(Done_trans_btn));
  browserObject.findElement(Done_trans_btn).click();
  
try {
	Thread.sleep(2000);
    } catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} 
}
}
