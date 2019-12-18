package model;

import java.util.ArrayList;

public class GerenciarRespostasJogadores {
	
	private static GerenciarRespostasJogadores uniqueInstance;
	private static XmlRespostas xml;
	
	public GerenciarRespostasJogadores() {
		xml = new XmlRespostas();
	}
	
	public static synchronized GerenciarRespostasJogadores getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new GerenciarRespostasJogadores();
		}
		return uniqueInstance;	
	}
	
	public static boolean salvarResposta(RespostaJogador resposta) {
		ArrayList<RespostaJogador> respostasBanco = pegarRespostas();
		xml.setRespostasJogadores(respostasBanco);
		xml.salvar(resposta);
		return true;
	}
	
	public static ArrayList<RespostaJogador> pegarRespostas() {
		ArrayList<RespostaJogador> respostasBanco = (ArrayList<RespostaJogador>) xml.ler();
		return respostasBanco;
	}
}
