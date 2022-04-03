package tests;

import org.testng.annotations.Test;
import com.utility.ExcelLib;
import pages.CreatNewLifeCustomer;
import pages.CustomerMenu;
import pages.HiasLoginPage;
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


@Test
public class AddLifeCustomerTest {
	
	WebDriver browserObject ;
	HiasLoginPage HIASLOGIN;
	CustomerMenu CMenu ;
	CreatNewLifeCustomer CNLC ; 
	

  @BeforeMethod
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Local Disk\\Git\\HIASAuto\\BESTDDFinalVersion2\\chromedriver.exe");
	 browserObject = new ChromeDriver();
	 browserObject .manage().window().maximize();			
	 HIASLOGIN = new HiasLoginPage(browserObject);
	 HIASLOGIN.NavigatetoURL();
  }
  
  
  @Test(dataProvider = "CreateCustomer",dataProviderClass = ExcelLib.class)
  public void addlifecustomer(String username ,String password ,String CustomerName ,String ZipCode,
		  String SICCODE ,String AgentEnrollments ,String ReportingPreference , String CustomerClass,
		  String WaivePeriod ,String EmployerContributions ,String DivisionCode ,String DivDescription)
  {
	  
	  HIASLOGIN = new HiasLoginPage(browserObject);
	  HIASLOGIN.Login(username , password);	  
		  
	  CMenu = new CustomerMenu(browserObject);
	  CMenu.navigatetoCustomerScreen();
	  
	  CNLC = new CreatNewLifeCustomer(browserObject);
	  CNLC.navigate_to_Cust_Details_screen();
	  
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
	  String ActualMessage = CNLC.Check_navigation_to_cust_Screen_Successfully();
	  Assert.assertEquals(ActualMessage, "Customer Details");

	  CNLC.Enter_Cust_Information(CustomerName, ZipCode , SICCODE);
	  CNLC.Allow_Agent_To_Edit_Enrollments(AgentEnrollments,ReportingPreference);
	  
	  
	 /* String ActualCUST_INFOMessage = CNLC.CheckCust_info_Validation();
	  Assert.assertNotEquals(ActualCUST_INFOMessage, "Invalid SIC Code");*/
	  
	  
	  CNLC.Add_Cust_Classes(CustomerClass,WaivePeriod,EmployerContributions);
	  CNLC.Add_Customer_Divisions(DivisionCode,DivDescription);
	  
	  String ActualTitleMessage = CNLC.gettitle();
	  Assert.assertNotEquals(ActualTitleMessage, "Customer");

  }

  @AfterMethod
  public void afterClass() {
	  DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
      Date date = new Date();
		File source = ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
		
		try {
			FileHandler.copy(source, new File("D:\\Hossam\\Automation\\screenshots\\"+dateFormat.format(date)+".png")); 
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
