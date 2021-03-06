package br.com.rsinet.HUB_BDD.pageObjects;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		Driver.getWait().until(
				ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/buttonProductAddToCart")));
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductName")).getText();
	}

	public String qtdProdutoCarrinho() throws MalformedURLException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait
				.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/textViewCartLength")));
		return element.getText();
	}

	public void clicarQtd() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity")).click();
	}

	public void colocarVinteItens() throws MalformedURLException {
		Driver.getWait()
				.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/textViewApply")));
		Driver.getDriver().pressKey(new KeyEvent(AndroidKey.NUMPAD_2));
		Driver.getDriver().pressKey(new KeyEvent(AndroidKey.NUMPAD_0));
		Driver.getDriver().pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart")).click();

	}

}
