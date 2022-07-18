package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductPage {

	public WebDriver driver;

	public SearchProductPage(WebDriver driver) {

		this.driver = driver;

	}

	// declaration of the elements
	By search = By.xpath("//input[@type='search']");
	By getName = By.xpath("//h4[contains(text(),Tomato)]");

	// actions on the elements
	public void searchProduct(String name) {

		driver.findElement(search).sendKeys(name);
	}

	public String getProductName() {

		String productName = driver.findElement(By.xpath("//h4[contains(text(),Tomato)]")).getText().split("-")[0]
				.trim();

		return productName;
	}
}
