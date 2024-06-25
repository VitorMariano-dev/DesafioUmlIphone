package Iphone;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
	
	// Aparelho telefônico
	public void ligar(String numero) {
		System.out.println("Ligando para o número" + numero);
	}
	
	public void atender() {
		System.out.println("Chamada atendida");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Correio de voz iniciado");
	}
	
	
	// Navegador Internet
	
	public void exibirPagina(String url) {
		System.out.println("Pagina " + url + "acessada");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Nova aba aberta");
	}
	
	public void atualizarPagnia() {
		System.out.println("Página Atualizada");
	}
	
	// Reprodutor Musical
	
	public void tocar() {
		System.out.println("Tocando musica");
	}
	
	public void pausar() {
		System.out.println("Pausando musica");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("Musica " + musica + "selecionada");
	}
}
