package model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageMinhaVisao {

	    //====================Endereços URL================================
		public String minhaVisaoURL = "https://mantis.saojudas.base2.com.br/my_view_page.php";
		//html/body/div[2]/div[2]/div[1]/div[2]/form/span/input
		//====================Caminhos de variaveis========================
		public By campoBuscaTarefa = By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/span/input");
		public By BotaoAtribuidoAMin = By.xpath("//*[@id=\'assigned\']/div[1]/div[2]/div");
		public By BotaoNaoAtribuido = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[3]/div[1]/h4/a");
		public By BotaoRelatadoPorMin = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[5]/div[1]/h4/a");
		public By BotaoResolvido = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[7]/div[1]/h4/a");
		public By BotaoModificadoRecentemente = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[9]/div[1]/h4/a");
		public By BotaoMonitoradoPorMin = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[11]/div[1]/h4/a");
		public By BotaoPerfilUsuario = By.xpath("/html/body/div[2]/div[2]/div[1]/ul/li/a");
		public By BotaoCriarTarefa = By.xpath("/html/body/div[1]/div/div[2]/ul/li[1]/div/a");
		public By BotaoAtribuidoAMinVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/a");
		public By BotaoNaoAtribuidoVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[2]/div/a");
		public By BotaoRelatadoPorMinVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[5]/div[1]/div[2]/div/a");
		public By BotaoResolvidoVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[7]/div[1]/div[2]/div/a");
		public By BotaoModificadoRecentementeVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[9]/div[1]/div[2]/div/a");
		public By BotaoMonitoradoPorMinVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[11]/div[1]/div[2]/div/a");
        public By botaoAnteriorLinhaTempo = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/a");
		public By textoErrorMilCem = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[1]");
		private By textoErroDuzentoTre = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/p[1]");
        public String urlAtribuidoAMin = "https://mantis.saojudas.base2.com.br/view_all_bug_page.php?filter=";
		public String urlLinhaTempo = "https://mantis.saojudas.base2.com.br/my_view_page.php?days=7";
		public String mensagemVisualizandoTarefa = "Visualizando Tarefas";
		public String mensagemFiltro = "Filtros";
		private String caracter = "busca";
		private String mensagemErroBuscaVazia = "APPLICATION ERROR #1100";
		private String mensagemErroBuscaCaracter = "APPLICATION ERROR #203";
		public WebDriver driver;
		
		public PageMinhaVisao(WebDriver driver) {
			this.driver = driver;
		}
		
		public PageMinhaVisao() {}
		
		public PageMinhaVisao getBotaoAtribuidoAMin() {
			driver.findElement(BotaoAtribuidoAMin).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoNaoAtribuido() {
			driver.findElement(BotaoNaoAtribuido).click();
			return this;
		
		}
		
		public PageMinhaVisao getBotaoRelatadoPorMin() {
			driver.findElement(BotaoRelatadoPorMin);
			return this;
		}
		
		public PageMinhaVisao getBotaoResolvido() {
			driver.findElement(BotaoResolvido).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoModificadoRecentemente() {
			driver.findElement(BotaoModificadoRecentemente);
			return this;
		}
		
		public PageMinhaVisao getBotaoMonitoradoPorMin() {
			driver.findElement(BotaoMonitoradoPorMin);
			return this;
		}
		
		public PageMinhaVisao getBotaoAtribuidoAMinVerTarefa() {
			driver.findElement(BotaoAtribuidoAMinVerTarefa).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoNaoAtribuidoVerTarefa() {
			driver.findElement(BotaoNaoAtribuidoVerTarefa).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoRelatadoPorMinVerTarefa() {
			driver.findElement(BotaoRelatadoPorMinVerTarefa);
			return this;
		}
		
		public PageMinhaVisao getBotaoResolvidoVerTarefa() {
			driver.findElement(BotaoResolvidoVerTarefa).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoModificadoRecentementeVerTarefa() {
			driver.findElement(BotaoModificadoRecentementeVerTarefa);
			return this;
		}
		
		public PageMinhaVisao getBotaoMonitoradoPorMinVerTarefa() {
			driver.findElement(BotaoMonitoradoPorMinVerTarefa);
			return this;
		}
		
		public PageMinhaVisao getBotaoAnteriorLinhaTempo() {
			driver.findElement(botaoAnteriorLinhaTempo).click();
			return this;
		}
		
		public String getURLMinhaVisao() {
			return minhaVisaoURL;
		}
		
		public PageMinhaVisao confirmaUrlAtual() {
			driver.getCurrentUrl();
			return this;
		}
		
		public PageMinhaVisao getSelecionarCampoTarefa() {
			driver.findElement(campoBuscaTarefa).click();
			return this;
		}

		public PageMinhaVisao getEnviarComandoCampoTarefa() {
			driver.findElement(campoBuscaTarefa).sendKeys(Keys.ENTER);
			return this;
		}

		
		public String getErroBuscaVazia() {
			String res = driver.findElement(campoBuscaTarefa).getText();
			return res;
		}

		public PageMinhaVisao getPreencherCampoBuscaCaracter() {
			driver.findElement(campoBuscaTarefa).sendKeys(getMensagemErroBuscaCaracter());
			return this;
		}

		
		public String getMensagemErroBuscaVazia() {
			return mensagemErroBuscaVazia;
		}
		
		public String getTextoErrorMilCem() {
			String res = driver.findElement(textoErrorMilCem).getText();
			return res;
		}
		
		public String getTextoErroDuzentoTre() {
			String res = driver.findElement(textoErroDuzentoTre).getText();
			return res;
		}

		
		public String getMensagemErroBuscaCaracter() {
			return mensagemErroBuscaCaracter;
		}
		
		public String getTextoCaracter() {
			return caracter;
		}
}
