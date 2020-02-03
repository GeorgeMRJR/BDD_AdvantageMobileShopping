package br.com.rsinet.HUB_BDD.steps;

import java.net.MalformedURLException;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.HUB_BDD.pageObjects.CadastroPage;
import br.com.rsinet.HUB_BDD.pageObjects.CategoriaProdutoPage;
import br.com.rsinet.HUB_BDD.pageObjects.HomePage;
import br.com.rsinet.HUB_BDD.pageObjects.LoginPage;
import br.com.rsinet.HUB_BDD.pageObjects.MenuPage;
import br.com.rsinet.HUB_BDD.pageObjects.ProdutoPage;
import br.com.rsinet.HUB_BDD.suporte.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class AbrirUmProdutoPelaHomeSteps {
	private WebDriver driver;
	private HomePage homePage;
	private CategoriaProdutoPage categoriaProdutoPage;
	private ProdutoPage produtoPage;
	private LoginPage loginPage;
	private CadastroPage cadastroPage;
	private MenuPage menuPage;

	public AbrirUmProdutoPelaHomeSteps() throws MalformedURLException {
		driver = Driver.getDriver();
		homePage = new HomePage(driver);
		categoriaProdutoPage = new CategoriaProdutoPage(driver);
		produtoPage = new ProdutoPage(driver);
		loginPage = new LoginPage(driver);
		cadastroPage = new CadastroPage(driver);
		menuPage = new MenuPage(driver);
	}

	@Dado("^toco na categoria \"([^\"]*)\"$")
	public void tocoNaCategoria(String categoria) {
		homePage.clicarCategoria(categoria);
	}

	@Entao("^deve abrir a tela da categoria \"([^\"]*)\"$")
	public void deveAbrirATelaDaGategoria(String categoria) {
		String txtCategoria = categoriaProdutoPage.txtCategoria();
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

	@Dado("^que estou logado e o carrinho esta vasio$")
	public void queEstouLogadoEOCarrinhoEstaVasio() throws MalformedURLException {
		menuPage.abrirMenu();
		menuPage.clicarLogin();
		loginPage.clicarNovaConta();
		cadastroPage.digitarUserName("testeCarrinho" + new Random().nextInt(100)).enter();
		cadastroPage.digitarEmail("teste@teste.com").enter();
		cadastroPage.digitarSenha("Abc123").enter();
		cadastroPage.digitarReSenha("Abc123");
		try {
			Driver.getDriver().hideKeyboard();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		cadastroPage.scroll();
		cadastroPage.scroll();
		cadastroPage.scroll();
		cadastroPage.registrar();

	}

	@Entao("^coloco (\\d+) itens do produto$")
	public void colocoItensDoProduto(int arg1) throws MalformedURLException  {
		produtoPage.clicarQtd();
		produtoPage.clicarQtd();
		produtoPage.colocarQtd("00");
		cadastroPage.enter();
	}

	@Entao("^deve aparecer (\\d+) itens no carrinho$")
	public void deveAparecerItensNoCarrinho(int arg1) {
		String qtdProdutoCarrinho = produtoPage.qtdProdutoCarrinho();
		int parseInt = Integer.parseInt(qtdProdutoCarrinho);
		Assert.assertTrue(parseInt<=10);
	}
}
