package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeaturesPages extends PageBase {

	public FeaturesPages(WebDriver driver) {
		super(driver);

	}
	@FindBy(id="ph-title")
	WebElement FeatureText ;

	String expectedTitle ="nopCommerce Features";
	//public String currentURL = driver.getCurrentUrl();

	@FindBy(xpath = "//a[@href='/en/features-mobile-commerce']")
	WebElement moCommerceLink ;

	@FindBy(xpath = "//a[@href='/en/features-multi-store']")
	WebElement multiStoreLink ;

	@FindBy(xpath = "//a[@href='/en/features-multi-vendor']")
	WebElement multiVendorLink ;

	@FindBy(xpath = "//a[@href='/en/features-product']")
	WebElement featureProductLink ;

	@FindBy(xpath = "//a[@href='/en/features-seo']")
	WebElement seoLink ;

	@FindBy(xpath = "//a[@href='/en/features-checkout']")
	WebElement checkoutLink ;

	@FindBy(xpath = "//a[@href='/en/features-marketing']")
	WebElement marketingLink ;

	@FindBy(xpath = "//a[@href='/en/features-payment-methods']")
	WebElement paymentMethodLink ;

	@FindBy(xpath = "//a[@href='/en/features-shipping']")
	WebElement shippingLink ;

	@FindBy(xpath = "//a[@href='/en/features-tax']")
	WebElement taxFeaturesLink ;

	@FindBy(xpath = "//a[@href='/en/features-customer-service']")
	WebElement customerServicesLink ;

	@FindBy(xpath = "//a[@href='/en/features-security-and-compliance']")
	WebElement securityLink ;

	@FindBy(xpath = "//a[@href='/en/get-started']")
	WebElement getStartedBtn ;

	@FindBy(className =  "next-page")
	WebElement nextBtn ;

	public boolean CheckTextPage() {
		return FeatureText.getText().equals(expectedTitle);
	}
	public boolean DisplayFeaturePageText() {
		return FeatureText.isDisplayed();
	}
	public String expectedPageTitle = "nopCommerce Features (the most powerful open-source shopping card platform) - nopCommerce";

	public String CheckpageTilte () {
		return	driver.getTitle();
	}

}
