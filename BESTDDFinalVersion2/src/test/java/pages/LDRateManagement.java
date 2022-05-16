package pages;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utility.HiasMenuLocators;

public class LDRateManagement extends HiasMenuLocators{
	

	public LDRateManagement(WebDriver browserObject) {
		
		this.browserObject= browserObject;
	}


	public void navigattoLDRatePage() {
		
		 Actions Action = new Actions(browserObject);
		WebElement element = (new WebDriverWait(browserObject, 50))
				   .until(ExpectedConditions.elementToBeClickable(By.linkText("Rating")));
		Action.moveToElement(element).build().perform();
		
		
		WebElement element1 = browserObject.findElement(RateManagement);
		browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		Action.moveToElement(element1).build().perform();
		
		
		 WebElement element2 = browserObject.findElement(LDRateManagement);
		 browserObject.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS) ;
		 element2.click();


	}


}
