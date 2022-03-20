package tests;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.utility.ExcelLib;
import pages.AddRateVersion;
import pages.HiasLoginPage;
import pages.LDRateManagement;
import pages.PlanRateScreen;

public class AddPlanRateDefinition {
	WebDriver browserObject ;
	HiasLoginPage HIASLOGIN;
	LDRateManagement LDmenu;
	PlanRateScreen PRScreen ;
	AddRateVersion AddRV ;
	String ActualResult = "Plan 5Name";
	
	
SoftAssert softAssert = new SoftAssert();
		 
	  @BeforeMethod
	  public void beforeClass(){
		  
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();	
		 HIASLOGIN = new HiasLoginPage(browserObject);
		 HIASLOGIN.NavigatetoURL();
	  }
	  


	  
	  @Test(dataProvider = "Add",dataProviderClass = ExcelLib.class)
	  public void AddnewPlanRate(String username, String password, String formnumber ,
			  String CD, String RCD, String PlanSchedule, String effectivedate, String Path, String ExpectedMessage , String TCNum ){

		 
		  HIASLOGIN = new HiasLoginPage(browserObject);
		  HIASLOGIN.Login(username , password);

		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		  String ActualLoginMessage = HIASLOGIN.CheckLoginSuccessfully();
		  Assert.assertEquals(ActualLoginMessage, "Home");

		  
		  LDmenu = new LDRateManagement(browserObject);
		  LDmenu.navigattoLDRatePage();
		  
		  PRScreen = new PlanRateScreen(browserObject);
		  PRScreen.navigatetoplanratepage();
		  PRScreen.searchforplan(formnumber);
		  browserObject.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS) ;
		  PRScreen.entercdcode(CD,RCD);
		  browserObject.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS) ;
		  PRScreen.selectPS(PlanSchedule);
			try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		  browserObject.manage().timeouts().implicitlyWait(20 ,TimeUnit.SECONDS) ;
		  PRScreen.clicknext();
			try {
			Thread.sleep(5000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			
				

			String ActualCDMessage = PRScreen.CheckCDisValid();
			Assert.assertEquals(ActualCDMessage, "Rate Version Details - Add Version");
			
			
			
		
		  AddRV = new AddRateVersion(browserObject);  
		  AddRV.add_Effective_From_Date(effectivedate);
			try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			String ActualImportMessage = AddRV.CheckEffectiveDateisValid();
			Assert.assertEquals(ActualImportMessage, "Import");
			
		  AddRV.importfile(Path);
		  
			try {
			Thread.sleep(11000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
			String ActualsuccessfullyMessage = AddRV.Checkuploadfileisvalid();
			Assert.assertEquals(ActualsuccessfullyMessage, "The life rate factor file is imported successfully.");
			
			AddRV.import2();
			AddRV.counter(TCNum);
		  
		if (ExpectedMessage.equalsIgnoreCase(ActualResult))
		{
			String ActualMessage = AddRV.gettitle();
			Assert.assertEquals(ExpectedMessage, ActualMessage);
			
		}
		
		

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
