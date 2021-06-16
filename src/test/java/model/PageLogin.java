package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class PageLogin {
	
	//--------------------Dados Do Ususario--------------------------------------------
	private String user = "Alessandro Lima Da Silva";
	private String senha = "alessandroLima";
	private String userFake = "zerto";
	private String passwordFake = "ddlerkfkjjkr";
	private String passwordBranco = "";
	private String email = "alessandrosilva.2705@aluno.saojudas.br";
	//*********************************************************************************
	//--------------------Endereços de url da pagina login-----------------------------
	private String urlUser = "https://mantis.saojudas.base2.com.br/login_page.php";
	private String urlPassword = "https://mantis.saojudas.base2.com.br/login_password_page.php";
	private String urlView = "https://mantis.saojudas.base2.com.br/my_view_page.php";
	private String urlPerdeuSenha = "https://mantis.saojudas.base2.com.br/lost_pwd_page.php?username=";
	private String mensagemErroLogin = "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.";
	private String urlEmailEnviado = "https://mantis.saojudas.base2.com.br/login_page.php?return=lost_pwd.php";//"https://mantis.saojudas.base2.com.br/lost_pwd.php";https://mantis.saojudas.base2.com.br/login_page.php?return=lost_pwd.php
	//*********************************************************************************
	//--------------------Endereços de componentes da pagina login---------------------
	private By caixaTextoUsuario =  By.xpath("//*[@id='username']");
	private By endBotaoLogin = By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/input[2]");
	private By endBotaoLoginErro = By.xpath("//*[@id='login-form']/fieldset/input[2]");
	private By endCaixaPassword = By.xpath("//*[@id='password']");
	private By endBotaoPassword = By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/input[3]");
	private By endMenssagemTextoErroSenha = By.xpath("/html/body/div/div/div/div/div/div[4]/p");
	private By botaoPerdeuSenha = By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/a");
	private By caixaEmail = By.xpath("//*[@id=\'email-field\']");
	private By botaoEnviarEmail = By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/input[2]");
	private By caixaEnviarEmail = By.xpath("//*[@id=\"email-field\"]");
	private WebDriver driver;
	//*********************************************************************************
	
	//Instancia a classe PageLogin com os dados de username e password
	
	public String getUrlView() {return urlView;}
	
	public String getUrlPerdeuSenha() {return urlPerdeuSenha;}
	
	public String getMensagemErroLogin() {return mensagemErroLogin;}
	
	public String getUrlEmailEnviado() {return urlEmailEnviado;}
	
	
	
	public PageLogin(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	//--------------------Instancia a classe PageLogin Vazia---------------------------
	public PageLogin() {}
	//*********************************************************************************
	
	
	//--------------------Metodo que recebe uma url e acessa a pagina------------------
	public PageLogin getTelaLogin() {
		
		driver.get(urlUser);
		
		return this;
	}
	//*********************************************************************************
	
	//--------------------Metodo que recebe uma url e acessa a pagina------------------
	public PageLogin getTelaMinhaVisao() {
			
		driver.get(urlView);
			
		return this;
	}
		//*********************************************************************************
		
	
	//--------------------Metodo que seleciona uma caixa de texto e preenche o campo--- 
	public PageLogin setCaixaTextoUsuario() {
		
		driver.findElement(caixaTextoUsuario).sendKeys(user);
		
		return this;
	}
	//*********************************************************************************
	
	//--------------------Metodo que clica no botao login------------------------------
	public PageLogin botaoLoginUser() {
		
		driver.findElement(getEndBotaoLogin()).click();
		
		return this;
		
	}
	//*********************************************************************************
	
	//--------------------Metodo que seleciona uma caixa de texto e preenche o campo---
	public PageLogin setCaixaTextoSenha() {
		
		driver.findElement(getEndCaixaPassword()).sendKeys(senha);
		
		return this;
	}
	//*********************************************************************************
	
	public PageLogin setCaixaTextoSenhaFake() {
		
		driver.findElement(getEndCaixaPassword()).sendKeys(passwordFake);
		
		return this;
	}
	//*********************************************************************************
	
	
	public PageLogin caixaPasswordBranco() {
		
		driver.findElement(getEndCaixaPassword()).sendKeys(passwordBranco);
		
		return this;
	}
	//*********************************************************************************
	
	
	//--------------------Metodo que clica no botao Password------------------------------
	public PageLogin botaoLoginPass() {
		
		driver.findElement(getEndBotaoPassword()).click();
		
		return this;
	}
	//*********************************************************************************
	
	public PageLogin getBotaoPerdeuSenha() {
		
		driver.findElement(botaoPerdeuSenha).click();
		
		return this;
	}
	
	public PageLogin confirmaUrlAtual() {
		
		driver.getCurrentUrl();
		
		return this;
	}
	
	public PageLogin setCaixaEmail() {
		
		driver.findElement(caixaEmail).sendKeys(email);
		
		return this;
	}
	
	public PageLogin setBotaoEnviarEmail() {
		
		driver.findElement(botaoEnviarEmail).click();
		
		return this;
		
	}
	
	public PageLogin getURLEmailEnviado() {
		driver.get(urlEmailEnviado);
		return this;
	}
	
	public String getURLPerdeuSenha() {
		
		String novo = user.replace( " ","+");
		novo = urlPerdeuSenha+novo;
		
		return novo;
	}
	
	public String getUser() {
		return user;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public String getUserFake() {
		return userFake;
	}
	
	public String getPasswordFake() {
		return passwordFake;
	}
	
	public String getPasswordBranco() {
		return passwordBranco;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUrlUser() {
		return urlUser;
	}
	
	public String getUrlPassword() {
		return urlPassword;
	}

	public By getEndBotaoLogin() {
		return endBotaoLogin;
	}

	public By getEndCaixaPassword() {
		return endCaixaPassword;
	}

	public By getEndBotaoLoginErro() {
		return endBotaoLoginErro;
	}

	public By getEndBotaoPassword() {
		return endBotaoPassword;
	}

}
