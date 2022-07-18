package pageObjectManager;

import org.openqa.selenium.WebDriver;

import pageObjects.CheckOutPage;
import pageObjects.CheckOutPage2;
import pageObjects.DealsPage;
import pageObjects.SearchProductPage;

public class PageObjectManagerClass {

	public DealsPage dp;
	public SearchProductPage sp;
	public CheckOutPage cop;
	public CheckOutPage2 cop2;

	public WebDriver driver;

	public PageObjectManagerClass(WebDriver driver) {

		this.driver = driver;
	}

	public DealsPage getDealsPageObject() {

		dp = new DealsPage(driver);
		return dp;
	}

	public SearchProductPage getSearchProductObject() {

		sp = new SearchProductPage(driver);
		return sp;
	}

	public CheckOutPage getCheckOutPageObject() {

		cop = new CheckOutPage(driver);
		return cop;
	}

	public CheckOutPage2 getCheckOutPageObject2() {

		cop2 = new CheckOutPage2(driver);
		return cop2;
	}

}
