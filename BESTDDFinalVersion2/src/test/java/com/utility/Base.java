package com.utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Base {
	
public void add_Input_Date(WebDriver browserObject, String inputDate, By locator)  {
		
		
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");  
        DateFormat newDateFormat = new SimpleDateFormat("MM-dd-yyyy");  
        Date date = new Date();
      
        try {
			date = dateFormat.parse(inputDate);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
        String newDate =  newDateFormat.format(date);
        
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
       browserObject.findElement(locator).sendKeys(Keys.ARROW_LEFT);
             

       // browserObject.findElement(Effective_from_date_path).click();
        	browserObject.findElement(locator).sendKeys(newDate);
        
	}
	
	

}
