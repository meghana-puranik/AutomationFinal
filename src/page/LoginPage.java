package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//Declaration
	private WebDriver driver;
     @FindBy(id="username")
     private WebElement unTB;
     @FindBy(name="pwd")
     private WebElement pwTB;
     @FindBy(xpath="//div[.='Login ']")
     private WebElement lBtn;
     public LoginPage(WebDriver driver)
     {   
    	 this.driver=driver;
    	 PageFactory.initElements(driver, this);
    	 
     }
	public void setPassword(String password)
		{
			pwTB.sendKeys(password);
		}
		public void clickLButton() 
		{
			lBtn.click();
			
			
		}


		public void setUserName(String username) {
			// TODO Auto-generated method stub
			unTB.sendKeys(username);
		}



		
}

		


		