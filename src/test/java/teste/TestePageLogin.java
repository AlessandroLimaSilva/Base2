package teste;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import model.PageLogin;

public class TestePageLogin {
	
	private static PageLogin login;
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public TestePageLogin(WebDriver driver,WebDriverWait wait) {
		
		this.driver = driver;
		this.wait = wait;
		
	}

	
	//Teste 01 Validar se o usuario com nome de usuario e senha consegue logar com sucesso
	@Test
	public void loginSucesso() throws InterruptedException {
		
		login = new PageLogin(driver);
		login.getTelaLogin();
		login.setCaixaTextoUsuario();
		Assert.assertTrue(verificaUrlAtual().equals(login.urlUser));
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoLogin));
		login.botaoLoginUser();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endCaixaPassword));
		Assert.assertTrue(verificaUrlAtual().equals(login.urlPassword));
		login.setCaixaTextoSenha();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoPassword));
		login.botaoLoginPass();
		Assert.assertTrue(verificaUrlAtual().equals(login.urlView));
	
	}
	
	//Teste 03 validar se o sistema mostra valida uma senha invalida
	@Test
	public void loginSenhaInvalida() throws WebDriverException{
		
		login = new PageLogin(driver);
		login.getTelaLogin();
		login.setCaixaTextoUsuario();
		Assert.assertTrue(verificaUrlAtual().equals(login.urlUser));
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoLogin));
		login.botaoLoginUser();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endCaixaPassword));
		Assert.assertTrue(verificaUrlAtual().equals(login.urlPassword));
		login.setCaixaTextoSenhaFake();
		login.botaoLoginPass();
		Assert.assertFalse(verificaUrlAtual().equals(login.urlView));
	
	}
	
	//Teste 04 validar se o sistema mostra a mensagem de erro ao nao digitar uma senha
	@Test
	public void loginSenhaEmBranco() throws WebDriverException{
		
		login = new PageLogin(driver);
		login.getTelaLogin();
		login.setCaixaTextoUsuario();
		Assert.assertTrue(verificaUrlAtual().equals(login.urlUser));
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoLogin));
		login.botaoLoginUser();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endCaixaPassword));
		Assert.assertTrue(verificaUrlAtual().equals(login.urlPassword));
		login.caixaPasswordBranco();
		login.botaoLoginPass();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoLoginErro));
		
	} 
	
	
	//Teste 06 validar se é possivel acessar o sistema sem se logar
	@Test
	public void AcessarMyViewSemLogar() throws WebDriverException{
		
		login = new PageLogin(driver);
		login.getTelaMinhaVisao();
		Assert.assertFalse(verificaUrlAtual().equals(login.urlView));
		
		
	}
	
	public void perdeuSenha() throws IOException, InterruptedException{
		
		login = new PageLogin(driver);//instancia o driver
		login.getTelaLogin();//acessa a tela de login
		login.setCaixaTextoUsuario();//preenche a caixa de texto usuario
		Assert.assertTrue(verificaUrlAtual().equals(login.urlUser));//verifica se a tela esta certa
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoLogin));//aguarda o botao de login ser carregado
		login.botaoLoginUser();//clica no botao de login de usuario
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endCaixaPassword));//aguarda carregar a caixa de texto password
		Assert.assertTrue(verificaUrlAtual().equals(login.urlPassword));//compara a url atual com a esperada
		//login.setCaixaTextoSenha();//preenche a caixa de texto senha
		login.getBotaoPerdeuSenha();//aciona o botao perdeu a senha
		System.out.print(login.getURLPerdeuSenha());
		Assert.assertTrue(verificaUrlAtual().equals(login.getURLPerdeuSenha()));//compara a url atual com a esperada
		login.setCaixaEmail().setBotaoEnviarEmail();//preenche a caixa de texto email
		
		Assert.assertTrue(verificaUrlAtual().equals(login.urlEmailEnviado));//compara a url atual com a esperada
		
	}
	
	
	
	
	public String verificaUrlAtual() throws WebDriverException{
		
		String resultado = driver.getCurrentUrl();
		
		return resultado;
	}
	
}
