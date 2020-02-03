package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoPage {
	private WebDriver driver;

	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}

	public String nomeProduto() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
	}

	public String qtdProdutoCarrinho() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartLength")).getText();
	}	
	
	public void clicarQtd() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity")).click();
	}

	public void colocarQtd(String qtd) {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity")).sendKeys(qtd);
	}	
	

}

