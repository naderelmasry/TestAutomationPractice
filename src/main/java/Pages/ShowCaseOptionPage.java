package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShowCaseOptionPage extends PageBase {

	
		
	

public ShowCaseOptionPage(WebDriver driver) {
		super(driver);
		
	}

public String expectedPageText = "Showcase. Live shops";

	@FindBy (tagName = "h1")
	WebElement verifyPageText ;
	
	
	@FindBy(linkText = "Read case studies")
	WebElement readBtn ;
	
	
	@FindBy(className = "btn blue-button")
	WebElement applyBtn ;
	
	@FindBy(linkText = "Next Page")
	WebElement nextBtn ;
	
	
	@FindBy(linkText = "last-page")
	WebElement lastBtn ;
	
	public String expectedTitle = "Showcase. Live shops - nopCommerce";
	public void clickOnApplyButton() {
		clickButton(applyBtn);
	}
	public void clickOnNextButton() {
		clickButton(nextBtn);
	}
	public void clickOnLastButton() {
		clickButton(lastBtn);
	}
	public boolean showCaseTextDisplayed() {
		return verifyPageText.isDisplayed();
	}
	public boolean CheckShowCaseText() {
		 return verifyPageText.getText().equals(expectedPageText);
	}
	public String CheckPageTitle() {
		return driver.getTitle();
		
	}
	
	
	
}
