package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageBase {


	protected WebDriver driver;
	//Create instructor 

	public PageBase(WebDriver driver) {
		 this.driver = driver;
		    PageFactory.initElements(driver, this);
	}
	
	//click on button
	public void clickButton(WebElement button) {
		button.click();
	}
	
	//send values
	public void setTextValue(WebElement text , String value) {
		text.sendKeys(value);
	}
	public String ActualPageTitle() {
	return driver.getTitle();
	}
	
	public String ActualPageURL() {
		return driver.getCurrentUrl();
		}
}
