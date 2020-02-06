package br.com.rsinet.HUB_BDD.pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import br.com.rsinet.HUB_BDD.suporte.Driver;

public class CategoriaProdutoPage {
	private WebDriver driver;

	public CategoriaProdutoPage(WebDriver driver) {
		this.driver = driver;
	}

	public String ProdutoNaoEncontrado() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")).getText();
	}

	public String txtCategoria() {

		WebElement element = driver.findElement(By.id("com.Advantage.aShopping:id/textViewAdvantage"));
		Driver.getWait().until(ExpectedConditions.attributeContains(element, "text", "("));
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewAdvantage")).getText();
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

		return driver.findElements(By.id("com.Advantage.aShopping:id/textViewProductName"));
	}

}
