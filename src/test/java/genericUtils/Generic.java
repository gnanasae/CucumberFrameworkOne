package genericUtils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Generic {

	public WebDriver driver;

	public Generic(WebDriver driver) {
		this.driver = driver;
	}

	public void switchToDealsPage() throws InterruptedException {

		// It will return the parent window name as a String
		String parent = driver.getWindowHandle();
		Set<String> winHandles = driver.getWindowHandles();
		// Now iterate using Iterator
		Iterator<String> it = winHandles.iterator();
		while (it.hasNext()) {
			String child_window = it.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
			}
		}
		Thread.sleep(2000);

	}



}
