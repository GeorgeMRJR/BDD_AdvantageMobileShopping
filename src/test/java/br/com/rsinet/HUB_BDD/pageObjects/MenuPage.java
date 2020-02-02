package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
	private WebDriver driver;

	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public void abrirMenu() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
	}

	public void clicarLogin() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).click();
	}

	public boolean logado() {
		try {
			return driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuSignOut")).isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
