package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageVerTarefa {

	public WebDriver driverr;
	public By urlVerTarefa = By.xpath("https://mantis.saojudas.base2.com.br/view_all_bug_page.php");
	public By botaoFiltroRedefinir = By.xpath("//*/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/a[1]");
	public By botaoFiltroSalvar = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/div[2]/div/div/div/div/a[2]");
	public By botaoFiltroRelator = By.xpath("//*[@id=\'reporter_id_filter\']");
	public By botaoFiltroCategoria = By.xpath("//*[@id=\'show_category_filter\']");
	public By botaoFiltroPerfil = By.xpath("//*[@id=\'show_profile_filter\']");
	public By botaoFiltroExibir = By.xpath("//*[@id=\'per_page_filter\']");
	public By botaoFiltroAtribuido = By.xpath("//*[@id=\'handler_id_filter\']");
	public By botaoFiltroOcultarStatus = By.xpath("//*[@id=\'hide_status_filter\']");
	public By botaoFiltroPlataforma = By.xpath("//*[@id=\'platform_filter\']");
	public By botaoFiltroMonitoradoPor = By.xpath("//*[@id=\'user_monitor_filter\']");
	public By botaoFiltroEstado = By.xpath("//*[@id=\'show_status_filter\']");
	public By botaoFiltroSO = By.xpath("//*[@id=\'os_filter\']");
	public By botaoFiltroOrdenarPor = By.xpath("//*[@id=\'show_sort_filter\']");
	public By botaoFiltroNotaPor = By.xpath("//*[@id=\'note_user_id_filter\']");
	public By botaoFiltroResolucao = By.xpath("//*[@id=\'show_resolution_filter\']");
	public By botaoFiltroVersaoSO = By.xpath("//*[@id=\'os_build_filter\']");
	public By botaoFiltroPrioridade = By.xpath("//*[@id=\'show_priority_filter\']");
	public By botaoFiltroFiltroData = By.xpath("//*[@id=\'do_filter_by_date_filter\']");
	public By botaoFiltroRelacoes = By.xpath("//*[@id=\'relationship_type_filter\']");
	public By botaoFiltroTipoCorrespondencia = By.xpath("//*[@id=\'match_type_filter\']");
	public By botaoFiltroGravidade = By.xpath("//*[@id=\'show_severity_filter\']");
	public By botaoFiltroMarcadores = By.xpath("//*[@id=\'tag_string_filter\']");
	public By botaoFiltroVisibilidade = By.xpath("//*[@id=\'view_state_filter\']");
	public By botaoFiltroDataUltimaAtualizacao = By.xpath("//*[@id=\'do_filter_by_last_updated_date_filter\']");
	public By botaoFiltroRessaltarAlteracao = By.xpath("//*[@id=\'highlight_changed_filter\']");
	public By botaoFiltroTarefaPegajosa = By.xpath("//*[@id=\'sticky_issues_filter\']");
	public By botaoFiltroAplicarFiltro = By.xpath("/html/body/div[2]/div[2]/div[2]/div/div[1]/div/div/div[2]/form/div[2]/div/div/input[2]");

	public PageVerTarefa getBotaoFiltroRedefinir() {
		driverr.findElement(botaoFiltroRedefinir).click();
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroSalvar() {
		driverr.findElement(botaoFiltroSalvar);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroRelator() {
		driverr.findElement(botaoFiltroRelator);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroCategoria() {
		driverr.findElement(botaoFiltroCategoria);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroPerfil() {
		driverr.findElement(botaoFiltroPerfil);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroExibir() {
		driverr.findElement(botaoFiltroExibir);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroAtribuido() {
		driverr.findElement(botaoFiltroAtribuido);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroOcultarStatus() {
		driverr.findElement(botaoFiltroOcultarStatus);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroPlataforma() {
		driverr.findElement(botaoFiltroPlataforma);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroMonitoradoPor() {
		driverr.findElement(botaoFiltroMonitoradoPor);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroEstado() {
		driverr.findElement(botaoFiltroEstado);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroSO() {
		driverr.findElement(botaoFiltroSO);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroOrdenarPor() {
		driverr.findElement(botaoFiltroOrdenarPor);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroNotaPor() {
		driverr.findElement(botaoFiltroNotaPor);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroResolucao() {
		driverr.findElement(botaoFiltroResolucao);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroVersaoSO() {
		driverr.findElement(botaoFiltroVersaoSO);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroPrioridade() {
		driverr.findElement(botaoFiltroPrioridade);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroFiltroData() {
		driverr.findElement(botaoFiltroFiltroData);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroRelacoes() {
		driverr.findElement(botaoFiltroRelacoes);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroTipoCorrespondencia() {
		driverr.findElement(botaoFiltroTipoCorrespondencia);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroGravidade() {
		driverr.findElement(botaoFiltroGravidade);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroMarcadores() {
		driverr.findElement(botaoFiltroMarcadores);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroVisibilidade() {
		driverr.findElement(botaoFiltroVisibilidade);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroDataUltimaAtualizacao() {
		driverr.findElement(botaoFiltroDataUltimaAtualizacao);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroRessaltarAlteracao() {
		driverr.findElement(botaoFiltroRessaltarAlteracao);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroTarefaPegajosa() {
		driverr.findElement(botaoFiltroTarefaPegajosa);
		return this;
	}
	
	public PageVerTarefa getBotaoFiltroAplicarFiltro() {
		driverr.findElement(botaoFiltroAplicarFiltro);
		return this;
	}
	
	public PageVerTarefa confirmaUrlAtual() {
		driverr.getCurrentUrl();
		return this;
	}
	
}
