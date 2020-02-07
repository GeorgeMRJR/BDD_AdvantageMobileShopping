package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.rsinet.HUB_BDD.suporte.Driver;

public class MenuPage {
	private WebDriver driver;

	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}

	public void abrirMenu() {
		Driver.getWait()
				.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/imageViewMenu")))
				.click();
	}

	public void clicarLogin() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).click();
	}

	public boolean logado() {
		boolean displayed = false;
		try {
			Driver.offImplicitlyWait();
			displayed = driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuSignOut")).isDisplayed();
			Driver.onImplicitlyWait();
			return displayed;
		} catch (Exception e) {

		}

		return displayed;
	}

}
