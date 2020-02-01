package br.com.rsinet.HUB_BDD.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoriaProdutoPage {
//	private WebDriver driver;

	public CategoriaProdutoPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.Advantage.aShopping:id/textViewProductName")
	private List<WebElement> Produto;

	@FindBy(id = "com.Advantage.aShopping:id/textViewNoProductsToShow")
	private WebElement produtoNaoEncontrado;

	public void clicarproduto(String produto) {
		for (int j = 0; j < Produto.size(); j++) {
			WebElement element = Produto.get(j);
			if (element.getText().contains(produto)) {
				element.click();
				break;
			}
		}
	}

	public String ProdutoNaoEncontrado() {
		return produtoNaoEncontrado.getText();
	}

}
