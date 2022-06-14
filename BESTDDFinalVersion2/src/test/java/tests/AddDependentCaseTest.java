package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utility.ExcelLib;

import pages.AddDependentCoverageDetails;
import pages.AddDependentDetails;
import pages.CustomerDetailsScreen;
import pages.HiasMenu;
import pages.DependentCasesScreen;
import pages.DependentsScreen;
import pages.HiasLoginPage;
import pages.PrimaryMemberMenu;
import pages.PrimaryMembersScreen;

public class AddDependentCaseTest {
	
	WebDriver browserObject;
	HiasLoginPage HIASLOGIN;
	HiasMenu Menu ;
	CustomerDetailsScreen CustDetailsScreen ;
	PrimaryMemberMenu PMScreenMenu ;
	PrimaryMembersScreen PMScreen;
	DependentsScreen DependentScreen;
	AddDependentDetails AddDependentScreen;
	DependentCasesScreen DepCasesScreen;
	AddDependentCoverageDetails DepCoverageScreen;
	
	@BeforeMethod
	public void BeforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		browserObject = new ChromeDriver();
		browserObject .manage().window().maximize();	
		HIASLOGIN = new HiasLoginPage(browserObject);
		HIASLOGIN.NavigatetoURL();
	}
	
	@Test(dataProvider = "AddDependentCase",dataProviderClass = ExcelLib.class)
	public void AddNewDependentCoverage(String username , String password, String CustomerNum, String PMemberNum, String DependentFName,String coverage,
			String effDate,String WaitingPeriod, String majorEffDate, String EnrollmentReason) throws InterruptedException
	{
		HIASLOGIN.Login(username, password);
		Menu = new HiasMenu(browserObject);
		Menu.navigatetoCustomerScreen();
		CustDetailsScreen = new CustomerDetailsScreen(browserObject);
		CustDetailsScreen.search(CustomerNum);
		//PMScreenMenu = new PrimaryMemberMenu(browserObject);
		//PMScreenMenu.Nav_PrimaryMemberDetailsScreen();
		Menu.Nav_PrimaryMemberDetailsScreen();
		PMScreen = new PrimaryMembersScreen(browserObject);
		PMScreen.search(PMemberNum);
		PMScreen.Navigate_to_Dependents_Screen();
		DependentScreen = new DependentsScreen(browserObject);
		DependentScreen.Navigate_to_ExistingDependentsDetails_Screen(DependentFName);
		AddDependentScreen = new AddDependentDetails(browserObject);
		AddDependentScreen.Navigate_to_DependentCases_Screen();
		DepCasesScreen = new DependentCasesScreen(browserObject);
		DepCasesScreen.Select_Coverage(coverage);
		DepCasesScreen.Navigate_to_DependentCoverageDetails_Screen();
		DepCoverageScreen = new AddDependentCoverageDetails(browserObject);
		DepCoverageScreen.Add_New_DependentCoverage(CustomerNum, PMemberNum, effDate, WaitingPeriod, majorEffDate, EnrollmentReason);
		assertTrue(DepCasesScreen.Verify_DependentCase_Added_Successfully());
		
	}
	
	@AfterMethod
	  public void afterClass() {
		
		browserObject.close();
  }


}
