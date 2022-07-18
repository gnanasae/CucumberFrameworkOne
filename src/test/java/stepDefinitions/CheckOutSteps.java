package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;
import utils.TestContextSetup;

public class CheckOutSteps {

	CheckOutPage cop ;
	TestContextSetup tcs;

	public CheckOutSteps(TestContextSetup tcs) {

		this.tcs = tcs;
	}

	@When("user search for {string}")
	public void user_search_for(String name) throws InterruptedException {

		cop = tcs.pom.getCheckOutPageObject();
		cop.searchProduct(name);
		Thread.sleep(3000);
		System.out.println("finished item search");

	}

	@Then("^add how much quantity is required and add the product to the cart$")
	public void add_how_much_quantity_is_required_and_add_the_product_to_the_cart() throws Throwable {
	
		cop.incrementItem();
		System.out.println("item incremented and added to cart");
	
	}

	@Then("^go to cart and click on the proceed to check out$")
	public void go_to_cart_and_click_on_the_proceed_to_check_out() throws Throwable {
		
		cop.proceedToCheckOut();
		
		
		
		System.out.println("proceeded to check out ");
	}

	

}
