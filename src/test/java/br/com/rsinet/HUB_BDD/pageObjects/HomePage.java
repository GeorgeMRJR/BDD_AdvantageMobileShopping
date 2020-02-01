package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//	private WebDriver driver;

	public HomePage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement menu;
	
	@FindBy(id = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement busca;

	@FindBy(id = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement lupa;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView")
	private WebElement catLaptop;
	
	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView")
	private WebElement catHeadPhones;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.TextView")
	private WebElement catTablets;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView")
	private WebElement catSpeakers;

	@FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[5]/android.widget.TextView")
	private WebElement catMice;

	public void buscar(String produto) {
		busca.sendKeys(produto);
	}

	public void clicarLupa() {
		lupa.click();
	}
	public void clicarMenu() {
		menu.click();
	}

	public void clicarCategoria(String Categoria) {
		switch (Categoria) {
		case "LAPTOPS":
			catLaptop.click();
			break;
		case "HEADPHONES":
			catHeadPhones.click();
			break;
		case "TABLETS":
			catTablets.click();
		default:
			System.out.println("categoria nao encontrada");
			break;
		}
	}

}
