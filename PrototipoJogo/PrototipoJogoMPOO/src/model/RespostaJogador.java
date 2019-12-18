package model;

public class RespostaJogador {
	
	private String nomeJogador;
	private String respostaMarcada;
	private String pergunta;
	
	public RespostaJogador(String nomeJogador, String respostaMarcada, String pergunta) {
		this.nomeJogador = nomeJogador;
		this.respostaMarcada = respostaMarcada;
		this.pergunta = pergunta;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public String getRespostaMarcada() {
		return respostaMarcada;
	}

	public void setRespostaMarcada(String respostaMarcada) {
		this.respostaMarcada = respostaMarcada;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	
	@Override
	public String toString() {
		return "Pergunta: " + pergunta + "// Resposta: " + respostaMarcada;
	}
}
