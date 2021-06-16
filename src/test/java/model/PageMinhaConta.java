package model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class PageMinhaConta {
	
	public WebDriver driver;
	private String urlMinhaConta = "https://mantis.saojudas.base2.com.br/account_page.php";
	private String urlPreferencia  = "https://mantis.saojudas.base2.com.br/account_prefs_page.php";
	private String urlGerenciarColuna  = "https://mantis.saojudas.base2.com.br/account_manage_columns_page.php";
	private String urlTokenAPI  = "https://mantis.saojudas.base2.com.br/api_tokens_page.php";
	private String urlContaUpdate = "https://mantis.saojudas.base2.com.br/account_update.php";
	
	
	private By botaoMenuMinhaConta = By.xpath("/html/body/div[1]/div/div[2]/ul/li[2]/a");
	private By botaoMinhaConta = By.xpath("/html/body/div[1]/div/div[2]/ul/li[2]/ul/li[1]/a");
	private By botaoSairMinhaConta = By.xpath("/html/body/div[1]/div/div[2]/ul/li[2]/ul/li[4]/a");
	private By botaoRSS = By.xpath("/html/body/div[1]/div/div[2]/ul/li[2]/ul/li[2]/a");
	private By botaoPerfil = By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[4]/a");
	private By botaoPreferencia   = By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[2]/a");
	private By botaoGerenciarColuna   = By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[3]/a");
	private By botaoTokenAPI   = By.xpath("/html/body/div[2]/div[2]/div[2]/div/ul/li[5]/a");
	private By botaoAdicionarPerfil  = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/fieldset/div/div[2]/div[2]/input");
	private By botaoAtualizarUsuario = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/form/div[1]/div[2]/div[2]/input");
	private By botaoEnviarPerfil = By.xpath("//*[@id=\'account-profile-update-form\']/div/div[2]/div[2]/input");
	private By caixaTextoPlataforma = By.xpath("//*[@id=\'platform\']");
	private By caixaTextoSO  = By.xpath("//*[@id=\'os\']");
	private By caixaTextoVersaoSO  = By.xpath("//*[@id=\'os-version\']");
	private By caixaTextoDescricaoAdicional  = By.xpath("//*[@id=\'description\']");
	private By caixaTextoSenhaAtual = By.xpath("//*[@id=\'password-current\']");
	private By caixaTextoNovaSenha = By.xpath("//*[@id=\'password\']");
	private By caixaTextoConfirmarSenha = By.xpath("//*[@id=\'password-confirm\']");
	private By caixaTextoEmail = By.xpath("//*[@id=\'email-field\']");
	private By caixaTextoNomeVerdadeiro = By.xpath("//*[@id=\"realname\"]");
	private By selecaoEditarPerfil  = By.xpath("//*[@id=\'action-edit\']");
	private By selecaoTornarPadrao  = By.xpath("//*[@id=\'action-default\']");
	private By selecaoApagarPerfil = By.xpath("//*[@id=\'action-delete\']");
	private By selecaoCaixaPerfil = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[4]/form/div/div[2]/div[1]/div/table/tbody/tr[4]/td[2]/select/option[2]");
	//Erro encontrado ao nao selecionar nenhuma opção de perfil na tela perfil e apertar o botao enviar
	private By erroPerfilSemSelecao = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[1]");
	
	private String urlLogin = "https://mantis.saojudas.base2.com.br/login_page.php";
	private String urlRSS = "https://mantis.saojudas.base2.com.br/issues_rss.php?username=Alessandro%20Lima%20Da%20Silva&key=";
	private String urlPerfilPlataforma = "https://mantis.saojudas.base2.com.br/account_prof_menu_page.php";
	private String perfilPlataforma = "AMD Ryzen 3900x, aourus x570, 32 gb 4266 mhz, rtx 2080 super";
	private String perfilSO = "Ubuntu";
	private String perfilVersaoSO = "21.04 X64 Hirsute Hippo";
	private String perfilDescricaoAdicional = "Versao Teste Automatizado selenium webdriver";
	private String validarNomePerfil = "AMD Ryzen 3900x, aourus x570, 32 Ubuntu 21.04 X64 Hirsut";
	private String erroPagePerfilVazio = "APPLICATION ERROR #200";
	private String userAle = "Alessandro Lima";
	private String userHugo = "Hugo BASE2";
	
	public PageMinhaConta (WebDriver driver) {
		this.driver = driver;
	}
	
	
	public PageMinhaConta getBotaoMenuMinhaConta() {
		driver.findElement(botaoMenuMinhaConta).click();
		return this;
	}
	
	public PageMinhaConta getBotaoMinhaConta() {
		
		try {
			
			driver.findElement(botaoMinhaConta).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
		
	}
	
	public PageMinhaConta getSairMinhaConta() {
		
		try {
			
			driver.findElement(botaoSairMinhaConta).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
		
	}
	
	public PageMinhaConta getBotaoPreferencia() {
		
		try {
			
			driver.findElement(botaoPreferencia).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
		
	}
	
	public PageMinhaConta getBotaoGerenciarColuna() {
		
		try {
			
			driver.findElement(botaoGerenciarColuna).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
		
	}
	
	
	public PageMinhaConta getBotaoPerfil() {
		
		try {
			
			driver.findElement(botaoPerfil).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
		
	}
	
	public PageMinhaConta getBotaoAtualizarUsuario() {
		
		try {
			
			driver.findElement(botaoAtualizarUsuario).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
		
	}
	
	
	public PageMinhaConta getBotaoTokenAPI() {
		
		try {
			
			driver.findElement(botaoTokenAPI).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
		
	}
	
	public PageMinhaConta getConsumirFeedRSS() {
		try {
			driver.findElement(botaoRSS).click();;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
		
	}

	
	
	public PageMinhaConta getBotaoAdicionarPerfil() {
		
		try {
			
			driver.findElement(botaoAdicionarPerfil).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
		
	}
	
	public PageMinhaConta getSelecaoCaixaPerfil() {
		
		try{
			driver.findElement(selecaoCaixaPerfil).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
	}
	
	public PageMinhaConta getSelecionarEditarPerfil() {
		try {
			
			driver.findElement(selecaoEditarPerfil).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
	}

	public PageMinhaConta getSelecionarTornarPadraoPerfil() {
		try {
			
			driver.findElement(selecaoTornarPadrao).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
	}

	public PageMinhaConta getSelecionarApagarPerfil() {
		try {
			
			driver.findElement(selecaoApagarPerfil).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
	}
	
	
	public PageMinhaConta getBotaoEnviarPerfil() {
		try {
			
			driver.findElement(botaoEnviarPerfil).click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return this;
	}

	
	public PageMinhaConta getCaixaTextoSenhaAtual() {
		PageLogin login = new PageLogin();
		driver.findElement(caixaTextoSenhaAtual).sendKeys(login.senha);
		return this;
		
	}

	public PageMinhaConta getCaixaTextoNovaSenha() {
		PageLogin login = new PageLogin();
		driver.findElement(caixaTextoNovaSenha).sendKeys(login.senha);
		return this;
		
	}

	public PageMinhaConta getCaixaTextoConfirmarSenha() {
		PageLogin login = new PageLogin();
		driver.findElement(caixaTextoConfirmarSenha).sendKeys(login.senha);
		return this;
		
	}

	public PageMinhaConta getCaixaTextoEmail() {
		PageLogin login = new PageLogin();
		driver.findElement(caixaTextoEmail).sendKeys(login.email);
		return this;
		
	}

	public PageMinhaConta getCaixaTextoNomeVerdadeiro() {
		PageLogin login = new PageLogin();
		driver.findElement(caixaTextoNomeVerdadeiro).sendKeys(login.user);
		return this;
		
	}
	
	public PageMinhaConta getCaixaTextoNomeVerdadeiroVazia() {
	
		driver.findElement(caixaTextoNomeVerdadeiro).clear();
		return this;
		
	}
	
	public PageMinhaConta getCaixaEmailVazia() {
		
		driver.findElement(caixaTextoEmail).clear();
		return this;
		
	}

	public PageMinhaConta getPreencherPlataforma() {
		driver.findElement(caixaTextoPlataforma).sendKeys(perfilPlataforma);
		return this;
		
	}

	
	public PageMinhaConta getPreencherSO() {
		driver.findElement(caixaTextoSO).sendKeys(perfilSO);
		return this;
		
	}
	
	public PageMinhaConta getPreencherVersaoSO() {
		driver.findElement(caixaTextoVersaoSO).sendKeys(perfilVersaoSO);
		return this;
		
	}
	
	public PageMinhaConta getPreencherDescricaoAdicional() {
		driver.findElement(caixaTextoDescricaoAdicional).sendKeys(perfilDescricaoAdicional);
		return this;
		
	}
	
	public PageMinhaConta getSelecionarCaixaNome() {
		driver.findElement(caixaTextoNomeVerdadeiro).isSelected();
		return this;
		
	}
	
	public CharSequence getNomeUsuario() {
		return driver.findElement(caixaTextoNomeVerdadeiro).getText();
	}

	public String getErroPerfilEnviarVazio() {
		String res = driver.findElement(erroPerfilSemSelecao).getText();
		return res;
	}

	
	public CharSequence getTextoSelecaoCaixaPerfil() {
		
		return driver.findElement(selecaoCaixaPerfil).getText();
	}
	
	public String getValidarNomePerfil() {
		return validarNomePerfil;
	}
	
	public By getRetornoBotaoAdiconarPerfil() {
		return botaoAdicionarPerfil;
	}
	
	public String getURLPerfilPlataforma() {
		return urlPerfilPlataforma;
	}

	public String getURLMinhaConta() {
		return urlMinhaConta;
	}
	
	public String getURLLogin() {
		return urlLogin;
	}
	
	public String getURLRSS() {
		return urlRSS;
	}
	
	public String getURLPreferencia() {
		return urlPreferencia;
	}
	
	public String getURLGerenciarColuna() {
		return urlGerenciarColuna;
	}
	
	public String getURLTokenAPI() {
		return urlTokenAPI;
	}
	
	public String getURLContaUpdate() {
		return urlContaUpdate;
	}
	
	public String getMensagemPerfilVazioErro() {
		return erroPagePerfilVazio;
	}
	
	public String getUserAle() {
		return userAle;
	}
	
	public String getUserHugo() {
		return userHugo;
	}
	
	public PageMinhaConta getTextoAle() {
		driver.findElement(caixaTextoNomeVerdadeiro).sendKeys(getUserAle());
		return this;
		
	}
	
	public PageMinhaConta getTextoHugo() {
		driver.findElement(caixaTextoNomeVerdadeiro).sendKeys(getUserHugo());
		return this;
		
	}

}
