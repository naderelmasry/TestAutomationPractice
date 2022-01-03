package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(id="FirstName")
	WebElement firstnameField;
	
	@FindBy(id="LastName")
	WebElement lastnameField;
	
	@FindBy(id="Email")
	WebElement emailField;
	
	@FindBy(id="ConfirmEmail")
	WebElement confirmEmailField;
	
	@FindBy(id="Username")
	WebElement userNameField;
	
	@FindBy(id="Password")
	WebElement passwordField;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPasswordField;
	
	@FindBy(id="Details_NopCommerceIntendedUseText")
	WebElement urOption;
	
	@FindBy(id="Details_CompanyIndustryId")
	WebElement companyPrimList;
	
	@FindBy(xpath="//option[@value='5']")
	WebElement companyPrimList_optionOther;
	
	@FindBy(id="Details_NopCommerceIntendedUseId")
	WebElement urPlanList;
	
	@FindBy(xpath="//option[@value='7']")
	WebElement urPlanList_option;
	
	@FindBy(id="Details_CompanyRoleId")
	WebElement mainActivityList;
	
	@FindBy(xpath="//option[@value='5']")
	WebElement mainActivityList_optionOther;
	
	@FindBy(id="Details_CompanySizeId")
	WebElement peapleNumberList;
	
	@FindBy(xpath= "//option[@value='1']")
	WebElement peapleNumberList_optionOther;
	
	@FindBy(id="register-button")
	WebElement registerBtn;
	
	@FindBy(tagName = "h2")
	public WebElement msgSucceed ; 

	public void userRegistration(String firstName , String lastName , String email , String userName , String password, String uroption) {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		setTextValue(firstnameField,firstName);
		setTextValue(lastnameField, lastName);
		setTextValue(emailField, email);
		setTextValue(confirmEmailField, email);
		setTextValue(passwordField, password);
		setTextValue(confirmPasswordField, password);
		setTextValue(userNameField, userName);
		clickButton(companyPrimList);
		clickButton(companyPrimList_optionOther);
//		clickButton(urPlanList);
//		clickButton(urPlanList_option);
//		setTextValue(urOption, uroption);
//		clickButton(mainActivityList);
//		clickButton(mainActivityList_optionOther);
//		
//		clickButton(peapleNumberList);
//		clickButton(peapleNumberList_optionOther);
//		
		clickButton(registerBtn);
	}
}
