package pages;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.utility.Locators_Repo;

public class AddPrimaryMemberDetails extends Locators_Repo {
	

	public AddPrimaryMemberDetails (WebDriver browserObject){
		this.browserObject= browserObject;
	}

	
	public void Add_NEW_Primary_Member(String Firstname , String Lastname , String Emailaddress ,
			String address , String ZiPCode , String Agee , String Gender,
			String Maritalstatus,String EMPClass , String EMP_Date , String Salary , String Sal_Date)
	{
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
		browserObject.findElement(EmailAddress).sendKeys(Emailaddress);
		browserObject.findElement(Address).sendKeys(address);
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
		
		browserObject.findElement(EMP_Add_Row).click();
		browserObject.findElement(EMP_Class).click();
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
			}
		browserObject.findElement(EMP_Class).sendKeys(EMPClass);
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
			}
		browserObject.findElement(EMP_Class).click();
		
		browserObject.findElement(EMP_Date_From).click();
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(EMP_Date_From).sendKeys(Keys.ARROW_LEFT);
		
		
		
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
        DateFormat newDateFormat = new SimpleDateFormat("MM-dd-yyyy");  
        Date date = new Date();
      
        try {
			date = dateFormat.parse(EMP_Date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
        String newDate =  newDateFormat.format(date);


       browserObject.findElement(EMP_Date_From).sendKeys(newDate);
       
       
  ////////////////////////////////Salary
       
		browserObject.findElement(Sal_Add_Row).click();
		browserObject.findElement(salary).click();
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
			}
		browserObject.findElement(salary).sendKeys(Salary);
		try {
			Thread.sleep(2000);
			} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
			}

		
		browserObject.findElement(Sal_Date_From).click();
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Sal_Date_From).sendKeys(Keys.ARROW_LEFT);
		
		
		
 
       Date date1 = new Date();
     
       try {
			date1 = dateFormat.parse(Sal_Date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
       String newDate1 =  newDateFormat.format(date1);


      browserObject.findElement(Sal_Date_From).sendKeys(newDate1);
      
		try {
			Thread.sleep(1500);
			} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
			}
	}
	
	public void Reporting_Preference(String Primary_preference_invoices)
	{
		if (Primary_preference_invoices.equalsIgnoreCase(ActualHIASDefaultResult1))

		{
			System.out.println("This is the Default Selection");
			//browserObject.findElement(HIAS_DEF_title).getText();
			//browserObject.findElement(HIAS_Default_radio).click();
		}
		else if (Primary_preference_invoices.equalsIgnoreCase(ActualAlways_PrintResult))
		{
			browserObject.findElement(Always_Print_Title).getText();
			browserObject.findElement(Always_Print_radio).click();
		}

		else {
					browserObject.findElement(Suppress_radio).click();
			 }
		
	}
	
	public void Invoice_Billing_Cycle(String Billing_Cycle)
	{
		if (Billing_Cycle.equalsIgnoreCase(ActualMonthlyResult))

		{
			//browserObject.findElement(Monthly_Title).getText();
			//browserObject.findElement(Monthly_radio).click();
			System.out.println("This is the Default Selection");
		}
		else if (Billing_Cycle.equalsIgnoreCase(ActualQuarterlyResult))
		{
			browserObject.findElement(Quarterly_Title).getText();
			browserObject.findElement(Quarterly_radio).click();
		}
		else if (Billing_Cycle.equalsIgnoreCase(ActualSemiAnnuallyResult))
		{
			browserObject.findElement(SemiAnnually_Title).getText();
			browserObject.findElement(SemiAnnually_radio).click();
		}

		else {
					browserObject.findElement(Annually_radio).click();
				
			 }
		
		     browserObject.findElement(PMS_Done).click();
	      
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			try 
			{
				Runtime.getRuntime().exec("D:\\Hossam\\Automation\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
			}
			catch (IOException e) {
				e.printStackTrace();
			}
	      browserObject.findElement(Conf_Yes).click();
	}
	
	public String gettitle() {
		String ActualMessage = browserObject.findElement(Pagetitle).getText();
		
		return ActualMessage;
	}
	
}
