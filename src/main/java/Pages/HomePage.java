package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase 
{

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(className ="userlink")
	WebElement userLinks;

	public void ChooseUserLink() {

		clickButton(userLinks);
	}

	@FindBy(xpath ="//a[@href='/en/register?returnUrl=%2Fen']")
	WebElement registerLink;

	public void openRegistrationPage() {
		clickButton(registerLink);
	}
	@FindBy (xpath = "//a[@href='/en/login?returnUrl=%2Fen']")
	WebElement loginLink ;

	@FindBy (xpath = "//*[ contains (text(), 'Product' ) ]")
	WebElement productMenu ;

	@FindBy (xpath = "//a[@href='/en/demo']")
	WebElement storeOption ;

	@FindBy (xpath = "//a[@href='/en/showcase']")
	WebElement showCaseOption ;

	@FindBy (xpath = "//a[@href='/en/features']")
	WebElement featureOption ;

	@FindBy (xpath = "//a[@href='/en/why-for-developers']")
	WebElement y4DevloperOption ;

	@FindBy (xpath = "//a[@href='/en/why-for-store-owners']")
	WebElement y4StoreOption ;


	@FindBy (xpath = "//*[ contains (text(), 'Downloads' ) ]")
	WebElement downloadMenu ;

	@FindBy(linkText = "Download nopCommerce")
	WebElement downloadOption ;
	
	@FindBy(linkText = "Marketplace")
	WebElement marketPlaceOption ;

	@FindBy(linkText = "Translations")
	WebElement translationOption ;
	
	@FindBy(linkText = "Copyright removal key")
	WebElement copyrightOption ;
	
	@FindBy (xpath = "//*[ contains (text(), 'Support & services' ) ]")
	WebElement supportMenu ;

	@FindBy (xpath = "//*[ contains (text(), 'Partners') ]")
	WebElement partnerLink ;

	public void OpenLoginPage() {
		clickButton(loginLink);
	}

	public void ProductDropDownList() {
		clickButton(productMenu);
	}

	public void StoreOption() {
		clickButton(storeOption);
	}
	public void ShowCaseOption() {
		clickButton(showCaseOption);
	}

	public void FeatureOption() {
		clickButton(featureOption);
	}
	public void Why4DevOption() {
		clickButton(y4DevloperOption);
	}

	public void Why4StoreOption() {
		clickButton(y4StoreOption);
	}
	public void DownloadMenu() {
		clickButton(downloadMenu);
	}
	public void DownloadOption() {
		clickButton(downloadOption);
	}
	public void MarketPlaceOption() {
		clickButton(marketPlaceOption);
	}
	public void TranslationOption() {
		clickButton(translationOption);
	}
	
	public void CopyrightOption() {
		clickButton(copyrightOption);
	}
}
