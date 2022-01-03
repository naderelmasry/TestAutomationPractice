package Tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase{
HomePage homeObj ;
UserRegistrationPage registerObj;
LoginPage loginObj ;
//	HomePage homeObj = new HomePage(driver);
//	UserRegistrationPage registerObj = new UserRegistrationPage(driver);
//	LoginPage loginObj = new LoginPage(driver);
	@Test
	public void userCanRegisterSuccssfully() {
		homeObj = new HomePage(driver);
		registerObj = new UserRegistrationPage(driver);
		
		homeObj.ChooseUserLink();
		homeObj.openRegistrationPage();
		registerObj.userRegistration("Nader", "Elsayed", "Nader.test02@gmail.com", "Nadertest02", "Nadertest02", "Your Option");
		assertTrue(registerObj.msgSucceed.getText().contains("Almost done! To complete your nopCommerce registration, we just need to verify your email address."), "User can't be registered");
		
	}
	
	@Test
	public void LoginValidData() {
		homeObj = new HomePage(driver);
		loginObj = new LoginPage(driver);
		homeObj.ChooseUserLink();
		homeObj.OpenLoginPage();
		assertTrue(loginObj.verifytext(), "warning ,the actual text doesn't equal Welcome, Please Sign In!");
		loginObj.UserLogin("Nadertest02", "Nadertest02");
	}
	
}
