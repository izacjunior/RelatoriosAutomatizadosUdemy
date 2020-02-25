package testA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import atu.testng.reports.ATUReports;


public class BaseTest1 {

	public WebDriver driver;
	
	{
		System.setProperty("atu.reporter.config",
				"C:\\Desenvolvimento\\Tools\\ATUReporter_Selenium_testNG_2.1 jar+javadoc+prop file+demo proj+atu recorder\\atu.properties");
	}

	@BeforeClass
	public void setup() {

		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "C:\\Desenvolvimento\\Tools\\chromedriver.exe");

			driver = new ChromeDriver();

			//ATUReports.setWebDriver(driver);
			
			driver.manage().window().maximize();

			driver.get("http://demo.automationtesting.in/Register.html");
			
			ATUReports.indexPageDescription = "Sample";
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
