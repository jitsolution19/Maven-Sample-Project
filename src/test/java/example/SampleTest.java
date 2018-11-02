package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	private WebDriver driver;

	@BeforeTest
	public void beforetest() {
		System.out.println("Launch Application");
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium_Project\\browserdriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void temp() {
		driver.get("https://housing.com/");
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
