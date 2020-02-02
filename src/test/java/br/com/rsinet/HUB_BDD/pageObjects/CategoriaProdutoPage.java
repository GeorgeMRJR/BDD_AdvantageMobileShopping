package br.com.rsinet.HUB_BDD.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoriaProdutoPage {
	private WebDriver driver;

	public CategoriaProdutoPage(WebDriver driver) {
		this.driver = driver;
	}

	public String ProdutoNaoEncontrado() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
	}

	public void clicarproduto(String produto) {
		for (int j = 0; j < getProduto().size(); j++) {
			WebElement element = getProduto().get(j);
			if (element.getText().contains(produto)) {
				element.click();
				break;
			}
		}
	}

	private List<WebElement> getProduto() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName"));
	}

}
