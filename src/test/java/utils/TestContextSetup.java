package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import genericUtils.Generic;
import pageObjectManager.PageObjectManagerClass;

public class TestContextSetup {

	public WebDriver driver;
	public String homePageName, topDealsName;
	public PageObjectManagerClass pom;
	public Generic generic;

	public BaseClass bc;

	public TestContextSetup() throws IOException {
		bc = new BaseClass();
		pom = new PageObjectManagerClass(bc.webDriverSetup());
		generic = new Generic(bc.webDriverSetup());

	}

}
