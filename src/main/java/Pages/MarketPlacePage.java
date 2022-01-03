package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPlacePage extends PageBase{

	public MarketPlacePage(WebDriver driver) {
		super(driver);

	}
	@FindBy(linkText = "All")
	WebElement allLink ;

	@FindBy(linkText = "Themes")
	WebElement themesLink ;

	@FindBy(linkText = "Extensions")
	WebElement extensionsLink ;

	@FindBy(id = "SearchTerm")
	WebElement searchTerm ;

	@FindBy(linkText = "See all extensions")
	WebElement allExtensionsLink ;
	
	@FindBy(linkText = "See all themes")
	WebElement allThemesLink ;
	
	@FindBy(linkText = "Upload Now")
	WebElement uploadNowLink ;
	
	public void SearchItem() {
		setTextValue(searchTerm, "");
	
	}
	
	public String expectedURL ="https://www.nopcommerce.com/en/marketplace";
	public String expectedTitle ="Marketplace - nopCommerce";
}
