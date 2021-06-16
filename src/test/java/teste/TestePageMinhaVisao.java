package teste;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import model.PageMinhaVisao;

public class TestePageMinhaVisao {
	
	private PageMinhaVisao minhaVisao;
	private WebDriver driver;
	private WebDriverWait wait;
	
	
	public TestePageMinhaVisao(WebDriver driver,WebDriverWait wait) {
		
		this.driver = driver;
		this.wait= wait;
		
	}
	
	public void getAcessarAtribuidoAMin() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoAtribuidoAMin));
		minhaVisao.getBotaoAtribuidoAMinVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	public void getAcessarNaoAtribuido() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoNaoAtribuidoVerTarefa));
		minhaVisao.getBotaoNaoAtribuidoVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	public void getAcessarRelatadoPorMin() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoRelatadoPorMinVerTarefa));
		minhaVisao.getBotaoRelatadoPorMinVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	public void getAcessarResolvido() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoResolvidoVerTarefa));
		minhaVisao.getBotaoResolvidoVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	public void getAcessarModificadoRecentemente() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoModificadoRecentementeVerTarefa));
		minhaVisao.getBotaoModificadoRecentementeVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	public void getAcessarMonitoradoPorMin() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoMonitoradoPorMinVerTarefa));
		minhaVisao.getBotaoRelatadoPorMinVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	public void getAcessarTelaLinhaTempo() {
		
		minhaVisao = new PageMinhaVisao(driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.botaoAbaLinhaTempo));
		//minhaVisao.getBotaoAbaLinhaTempo();
		minhaVisao.getBotaoAnteriorLinhaTempo();
		Assert.assertTrue(verificaUrlAtual().equals(minhaVisao.urlLinhaTempo));
	}
	
	public void getErroBuscaVazia() {
		minhaVisao = new PageMinhaVisao(driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.botaoAnteriorLinhaTempo));
		minhaVisao.getSelecionarCampoTarefa().
											  getEnviarComandoCampoTarefa();
		Assert.assertTrue(minhaVisao.getTextoErrorMilCem().equals(minhaVisao.getMensagemErroBuscaVazia()));
	}

	public void getErroBuscaCaracter() {
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.botaoAnteriorLinhaTempo));
		minhaVisao.getPreencherCampoBuscaCaracter().
											  getEnviarComandoCampoTarefa();
		Assert.assertTrue(minhaVisao.getTextoErroDuzentoTre().equals(minhaVisao.getMensagemErroBuscaCaracter()));
	}

	public void getEfetuarBusca() {
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.botaoAnteriorLinhaTempo));
		minhaVisao.getPreencherBusca().
									 getEnviarComandoCampoTarefa();
		Assert.assertTrue(minhaVisao.getBuscaLink().equals(minhaVisao.verificaUrlAtual()));
	}

	
	public String verificaUrlAtual() throws WebDriverException{
		String resultado = driver.getCurrentUrl();
		return resultado;
	}
	
	

}
