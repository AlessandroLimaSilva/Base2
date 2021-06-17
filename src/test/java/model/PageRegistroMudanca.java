package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRegistroMudanca {

	private String urlRegistroMudanca = "https://mantis.saojudas.base2.com.br/changelog_page.php";
	private By botaoRegistroMudanca = By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a/span");
	private WebDriver driver;
	
	public PageRegistroMudanca(WebDriver browser) {
		this.driver = browser;
	}
	
	public PageRegistroMudanca getURLRegistroMudanca() {
		driver.get(getUrlRegistroMudanca());
		return this;
	}
	
	public PageRegistroMudanca getBotaoReagistroMudanca() {
		driver.findElement(botaoRegistroMudanca).click();
		return this;
	}
	
	public PageRegistroMudanca confirmaUrlAtual() {
		driver.getCurrentUrl();
		return this;
	}

	public String getUrlRegistroMudanca() {
		return urlRegistroMudanca;
	}

}
