package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;

public class DownloadsNonCommercePage  extends PageBase
{

	public DownloadsNonCommercePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(tagName = "h1")
	WebElement pageText ;
	
	@FindBy(linkText = "Download")
	WebElement downloadLink ;
	
	@FindBy(linkText = "Windows")
	WebElement windowsLink ;
	
	@FindBy(linkText = "Linux")
	WebElement linuxLink ;
	
	@FindBy(xpath = "//a[@href='/en/hosting-partners']")
	WebElement chooseCompanyLink ;
	
	@FindBy(xpath = "//a[@href='https://docs.nopcommerce.com/user-guide/installing/installation-guide/index.html']")
	WebElement installNopcommerceLink ;
	
	@FindBy(xpath = "//a[@href='https://docs.nopcommerce.com/user-guide/getting-started.html']")
	WebElement configureStoreLink ;
	
	@FindBy(xpath = "//a[@href='/en/extensions']")
	WebElement chooseInstallPluginsLink ;
	
	@FindBy(xpath = "//a[@href='/en/themes']")
	WebElement chooseThemeLink ;
	
	public String expectedURL = "https://www.nopcommerce.com/en/download-nopcommerce";
	public String expectedTitle ="Download - nopCommerce";
	
	public String DisplayPageText() {
		return pageText.getText() ;
	}
	
	
}
