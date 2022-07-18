package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {

	public TestContextSetup tcs;
	public WebDriver driver;

	public Hooks(TestContextSetup tcs) throws IOException {

		this.tcs = tcs;
		this.driver = tcs.bc.webDriverSetup();

	}

	@After
	public void afterScenario() throws IOException {

		tcs.bc.webDriverSetup().quit();
	}

	@AfterStep
	public void takeScreenshot(Scenario scenario) throws IOException {

		if (scenario.isFailed()) {

			TakesScreenshot takeScreenshot = ((TakesScreenshot) driver);

			File srcFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./src/test/resources/Screenshot/screenshot.png");
			FileUtils.copyFile(srcFile, destFile);

		}
	}

}
