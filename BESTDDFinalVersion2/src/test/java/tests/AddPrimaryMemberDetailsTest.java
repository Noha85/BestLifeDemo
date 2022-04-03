package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.ExcelLib;

import pages.CustomerDetailsScreen;
import pages.CustomerMenu;
import pages.HiasLoginPage;
import pages.PrimaryMemberMenu;
import pages.PrimaryMemberDetailsPage;
public class AddPrimaryMemberDetailsTest {
	WebDriver browserObject ;
	HiasLoginPage HIASLOGIN;
	CustomerMenu CMenu ;
	CustomerDetailsScreen CustDetailsScreen ;
	PrimaryMemberMenu PMScreen ;
	PrimaryMemberDetailsPage PMDPScreen ;
	
	
	@BeforeMethod
	  public void beforeClass() {
		  
		  System.setProperty("webdriver.chrome.driver", "D:\\Local Disk\\Git\\HIASAuto\\BESTDDFinalVersion2\\chromedriver.exe");
		 browserObject = new ChromeDriver();
		 browserObject .manage().window().maximize();			
		 HIASLOGIN = new HiasLoginPage(browserObject);
		 HIASLOGIN.NavigatetoURL();
		 
	  }
	  
	  @Test(dataProvider = "AddPriamryMember",dataProviderClass = ExcelLib.class)
	  public void Addnewprimarymember(String username,String password, String Cust_Num,String Firstname,String Lastname,String emailaddress,String P_Address,String ZiPCode,String Agee , String Gender,String Maritalstatus, String SSN) throws InterruptedException{

		  HIASLOGIN = new HiasLoginPage(browserObject);
		  HIASLOGIN.Login(username , password);	  
			  
		  CMenu = new CustomerMenu(browserObject);
		  CMenu.navigatetoCustomerScreen();
		  CustDetailsScreen = new CustomerDetailsScreen(browserObject);
		  CustDetailsScreen.search(Cust_Num);
			try {
				Thread.sleep(1000);
				} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			
			PMDPScreen = new PrimaryMemberDetailsPage(browserObject);
			PMDPScreen.Add_NEW_Primary_Member(Cust_Num,Firstname,Lastname,emailaddress,P_Address,ZiPCode,Agee,Gender,Maritalstatus,SSN);
		 		//test		
	  }


	
	  @AfterMethod
	  public void afterClass() {
	       /* DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy h-m-s");
	        Date date = new Date();
			File source = ((TakesScreenshot)browserObject).getScreenshotAs(OutputType.FILE);
			
			try {
				FileHandler.copy(source, new File("C:\\Hossam\\Automation\\screenshots\\"+dateFormat.format(date)+".png")); 
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
		browserObject.close();

	  }
}
