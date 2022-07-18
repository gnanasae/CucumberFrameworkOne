package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage2 {

	public WebDriver driver;

	public CheckOutPage2(WebDriver driver) {

		this.driver = driver;
	}

	// declarations
	By getProduct = By.xpath("//p[contains(text(),\"Brocolli\")]");
	By placeOrderBtn = By.xpath("//button[contains(text(),\"Place Order\")]");
	By title = By.xpath("//title[contains(text(),\"GreenKart\")]");

	// actions
	public String getProductName() {

		return driver.findElement(getProduct).getText().split("-")[0].trim();

	}

	public void placeOrder() {

		driver.findElement(placeOrderBtn).click();
	}

	public String getTitle() {

		return driver.findElement(title).getText();

	}
}
