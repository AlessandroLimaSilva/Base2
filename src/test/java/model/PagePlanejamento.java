package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagePlanejamento {

	
	public String urlPlanejamento = "https://mantis.saojudas.base2.com.br/roadmap_page.php";
	public By botaoPlanejamento = By.xpath("//*[@id=\'sidebar\']/ul/li[5]/a");
	public WebDriver browser;
	
	public PagePlanejamento(WebDriver browser) {
		this.browser = browser;
	}
	
	public PagePlanejamento getURLPlanejamento() {
		browser.get(urlPlanejamento);
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
}
