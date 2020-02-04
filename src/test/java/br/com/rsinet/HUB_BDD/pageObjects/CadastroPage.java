package br.com.rsinet.HUB_BDD.pageObjects;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.HUB_BDD.suporte.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class CadastroPage extends BasePage {

	private WebDriver driver;

	public CadastroPage(WebDriver driver) {
		this.driver = driver;
	}

	private WebElement getUsername() {
		return driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/child::*[1]"));
	}

	private WebElement getEmail() {
		return driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextEmail']/child::*[1]"));
	}

	private WebElement getSenha() {
		return driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/child::*[1]"));
	}

	private WebElement getReSenha() {
		return driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextConfirmPassword']/child::*[1]"));
	}

	private WebElement getPrimeiroNome() {
		return driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextFirstName']/child::*[1]"));
	}

	private WebElement getSobreNome() {
		return driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLastName']/child::*[1]"));
	}

	private WebElement getTelefone() {
		return driver.findElement(
				By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/child::*[1]"));
	}

	private WebElement getEstado() {
		return driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]"));
	}

	private WebElement getCidade() {
		return driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]"));
	}

	private WebElement getEndereco() {
		return driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]"));
	}

	private WebElement getCep() {
		return driver
				.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]"));
	}

	private WebElement getContinente() {
		return driver.findElement(By.xpath("com.Advantage.aShopping:id/textViewCountriesTitle"));
	}
//
//	private WebElement getContinentes() {
//		return driver.findElement(By.xpath("//*[@resource-id='com.Advantage.aShopping:id/select_dialog_listview']"));
//	}

	private WebElement getBtnRegistrar() {
		return driver.findElement(By.className("android.widget.Button"));
	}

	public CadastroPage enter() throws MalformedURLException {
		(new TouchAction<>(Driver.getDriver())).tap(PointOption.point(985, 1699)).perform();
		return this;
	}

	public CadastroPage digitarUserName(String userNameTxt) {
		getUsername().click();
		getUsername().sendKeys(userNameTxt);
		return this;
	}

	public CadastroPage digitarEmail(String emailTxt) {
		getEmail().click();
		getEmail().sendKeys(emailTxt);
		return this;
	}

	public CadastroPage digitarSenha(String senhaTxt) {
		getSenha().click();
		getSenha().sendKeys(senhaTxt);
		return this;
	}

	public CadastroPage digitarReSenha(String reSenhaTxt) {
		getReSenha().click();
		getReSenha().sendKeys(reSenhaTxt);
		return this;
	}

	public CadastroPage digitarNome(String nomeTxt) {
		getPrimeiroNome().click();
		getPrimeiroNome().sendKeys(nomeTxt);
		return this;
	}

	public CadastroPage digitarSobreNome(String sobreNomeTxt) {
		getSobreNome().click();
		getSobreNome().sendKeys(sobreNomeTxt);
		return this;
	}

	public CadastroPage digitarTelefone(String telefoneTxt) {
		getTelefone().click();
		getTelefone().sendKeys(telefoneTxt);
		return this;
	}

	public CadastroPage digitarEstado(String estadoTxt) {
		getEstado().click();
		getEstado().sendKeys(estadoTxt);
		return this;
	}

	public CadastroPage digitarCidade(String cidadeTxt) {
		getCidade().click();
		getCidade().sendKeys(cidadeTxt);
		return this;
	}

	public CadastroPage digitarEndereco(String enderecoTxt) {
		getEndereco().click();
		getEndereco().sendKeys(enderecoTxt);
		return this;
	}

	public CadastroPage digitarCep(String cepTxt) {
		getCep().click();
		getCep().sendKeys(cepTxt);
		return this;
	}

	public CadastroPage clicarContinente() {
		getContinente().click();
		return this;
	}

	public void registrar() throws MalformedURLException {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
		Driver.getDriver().hideKeyboard();
		scroll(0.8, 0.3);
		scroll(0.8, 0.3);
//		scrollToText((AndroidDriver) driver, "REGISTER");

		wait.until(ExpectedConditions.visibilityOf(elementToText((AndroidDriver) driver, "REGISTER")));
//		clickToText((AndroidDriver) driver, "REGISTER");
		getBtnRegistrar().click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.Advantage.aShopping:id/imageViewMenu")));

	}

}
