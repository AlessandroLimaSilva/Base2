package teste;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import model.PageLogin;
import model.PagePlanejamento;

public class TestePagePlanejamento {
	
	private PagePlanejamento planejamento;
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public TestePagePlanejamento(WebDriver driver,WebDriverWait wait) {
		this.driver = driver;
		this.wait= wait;
	}
	
	//Teste de caminho para função acessar planejamento
	public void getAcessarPlanejamento() throws IOException,WebDriverException,InterruptedException{
		
		PageLogin login = new PageLogin(driver);
		planejamento = new PagePlanejamento(driver);
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
		
		planejamento.getBotaoPlanejamento();
		Assert.assertTrue(planejamento.urlPlanejamento.equals(verificaUrlAtual()));
		
	}
	
	public String verificaUrlAtual() throws IOException,WebDriverException,InterruptedException{
		String resultado = driver.getCurrentUrl();
		return resultado;
	}
	

}
