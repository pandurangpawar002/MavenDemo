
package testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoMaven {

	@Test
	public static void startapp() {
		WebDriver driver;//hellojjkhkh

		System.setProperty("webdriver.chrome.driver",
				"D:\\Atomation\\Selenium jars and drivers\\Chrome 96\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String currenturl = driver.getCurrentUrl();
		Assert.assertTrue(currenturl.contains("guru99.com"));
		Reporter.log("Browser is opened");
		driver.manage().window().maximize();
	}
}