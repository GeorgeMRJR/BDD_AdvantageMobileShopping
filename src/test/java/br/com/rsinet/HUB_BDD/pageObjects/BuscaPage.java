package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuscaPage {
//	private WebDriver driver;

	public BuscaPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement Produto;

	@FindBy(id = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement produtoNaoEncontrado;

	public void clicarproduto() {
		Produto.click();
	}

	public String ProdutoNaoEncontrado() {
		return produtoNaoEncontrado.getText();
	}

}
