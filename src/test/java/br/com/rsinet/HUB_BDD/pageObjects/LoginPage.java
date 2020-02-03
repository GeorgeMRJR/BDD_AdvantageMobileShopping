package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clicarNovaConta() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewSingUpToday")).click();
	}

	public void userName(String nomeUsuario) {
		WebElement login = driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLoginUserName']/child::*[1]"));
		login.click();
		login.sendKeys(nomeUsuario);
	}

	public void password(String senhaTxt) {
		WebElement senha = driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLoginPassword']/child::*[1]"));
		senha.click();
		senha.sendKeys(senhaTxt);

	}

}
