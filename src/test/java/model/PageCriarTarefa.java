package model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCriarTarefa {

	public WebDriver driver;
	public By urlCriarTarefa = By.xpath("https://mantis.saojudas.base2.com.br/bug_report_page.php");
	public By categoria = By.xpath("//*[@id=\'category_id\']");
	public By frequencia = By.xpath("//*[@id=\'reproducibility\']");
	public By gravidade = By.xpath("//*[@id=\'severity\']");
	public By prioridade = By.xpath("//*[@id=\'priority\']");
	public By selecionarPerfil = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[5]/td/div[1]/a/i");
	public By plataforma = By.xpath("//*[@id=\'platform\']");
	public By so = By.xpath("//*[@id=\'os\']");
	public By versaoSO = By.xpath("//*[@id=\'os_build\']");
	public By atribuirA = By.xpath("//*[@id=\'handler_id\']");
	public By resumo = By.xpath("//*[@id=\'summary\']");
	public By descricao = By.xpath("//*[@id=\'description\']");
	public By passoReproduzir = By.xpath("//*[@id=\'steps_to_reproduce\']");
	public By informacaoAdicional = By.xpath("//*[@id=\'additional_info\']");
	public By aplicarMarcadorCampo = By.xpath("//*[@id=\'tag_string\']");
	public By aplicarMarcadorComboBox = By.xpath("//*[@id=\'tag_select\']");
	public By enviarArquivo = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[12]/td/div[2]");
	public By visibilidadePublico = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[13]/td/label[1]/span");
	public By visibilidadePrivado = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[13]/td/label[2]/span");
	public By continuarRelatando = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[14]/td/label/span");
	public By criarNovaTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[2]/input");
	public By recentementeVisitado = By.xpath("");
	
	

	
	public PageCriarTarefa getURLCriarTarefa() {
		driver.findElement(urlCriarTarefa);
		return this;
	}
	
	public PageCriarTarefa getCategoria() {
		driver.findElement(categoria);
		return this;
	}
	
	public PageCriarTarefa getFrequencia() {
		driver.findElement(frequencia);
		return this;
	}

	public PageCriarTarefa getGravidade() {
		driver.findElement(gravidade);
		return this;
	}
	
	public PageCriarTarefa getPrioridade() {
		driver.findElement(prioridade);
		return this;
	}
	
	public PageCriarTarefa getSelecionarPerfil() {
		driver.findElement(selecionarPerfil);
		return this;
	}
	
	public PageCriarTarefa getPlataforma() {
		driver.findElement(plataforma);
		return this;
	}
	
	public PageCriarTarefa getSO() {
		driver.findElement(so);
		return this;
	}

	public PageCriarTarefa getVersaoSO() {
		driver.findElement(versaoSO);
		return this;
	}
	
	public PageCriarTarefa getAtribuirA() {
		driver.findElement(atribuirA);
		return this;
	}

	public PageCriarTarefa getResumo() {
		driver.findElement(resumo);
		return this;
	}
	
	public PageCriarTarefa getDescricao() {
		driver.findElement(descricao);
		return this;
	}
	
	public PageCriarTarefa getPassoReproduzir() {
		driver.findElement(passoReproduzir);
		return this;
	}

	public PageCriarTarefa getInformacaoAdicional() {
		driver.findElement(informacaoAdicional);
		return this;
	}
	
	public PageCriarTarefa getAplicarMarcador() {
		driver.findElement(aplicarMarcadorCampo);
		return this;
	}
	
	public PageCriarTarefa getAplicarMarcadorComboBox() {
		driver.findElement(aplicarMarcadorCampo);
		return this;
	}

	public PageCriarTarefa getEnviarArquivo() {
		driver.findElement(enviarArquivo);
		return this;
	}
	
	public PageCriarTarefa getVisibilidadePublico() {
		driver.findElement(visibilidadePublico);
		return this;
	}
	
	public PageCriarTarefa getVisibilidadePrivado() {
		driver.findElement(visibilidadePrivado);
		return this;
	}

	public PageCriarTarefa getContinuarRelatando() {
		driver.findElement(continuarRelatando);
		return this;
	}
	
	public PageCriarTarefa getCriarNovaTarefa() {
		driver.findElement(criarNovaTarefa);
		return this;
	}

	public PageCriarTarefa getRecentementeVisitado() {
		driver.findElement(recentementeVisitado);
		return this;
	}
	
	public PageCriarTarefa confirmaUrlAtual() {
		driver.getCurrentUrl();
		return this;
	}
}
