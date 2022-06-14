package tests;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.ExcelLib;


import pages.CustomerMenu;
import pages.HiasLoginPage;
import pages.ACHAdHocScreen;

public class AddACHAdHocPaymentTest {
	//Adhoc test
	WebDriver browserObject ;
	HiasLoginPage HIASLOGIN;
	CustomerMenu CMenu ;
	ACHAdHocScreen AADS;
	
	@BeforeMethod
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 HIASLOGIN = new HiasLoginPage(browserObject);
		 HIASLOGIN.NavigatetoURL();
		 
	  }
	
	@Test(dataProvider = "ACHAdHocSetup",dataProviderClass = ExcelLib.class)
	 public void AddAdHocSetup(String UserName,String Password,String PrimaryNum,String ActionType,String PayAmt,String DebitDate,String PayFullAmt) throws InterruptedException, ParseException{
	 HIASLOGIN = new HiasLoginPage(browserObject);
	  HIASLOGIN.Login(UserName , Password);	  
	  Thread.sleep(2000);
	  CMenu = new CustomerMenu(browserObject);
	  CMenu.navigatetoCustomerScreen();
	  AADS=new ACHAdHocScreen(browserObject);
	  AADS.search(PrimaryNum);
	  AADS.Navigate_to_PrimaryACHSetup_Screen();
	  AADS.Navigate_to_ACHAdHoc_Screen();
	  AADS.Add_AdHoc_Setup(ActionType,PayAmt,DebitDate,PayFullAmt);
	}
	@AfterMethod
	  public void afterClass() {
	        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
	        Date date = new Date();
		//	File source = ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
			
		/*	try {
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
			}*/
		browserObject.quit();
	  }
}
