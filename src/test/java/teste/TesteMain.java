package teste;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;

public class TesteMain {
	//**********************************************************************
	// 01 ||Teste de login efetuado com sucesso
	@Test
	public void loginSucesso() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
			
		login.loginSucesso();///1
		driver.quit();
			
		
	}
	
	//***************************************************************2
		// 15 || Teste  para acessar função minha conta
	@Test
	public void AcessarTelaMinhaConta() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
			
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		tpgm.getAcessarMinhaConta();//2
			
		driver.quit();
			
	}
	
	//**************************************************3
	// 29 || Erro ao digitar uma letra ou caracter especial no campo de busca.
	@Test
	public void erroBuscaCaracterLetra() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao mv = new TestePageMinhaVisao(driver,wait);
		login.loginSucesso();
		mv.getErroBuscaCaracter();//****************************3
		driver.quit();

	}


    ///*********************************************4
	// 25 || Teste para acessar a função adicionar perfil de usuario
	@Test
	public void adicionarPerfilUsuario() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		
		tpgm.getAdicionarPerfil();
		driver.quit();
	}
	//***********************************************5
	// 27 ||Erro ao nao selecionar um perfil e apertar o botao enviar
	@Test
	public void naoSelecionarPerfilUsuario() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		
		tpgm.getNaoSelecionarPerfil();
		driver.quit();
	}

	
	// 02 ||Teste login com senha invalida
	@Test
	public void loginSenhaInvalida() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		
		login.loginSenhaInvalida();
		driver.quit();
	}
	
	// 03 ||Teste de login com a senha não preenchida
	@Test
	public void loginSenhaEmBranco() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		
		login.loginSenhaEmBranco();
		driver.quit();
		
	}
	
	// 04 ||Teste de tentativa de entrar na pagina minha visao sem logar no sistema
	@Test
	public void loginAcessarMyViewSemLogar() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		
		login.AcessarMyViewSemLogar();
		driver.quit();
		
	}

	// 05 ||Teste para acessar a função planejamento estando logado no sistema
	@Test
	public void AcessarPlanejamento() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePagePlanejamento planejamento = new TestePagePlanejamento(driver,wait);
		planejamento.getAcessarPlanejamento();
		driver.quit();
	}
	
	// 06 ||Testa se a função de perdeu a senha funciona
	@Test
	public void loginPerdeuSenha() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		
		login.perdeuSenha();
		
		driver.quit();
		
	}
	
	// 07 ||Teste para acessar a função registro de função
	@Test
	public void AcessarRegistroMudanca() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageRegistroMudanca registroMudanca = new TestePageRegistroMudanca(driver,wait);
		registroMudanca.getAcessarRegistroMudanca();
		driver.quit();
	}

	// 08 ||Teste para acessar a funçaõ atribuido a min
	@Test
	public void AcessarTelaAtribuidoAMin() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao minhaVisao = new TestePageMinhaVisao(driver,wait);
		
		login.loginSucesso();
		minhaVisao.getAcessarAtribuidoAMin();
		
		driver.quit();
		
	}
	
	// 09 ||Teste para acessar a função não atribuido a min
	@Test
	public void AcessarTelaNaoAtribuido() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao minhaVisao = new TestePageMinhaVisao(driver,wait);
		
		login.loginSucesso();
		minhaVisao.getAcessarNaoAtribuido();
		
		driver.quit();
		
	}
	
	// 10 ||Teste para acessar a função Relatado por min
	@Test
	public void AcessarTelaRealatadoPorMin() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao minhaVisao = new TestePageMinhaVisao(driver,wait);
		
		login.loginSucesso();
		minhaVisao.getAcessarRelatadoPorMin();
		
		driver.quit();
		
	}
	
	// 11 ||Teste para acessar a função resolvido
	@Test
	public void AcessarTelaResolvido() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao minhaVisao = new TestePageMinhaVisao(driver,wait);
		
		login.loginSucesso();
		minhaVisao.getAcessarResolvido();
		
		driver.quit();
		
	}
	
	// 12 ||Teste para acessar a função modificado recentemente
	@Test
	public void AcessarTelaModificadoRecentemente() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao minhaVisao = new TestePageMinhaVisao(driver,wait);
		
		login.loginSucesso();
		minhaVisao.getAcessarModificadoRecentemente();
		
		driver.quit();
		
	}
	
	// 13 || Teste para acessar a função monitorado por min
	@Test
	public void AcessarTelaMonitoradoPorMin() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao minhaVisao = new TestePageMinhaVisao(driver,wait);
		
		login.loginSucesso();
		minhaVisao.getAcessarMonitoradoPorMin();
		
		driver.quit();
		
	}
	
	// 14 || Teste para acessar a função linha do tempo
	@Test
	public void AcessarTelaLinhaTempo() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao minhaVisao = new TestePageMinhaVisao(driver,wait);
		
		login.loginSucesso();
		minhaVisao.getAcessarTelaLinhaTempo();
		
		driver.quit();
	}
	
	
	// 16 || Teste para acessar a função deslogar do sistema
	@Test
	public void deslogarMinhaConta() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		tpgm.getSairMinhaConta();
		
		driver.quit();

	}
	
	// 17 || Teste para acessar a função feedRSS
	@Test
	public void consumirFeedRSS() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		tpgm.getConsumirRSS();
		
		driver.quit();
	}
	
	// 18 || Teste para acessar a função preferencial
	@Test
	public void AcessarTelaPreferencia() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		tpgm.getAcessarPreferencias();
		
		driver.quit();
	}
	
	// 19 || Teste para acessar a função gerenciar coluna
	@Test
	public void AcessarTelaGerenciarColuna() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		tpgm.getAcessarGerenciarColuna();
		
		driver.quit();
	}
	
	// 20 || Teste para acessar a função perfil
	@Test
	public void AcessarTelaPerfil() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		tpgm.getAcessarPerfil();
		
		driver.quit();
	}
	
	// 21 || Teste para acessar a função token api
	@Test
	public void AcessarTelaTokenAPI() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		
		tpgm.getAcessarTokenAPI();
		driver.quit();
	}

	// 22 || Teste para acessar a funcão trocar nome de usuario
	@Test
	public void trocarNomeUsuario() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		
		tpgm.getTrocarNomeVerdadeiro();
		
		driver.quit();
	}

	// 23 || Teste para acessar a função trocar email 
	@Test
	public void trocarEmailUsuario() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		
		tpgm.getTrocarEmail();
		
		driver.quit();
	}

	// 24 || Teste para acessar a função trocar senha 
	@Test
	public void trocarSenhaUsuario() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		
		tpgm.getTrocarSenha();
		
		driver.quit();
	}
	
	// 26 || Teste para a função selecionar perfil de usuario
	@Test
	public void selecionarPerfilUsuario() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaConta tpgm = new TestePageMinhaConta(driver,wait);
		login.loginSucesso();
		
		tpgm.getSelecionarPerfil();
		driver.quit();
	}

	
	// 28 ||Erro ao digitar enter no campo de busca vazio
	@Test
	public void erroBuscaVaziaCampoTarefa() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao mv = new TestePageMinhaVisao(driver,wait);
		login.loginSucesso();
		mv.getErroBuscaVazia();
		driver.quit();
	}
	
	//30 || 
	@Test
	public void efetuarBusca() throws IOException,WebDriverException,InterruptedException,RuntimeException{
		WebDriver driver = new DriverFactory().getConnectionChrome();
		WebDriverWait wait = new WebDriverWait(driver,10);
		
		TestePageLogin login = new TestePageLogin(driver,wait);
		TestePageMinhaVisao mv = new TestePageMinhaVisao(driver,wait);
		login.loginSucesso();
		mv.getEfetuarBusca();
		driver.quit();

	}

}
