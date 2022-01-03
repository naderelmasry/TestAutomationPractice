package Pages;

import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WhyForStoreOwner extends PageBase {

	public WhyForStoreOwner(WebDriver driver) {
		super(driver);
		
	}
@FindBy(tagName = "h1")
WebElement pageText ;

@FindBy(linkText="General")
WebElement generalLink ;

@FindBy(linkText="For SMB")
WebElement SMPLink ;

@FindBy(linkText="For Enterprise")
WebElement EnterpriseLink ;

@FindBy(linkText="For B2B")
WebElement B2BlLink ;

@FindBy(linkText="For B2C")
WebElement B2ClLink ;

@FindBy(linkText="View all features")
WebElement featureLink ;

@FindBy(linkText="View demo")
WebElement demoLink ;

@FindBy(linkText="View all integrations")
WebElement AllIntegrationsLink ;

@FindBy(linkText="Find a developer for your project")
WebElement findDevLink ;

@FindBy(linkText="Previous")
WebElement previousLink ;

@FindBy(linkText="Next")
WebElement nextLink ;

public String expectedTitle = "Why for store owners. The most effective solution for B2C and B2B - nopCommerce";
public String expectedText ="Why for store owners";
public String DisplayPageText() {
	return pageText.getText();
}
}
