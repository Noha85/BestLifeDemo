package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.ExcelLib;

import pages.AddDependentDetails;
import pages.AddPrimaryMemberDetails;
import pages.CustomerDetailsScreen;
import pages.CustomerMenu;
import pages.DependentsScreen;
import pages.HiasLoginPage;
import pages.PrimaryMemberMenu;
import pages.PrimaryMembersScreen;

public class AddDependentTest {
	
	WebDriver browserObject;
	HiasLoginPage HIASLOGIN;
	CustomerMenu CMenu ;
	CustomerDetailsScreen CustDetailsScreen ;
	PrimaryMemberMenu PMScreenMenu ;
	PrimaryMembersScreen PMScreen;
	AddPrimaryMemberDetails PMDetailsScreen;
	DependentsScreen DependentScreen;
	AddDependentDetails AddDependentScreen;
	
	@BeforeMethod
	public void BeforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		browserObject = new ChromeDriver();
		browserObject .manage().window().maximize();	
		HIASLOGIN = new HiasLoginPage(browserObject);
		HIASLOGIN.NavigatetoURL();
	}
	
	@Test(dataProvider = "AddDependent",dataProviderClass = ExcelLib.class)
	public void AddNewDependent(String username , String password, String CustomerNum, String PMemberNum, String FirstName, String LastName,
			String Relationship, String Age, String Gender, String Eligible, String EligibleReason, String ProofDate) throws InterruptedException 
	{
		HIASLOGIN.Login(username, password);
		CMenu = new CustomerMenu(browserObject);
		CMenu.navigatetoCustomerScreen();
		CustDetailsScreen = new CustomerDetailsScreen(browserObject);
		CustDetailsScreen.search(CustomerNum);
		PMScreenMenu = new PrimaryMemberMenu(browserObject);
		PMScreenMenu.Nav_PrimaryMemberDetailsScreen();
		PMScreen = new PrimaryMembersScreen(browserObject);
		PMScreen.search(PMemberNum);
		PMScreen.selectPrimaryMember();
		PMDetailsScreen = new AddPrimaryMemberDetails(browserObject);
		PMDetailsScreen.Navigate_to_Dependents_Screen();
		DependentScreen = new DependentsScreen(browserObject);
		DependentScreen.Navigate_to_DependentsDetails_Screen();
		AddDependentScreen = new AddDependentDetails(browserObject);
		AddDependentScreen.Add_New_Dependent(FirstName, LastName, Relationship, Age, Gender, Eligible, EligibleReason, ProofDate);
		assertTrue(DependentScreen.Verify_Dependent_Added_Successfully(FirstName, LastName, Gender, Relationship));
	}
	
	@AfterMethod
	  public void afterClass() {
		
		browserObject.close();
  }

}
