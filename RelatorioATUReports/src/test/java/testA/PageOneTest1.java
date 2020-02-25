package testA;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

public class PageOneTest1 extends BaseTest1 {

	@Test(groups = "Regression")
	public void validarURL() {

		log("Verificar URL");
		String url = driver.getCurrentUrl();
		assertEquals(url, "http://demo.automationtesting.in/Register.html");
	}

	@Test(groups = "Funcional")
	public void validarTitle() {
		log("Verificar titulo");
		String url = driver.getTitle();
		assertEquals(url, "Register");
	}

	@Test(dependsOnMethods = { "validarTitle" })
	public void validarTitleTwo() {
		log("Verificar URL 2");
		String url = driver.getTitle();
		assertEquals(url, "Register");
	}

	@Test(groups = "Test One")
	public void validarTitleTestTwo() {
		log("Verificar Titulo 2");
		String url = driver.getTitle();
		assertEquals(url, "Register");
	}

}
