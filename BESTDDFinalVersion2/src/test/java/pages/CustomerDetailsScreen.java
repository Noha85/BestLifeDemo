package pages;




import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.utility.CustomerDetailsScreenLocators;




public class CustomerDetailsScreen extends CustomerDetailsScreenLocators{
	

	
	public CustomerDetailsScreen(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}
	
	public void navigate_to_Cust_Details_screen() {

		browserObject.findElement(Add_Life_Customer_Btn1).click();
	}
	
	public void search(String CustomerNum) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		browserObject.findElement(Customernum1).sendKeys(CustomerNum);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		browserObject.findElement(Search_Btn1).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String FindCustSuccessfully() {
		
		/*WebElement BooksTable = browserObject.findElement(Customerlocation1);
		List<WebElement> rows = browserObject.findElements(By.tagName("tr"));
	
		int count = rows.size();
		System.out.println("count rows :" +count);
		
		
		List<WebElement> cols = rows.get(1).findElements(By.tagName("td"));
		String cell = cols.get(0).getText();
		System.out.println("cell value :" +cell);*/
		
		String ActualCustMessage = browserObject.findElement(Customerlocation1).getText();
		return ActualCustMessage ;
	}
	
	public void Navigate_to_Cust_Tab() {
		
		browserObject.findElement(Customerlocation1).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserObject.findElement(Cust_Cases_Tab1).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	public void navigate_to_Add_Life_Coverage_screen() {
		
		browserObject.findElement(Add_Life_Coverage_Btn1).click();
	}

	public void searchforplan(String CDCODE){
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try 
		{
			Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
		}
		catch (IOException e ) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		browserObject.findElement(CdCode_Path1).click();
		browserObject.findElement(CdCode_Path1).sendKeys(CDCODE);
		browserObject.findElement(Search_Plan_Btn1).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try 
		{
			Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
		}
		catch (IOException e ) {
			e.printStackTrace();
		}
		browserObject.findElement(Next_Btn1).click();
	}
	
	public String CheckCDCodeSuccessfully() {
		String ActualCustMessage = browserObject.findElement(CustTitle1).getText();
		return ActualCustMessage;
	}
	
	

	public void Create_Cust_Case(String CaseEffectiveDate) {

		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		try 
		{
			Runtime.getRuntime().exec("D:\\git\\HIASAuto\\BESTDDFinalVersion2\\Autoit\\clickfocus.exe");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		

		
		browserObject.findElement(Case_Effective_Path1).click();
		browserObject.findElement(Case_Effective_Path1).sendKeys(CaseEffectiveDate);
		browserObject.findElement(Case_Effective_Path1).sendKeys(Keys.ENTER);
		

	}
	public void Create_Case_renew(String CaseRenewalDate) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		browserObject.findElement(Case_Renewal_Path1).click();
		browserObject.findElement(Case_Renewal_Path1).sendKeys(Keys.chord(Keys.CONTROL , "a"));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
        DateFormat newDateFormat = new SimpleDateFormat("MM-dd-yyyy");  
        Date date = new Date();
      
        try {
			date = dateFormat.parse(CaseRenewalDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
        String newDate =  newDateFormat.format(date);


       browserObject.findElement(Case_Renewal_Path1).sendKeys(newDate);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		browserObject.findElement(Case_Renewal_Path1).sendKeys(Keys.TAB);
	}
	
	public void Create_open_enrollment(String OpenEnrollmentDate) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		browserObject.findElement(Open_Enrollment_Path1).click();
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		browserObject.findElement(Open_Enrollment_Path1).sendKeys(Keys.ARROW_LEFT);
		
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
        DateFormat newDateFormat = new SimpleDateFormat("MM-dd-yyyy");  
        Date date = new Date();
      
        try {
			date = dateFormat.parse(OpenEnrollmentDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
        String newDate =  newDateFormat.format(date);


       browserObject.findElement(Open_Enrollment_Path1).sendKeys(newDate);
		

		
	}
	
	public void selectGroup(String GroupBeneficiary) {
		

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		if (GroupBeneficiary.equalsIgnoreCase(ActualYesResult1))

		{
			browserObject.findElement(title_yes1).getText();
			browserObject.findElement(Group_yes_path1).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			browserObject.findElement(Group_yes_path1).click();
		}

		else {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
				browserObject.findElement(Group_no_path1).click();
				browserObject.findElement(Group_no_path1).click();
			 }
	}
	
	
	public void selectBirthdateChange(String ApplyBirthDateChanges) {

		if (ApplyBirthDateChanges.equalsIgnoreCase(ActualDOEResult1))

		{
			browserObject.findElement(title_AT_Date_of_Event1).getText();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			browserObject.findElement(AT_Date_of_Event_path1).click();
			browserObject.findElement(AT_Date_of_Event_path1).click();
		}

		else {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
				browserObject.findElement(AT_Date_of_Renewal_path1).click();
				browserObject.findElement(AT_Date_of_Renewal_path1).click();
			 }
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
		browserObject.findElement(Save_Btn1).click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		
	}
	
	
	 public void counter(String CCNum)
	 {
		 System.out.println(CCNum);
	 }
	
	public String gettitle() {
		String ActualMessage = browserObject.findElement(title1).getText();
		
		return ActualMessage;
	}
	public void findPrimaryMember() {
	}
	
}


