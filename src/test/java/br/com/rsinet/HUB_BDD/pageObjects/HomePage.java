package br.com.rsinet.HUB_BDD.pageObjects;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.HUB_BDD.suporte.Driver;
import io.appium.java_client.android.AndroidDriver;

public class HomePage extends BasePage {
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void buscar(String produto) {
		driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch")).sendKeys(produto);
	}

	public void clicarLupa() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch")).click();
	}

	public void clicarMenu() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
	}

	public void clicarCarrinho() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewCart")).click();
	}

	public void clicarCategoria(String Categoria) throws MalformedURLException {
		WebDriverWait wait = Driver.getWait();
		switch (Categoria) {
		case "LAPTOPS":
			wait.until(ExpectedConditions.elementToBeClickable(elementToText((AndroidDriver<?>) driver, "LAPTOPS")));
			clickToText((AndroidDriver<?>) driver, "LAPTOPS");
			break;

		case "HEADPHONES":
			wait.until(ExpectedConditions.elementToBeClickable(elementToText((AndroidDriver<?>) driver, "HEADPHONES")));
			clickToText((AndroidDriver<?>) driver, "HEADPHONES");
			break;

		case "TABLETS":
			wait.until(ExpectedConditions.elementToBeClickable(elementToText((AndroidDriver<?>) driver, "TABLETS")));
			clickToText((AndroidDriver<?>) driver, "TABLETS");
			break;

		case "SPEAKERS":
			scrollToText((AndroidDriver<?>) driver, "SPEAKERS");
			wait.until(ExpectedConditions.elementToBeClickable(elementToText((AndroidDriver<?>) driver, "SPEAKERS")));
			clickToText((AndroidDriver<?>) driver, "SPEAKERS");
			break;

		case "MICE":
			scrollToText((AndroidDriver<?>) driver, "MICE");
			wait.until(ExpectedConditions.elementToBeClickable(elementToText((AndroidDriver<?>) driver, "MICE")));
			clickToText((AndroidDriver<?>) driver, "MICE");
			break;

		default:
			System.out.println("categoria nao encontrada");
			break;
		}
	}

}
