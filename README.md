# Projeto de Teste de Software da Base2 na Disciplina de Engenharia de Software.

Orientadores do projeto.
Professora Doutoura Ana Paula G. Serra
Professor Fernando Betine.

Projeto Realizado com a finalidade de efetuar Testes de Software no sistema MantisBt.

Metodologia :
Page Object Model (POM).

Ferrramentas : 
Selenium WebDriver : 3.141.59.
Junit : 4.12.
Eclipse : 2021-03(4.149.0) Build id: 20210312-0638.
Firefox : 88.0.1 (64-bits)
FireFox gecko Driver : GeckoDriver V0.29.1-Linux64
Google Chrome : Versão 90.0.4430.212 (Versão oficial) 64 bits
Google Chrome Driver : ChromeDriver 90.4430.24

Instruções:

1 - Criar um novo projeto Maven no eclipse.

2 - Configurar o arquivo POM.xml no endereço :
https://github.com/AlessandroLimaSilva/Base2/blob/main/projeto-base2/pom.xml

3 - Criar a estrutura de pacote a seguir no src/test/java :

Pacote : factory : 
adicionar o arquivo : DriverFactory.java
Pacote model : 
adicionar os arquivos : 
PageCriarTarefa.java,PageLogin.java,PageMinhaConta.java,PageMinhaVisao.java,PagePlanejamento.java,PageRegistroMudanca.java,PageVerTarefa.java.

Pacote teste : 
adicionar os arquivos : 
TesteMain.java,TestePageLogin.java,TestePageMinhaConta.java,TestePageMinhaVisao.java,TestePagePlanejamento.java,TestePageRegistroMudanca.java.

Os arquivos estão disponiveis no repositorio : https://github.com/AlessandroLimaSilva/Base2

4 - Rodar os testes na classe TesteMain.java ataraves da opção Junit test.
Os teste pode ser efetuados indivuais ou em lotes.

Plataforma utilizada nos testes :
 
OS: Ubuntu 21.04 x86_64 

Host: B450 AORUS PRO WIFI 

Kernel: 5.12.0-051200-generic 
 
CPU: AMD Ryzen 5 3600 (12) @ 3.600GH 

GPU: NVIDIA GeForce RTX 2080 SUPER 

Memory: 3774MiB / 16010MiB 
                                       
                                                                   
