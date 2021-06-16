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
	
	//Logica acesso a função Atribuido a min
	public void getAcessarAtribuidoAMin() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoAtribuidoAMin));
		minhaVisao.getBotaoAtribuidoAMinVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	//Logica acesso a função Não atibuidos
	public void getAcessarNaoAtribuido() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoNaoAtribuidoVerTarefa));
		minhaVisao.getBotaoNaoAtribuidoVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	//Logica acesso a função Relatados por mim
	public void getAcessarRelatadoPorMin() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoRelatadoPorMinVerTarefa));
		minhaVisao.getBotaoRelatadoPorMinVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	//Logica acesso a função Resolvidos
	public void getAcessarResolvido() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoResolvidoVerTarefa));
		minhaVisao.getBotaoResolvidoVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	//Logica acesso a função Modificados Recentemente
	public void getAcessarModificadoRecentemente() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoModificadoRecentementeVerTarefa));
		minhaVisao.getBotaoModificadoRecentementeVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	//Logica acesso a função Monitarados por min
	public void getAcessarMonitoradoPorMin() throws IOException, InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.BotaoMonitoradoPorMinVerTarefa));
		minhaVisao.getBotaoRelatadoPorMinVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.mensagemFiltro);
		driver.getPageSource().contentEquals(minhaVisao.mensagemVisualizandoTarefa);
		driver.getPageSource().contentEquals(minhaVisao.minhaVisaoURL);
		
	}
	
	//Logica acesso a função linha do tempo
	public void getAcessarTelaLinhaTempo() {
		
		minhaVisao = new PageMinhaVisao(driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.botaoAbaLinhaTempo));
		//minhaVisao.getBotaoAbaLinhaTempo();
		minhaVisao.getBotaoAnteriorLinhaTempo();
		Assert.assertTrue(verificaUrlAtual().equals(minhaVisao.urlLinhaTempo));
	}
	
	//Logica de erro ao enviar uma tecla para o campo de busca
	public void getErroBuscaVazia() {
		minhaVisao = new PageMinhaVisao(driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.botaoAnteriorLinhaTempo));
		minhaVisao.getSelecionarCampoTarefa().
											  getEnviarComandoCampoTarefa();
		Assert.assertTrue(minhaVisao.getTextoErrorMilCem().equals(minhaVisao.getMensagemErroBuscaVazia()));
	}

	//Logica de erro ao enviar um caracter no campo de busca
	public void getErroBuscaCaracter() {
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.botaoAnteriorLinhaTempo));
		minhaVisao.getPreencherCampoBuscaCaracter().
											  getEnviarComandoCampoTarefa();
		Assert.assertTrue(minhaVisao.getTextoErroDuzentoTre().equals(minhaVisao.getMensagemErroBuscaCaracter()));
	}
	
	//Logica acesso a função de busca
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
