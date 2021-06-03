package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class PageLogin {
	
	//--------------------Dados Do Ususario--------------------------------------------
	public String user = "Alessandro Lima Da Silva";
	public String senha = "alessandroLima";
	public String userFake = "zerto";
	public String passwordFake = "ddlerkfkjjkr";
	public String passwordBranco = "";
	public String email = "alessandrosilva.2705@aluno.saojudas.br";
	//*********************************************************************************
	//--------------------Endereços de url da pagina login-----------------------------
	public String urlUser = "https://mantis.saojudas.base2.com.br/login_page.php";
	public String urlPassword = "https://mantis.saojudas.base2.com.br/login_password_page.php";
	public String urlView = "https://mantis.saojudas.base2.com.br/my_view_page.php";
	public String urlPerdeuSenha = "https://mantis.saojudas.base2.com.br/lost_pwd_page.php?username=";
	public String mensagemErroLogin = "Sua conta pode estar desativada ou bloqueada ou o nome de usuário e a senha que você digitou não estão corretos.";
	public String urlEmailEnviado = "https://mantis.saojudas.base2.com.br/login_page.php?return=lost_pwd.php";//"https://mantis.saojudas.base2.com.br/lost_pwd.php";https://mantis.saojudas.base2.com.br/login_page.php?return=lost_pwd.php
	//*********************************************************************************
	//--------------------Endereços de componentes da pagina login---------------------
	public By caixaTextoUsuario =  By.xpath("//*[@id='username']");
	public By endBotaoLogin = By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/input[2]");
	public By endBotaoLoginErro = By.xpath("//*[@id='login-form']/fieldset/input[2]");
	public By endCaixaPassword = By.xpath("//*[@id='password']");
	public By endBotaoPassword = By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/input[3]");
	public By endMenssagemTextoErroSenha = By.xpath("/html/body/div/div/div/div/div/div[4]/p");
	public By botaoPerdeuSenha = By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div/form/fieldset/a");
	public By caixaEmail = By.xpath("//*[@id=\'email-field\']");
	public By botaoEnviarEmail = By.xpath("/html/body/div/div/div/div/div/div[4]/div/div/div[1]/form/fieldset/input[2]");
	public By caixaEnviarEmail = By.xpath("//*[@id=\"email-field\"]");
	public WebDriver driver;
	//*********************************************************************************
	
	//Instancia a classe PageLogin com os dados de username e password
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
		
		driver.findElement(endBotaoLogin).click();
		
		return this;
		
	}
	//*********************************************************************************
	
	//--------------------Metodo que seleciona uma caixa de texto e preenche o campo---
	public PageLogin setCaixaTextoSenha() {
		
		driver.findElement(endCaixaPassword).sendKeys(senha);
		
		return this;
	}
	//*********************************************************************************
	
	public PageLogin setCaixaTextoSenhaFake() {
		
		driver.findElement(endCaixaPassword).sendKeys(passwordFake);
		
		return this;
	}
	//*********************************************************************************
	
	
	public PageLogin caixaPasswordBranco() {
		
		driver.findElement(endCaixaPassword).sendKeys(passwordBranco);
		
		return this;
	}
	//*********************************************************************************
	
	
	//--------------------Metodo que clica no botao Password------------------------------
	public PageLogin botaoLoginPass() {
		
		driver.findElement(endBotaoPassword).click();
		
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

}
