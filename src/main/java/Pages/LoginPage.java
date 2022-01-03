package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(id = "Username")
WebElement userNameLoginTxt ;

@FindBy (id = "Password")
WebElement passwordLoginTxt ;

@FindBy(xpath = "//label[@class='custom-control-label']")
WebElement checkBoxRememberMe ;

@FindBy(xpath = "//input[@class='btn blue-button']")
WebElement loginButton ;

@FindBy (className = "page-title")
WebElement verifyLoginTxt ;

public void UserLogin(String loginUserName , String LoginPassword) {
	setTextValue(userNameLoginTxt, loginUserName);
	setTextValue(passwordLoginTxt, LoginPassword);
	clickButton(checkBoxRememberMe);
	clickButton(loginButton);
}
public boolean verifytext() {
	return verifyLoginTxt.getText().equals("Welcome, Please Sign In!");
}
}
