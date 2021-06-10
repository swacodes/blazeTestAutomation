package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	private WebDriver driver;
	private static String appURL="https://blazedemo.com/index.php";

	public WebDriver getDriver() {
		return driver;
	}
	
	private void setDriver() 
	{
		driver = setChromeDriver();

	}
	
	private static WebDriver setChromeDriver() 
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get(appURL);
		return driver;

	}
	
	@BeforeSuite
	public void initialize()
	{
		try {
			setDriver();

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}

	@AfterSuite
	public void tearDown() {
		if(null != driver) {
			driver.close();
			driver.quit();
		}
	}

}
