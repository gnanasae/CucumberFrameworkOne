package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
			this.driver = driver;}
	
	
	//Declaration
	By searchProduct = By.xpath("//input[@type='search']");
	By increment = By.xpath("//a[@class='increment']");
	By addToCart = By.xpath("//button[text()=\"ADD TO CART\"]");
	By cart = By.xpath("//img[@alt='Cart']");
	By proceed = By.xpath("//button[contains(text(),\"PROCEED TO CHECKOUT\")]");
	
	
	//actions
	
	public void searchProduct(String name) {
			driver.findElement(searchProduct).sendKeys(name);
			}
	
	public void incrementItem() {
		
		for(int i=1; i<=2 ;i++) {
		driver.findElement(increment).click();
		}
		
		driver.findElement(addToCart).click();
	}
	
	public void proceedToCheckOut() {
		
		driver.findElement(cart).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(proceed).click();
	}

}
