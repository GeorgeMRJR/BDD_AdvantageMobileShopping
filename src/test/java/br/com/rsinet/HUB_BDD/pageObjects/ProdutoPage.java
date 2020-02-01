package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdutoPage {
//	private WebDriver driver;

	public ProdutoPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.Advantage.aShopping:id/textViewProductName")
	private WebElement produtoNome;
	


	public String nomeProduto() {
		return produtoNome.getText();
	}
	


}


