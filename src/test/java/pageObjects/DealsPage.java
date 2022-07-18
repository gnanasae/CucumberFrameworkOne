package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPage {

	public WebDriver driver;
	
	public DealsPage(WebDriver driver) {
		
		this.driver = driver;
	}

	

	// Declaration of the element
	By offerPageButton = By.xpath("//a[contains(text(),'Top Deals')]");
	By searchFeild = By.xpath("//input[@id='search-field']");
	By getProductName = By.xpath("//tbody/tr/td[1]");

	// actions on the elements
	public void clickOnOfferPage() {

		driver.findElement(offerPageButton).click();

	}

	public String getProductName(String name) {
		driver.findElement(searchFeild).sendKeys(name);
		return driver.findElement(getProductName).getText();
	}
	
	public String getCurrentUrl() {

		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}

}
