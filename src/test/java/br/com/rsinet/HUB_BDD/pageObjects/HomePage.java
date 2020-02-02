package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
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

	public void clicarCategoria(String Categoria) {
		switch (Categoria) {
		case "LAPTOPS":
			getCatLaptop().click();
			break;
		case "HEADPHONES":
			getCatHeadPhones().click();
			break;
		case "TABLETS":
			getCatTablets().click();
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
