package pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.AddPrimaryMemberDetails_Locators;
import com.utility.Locators_Repo;

public class AddPrimaryMemberDetails extends AddPrimaryMemberDetails_Locators {
	//hello

	public AddPrimaryMemberDetails (WebDriver browserObject){
		this.browserObject= browserObject;
	}

	
	public void Addprimmemberdetails(String Firstname , String Lastname , String emailaddress ,String P_address , String ZiPCode , String Agee , String Gender,String Maritalstatus,String SSN) throws InterruptedException
	{
		browserObject.findElement(PrimaryMembers_HyperLink).click();
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		browserObject.findElement(Add_Btn).click();
		browserObject.findElement(FirstName).sendKeys(Firstname);
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		browserObject.findElement(LastName).sendKeys(Lastname);
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		browserObject.findElement(EmailAddress).sendKeys(emailaddress);
		browserObject.findElement(Address).sendKeys(P_address);
		browserObject.findElement(ZIPCode).sendKeys(ZiPCode);
		browserObject.findElement(Age).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserObject.findElement(Age).sendKeys(Agee);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserObject.findElement(FirstName).click();
		
		if (Gender.equalsIgnoreCase(ActualMaleResult))

		{
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
				}
			browserObject.findElement(MaleTitle).getText();
			browserObject.findElement(Male).click();
		}

		else {
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
				}
				browserObject.findElement(Female).click();
				}
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
			}
		
		browserObject.findElement(MaritalStatus).click();
		
		browserObject.findElement(MaritalStatus).sendKeys(Maritalstatus);
		browserObject.findElement(MaritalStatus).click();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			 browserObject.findElement(PMS_Done).click();
			 Thread.sleep(3000);
			try 
			{
				Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
	      browserObject.findElement(Conf_Yes).click();
	      Thread.sleep(3000);
	}
	
	public String gettitle() {
		String ActualMessage = browserObject.findElement(Pagetitle).getText();
		
		return ActualMessage;
	}
	public void Navigate_to_Dependents_Screen()
	{
		browserObject.findElement(Dependents_button).click();
		WebDriverWait wait = new WebDriverWait(browserObject, 10);
		wait.until(ExpectedConditions.titleContains("Dependents"));
		
	}

		
}
	


	

