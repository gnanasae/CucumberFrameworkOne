package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import genericUtils.Generic;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjectManager.PageObjectManagerClass;
import pageObjects.DealsPage;
import utils.TestContextSetup;

public class dealsPageSteps {
	WebDriver driver;
	PageObjectManagerClass pom;
	TestContextSetup tcs;

	public dealsPageSteps(TestContextSetup tcs) {
		this.tcs = tcs;
	}

	@And("^user navigates to top deals and search for (.+)$")
	public void user_navigates_to_top_deals_and_search_for(String shortName) throws InterruptedException, IOException {
		DealsPage dp = tcs.pom.getDealsPageObject();
		dp.clickOnOfferPage();
		driver = tcs.bc.webDriverSetup();
		Generic g = tcs.generic;
		String url = dp.getCurrentUrl();
		System.out.println(url);
		g.switchToDealsPage();
		Thread.sleep(2000);
		tcs.topDealsName = dp.getProductName(shortName);
		System.out.println("extracted name from the top deals page is" + " " + tcs.topDealsName);

	}

	@Then("validating both for product match")
	public void validating_both_for_product_match() {

		Assert.assertEquals(tcs.homePageName, tcs.topDealsName);

		System.out.println("both are matched");
		System.out.println("test passed successfully");
	}

}
