package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import genericUtils.Generic;
import io.cucumber.java.en.Then;
import pageObjects.CheckOutPage2;
import utils.TestContextSetup;

public class CheckOutStep2 {

	TestContextSetup tcs;
	CheckOutPage2 cp2;

	public CheckOutStep2(TestContextSetup tcs) {

		this.tcs = tcs;
	}

	@Then("verify the product {string}")
	public void verify_the_product(String name) throws InterruptedException, IOException {

		Generic g = tcs.generic;
		cp2 = tcs.pom.getCheckOutPageObject2();
		
		g.switchToDealsPage();
		Thread.sleep(3000);
		cp2 = tcs.pom.cop2;
		String actualProduct = cp2.getProductName();
		String expected = name;
		Assert.assertEquals(actualProduct, expected);

		System.out.println("product is mathched as expected");

	}

	@Then("place the order")
	public void place_the_order() {

		cp2.placeOrder();

		System.out.println("placed order succesfully");
	}

	@Then("select the country")
	public void select_the_country() {
	}

}
