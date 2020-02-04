package br.com.rsinet.HUB_BDD.pageObjects;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.HUB_BDD.suporte.Driver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class ProdutoPage {
	private WebDriver driver;

	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}

	public String nomeProduto() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
	}

	public String qtdProdutoCarrinho() throws MalformedURLException {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.Advantage.aShopping:id/textViewCartLength")));
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewCartLength")).getText();
	}

	public void clicarQtd() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity")).click();
	}

	public void colocarVinteItens() throws MalformedURLException {
		Driver.getDriver().pressKey(new KeyEvent(AndroidKey.NUMPAD_2));
		Driver.getDriver().pressKey(new KeyEvent(AndroidKey.NUMPAD_0));
		Driver.getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart")).click();

	}

}
