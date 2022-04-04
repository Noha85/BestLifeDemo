package tests;

import static org.testng.Assert.assertEquals;

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

public class AddDependentCaseTest {
	
	WebDriver browserObject;
	HiasLoginPage HIASLOGIN;
	CustomerMenu CMenu ;
	CustomerDetailsScreen CustDetailsScreen ;
	PrimaryMemberMenu PMScreenMenu ;
	PrimaryMembersScreen PMScreen;
	DependentsScreen DependentScreen;
	AddDependentDetails AddDependentScreen;
	
	@BeforeMethod
	public void BeforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		browserObject = new ChromeDriver();
		HIASLOGIN = new HiasLoginPage(browserObject);
		HIASLOGIN.NavigatetoURL();
	}
	
	@Test(dataProvider = "AddDependentCase",dataProviderClass = ExcelLib.class)
	public void AddNewDependent(String username , String password, String CustomerNum, String PMemberNum)
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
		PMScreen.Navigate_to_Dependents_Screen();
		DependentScreen = new DependentsScreen(browserObject);
		DependentScreen.Navigate_to_ExistingDependentsDetails_Screen();
		//DependentScreen.Navigate_to_DependentsDetails_Screen();
		//AddDependentScreen = new AddDependentDetails(browserObject);
		
	}
	
	@AfterMethod
	  public void afterClass() {
		
		browserObject.close();
  }


}
