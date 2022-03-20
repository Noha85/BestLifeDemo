package pages;



import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.utility.Locators_Repo;


public class AddRateVersion extends Locators_Repo {
	


	public AddRateVersion(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}
	
	
	public void add_Effective_From_Date(String effectivedate)  {
		
		
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
        DateFormat newDateFormat = new SimpleDateFormat("MM-dd-yyyy");  
        Date date = new Date();
      
        try {
			date = dateFormat.parse(effectivedate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
        String newDate =  newDateFormat.format(date);
        
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(Effective_from_date_path).sendKeys(Keys.ARROW_LEFT);
       
       

       // browserObject.findElement(Effective_from_date_path).click();
        	browserObject.findElement(Effective_from_date_path).sendKeys(newDate);
        	
    		try {
    			Thread.sleep(6000);
    			} catch (InterruptedException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    			}
    		
    		browserObject.findElement(Import_Btn).click();
        
	}
	
	public String CheckEffectiveDateisValid() {
		String ActualImportMessage = browserObject.findElement(importtitle).getText();
			
		return ActualImportMessage;
	}
	

	
	public void importfile(String Path) {
		
	try 
		{
			Runtime.getRuntime().exec(Path);
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

		browserObject.findElement(choosefile).click();
		
		try {
			Thread.sleep(5000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		
		browserObject.findElement(Upload_import_btn).click();
		
	/*	try {
			Thread.sleep(9000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}*/
	}
	
	public String Checkuploadfileisvalid() {
		String ActualsuccessfullyMessage = browserObject.findElement(successfullyTitle).getText();
		return ActualsuccessfullyMessage;
	}
	
	
	public void import2() {
		
		try 
		{
			Runtime.getRuntime().exec("D:\\Hossam\\Automation\\BESTDDFinalVersion2\\Autoit\\uploadfile1.exe");
		}
		catch (IOException e ) {
			e.printStackTrace();
		}
		browserObject.findElement(Upload_Ok_btn).click();
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		browserObject.findElement(publish_checkbox).click();
		try {
		Thread.sleep(3000);
		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}

		browserObject.findElement(Done_btn).click();
		
		try {
			Thread.sleep(3000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	


	
	 public void counter(String TCNum)
	 {
		 System.out.println(TCNum);
	 }
	
	 
	public String gettitle() {
		String ActualMessage = browserObject.findElement(title).getText();	
		return ActualMessage;
	}
	
	



}

