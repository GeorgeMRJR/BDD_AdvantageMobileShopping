package br.com.rsinet.HUB_BDD.pageObjects;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		switch (Categoria) {
		case "LAPTOPS":
			wait.until(ExpectedConditions.visibilityOf(elementToText((AndroidDriver) driver, "LAPTOPS")));
			clickToText((AndroidDriver) driver, "LAPTOPS");
			break;

		case "HEADPHONES":
			wait.until(ExpectedConditions.visibilityOf(elementToText((AndroidDriver) driver, "HEADPHONES")));
			clickToText((AndroidDriver) driver, "HEADPHONES");
			break;

		case "TABLETS":
			wait.until(ExpectedConditions.visibilityOf(elementToText((AndroidDriver) driver, "TABLETS")));
			clickToText((AndroidDriver) driver, "TABLETS");
			break;

		case "SPEAKERS":
			scrollToText((AndroidDriver) driver, "SPEAKERS");
			wait.until(ExpectedConditions.visibilityOf(elementToText((AndroidDriver) driver, "SPEAKERS")));
			clickToText((AndroidDriver) driver, "SPEAKERS");
			break;

		case "MICE":
			scrollToText((AndroidDriver) driver, "MICE");
			wait.until(ExpectedConditions.visibilityOf(elementToText((AndroidDriver) driver, "MICE")));
			clickToText((AndroidDriver) driver, "MICE");
			break;

		default:
			System.out.println("categoria nao encontrada");
			break;
		}
	}

	private WebElement getCatLaptop() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView"));
	}

	private WebElement getCatHeadPhones() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView"));
	}

	private WebElement getCatTablets() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView"));
	}

}
