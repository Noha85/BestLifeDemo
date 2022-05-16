package pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


import com.utility.HiasMenuLocators;


public class HiasLoginPage extends HiasMenuLocators{
	

	public HiasLoginPage(WebDriver browserObject)
	{
		this.browserObject = browserObject;
	}
	
	public void NavigatetoURL()
	{
		browserObject.navigate().to(URL);
	}

	public void Login(String Username , String Password)
	{

		browserObject.findElement(Usernamepath).sendKeys(Username);
		browserObject.findElement(Passwordpath).sendKeys(Password);
		browserObject.findElement(Passwordpath).sendKeys(Keys.ENTER);
 

	}
	

	public String CheckLoginSuccessfully () {
		
		
		String ActualLoginMessage = browserObject.findElement(titlee).getText();
		
		return ActualLoginMessage;
	}






	
	

}
