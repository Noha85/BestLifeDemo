package tests;

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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.ExcelLib;

import pages.AddLifePrimaryMemberDetails;
import pages.CustomerDetailsScreen;
import pages.CustomerMenu;
import pages.HiasLoginPage;
import pages.PrimaryMemberMenu;
import pages.PrimaryMembersScreen;
public class AddPrimaryMemberCase {
	WebDriver browserObject ;
	HiasLoginPage HIASLOGIN;
	CustomerMenu CMenu ;
	CustomerDetailsScreen CustDetailsScreen ;
	PrimaryMemberMenu PMScreen ;
	AddLifePrimaryMemberDetails PMDScreen ;
	PrimaryMembersScreen PMS;
	String ActualResult = "Primary Members";
	

	@BeforeMethod
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 HIASLOGIN = new HiasLoginPage(browserObject);
		 HIASLOGIN.NavigatetoURL();
		 
	  }
	  @Test	  (dataProvider = "AddPM",dataProviderClass = ExcelLib.class)
	  public void Hamada(String username , String password,String CustomerNum ,String Firstname , String Lastname ,
			  String Emailaddress ,String address , String ZiPCode , String Agee , String Gender , String Maritalstatus ,
			  String EMPClass, String EMP_Date , String salary , String Sal_Date ,String Primary_preference_invoices , String Billing_Cycle,
			  String ExpectedMessage){ 
		  HIASLOGIN = new HiasLoginPage(browserObject);
		  HIASLOGIN.Login(username , password);	  
			  
		  CMenu = new CustomerMenu(browserObject);
		  CMenu.navigatetoCustomerScreen();
		  CustDetailsScreen = new CustomerDetailsScreen(browserObject);
		  CustDetailsScreen.findPrimaryMember();
		  PMS = new PrimaryMembersScreen(browserObject);
		  PMS.switchToPrimaryMemberCases();
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  PMS.selectCoveragePrimaryMemberCases("Dental");
		  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  PMS.addPrimaryMemberCase();
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
