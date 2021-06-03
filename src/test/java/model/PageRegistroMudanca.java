package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageRegistroMudanca {

	public String urlRegistroMudanca = "https://mantis.saojudas.base2.com.br/changelog_page.php";
	public By botaoRegistroMudanca = By.xpath("/html/body/div[2]/div[1]/ul/li[4]/a/span");
	public WebDriver driver;
	
	public PageRegistroMudanca(WebDriver browser) {
		this.driver = browser;
	}
	
	public PageRegistroMudanca getURLRegistroMudanca() {
		driver.get(urlRegistroMudanca);
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

}
