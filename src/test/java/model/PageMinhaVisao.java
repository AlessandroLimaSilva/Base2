package model;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class PageMinhaVisao {

	    //====================Endereços URL================================
		private String minhaVisaoURL = "https://mantis.saojudas.base2.com.br/my_view_page.php";
		private String buscaLink = "https://mantis.saojudas.base2.com.br/view.php?id=4";
		//====================Caminhos de variaveis========================
		public By campoBuscaTarefa = By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/span/input");
		public By botaoAtribuidoAMin = By.xpath("//*[@id=\'assigned\']/div[1]/div[2]/div");
		public By botaoNaoAtribuido = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[3]/div[1]/h4/a");
		public By botaoRelatadoPorMin = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[5]/div[1]/h4/a");
		public By botaoResolvido = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[7]/div[1]/h4/a");
		public By botaoModificadoRecentemente = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[9]/div[1]/h4/a");
		public By botaoMonitoradoPorMin = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[11]/div[1]/h4/a");
		public By botaoPerfilUsuario = By.xpath("/html/body/div[2]/div[2]/div[1]/ul/li/a");
		public By botaoCriarTarefa = By.xpath("/html/body/div[1]/div/div[2]/ul/li[1]/div/a");
		public By botaoAtribuidoAMinVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/a");
		public By botaoNaoAtribuidoVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[2]/div/a");
		public By botaoRelatadoPorMinVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[5]/div[1]/div[2]/div/a");
		public By botaoResolvidoVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[7]/div[1]/div[2]/div/a");
		public By botaoModificadoRecentementeVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[9]/div[1]/div[2]/div/a");
		public By botaoMonitoradoPorMinVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[11]/div[1]/div[2]/div/a");
        public By botaoAnteriorLinhaTempo = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/a");
		public By textoErrorMilCem = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[1]");
		private By textoErroDuzentoTre = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/p[1]");
        public By botaoAbaLinhaTempo = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/a");
		public String urlAtribuidoAMin = "https://mantis.saojudas.base2.com.br/view_all_bug_page.php?filter=";
		public String urlLinhaTempo = "https://mantis.saojudas.base2.com.br/my_view_page.php?days=7";
		public String mensagemVisualizandoTarefa = "Visualizando Tarefas";
		public String mensagemFiltro = "Filtros";
		private String caracter = "busca";
		private String mensagemErroBuscaVazia = "APPLICATION ERROR #1100";
		private String mensagemErroBuscaCaracter = "APPLICATION ERROR #203";
		private String busca = "4";
		public WebDriver driver;
		
		public PageMinhaVisao(WebDriver driver) {
			this.driver = driver;
		}
		
		public PageMinhaVisao() {}
		
		public PageMinhaVisao getBotaoAtribuidoAMin() {
			driver.findElement(botaoAtribuidoAMin).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoNaoAtribuido() {
			driver.findElement(botaoNaoAtribuido).click();
			return this;
		
		}
		
		public PageMinhaVisao getBotaoRelatadoPorMin() {
			driver.findElement(botaoRelatadoPorMin);
			return this;
		}
		
		public PageMinhaVisao getBotaoResolvido() {
			driver.findElement(botaoResolvido).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoModificadoRecentemente() {
			driver.findElement(botaoModificadoRecentemente);
			return this;
		}
		
		public PageMinhaVisao getBotaoMonitoradoPorMin() {
			driver.findElement(botaoMonitoradoPorMin);
			return this;
		}
		
		public PageMinhaVisao getBotaoAtribuidoAMinVerTarefa() {
			driver.findElement(botaoAtribuidoAMinVerTarefa).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoNaoAtribuidoVerTarefa() {
			driver.findElement(botaoNaoAtribuidoVerTarefa).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoRelatadoPorMinVerTarefa() {
			driver.findElement(botaoRelatadoPorMinVerTarefa);
			return this;
		}
		
		public PageMinhaVisao getBotaoResolvidoVerTarefa() {
			driver.findElement(botaoResolvidoVerTarefa).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoModificadoRecentementeVerTarefa() {
			driver.findElement(botaoModificadoRecentementeVerTarefa);
			return this;
		}
		
		public PageMinhaVisao getBotaoMonitoradoPorMinVerTarefa() {
			driver.findElement(botaoMonitoradoPorMinVerTarefa);
			return this;
		}
		
		public PageMinhaVisao getBotaoAnteriorLinhaTempo() {
			driver.findElement(botaoAnteriorLinhaTempo).click();
			return this;
		}
		
		public String getURLMinhaVisao() {
			return getMinhaVisaoURL();
		}
		
		public PageMinhaVisao confirmaUrlAtual() {
			driver.getCurrentUrl();
			return this;
		}
		
		public PageMinhaVisao getSelecionarCampoTarefa() {
			driver.findElement(campoBuscaTarefa).click();
			return this;
		}
		
		public PageMinhaVisao getBotaoAbaLinhaTempo() {
			driver.findElement(botaoAbaLinhaTempo).click();
			return this;
		}

		public PageMinhaVisao getEnviarComandoCampoTarefa() {
			driver.findElement(campoBuscaTarefa).sendKeys(Keys.ENTER);
			return this;
		}
		
		public PageMinhaVisao getBotaoAbaLinhaTempoVisualizar() {
			driver.findElement(botaoAbaLinhaTempo);
			return this;
		}

		
		public String getErroBuscaVazia() {
			String res = driver.findElement(campoBuscaTarefa).getText();
			return res;
		}
		
		public PageMinhaVisao getPreencherBusca() {
			driver.findElement(campoBuscaTarefa).sendKeys(getBusca());
			return this;
		}

		public PageMinhaVisao getPreencherCampoBuscaCaracter() {
			driver.findElement(campoBuscaTarefa).sendKeys(getTextoCaracter());
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
		
		public String getBusca() {
			return busca;
		}
		
		public String getBuscaLink() {
			return buscaLink;
		}
		
		public String verificaUrlAtual() throws WebDriverException{
			
			String resultado = driver.getCurrentUrl();
			
			return resultado;
		}

		public String getMinhaVisaoURL() {
			return minhaVisaoURL;
		}

}
