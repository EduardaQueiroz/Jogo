package model;

import java.util.ArrayList;

public class JuntarMudinhas {
	
	private static ArrayList<Mudinha> mudinhasFU = new ArrayList<>();
	private static ArrayList<Mudinha> mudinhasFD = new ArrayList<>();
	private static ArrayList<Mudinha> mudinhasFT = new ArrayList<>();
	private static ArrayList<Mudinha> mudinhasFQ = new ArrayList<>();
	
	public static ArrayList<Mudinha> criarMudinhasFU(){
		mudinhasFU.add(new Mudinha(470, 300, true, JuntarInimigos.criarInimigosFU().get(0).getCodigo()));
		mudinhasFU.add(new Mudinha(450, 80, true, JuntarInimigos.criarInimigosFU().get(1).getCodigo()));
		mudinhasFU.add(new Mudinha(570, 530, true, JuntarInimigos.criarInimigosFU().get(2).getCodigo()));
		return mudinhasFU;
	}
	
	public static ArrayList<Mudinha> criarMudinhasFD(){
		mudinhasFD.add(new Mudinha(70, 380, true, JuntarInimigos.criarInimigosFD().get(0).getCodigo()));
		mudinhasFD.add(new Mudinha(520, 60, true, JuntarInimigos.criarInimigosFD().get(1).getCodigo()));
		mudinhasFD.add(new Mudinha(530, 510, true, JuntarInimigos.criarInimigosFD().get(2).getCodigo()));
		return mudinhasFD;
	}
	
	public static ArrayList<Mudinha> criarMudinhasFT(){
		mudinhasFT.add(new Mudinha(360, 500, true, JuntarInimigos.criarInimigosFD().get(0).getCodigo()));
		mudinhasFT.add(new Mudinha(280, 70, true, JuntarInimigos.criarInimigosFD().get(1).getCodigo()));
		mudinhasFT.add(new Mudinha(640, 350, true, JuntarInimigos.criarInimigosFD().get(2).getCodigo()));
		return mudinhasFT;
	}
	
	public static ArrayList<Mudinha> criarMudinhasFQ(){
		mudinhasFQ.add(new Mudinha(100, 200, true, JuntarInimigos.criarInimigosFD().get(0).getCodigo()));
		mudinhasFQ.add(new Mudinha(100, 200, true, JuntarInimigos.criarInimigosFD().get(1).getCodigo()));
		mudinhasFQ.add(new Mudinha(100, 200, true, JuntarInimigos.criarInimigosFD().get(2).getCodigo()));
		return mudinhasFQ;
	}

}
