package testNgTestRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_senarios.txt",
glue = "stepDefinitions",
plugin = {"html:target/cucumber.html","json:target/cucumber.json"
},
monochrome = true)
public class failed_testRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}

}
