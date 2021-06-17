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
		private By campoBuscaTarefa = By.xpath("/html/body/div[2]/div[2]/div[1]/div/form/span/input");
		private By botaoAtribuidoAMin = By.xpath("//*[@id=\'assigned\']/div[1]/div[2]/div");
		private By botaoNaoAtribuido = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[3]/div[1]/h4/a");
		private By botaoRelatadoPorMin = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[5]/div[1]/h4/a");
		private By botaoResolvido = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[7]/div[1]/h4/a");
		private By botaoModificadoRecentemente = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[9]/div[1]/h4/a");
		private By botaoMonitoradoPorMin = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[11]/div[1]/h4/a");
		private By botaoPerfilUsuario = By.xpath("/html/body/div[2]/div[2]/div[1]/ul/li/a");
		private By botaoCriarTarefa = By.xpath("/html/body/div[1]/div/div[2]/ul/li[1]/div/a");
		private By botaoAtribuidoAMinVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/a");
		private By botaoNaoAtribuidoVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[3]/div[1]/div[2]/div/a");
		private By botaoRelatadoPorMinVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[5]/div[1]/div[2]/div/a");
		private By botaoResolvidoVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[7]/div[1]/div[2]/div/a");
		private By botaoModificadoRecentementeVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[9]/div[1]/div[2]/div/a");
		private By botaoMonitoradoPorMinVerTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div[11]/div[1]/div[2]/div/a");
        private By botaoAnteriorLinhaTempo = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div[1]/div/div/a");
		private By textoErrorMilCem = By.xpath("//*[@id=\"main-container\"]/div[2]/div[2]/div/div/div[2]/p[1]");
		private By textoErroDuzentoTre = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/p[1]");
        private By botaoAbaLinhaTempo = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/a");
		private String urlAtribuidoAMin = "https://mantis.saojudas.base2.com.br/view_all_bug_page.php?filter=";
		private String urlLinhaTempo = "https://mantis.saojudas.base2.com.br/my_view_page.php?days=7";
		private String mensagemVisualizandoTarefa = "Visualizando Tarefas";
		private String mensagemFiltro = "Filtros";
		private String caracter = "busca";
		private String mensagemErroBuscaVazia = "APPLICATION ERROR #1100";
		private String mensagemErroBuscaCaracter = "APPLICATION ERROR #203";
		private String busca = "4";
		private WebDriver driver;
		
		
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
		
		public String getFiltroMensagem() {return mensagemFiltro;}
		
		public String getMensagemVisualizandoATarefa() {return mensagemVisualizandoTarefa;}
		
		public String getUrlLinhaDoTempo() {return urlLinhaTempo;}
		
		public By getBotaoAnteriorLinhaDoTempo() {return botaoAnteriorLinhaTempo;}
		
		public By getBotaoMonitoradoMinVerTarefa() {return botaoMonitoradoPorMinVerTarefa;}
		
		public By getBotaoModificadoRecentementeTarefa() {return botaoModificadoRecentementeVerTarefa;}
		
		public By getBotaoResolvidoTarefa() {return botaoResolvidoVerTarefa;}
		
		public By getBotaoNaoAtribuidoTarefa() {return botaoNaoAtribuidoVerTarefa;}
		
		public By getBotaoAtribuidoMin() {return botaoAtribuidoAMin;}
		
		public By getBotaoRelatadoMinVerTarefa() {return botaoRelatadoPorMinVerTarefa;}

		
		public String verificaUrlAtual() throws WebDriverException{
			
			String resultado = driver.getCurrentUrl();
			
			return resultado;
		}

		public String getMinhaVisaoURL() {
			return minhaVisaoURL;
		}

}
