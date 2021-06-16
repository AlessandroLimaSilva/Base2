package model;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageCriarTarefa {

	private WebDriver driver;
	private By urlCriarTarefa = By.xpath("https://mantis.saojudas.base2.com.br/bug_report_page.php");
	private By categoria = By.xpath("//*[@id=\'category_id\']");
	private By frequencia = By.xpath("//*[@id=\'reproducibility\']");
	private By gravidade = By.xpath("//*[@id=\'severity\']");
	private By prioridade = By.xpath("//*[@id=\'priority\']");
	private By selecionarPerfil = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[5]/td/div[1]/a/i");
	private By plataforma = By.xpath("//*[@id=\'platform\']");
	private By so = By.xpath("//*[@id=\'os\']");
	private By versaoSO = By.xpath("//*[@id=\'os_build\']");
	private By atribuirA = By.xpath("//*[@id=\'handler_id\']");
	private By resumo = By.xpath("//*[@id=\'summary\']");
	private By descricao = By.xpath("//*[@id=\'description\']");
	private By passoReproduzir = By.xpath("//*[@id=\'steps_to_reproduce\']");
	private By informacaoAdicional = By.xpath("//*[@id=\'additional_info\']");
	private By aplicarMarcadorCampo = By.xpath("//*[@id=\'tag_string\']");
	private By aplicarMarcadorComboBox = By.xpath("//*[@id=\'tag_select\']");
	private By enviarArquivo = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[12]/td/div[2]");
	private By visibilidadePublico = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[13]/td/label[1]/span");
	private By visibilidadePrivado = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[13]/td/label[2]/span");
	private By continuarRelatando = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[1]/div/table/tbody/tr[14]/td/label/span");
	private By criarNovaTarefa = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div/form/div/div[2]/div[2]/input");
	private By recentementeVisitado = By.xpath("");
	
	

	
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
