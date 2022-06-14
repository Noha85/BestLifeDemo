package tests;
import java.text.DateFormat;
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

import pages.AddPrimaryMemberDetails;
import pages.CustomerDetailsScreen;
import pages.HiasLoginPage;
import pages.HiasMenu;
import pages.PrimaryMemberMenu;
import pages.PrimaryMemberACHSetupScreen;

public class AddPrimaryAchSetupTest {
	//ACH
	WebDriver browserObject ;
	HiasLoginPage HIASLOGIN;
	HiasMenu CMenu ;
	CustomerDetailsScreen CustDetailsScreen ;
	PrimaryMemberMenu PMScreen ;
	AddPrimaryMemberDetails PMDPScreen ;
	PrimaryMemberACHSetupScreen PMASScreen;
	
	
	@BeforeMethod
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 HIASLOGIN = new HiasLoginPage(browserObject);
		 HIASLOGIN.NavigatetoURL();
		 
	  }
	
	
	  @Test(dataProvider = "PrimaryMemberAchSetup",dataProviderClass = ExcelLib.class)
	  public void AddprimayMemberAchSetup(String UserName,String Password, String PrimaryNum,String RoutingNum, String AccountNum,String AccountType,String ACHStatus,String Signed,String SignDate,String RecurringAmt,String MonthlyACHDebitDate) throws InterruptedException{

		  HIASLOGIN = new HiasLoginPage(browserObject);
		  HIASLOGIN.Login(UserName , Password);	  
		  Thread.sleep(2000);
		  CMenu = new HiasMenu(browserObject);
		  CMenu.navigatetoCustomerScreen();
		  PMASScreen = new PrimaryMemberACHSetupScreen(browserObject);
		  PMASScreen.search(PrimaryNum);
		  PMASScreen.Navigate_to_PrimaryACHSetup_Screen();
		  PMASScreen.Add_Member_ACH_Setup(RoutingNum, AccountNum, AccountType, ACHStatus, Signed, SignDate, RecurringAmt, MonthlyACHDebitDate);
			

	  }
	  
	  @AfterMethod
	  public void afterClass() {
	        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
	        Date date = new Date();
		/*	File source = ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
			
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
			}*/
		browserObject.quit();
	  }
	  
}
