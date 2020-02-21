package testA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest1 {

	public WebDriver driver;

	@BeforeClass
	public void setup() {

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Desenvolvimento\\Tools\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("http://demo.automationtesting.in/Register.html");
		}
	}

	public void log(String logMessage) {
		Reporter.log(logMessage);

	}

	@AfterClass
	public void tearDonw1() {

		if (driver != null) {
			driver.quit();
		}

	}

}
