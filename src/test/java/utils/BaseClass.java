package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;

	public WebDriver webDriverSetup() throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/global.properties");
		Properties prop = new Properties();
		prop.load(fis);

		String url = prop.getProperty("url");

		if (driver == null) {
			
			if( prop.getProperty("browser").equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50000));
			driver.navigate().to(url);
			}
			
			else if( prop.getProperty("browser").equalsIgnoreCase("firefox")){
				
				System.out.println(" looking for fire fox browser");
				
			}
		}
		return driver;
	}

}
