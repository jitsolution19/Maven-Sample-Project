package testNG_Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebSitetitleValidation {

	@Test()
	public void titlevalidation() {
		System.out.println("Launch Application");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Selenium_Project\\browserdriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://housing.com/");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Property | Real Estate | Buy/Sale/Rent | Property Site India");
		driver.quit();
	}
}
