package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class StoreDemoPage extends PageBase {

	public StoreDemoPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id = "ph-title")
	WebElement verifyPageText ;


	@FindBy(className = "desktop-store-image")
	WebElement verifyPageImg ;

	@FindBy (className = "button-text")
	WebElement adminBtn ;

	@FindBy (linkText = "Frontend")
	WebElement frontendBtn ;

	@FindBy (linkText = "Partners")
	WebElement PartnersBtn ;

	@FindBy (linkText = " Community forums")
	WebElement  CommunityForumsBtn ;

	@FindBy (linkText = " Get started")
	WebElement  GetStartedBtn ;

	//	public String pageTitle = driver.getTitle();
	public	String expectedtitle = "Store Demo - nopCommerce";

	public String expectedText = "nopCommerce Store Demo";


	public void adminArea () {
		clickButton(adminBtn);
	}
	public void frontEndButton() {
		clickButton(frontendBtn);
	}
	public void CommunityButton() {
		clickButton(CommunityForumsBtn);
	}
	public void PartnerButton() {
		clickButton(PartnersBtn);
	}

	public void GetStartButton() {
		clickButton(GetStartedBtn);
	}

	public boolean displayStorePageImage () {

		return verifyPageImg.isDisplayed();
	}
	public String CheckStorePageText() {

		return verifyPageText.getText();

	}
	public String CheckStorePageTitle() {

		return driver.getTitle();

	}
}
