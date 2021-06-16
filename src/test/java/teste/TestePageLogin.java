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

	
	////Logica Teste função se o usuario com nome de usuario e senha consegue logar com sucesso
	public void loginSucesso() throws IOException,WebDriverException,InterruptedException {
		
		login = new PageLogin(driver);
		login.getTelaLogin().
							setCaixaTextoUsuario();
		
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
	
	////Logica Teste sistema valida uma senha invalida
	public void loginSenhaInvalida() throws IOException,WebDriverException,InterruptedException{
		
		login = new PageLogin(driver);
		login.getTelaLogin().
							setCaixaTextoUsuario();
		
		Assert.assertTrue(verificaUrlAtual().equals(login.urlUser));
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoLogin));
		login.botaoLoginUser();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endCaixaPassword));
		Assert.assertTrue(verificaUrlAtual().equals(login.urlPassword));
		login.setCaixaTextoSenhaFake().
									botaoLoginPass();
		
		Assert.assertFalse(verificaUrlAtual().equals(login.urlView));
	
	}
	
	////Logica Teste sistema mostra a mensagem de erro ao nao digitar uma senha
	public void loginSenhaEmBranco() throws IOException,WebDriverException,InterruptedException{
		
		login = new PageLogin(driver);
		login.getTelaLogin().
							setCaixaTextoUsuario();
		
		Assert.assertTrue(verificaUrlAtual().equals(login.urlUser));
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoLogin));
		login.botaoLoginUser();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endCaixaPassword));
		Assert.assertTrue(verificaUrlAtual().equals(login.urlPassword));
		login.caixaPasswordBranco().
									botaoLoginPass();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoLoginErro));
		
	} 
	
	
	//Logica Teste  acessar o sistema sem se logar
	public void AcessarMyViewSemLogar() throws IOException,WebDriverException,InterruptedException{
		
		login = new PageLogin(driver);
		login.getTelaMinhaVisao();
		Assert.assertFalse(verificaUrlAtual().equals(login.urlView));
		
		
	}
	
	//Logica Teste função Perdeu Senha
	public void perdeuSenha() throws IOException,WebDriverException,InterruptedException{
		
		login = new PageLogin(driver);//instancia o driver
		login.getTelaLogin().			//acessa a tela de login
							setCaixaTextoUsuario();//preenche a caixa de texto usuario
		
		Assert.assertTrue(verificaUrlAtual().equals(login.urlUser));//verifica se a tela esta certa
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endBotaoLogin));//aguarda o botao de login ser carregado
		login.botaoLoginUser();//clica no botao de login de usuario
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.endCaixaPassword));//aguarda carregar a caixa de texto password
		Assert.assertTrue(verificaUrlAtual().equals(login.urlPassword));//compara a url atual com a esperada
		//login.setCaixaTextoSenha();//preenche a caixa de texto senha
		login.getBotaoPerdeuSenha();//aciona o botao perdeu a senha
		//System.out.print(login.getURLPerdeuSenha());
		Assert.assertTrue(verificaUrlAtual().equals(login.getURLPerdeuSenha()));//compara a url atual com a esperada
		login.setCaixaEmail().
							setBotaoEnviarEmail();//preenche a caixa de texto email
		
		Assert.assertTrue(verificaUrlAtual().equals(login.urlEmailEnviado));//compara a url atual com a esperada
		
	}
	
	
	
	
	public String verificaUrlAtual() throws IOException,WebDriverException,InterruptedException{
		
		String resultado = driver.getCurrentUrl();
		
		return resultado;
	}
	
}
