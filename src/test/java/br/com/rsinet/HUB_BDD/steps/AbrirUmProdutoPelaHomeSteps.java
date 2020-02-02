package br.com.rsinet.HUB_BDD.steps;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageObjects.CategoriaProdutoPage;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.pageObjects.ProdutoPage;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class AbrirUmProdutoPelaHomeSteps {
	private WebDriver driver;
	private HomePage homePage;
	private CategoriaProdutoPage categoriaProdutoPage;
	private ProdutoPage produtoPage;

	public AbrirUmProdutoPelaHomeSteps() throws MalformedURLException {
		driver = Driver.getDriver();
		homePage = new HomePage(driver);
		categoriaProdutoPage = new CategoriaProdutoPage(driver);
		produtoPage = new ProdutoPage(driver);
	}

	@Dado("^toco na categoria \"([^\"]*)\"$")
	public void tocoNaCategoria(String categoria) {
		homePage.clicarCategoria(categoria);
	}

	@Entao("^deve abrir a tela da categoria \"([^\"]*)\"$")
	public void deveAbrirATelaDaGategoria(String categoria) {
		String txtCategoria = categoriaProdutoPage.txtCategoria();
		System.out.println("cate>>>>"+categoria);
		System.out.println("txtca>>>"+txtCategoria.toUpperCase());
		System.out.println("txtca>>>"+txtCategoria);
		Assert.assertTrue(txtCategoria.toUpperCase().contains(categoria));
	}

	@Dado("^toco no produto \"([^\"]*)\"$")
	public void tocoNoProduto(String produto) {
		categoriaProdutoPage.clicarproduto(produto.toUpperCase());
	}

	@Entao("^aparecera a tela do produto \"([^\"]*)\"$")
	public void apareceraATelaDoProduto(String produtoEsperado) {
		String nomeProduto = produtoPage.nomeProduto();
		Assert.assertEquals(produtoEsperado.toUpperCase(), nomeProduto.toUpperCase());
	}
}
