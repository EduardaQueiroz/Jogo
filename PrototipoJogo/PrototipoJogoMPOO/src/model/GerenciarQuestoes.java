package model;

import java.util.ArrayList;

public class GerenciarQuestoes {
	
	private static GerenciarQuestoes uniqueInstance;
	
	private static Xml xml;
	public static Questao questao;
	
	private GerenciarQuestoes() {
		xml = new Xml();
		
	}
	
	public static synchronized GerenciarQuestoes getInstance() {
		if(uniqueInstance == null) {
			uniqueInstance = new GerenciarQuestoes();
		}
		return uniqueInstance;
	}
	
	public static void deletarQuestao(int codigo) {
		xml.remover(codigo);
	}
	
	public static void deletarPorIndice(int indice) {
		System.out.println(indice);
		ArrayList<Questao> questoesBanco = pegarQuestoes();
		xml.setQuestoes(questoesBanco);
		xml.removerPorIndice(indice);
	}
	
	public static Questao buscarQuestao(int codigo) {
		ArrayList<Questao> questoesBanco = pegarQuestoes();
		xml.setQuestoes(questoesBanco);
		questao = xml.buscar(codigo);
		return questao;
	}
	
	public static boolean salvarQuestao(Questao questao) {
		ArrayList<Questao> questoesBanco = pegarQuestoes();
		xml.setQuestoes(questoesBanco);
		xml.salvar(questao);
		return true;
	}
	
	public static ArrayList<Questao> pegarQuestoes() {
		ArrayList<Questao> questoesBanco = (ArrayList<Questao>) xml.ler();
		return questoesBanco;
	}
	
	public static void removerTemp(ArrayList<Questao> questoes, int cod){
		for(Questao questao : questoes) {
			if(questao.getFase() == cod) {
				questoes.remove(questao);
			}
		}
	}
	
	public static Questao pegarQuestaoTemp(ArrayList<Questao> questoes, int cod){
		for(Questao questao : questoes) {
			if(questao.getFase() == cod) {
				return questao;
			}
		}
		return null;
	}
	
	
}
