package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagePlanejamento {

	
	private String urlPlanejamento = "https://mantis.saojudas.base2.com.br/roadmap_page.php";
	private By botaoPlanejamento = By.xpath("//*[@id=\'sidebar\']/ul/li[5]/a");
	private WebDriver browser;
	
	public PagePlanejamento(WebDriver browser) {
		this.browser = browser;
	}
	
	public PagePlanejamento getURLPlanejamento() {
		browser.get(getUrlPlanejamento());
		return this;
	}
	
	public PagePlanejamento getBotaoPlanejamento() {
		browser.findElement(botaoPlanejamento).click();
		return this;
	}
	
	public PagePlanejamento confirmaUrlAtual() {
		browser.getCurrentUrl();
		return this;
	}

	public String getUrlPlanejamento() {
		return urlPlanejamento;
	}

}
