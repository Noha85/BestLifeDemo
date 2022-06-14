package tests;

import org.testng.annotations.Test;


import com.utility.ExcelLib;

import pages.CustomerDetailsScreen;
import pages.HiasMenu;
import pages.HiasLoginPage;
import pages.PlanRateScreen;
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

public class AddCustomerCase {

	WebDriver browserObject ;
	HiasLoginPage HIASLOGIN;
	HiasMenu Menu ;
	CustomerDetailsScreen CustDetailsScreen ;
	PlanRateScreen PRScreen ;
	String ActualResult = "Customer Agents";

	@BeforeMethod
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 HIASLOGIN = new HiasLoginPage(browserObject);
		 HIASLOGIN.NavigatetoURL();
		 
	  }
	  
 
	  @Test(dataProvider = "AddCC",dataProviderClass = ExcelLib.class)
	  public void AddnewPlanRate(String username , String password,String CustomerNum , String CDCODE , String CaseEffectiveDate ,
			  String CaseRenewalDate ,String OpenEnrollmentDate , String GroupBeneficiary ,
			  String ApplyBirthDateChanges , String ExpectedMessage, String CCNum ){

		  HIASLOGIN = new HiasLoginPage(browserObject);
		  HIASLOGIN.Login(username , password);	  
			  
		  Menu = new HiasMenu(browserObject);
		  Menu.navigatetoCustomerScreen();
		  CustDetailsScreen = new CustomerDetailsScreen(browserObject);
		  CustDetailsScreen.search(CustomerNum);
			try {
				Thread.sleep(3000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			

			
			if (CustomerNum.equalsIgnoreCase(CustDetailsScreen.FindCustSuccessfully()))
			{
				
				CustDetailsScreen.Navigate_to_Cust_Tab();
			}
			else {
				
				Assert.assertEquals(CustomerNum, CustDetailsScreen.FindCustSuccessfully());	
			}
		  
			
		  CustDetailsScreen.navigate_to_Add_Life_Coverage_screen();
		  CustDetailsScreen.searchforplan(CDCODE);
			try {
				Thread.sleep(5000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
		 String ActualCdMessage = CustDetailsScreen.CheckCDCodeSuccessfully();
		Assert.assertEquals(ActualCdMessage, "Case Details");

		  CustDetailsScreen.Create_Cust_Case(CaseEffectiveDate);
		  CustDetailsScreen.Create_Case_renew(CaseRenewalDate);
		  CustDetailsScreen.Create_open_enrollment(OpenEnrollmentDate);
		  CustDetailsScreen.selectGroup(GroupBeneficiary);
		 CustDetailsScreen.selectBirthdateChange(ApplyBirthDateChanges);
		  
		  CustDetailsScreen.counter(CCNum);
		  
			try {
				Thread.sleep(6000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			  
		if (ExpectedMessage.equalsIgnoreCase(ActualResult))
		{
			String ActualMessage = CustDetailsScreen.gettitle();
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
