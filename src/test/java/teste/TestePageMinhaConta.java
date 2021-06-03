package teste;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import model.PageMinhaConta;
import model.PageMinhaVisao;

public class TestePageMinhaConta {

	public WebDriver driver;
	public WebDriverWait wait;
	
	public TestePageMinhaConta(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
	
	public void getAcessarMinhaConta() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		
	}
	
	public void getSairMinhaConta() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getSairMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLLogin()));
		
	}
	
	public void getConsumirRSS() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getConsumirFeedRSS();
		Assert.assertTrue(verificaUrlAtual().contains(pgm.getURLRSS()));
		
	}
	
	public void getAcessarPreferencias() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLPerfilPlataforma()));
	}
	
	public void getAcessarGerenciarColuna() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoGerenciarColuna();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLGerenciarColuna()));
	}
	
	public void getAcessarTokenAPI() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoTokenAPI();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLTokenAPI()));
	}
	
	public void getAcessarPerfil() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLPerfilPlataforma()));
	}
	
	public void getTrocarNomeVerdadeiro() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		PageMinhaVisao pvs = new PageMinhaVisao(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		pgm.getCaixaTextoNomeVerdadeiroVazia();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getCaixaTextoNomeVerdadeiro();
		pgm.getBotaoAtualizarUsuario();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLContaUpdate()));
		wait.until(ExpectedConditions.visibilityOfElementLocated(pvs.BotaoAtribuidoAMin));
		
	}
	
	public void getTrocarEmail() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		PageMinhaVisao pvs = new PageMinhaVisao(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getCaixaEmailVazia();
		pgm.getCaixaTextoEmail();
		pgm.getBotaoAtualizarUsuario();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLContaUpdate()));
		wait.until(ExpectedConditions.visibilityOfElementLocated(pvs.BotaoAtribuidoAMin));
		
	}

	public void getTrocarSenha() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		PageMinhaVisao pvs = new PageMinhaVisao(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getCaixaTextoSenhaAtual();
		pgm.getCaixaTextoNovaSenha();
		pgm.getCaixaTextoConfirmarSenha();
		pgm.getBotaoAtualizarUsuario();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(pvs.BotaoAtribuidoAMin));
		
	}

	public void getAdicionarPerfil() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		wait.until(ExpectedConditions.visibilityOfElementLocated(pgm.getRetornoBotaoAdiconarPerfil()));
		pgm.getPreencherPlataforma().
									getPreencherSO().
									getPreencherVersaoSO().
									getPreencherDescricaoAdicional().
									getBotaoAdicionarPerfil();
		System.out.println(pgm.getValidarNomePerfil());
		Assert.assertTrue(pgm.getValidarNomePerfil().contains(pgm.getTextoSelecaoCaixaPerfil()));	
		
	}

	public void getSelecionarPerfil() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		wait.until(ExpectedConditions.visibilityOfElementLocated(pgm.getRetornoBotaoAdiconarPerfil()));
		pgm.getSelecaoCaixaPerfil().
									getBotaoAdicionarPerfil().
									getBotaoEnviarPerfil();
		
		
	}

	
	public void getNaoSelecionarPerfil() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta();
		pgm.getBotaoMinhaConta();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		wait.until(ExpectedConditions.visibilityOfElementLocated(pgm.getRetornoBotaoAdiconarPerfil()));
		pgm.getBotaoEnviarPerfil();
		Assert.assertTrue(pgm.getErroPerfilEnviarVazio().equals(pgm.getMensagemPerfilVazioErro()));
		System.out.println(pgm.getErroPerfilEnviarVazio());
		
	}

	
	public String verificaUrlAtual() throws WebDriverException{
		String resultado = driver.getCurrentUrl();
		return resultado;
	}

}
