package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarNovaConta() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewSingUpToday")).click();
	}

}
