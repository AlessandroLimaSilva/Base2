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
	public void getAcessarPlanejamento() throws IOException, InterruptedException{
		
		PageLogin login = new PageLogin(driver);
		planejamento = new PagePlanejamento(driver);
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
		
		planejamento.getBotaoPlanejamento();
		Assert.assertTrue(planejamento.urlPlanejamento.equals(verificaUrlAtual()));
		
	}
	
	public String verificaUrlAtual() throws WebDriverException{
		String resultado = driver.getCurrentUrl();
		return resultado;
	}
	

}
