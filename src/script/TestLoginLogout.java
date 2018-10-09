package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class TestLoginLogout extends BaseTest {
	@Test(priority=1,groups= {"login","smoke"})
	public void testLoginLogout()
	{
		LoginPage loginPage = new LoginPage(driver);
		String sheet="TestLoginLogout";
		String uname = Utility.getXLData(INPUT_PATH, sheet, 1, 0);
		
		String pword = Utility.getXLData(INPUT_PATH, sheet, 1, 1);
		loginPage.setUserName(uname);
		loginPage.setPassword(pword);
		loginPage.clickLButton();
		HomePage homePage = new HomePage(driver);
		homePage.logoutClick();
	}

}
