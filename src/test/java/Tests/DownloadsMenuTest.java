package Tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.DownloadsNonCommercePage;
import Pages.HomePage;
import Pages.MarketPlacePage;

public class DownloadsMenuTest extends TestBase {
	HomePage homeObj ;
	DownloadsNonCommercePage downloadObj ;
	MarketPlacePage marketObj ;
	@Test
	public void ChooseDownloadsOptions() {
		homeObj =new HomePage(driver);
		downloadObj = new DownloadsNonCommercePage(driver);
		homeObj.DownloadMenu();
		homeObj.DownloadOption();

		assertEquals(downloadObj.ActualPageURL(), downloadObj.expectedURL);
		assertEquals(downloadObj.ActualPageTitle(), downloadObj.expectedTitle);
	}
@Test
public void ChooseMarketPlaceOption() {
	homeObj = new HomePage(driver);
	marketObj = new MarketPlacePage(driver);
	homeObj.DownloadMenu();
	homeObj.MarketPlaceOption();
	assertEquals(marketObj.ActualPageURL(), marketObj.expectedURL);
	assertEquals(marketObj.ActualPageTitle(), marketObj.expectedTitle);
}
}
