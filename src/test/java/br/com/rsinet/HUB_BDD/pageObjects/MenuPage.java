package br.com.rsinet.HUB_BDD.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {
//	private WebDriver driver;

	public MenuPage(WebDriver driver) {
//		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement login;
	
	@FindBy(id = "com.Advantage.aShopping:id/textViewMenuSignOut")
	private WebElement logOut;
	
	@FindBy(id = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement menu;
	
	public void abrir() {
		menu.click();
	}

	public void clicarLogin() {
		login.click();
	}
	
	public boolean logado() {
		try {
			return logOut.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

}
