package Tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.testng.annotations.Test;

import Pages.FeaturesPages;
import Pages.HomePage;
import Pages.ShowCaseOptionPage;
import Pages.StoreDemoPage;
import Pages.WhyForDevelopers;
import Pages.WhyForStoreOwner;

public class ProductMenuTest extends TestBase {
	StoreDemoPage storeObj;
	HomePage homeObj;
	ShowCaseOptionPage showObj;
	FeaturesPages featureObj ;
	WhyForDevelopers y4devObj;
	WhyForStoreOwner y4storeObj;
	@Test
	public void chooseStoreOption() {
		homeObj = new HomePage(driver);
		storeObj = new StoreDemoPage(driver);
		homeObj.ProductDropDownList();
		homeObj.StoreOption();

		System.out.println(driver.getCurrentUrl());
		assertEquals(storeObj.CheckStorePageText(), storeObj.expectedText,"The page text doesn't equal the expected page text");
		assertEquals(storeObj.CheckStorePageTitle(), storeObj.expectedtitle,"the actual page title doesn't equal the expected title");

	}


	@Test
	public void ChooseShowCaseOption() {
		homeObj = new HomePage(driver);
		showObj= new ShowCaseOptionPage(driver);
		homeObj.ProductDropDownList();
		homeObj.ShowCaseOption();

		System.out.println(driver.getCurrentUrl());
		org.testng.Assert.assertTrue(showObj.showCaseTextDisplayed(),"The Text of the Show case page doesn't display");
		org.testng.Assert.assertTrue(showObj.CheckShowCaseText(),"the current text on show case page doesn't equal the expected text");
		assertEquals(showObj.CheckPageTitle(),showObj.expectedTitle,"the actual page show case title doesn't equal the expected title ");

	}

	@Test
	public void ChooseFeatureOption() {
		homeObj = new HomePage(driver);
		featureObj = new FeaturesPages(driver);
		homeObj.ProductDropDownList();
		homeObj.FeatureOption();
		System.out.println(driver.getCurrentUrl());
		org.testng.Assert.assertTrue(featureObj.DisplayFeaturePageText(),"The text of the feature page doesn't display");
		assertTrue(featureObj.CheckTextPage());
		assertEquals(featureObj.ActualPageTitle(), featureObj.expectedPageTitle,"The actual title of page feature doesn't equal the expected title");
	}

	@Test
	public void ChooseY4DeveloperOption() {
		y4devObj = new WhyForDevelopers(driver);
		homeObj = new HomePage(driver);
		homeObj.ProductDropDownList();
		homeObj.Why4DevOption();
		System.out.println(driver.getCurrentUrl());
		assertEquals(y4devObj.ActualPageTitle(),y4devObj.expectedTitle,"the actual title of page why for developers doesn't equal the expected title");
		assertEquals(y4devObj.DisplayPageText(), y4devObj.expectedText);
	}
	@Test
	public void ChooseY4StoreOwners() {
		y4storeObj = new WhyForStoreOwner(driver);
		homeObj = new HomePage(driver);
		homeObj.ProductDropDownList();
		homeObj.Why4StoreOption();

		System.out.println(driver.getCurrentUrl());
		assertEquals(y4storeObj.ActualPageTitle(), y4storeObj.expectedTitle,"The actual tilte of page why for store owners doesn't equal the expected title");
		assertEquals(y4storeObj.DisplayPageText(), y4storeObj.expectedText);	
	}



}

