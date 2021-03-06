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
	public void getAcessarAtribuidoAMin() throws IOException,WebDriverException,InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.getBotaoAtribuidoMin()));
		minhaVisao.getBotaoAtribuidoAMinVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.getFiltroMensagem());
		driver.getPageSource().contentEquals(minhaVisao.getMensagemVisualizandoATarefa());
		driver.getPageSource().contentEquals(minhaVisao.getMinhaVisaoURL());
		
	}
	
	//Logica acesso a função Não atibuidos
	public void getAcessarNaoAtribuido() throws IOException,WebDriverException,InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.getBotaoNaoAtribuidoTarefa()));
		minhaVisao.getBotaoNaoAtribuidoVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.getFiltroMensagem());
		driver.getPageSource().contentEquals(minhaVisao.getMensagemVisualizandoATarefa());
		driver.getPageSource().contentEquals(minhaVisao.getMinhaVisaoURL());
		
	}
	
	//Logica acesso a função Relatados por mim
	public void getAcessarRelatadoPorMin() throws IOException,WebDriverException,InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.getBotaoRelatadoMinVerTarefa()));
		minhaVisao.getBotaoRelatadoPorMinVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.getFiltroMensagem());
		driver.getPageSource().contentEquals(minhaVisao.getMensagemVisualizandoATarefa());
		driver.getPageSource().contentEquals(minhaVisao.getMinhaVisaoURL());
		
	}
	
	//Logica acesso a função Resolvidos
	public void getAcessarResolvido() throws IOException,WebDriverException,InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.getBotaoResolvidoTarefa()));
		minhaVisao.getBotaoResolvidoVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.getFiltroMensagem());
		driver.getPageSource().contentEquals(minhaVisao.getMensagemVisualizandoATarefa());
		driver.getPageSource().contentEquals(minhaVisao.getMinhaVisaoURL());
		
	}
	
	//Logica acesso a função Modificados Recentemente
	public void getAcessarModificadoRecentemente() throws IOException,WebDriverException,InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.getBotaoModificadoRecentementeTarefa()));
		minhaVisao.getBotaoModificadoRecentementeVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.getFiltroMensagem());
		driver.getPageSource().contentEquals(minhaVisao.getMensagemVisualizandoATarefa());
		driver.getPageSource().contentEquals(minhaVisao.getMinhaVisaoURL());
		
	}
	
	//Logica acesso a função Monitarados por min
	public void getAcessarMonitoradoPorMin() throws IOException,WebDriverException,InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.getBotaoMonitoradoMinVerTarefa()));
		minhaVisao.getBotaoRelatadoPorMinVerTarefa();
		driver.getPageSource().contentEquals(minhaVisao.getFiltroMensagem());
		driver.getPageSource().contentEquals(minhaVisao.getMensagemVisualizandoATarefa());
		driver.getPageSource().contentEquals(minhaVisao.getMinhaVisaoURL());
		
	}
	
	//Logica acesso a função linha do tempo
	public void getAcessarTelaLinhaTempo() throws IOException,WebDriverException,InterruptedException{
		
		minhaVisao = new PageMinhaVisao(driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.botaoAbaLinhaTempo));
		//minhaVisao.getBotaoAbaLinhaTempo();
		minhaVisao.getBotaoAnteriorLinhaTempo();
		Assert.assertTrue(verificaUrlAtual().equals(minhaVisao.getUrlLinhaDoTempo()));
	}
	
	//Logica de erro ao enviar uma tecla para o campo de busca
	public void getErroBuscaVazia() throws IOException,WebDriverException,InterruptedException{
		minhaVisao = new PageMinhaVisao(driver);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.botaoAnteriorLinhaTempo));
		minhaVisao.getSelecionarCampoTarefa().
											  getEnviarComandoCampoTarefa();
		Assert.assertTrue(minhaVisao.getTextoErrorMilCem().equals(minhaVisao.getMensagemErroBuscaVazia()));
	}

	//Logica de erro ao enviar um caracter no campo de busca
	public void getErroBuscaCaracter() throws IOException,WebDriverException,InterruptedException{
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.getBotaoAnteriorLinhaDoTempo()));
		minhaVisao.getPreencherCampoBuscaCaracter().
											  getEnviarComandoCampoTarefa();
		Assert.assertTrue(minhaVisao.getTextoErroDuzentoTre().equals(minhaVisao.getMensagemErroBuscaCaracter()));
	}
	
	//Logica acesso a função de busca
	public void getEfetuarBusca() throws IOException,WebDriverException,InterruptedException{
		minhaVisao = new PageMinhaVisao(driver);
		wait.until(ExpectedConditions.visibilityOfElementLocated(minhaVisao.getBotaoAnteriorLinhaDoTempo()));
		minhaVisao.getPreencherBusca().
									 getEnviarComandoCampoTarefa();
		Assert.assertTrue(minhaVisao.getBuscaLink().equals(minhaVisao.verificaUrlAtual()));
	}

	
	public String verificaUrlAtual() throws IOException,WebDriverException,InterruptedException{
		String resultado = driver.getCurrentUrl();
		return resultado;
	}
	
	

}
