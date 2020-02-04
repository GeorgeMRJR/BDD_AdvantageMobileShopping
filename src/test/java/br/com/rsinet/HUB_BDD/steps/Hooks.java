package br.com.rsinet.HUB_BDD.steps;

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.suporte.Driver;
import br.com.rsinet.HUB_BDD.suporte.Screenshot;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks {
	private WebDriver driver;

	@After(order = 1)
	public void afterScenario(Scenario scenario) throws MalformedURLException {
		driver = Driver.getDriver();
		Screenshot screenshot = new Screenshot();
		screenshot.gerarScreenShot(driver, scenario);
	}

	@After(order = 0)
	public void resetApp() throws MalformedURLException {
		Driver.getDriver().resetApp();
	}

	@AfterClass
	public void tearDown() {
		Driver.fecharDriver();

	}
}
