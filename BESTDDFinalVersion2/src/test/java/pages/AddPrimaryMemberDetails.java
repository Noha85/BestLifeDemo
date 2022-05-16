package pages;

import java.io.IOException;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.utility.AddPrimaryMemberDetails_Locators;


public class AddPrimaryMemberDetails extends AddPrimaryMemberDetails_Locators {
	//hello
    int EXPECTED_ROW_COUNT =1;

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
			Thread.sleep(2000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		int num = Integer.parseInt(SSN);
        int rand_SSN=generateRandomDigits(num);
		String final_SSN=Integer.toString(rand_SSN);
		browserObject.findElement(mem_SSN).sendKeys(final_SSN);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			 browserObject.findElement(Primary_Member_Cases_Tab).click();
			 Thread.sleep(4000);
			try 
			{
				Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			browserObject.findElement(Conf_Yes).click();
	      Thread.sleep(2000);

	      String ExpectedText = "Primary Cases";
	      String ExpText="Primary Member Number";
	      JavascriptExecutor Js1 = (JavascriptExecutor) browserObject;
	      Js1.executeScript("window.scrollBy(0,2000)");  
	      WebElement prim_case_field = (new WebDriverWait(browserObject, 100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"ctl00_DefaultContent_uxPrimaryMemberCasesUpdatePanel\"]/div[2]/div[1]/span/big/b")));
	     
		    WebElement prim_num_field = (new WebDriverWait(browserObject, 100)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(" //*[@id=\"ctl00_DefaultContent_uxPrimaryMemberNumberCaption\"]")));
		    Assert.assertEquals(ExpText, prim_num_field.getText());
		    Assert.assertEquals(ExpectedText, prim_case_field.getText());

	}
	
	public static int generateRandomDigits(int n) {
	    int m = (int) Math.pow(10, n - 1);
	    return m + new Random().nextInt(9 * m);
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
	


	

