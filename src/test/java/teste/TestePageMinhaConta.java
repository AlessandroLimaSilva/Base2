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
	
	//Logica Teste acessar Minha Conta
	public void getAcessarMinhaConta() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMenuMinhaConta();
	
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		
	}
	
	//Logica Teste Sair Minha Conta
	public void getSairMinhaConta() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getSairMinhaConta();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLLogin()));
		
	}
	
	//Logica Teste função feed rss
	public void getConsumirRSS() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getConsumirFeedRSS();
		
		Assert.assertTrue(verificaUrlAtual().contains(pgm.getURLRSS()));
		
	}
	
	//Logica Teste acessar função Acessar Preferencias
	public void getAcessarPreferencias() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLPerfilPlataforma()));
	}
	
	//Logica Teste acessar função Gerenciar Coluna
	public void getAcessarGerenciarColuna() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta();
	
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoGerenciarColuna();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLGerenciarColuna()));
	}
	
	//Logica Teste acessar função Token API 
	public void getAcessarTokenAPI() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoTokenAPI();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLTokenAPI()));
	}
	
	//Logica Teste acessar função Acessar Perfil
	public void getAcessarPerfil() {
		
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLPerfilPlataforma()));
	}
	
	//Logica Teste função Trocar Nome Verdadeiro
	public void getTrocarNomeVerdadeiro() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		PageMinhaVisao pvs = new PageMinhaVisao(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta().
									getCaixaTextoNomeVerdadeiroVazia();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getCaixaTextoNomeVerdadeiro().
										getBotaoAtualizarUsuario();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLContaUpdate()));
		wait.until(ExpectedConditions.visibilityOfElementLocated(pvs.BotaoAtribuidoAMin));
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta();
		
		
	}
	
	//Logica Teste função Trocar Email
	public void getTrocarEmail() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		PageMinhaVisao pvs = new PageMinhaVisao(driver);
		pgm.getBotaoMenuMinhaConta().getBotaoMinhaConta();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getCaixaEmailVazia().
								getCaixaTextoEmail().
								getBotaoAtualizarUsuario();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLContaUpdate()));
		wait.until(ExpectedConditions.visibilityOfElementLocated(pvs.BotaoAtribuidoAMin));
		
	}

	//Logica Teste função Trocar Email
	public void getTrocarSenha() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		PageMinhaVisao pvs = new PageMinhaVisao(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getCaixaTextoSenhaAtual().
									getCaixaTextoNovaSenha().
									getCaixaTextoConfirmarSenha().
									getBotaoAtualizarUsuario();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(pvs.BotaoAtribuidoAMin));
		
	}

	//Logica Teste função Adicionar Perfil
	public void getAdicionarPerfil() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		wait.until(ExpectedConditions.visibilityOfElementLocated(pgm.getRetornoBotaoAdiconarPerfil()));
		pgm.getSelecaoCaixaPerfil();
		pgm.getPreencherPlataforma().
									getPreencherSO().
									getPreencherVersaoSO().
									getPreencherDescricaoAdicional().
									getBotaoAdicionarPerfil();
		Assert.assertTrue(pgm.getValidarNomePerfil().contains(pgm.getTextoSelecaoCaixaPerfil()));
		wait.until(ExpectedConditions.visibilityOfElementLocated(pgm.getRetornoBotaoAdiconarPerfil()));
		pgm.getSelecaoCaixaPerfil().
									getSelecaoCaixaPerfil();

		
	}

	//Logica Teste função Selecionar Perfil
	public void getSelecionarPerfil() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta();
		
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		wait.until(ExpectedConditions.visibilityOfElementLocated(pgm.getRetornoBotaoAdiconarPerfil()));
		pgm.getSelecaoCaixaPerfil().
									getBotaoAdicionarPerfil().
									getBotaoEnviarPerfil();
		
		
	}

	//Logica Teste função ao Não Selecionar Perfil
	public void getNaoSelecionarPerfil() {
		PageMinhaConta pgm = new PageMinhaConta(driver);
		pgm.getBotaoMenuMinhaConta().
									getBotaoMinhaConta();
	
		Assert.assertTrue(verificaUrlAtual().equals(pgm.getURLMinhaConta()));
		pgm.getBotaoPerfil();
		wait.until(ExpectedConditions.visibilityOfElementLocated(pgm.getRetornoBotaoAdiconarPerfil()));
		pgm.getBotaoEnviarPerfil();
		Assert.assertTrue(pgm.getErroPerfilEnviarVazio().equals(pgm.getMensagemPerfilVazioErro()));
		
		
	}

	
	public String verificaUrlAtual() throws WebDriverException{
		String resultado = driver.getCurrentUrl();
		return resultado;
	}

}
