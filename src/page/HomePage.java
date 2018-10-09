package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Declaration
		private WebDriver driver;
		@FindBy(xpath="//a[.='Logout']")
	     private WebElement logout;
		public  HomePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
	    	 PageFactory.initElements(driver, this);
		}
		public void logoutClick()
		{
			logout.click();
		}
		
}
