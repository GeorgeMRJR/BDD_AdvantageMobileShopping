package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuscaPage {

	private WebDriver driver;

	public BuscaPage(WebDriver driver) {
		this.driver = driver;
	}

	public String nomeProduto() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
	}

	public void clicarProduto() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		Thread.sleep(3000);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/imageViewProduct")));
		element.click();
	}

	public String ProdutoNaoEncontrado() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
	}

}
