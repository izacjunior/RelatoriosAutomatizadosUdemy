package test;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class PageOneTest2 extends BaseTest1 {

	@Test(groups = "Regression1")
	public void validarURL1() throws InterruptedException {
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		assertEquals(url, "http://demo.automationtesting.in/Register.html");
	}

	@Test(groups = "Funcional1")
	public void validarTitle1() throws InterruptedException {
		Thread.sleep(1000);

		String url = driver.getTitle();
		assertEquals(url, "Register");
	}

}
