package teste;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import model.PageLogin;
import model.PageRegistroMudanca;

public class TestePageRegistroMudanca {
	
	private PageRegistroMudanca registroMudanca;
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public TestePageRegistroMudanca(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait= wait;
	}
	
	//Teste de caminho para acessar função registro mudança
	public void getAcessarRegistroMudanca() throws IOException,WebDriverException,InterruptedException{
		
		PageLogin login = new PageLogin(driver);
		registroMudanca = new PageRegistroMudanca(driver);
		login.getTelaLogin().
							setCaixaTextoUsuario();
		Assert.assertTrue(verificaUrlAtual().equals(login.getUrlUser()));
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.getEndBotaoLogin()));
		login.botaoLoginUser();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.getEndCaixaPassword()));
		Assert.assertTrue(verificaUrlAtual().equals(login.getUrlPassword()));
		login.setCaixaTextoSenha();
		wait.until(ExpectedConditions.visibilityOfElementLocated(login.getEndBotaoPassword()));
		login.botaoLoginPass();
		
		registroMudanca.getBotaoReagistroMudanca();
		Assert.assertTrue(verificaUrlAtual().equals(registroMudanca.urlRegistroMudanca));
		
	}
	
	public String verificaUrlAtual() throws IOException,WebDriverException,InterruptedException{
		String resultado = driver.getCurrentUrl();
		return resultado;
	}
	


}
