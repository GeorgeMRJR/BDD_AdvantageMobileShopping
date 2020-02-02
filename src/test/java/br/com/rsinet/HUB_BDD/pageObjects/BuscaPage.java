package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaPage {
	private WebDriver driver;

	public BuscaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String nomeProduto() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
	}

	public void clicarProduto() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).click();
	}

	public String ProdutoNaoEncontrado() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
	}

}
