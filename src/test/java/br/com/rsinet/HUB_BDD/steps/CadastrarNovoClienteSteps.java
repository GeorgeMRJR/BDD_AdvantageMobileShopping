package br.com.rsinet.HUB_BDD.steps;

import java.net.MalformedURLException;
import java.util.Random;

import org.junit.Assert;

import br.com.rsinet.HUB_BDD.pageObjects.CadastroPage;
import br.com.rsinet.HUB_BDD.pageObjects.LoginPage;
import br.com.rsinet.HUB_BDD.pageObjects.MenuPage;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CadastrarNovoClienteSteps {

	private AndroidDriver<MobileElement> driver;
	private MenuPage menuPage;
	private LoginPage loginPage;
	private CadastroPage cadastroPage;

	public CadastrarNovoClienteSteps() throws MalformedURLException {
		driver = Driver.getDriver();
		menuPage = new MenuPage(driver);
		loginPage = new LoginPage(driver);
		cadastroPage = new CadastroPage(driver);
	}

	@Dado("^que estou no aplicativo android advantage mobile shopping$")
	public void queEstouNoAplicativoAndroidAdvantageMobileShopping() {
	}

	@E("^toco no menu$")
	public void tocoNoMenu() throws MalformedURLException {
		menuPage.abrirMenu();
	}

	@Dado("^toco em login$")
	public void tocoEmLogin() {
		menuPage.clicarLogin();
	}

	@Dado("^toco em nova conta$")
	public void tocoEmNovaConta() {
		loginPage.clicarNovaConta();
	}

	@Entao("^a tela de cadastro abrira$")
	public void aTelaDeCadastroAbrira() {
	}

	@E("^Digito o nome de usuario \"([^\"]*)\"$")
	public void digitoONomeDeUsuario(String userNameTxt) throws MalformedURLException {

		cadastroPage.digitarUserName(userNameTxt + new Random().nextInt(100) + new Random().nextInt(100)).enter();
	}

	@E("^Digito o email \"([^\"]*)\"$")
	public void digitoOEmail(String emailTxt) throws MalformedURLException {
		cadastroPage.digitarEmail(emailTxt).enter();
	}

	@E("^Digito a senha \"([^\"]*)\"$")
	public void digitoASenha(String senhaTxt) throws MalformedURLException {
		cadastroPage.digitarSenha(senhaTxt).enter();
	}

	@E("^Digito a comfirmacao da senha \"([^\"]*)\"$")
	public void digitoAComfirmacaoDaSenha(String reSenhaTxt) throws MalformedURLException {
		cadastroPage.digitarReSenha(reSenhaTxt).enter();
	}

	@E("^Digito o primeiro nome \"([^\"]*)\"$")
	public void digitoOPrimeiroNome(String nomeTxt) throws MalformedURLException {
		cadastroPage.digitarNome(nomeTxt).enter();
	}

	@E("^Digito o sobre nome \"([^\"]*)\"$")
	public void digitoOSobreNome(String sobreNomeTxt) throws MalformedURLException {
		cadastroPage.digitarSobreNome(sobreNomeTxt).enter();
	}

	@E("^Digito o telefone \"([^\"]*)\"$")
	public void digitoOTelefone(String telefoneTxt) throws MalformedURLException {
		cadastroPage.digitarTelefone(telefoneTxt).enter();
	}

	@E("^Seleciono o continente \"([^\"]*)\"$")
	public void selecionoOContinente(String continente) throws MalformedURLException {
		cadastroPage.clicarContinente();
		cadastroPage.escolherContinente(continente);
	}

	@E("^Digito o estado \"([^\"]*)\"$")
	public void digitoOEstado(String estadoTxt) throws MalformedURLException {
		cadastroPage.digitarEstado(estadoTxt).enter();
	}

	@E("^Digito o endereco \"([^\"]*)\"$")
	public void digitoOEndereco(String enderecoTxt) throws MalformedURLException {
		cadastroPage.digitarEndereco(enderecoTxt).enter();
	}

	@E("^Digito a cidade \"([^\"]*)\"$")
	public void digitoACidade(String cidadeTxt) throws MalformedURLException {
		cadastroPage.digitarCidade(cidadeTxt).enter();
	}

	@E("^Digito o codigo postal \"([^\"]*)\"$")
	public void digitoOCodigoPostal(String cepTxt) throws MalformedURLException {
		cadastroPage.digitarCep(cepTxt).enter();
	}

	@E("^clico no botao de registro$")
	public void clicoNoBotaoDeRegistro() throws MalformedURLException {
		cadastroPage.registrar();
	}

	@Entao("^o usuario estara cadastrado$")
	public void oUsuarioEstaraCadastrado() throws MalformedURLException {
		menuPage.abrirMenu();
		boolean logado = menuPage.logado();
		Assert.assertTrue(logado);
	}

//	@Quando("^Digito os dados invalidos para cadastro$")
//	public void digitoOsDadosInvalidosParaCadastro(DataTable dadosDeCadastro) throws MalformedURLException {
//		for (Map<String, String> data : dadosDeCadastro.asMaps(String.class, String.class)) {
////			cadastroPage.digitarUserName(data.get("NomeDeUsuario")).enter();
//			digitoONomeDeUsuario(data.get("NomeDeUsuario"));
//			digitoOEmail(data.get("Email"));
//			digitoASenha(data.get("Senha"));
//			digitoAComfirmacaoDaSenha(data.get("ComfirmaSenha"));
//			digitoOPrimeiroNome(data.get("Nome"));
//			digitoOSobreNome(data.get("SobreNome"));
//			digitoOTelefone(data.get("Telefone"));
////			selecionoOContinentedata.get("Continente");
//			digitoOEstado(data.get("Estado"));
//			digitoOEndereco(data.get("Endereco"));
//			digitoACidade(data.get("Cidade"));
//			digitoOCodigoPostal(data.get("Cep"));
//		}
//	}
	@Entao("^Digito o nome de usuario ja existente \"([^\"]*)\"$")
	public void digitoONomeDeUsuarioJaExistente(String userNameTxt) throws MalformedURLException {
		cadastroPage.digitarUserName(userNameTxt).enter();
	}

	@Entao("^o cadastro nao sera realisado$")
	public void oCadastroNaoSeraRealisado() throws MalformedURLException {
		menuPage.abrirMenu();
		boolean logado = menuPage.logado();
		Assert.assertFalse(logado);
	}

}
