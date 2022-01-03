package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class WhyForDevelopers extends PageBase{

	public WhyForDevelopers(WebDriver driver) {
		super(driver);
		
	}
	@FindBy (tagName = "h1")
	WebElement textpage ;
	
	@FindBy(linkText = "Free and open-source")
	WebElement sourceCodeLink ;
	
	@FindBy(linkText = "The advantages of working with nopCommerce")
	WebElement advantagesLink ;
	
	@FindBy(linkText = "Testimonials")
	WebElement testimonalsLink ;
	
	@FindBy(linkText = "next-page")
	WebElement nextLink ;
	
	@FindBy(linkText = "Get started")
	WebElement getStartLink ;
	
	public String expectedTitle = "Why for developers. The most popular ASP.NET based shopping cart solution - nopCommerce";
	public String expectedText ="Why for developers";
	public String DisplayPageText () {
	return	textpage.getText();
	}
}
