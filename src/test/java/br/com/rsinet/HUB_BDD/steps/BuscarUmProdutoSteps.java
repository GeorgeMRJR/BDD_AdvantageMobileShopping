package br.com.rsinet.HUB_BDD.steps;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageObjects.BuscaPage;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.pageObjects.ProdutoPage;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;


public class BuscarUmProdutoSteps {
	private WebDriver driver;
	private HomePage homePage;
	private BuscaPage buscaPage;
	private ProdutoPage produtoPage;

	public BuscarUmProdutoSteps() throws MalformedURLException {
		driver = Driver.getDriver();
		homePage = new HomePage(driver);
		buscaPage = new BuscaPage(driver);
		produtoPage = new ProdutoPage(driver);
	}

	@Dado("^que estou na tela principal do aplicativo android advantage mobile shopping$")
	public void queEstouNaTelaPrincipalDoAplicativoAndroidAdvantageMobileShopping() {
	}

	@Dado("^o usuario tocou no icone da lupa$")
	public void oUsuarioTocouNoIconeDaLupa() {
		homePage.clicarLupa();
	}

	@Dado("^buscou no campo de busca o \"([^\"]*)\"$")
	public void buscouNoCampoDeBuscaO(String produto) {
		homePage.buscar(produto);
	}

	@Entao("^a pagina do resultado aparecera com o resultado da busca \"([^\"]*)\"$")
	public void aPaginaDoResultadoApareceraComOResultadoDaBusca(String produto) {
		String atual = buscaPage.nomeProduto();
		Assert.assertEquals(produto, atual);
	}

	@Entao("^o usuario toca no produto$")
	public void oUsuarioTocaNoProduto() {
		buscaPage.clicarProduto();
	}

	@Entao("^a pagina do \"([^\"]*)\" sera exibida$")
	public void aPaginaDoSeraExibida(String produtoEsperado) {
	String produtoAtual = produtoPage.nomeProduto();
	Assert.assertEquals(produtoEsperado, produtoAtual);
	}

	@Entao("^aparecera uma pagina informando que o produto \"([^\"]*)\" nao foi encontrado$")
	public void apareceraUmaPaginaInformandoQueOProdutoNaoFoiEncontrado(String produto) {
		String naoEncontrado = buscaPage.ProdutoNaoEncontrado();
		Assert.assertTrue(naoEncontrado.contains(produto));
	}

}
