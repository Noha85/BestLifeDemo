package pages;


import java.io.IOException;
import org.openqa.selenium.WebDriver;

import com.utility.LifeCustomerPageLocators;



public class CreatNewLifeCustomer extends LifeCustomerPageLocators {



	public CreatNewLifeCustomer (WebDriver browserObject){
		this.browserObject= browserObject;
	}
	
	
	public void navigate_to_Cust_Details_screen() {

		browserObject.findElement(Add_Life_Customer_Btn).click();
	}
	
	public String Check_navigation_to_cust_Screen_Successfully() {
		String ActualCustMessage = browserObject.findElement(Cust_Details_title).getText();
		return ActualCustMessage;
	}
	
	public void Enter_Cust_Information(String CustomerName , String ZipCode ,String SICCODE) {
		
		browserObject.findElement(Customername).sendKeys(CustomerName);
		browserObject.findElement(ZIPCodePath).sendKeys(ZipCode);
		browserObject.findElement(SICCodePath).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browserObject.findElement(SICCodePath).sendKeys(SICCODE);
		browserObject.findElement(Enrollment_yes_path).click();
		
	}
	
	
	
	public void Allow_Agent_To_Edit_Enrollments(String AgentEnrollments , String ReportingPreference) {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		if (AgentEnrollments.equalsIgnoreCase(ActualYesResult))

		{
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
				}
			browserObject.findElement(title_yes).getText();
			browserObject.findElement(Enrollment_yes_path).click();
		}

		else {
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
				}
				browserObject.findElement(Enrollment_no_path).click();
				}
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
			}
		
		
		if (ReportingPreference.equalsIgnoreCase(ActualHIASDefaultResult))

		{
			browserObject.findElement(HIAS_DEF_title).getText();
			browserObject.findElement(Report_HIAS_Default).click();
		}

		else {

				browserObject.findElement(Report_Suppress).click();
				
								
				try 
				{
					Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
				}
				catch (IOException e) {
					e.printStackTrace();
				}
				
				try {
					Thread.sleep(3000);
					} catch (InterruptedException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
					}

				browserObject.findElement(Ok_Btn).click();
				
				try {
					Thread.sleep(3000);
					} catch (InterruptedException e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
					}
				browserObject.findElement(Email_Add).sendKeys("Test@integrant.com");
				
				
			 }
		browserObject.findElement(Division_Chk_Box).click();
		browserObject.findElement(Add_Classes_Btn).click();
	}
	
	
	
	public String CheckCust_info_Validation() {
		String ActualCDMessage = browserObject.findElement(Cust_Class_Details).getText();
		return ActualCDMessage;
	}
	
	public void Report_Members_By_Division()
	{	
			
		browserObject.findElement(Division_Chk_Box).click();
	}
	
	public void Add_Cust_Classes(String CustomerClass , String WaivePeriod,String EmployerContributions) {

		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try 
		{
			Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		browserObject.findElement(Cust_List).click();
		browserObject.findElement(Cust_List).sendKeys(CustomerClass);
		browserObject.findElement(Cust_List).click();
		
		if (WaivePeriod.equalsIgnoreCase(ActualYesResult))

		{
			browserObject.findElement(Waive_yes_title).getText();
			browserObject.findElement(Waive_yes).click();
		}

		else {

				browserObject.findElement(Waive_no).click();
			 }
		
		browserObject.findElement(Primary).click();
		browserObject.findElement(Primary).sendKeys(EmployerContributions);
		browserObject.findElement(Dependent).click();
		browserObject.findElement(Dependent).sendKeys(EmployerContributions);
		browserObject.findElement(Dependent).click();
		browserObject.findElement(Cust_Class_Save_Close).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		
		
		
	}
	
	
	public void Add_Customer_Divisions(String DivisionCode , String DivDescription) {

		browserObject.findElement(Add_Cust_Divisions_Btn).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try 
		{
			Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		browserObject.findElement(Division_Code).sendKeys(DivisionCode);
		browserObject.findElement(Description).sendKeys(DivDescription);
		browserObject.findElement(Cust_Divisions_Save_Close).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		browserObject.findElement(Division_Chk_Box).click();
		
	//	browserObject.findElement(Done_Btn).click();
		

	}
	
	public String gettitle() {
		String ActualtitleMessage = browserObject.findElement(titlee).getText();
		return ActualtitleMessage;
	}

}
	