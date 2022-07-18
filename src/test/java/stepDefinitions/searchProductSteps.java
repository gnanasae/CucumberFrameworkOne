package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjectManager.PageObjectManagerClass;
import pageObjects.SearchProductPage;
import utils.TestContextSetup;

public class searchProductSteps {

	PageObjectManagerClass pom;
	TestContextSetup tcs;

	public searchProductSteps(TestContextSetup tcs) {
		this.tcs = tcs;
	}

	@Given("user is on the GreenKart home page")
	public void user_is_on_the_green_kart_home_page() throws InterruptedException {

		System.out.println("user is on greenkart page");
		Thread.sleep(2000);
	}

	@When("^user search for (.+) related product is displayed and actual name is extracted$")
	public void user_search_for_related_product_is_displayed_and_actual_name_is_extracted(String shortName)
			throws InterruptedException {

		SearchProductPage sp = tcs.pom.getSearchProductObject();
		sp.searchProduct(shortName);
		Thread.sleep(5000);
		System.out.println(shortName);
		tcs.homePageName = sp.getProductName();
		System.out.println("actual name extracted from home page is " + " " + tcs.homePageName);

	}

}
