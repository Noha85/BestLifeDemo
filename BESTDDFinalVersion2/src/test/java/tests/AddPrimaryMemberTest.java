package tests;

import org.testng.annotations.Test;

import com.utility.ExcelLib;

import pages.AddLifePrimaryMemberDetails;
import pages.CustomerDetailsScreen;
import pages.CustomerMenu;
import pages.HiasLoginPage;
import pages.PrimaryMemberMenu;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

import org.testng.annotations.AfterMethod;

public class AddPrimaryMemberTest {

	
	WebDriver browserObject ;
	HiasLoginPage HIASLOGIN;
	CustomerMenu CMenu ;
	CustomerDetailsScreen CustDetailsScreen ;
	PrimaryMemberMenu PMScreen ;
	AddLifePrimaryMemberDetails PMDScreen ;
	
	String ActualResult = "Primary Members";
	

	@BeforeMethod
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 HIASLOGIN = new HiasLoginPage(browserObject);
		 HIASLOGIN.NavigatetoURL();
		 
	  }
	  


	  
	  @Test(dataProvider = "AddPM",dataProviderClass = ExcelLib.class)
	  public void AddnewPlanRate(String username , String password,String CustomerNum ,String Firstname , String Lastname ,
			  String Emailaddress ,String address , String ZiPCode , String Agee , String Gender , String Maritalstatus ,
			  String EMPClass, String EMP_Date , String salary , String Sal_Date ,String Primary_preference_invoices , String Billing_Cycle,
			  String ExpectedMessage){

		  HIASLOGIN = new HiasLoginPage(browserObject);
		  HIASLOGIN.Login(username , password);	  
			  
		  CMenu = new CustomerMenu(browserObject);
		  CMenu.navigatetoCustomerScreen();
		  CustDetailsScreen = new CustomerDetailsScreen(browserObject);
		  CustDetailsScreen.search(CustomerNum);
			try {
				Thread.sleep(3000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			PMScreen = new PrimaryMemberMenu(browserObject);
			PMScreen.Nav_PrimaryMemberDetailsScreen();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PMScreen.navigatetoPrimaryMemberDetailsScreen_Menu();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			PMDScreen = new AddLifePrimaryMemberDetails(browserObject);
			PMDScreen.AddnewLifeprimarymember(Firstname,Lastname,Emailaddress,address,ZiPCode,Agee,Gender,Maritalstatus,EMPClass, EMP_Date , salary , Sal_Date);
			PMDScreen.Reporting_Preference(Primary_preference_invoices);
			PMDScreen.Invoice_Billing_Cycle( Billing_Cycle);
			

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			if (ExpectedMessage.equalsIgnoreCase(ActualResult))
			{
				String ActualMessage = PMDScreen.gettitle();
				Assert.assertEquals(ActualMessage,ExpectedMessage);
			}
		 
		
	  }


	
	  @AfterMethod
	  public void afterClass() {
	        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
	        Date date = new Date();
			File source = ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
			
			try {
				FileHandler.copy(source, new File("D:\\screenshots\\"+dateFormat.format(date)+".png")); 
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		browserObject.close();
	  }
	  
	
	
	
}
