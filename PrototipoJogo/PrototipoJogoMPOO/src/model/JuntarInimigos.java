package model;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class JuntarInimigos {
	
	private static ArrayList<Inimigo> inimigosFU = new ArrayList<>();
	private static ArrayList<Inimigo> inimigosFD = new ArrayList<>();
	private static ArrayList<Inimigo> inimigosFT = new ArrayList<>();
	private static ArrayList<Inimigo> inimigosFQ = new ArrayList<>();
	
	public static ArrayList<Inimigo> criarInimigosFU(){
		inimigosFU.add(new Inimigo(5, 142, 196, 3, 4, 600, 200, "view/imagens/inimigo.png", "cima", true, 1) );
		inimigosFU.add(new Inimigo(5, 142, 196, 3, 4, 400, 500, "view/imagens/inimigo.png", "direita", true, 2));
		inimigosFU.add(new Inimigo(5, 142, 196, 3, 4, 230, 400, "view/imagens/inimigo.png", "cima", true, 3));
		return inimigosFU;
	}
	
	public static ArrayList<Inimigo> criarInimigosFD(){
		inimigosFD.add(new Inimigo(5, 142, 196, 3, 4, 90, 180, "view/imagens/inimigo.png", "cima", true, 1));
		inimigosFD.add(new Inimigo(5, 142, 196, 3, 4, 300, 340, "view/imagens/inimigo.png", "direita", true, 2));
		inimigosFD.add(new Inimigo(5, 142, 196, 3, 4, 700, 270, "view/imagens/inimigo.png", "esquerda", true, 3));
		return inimigosFD;
	}

	public static ArrayList<Inimigo> criarInimigosFT(){
		inimigosFT.add(new Inimigo(5, 142, 196, 3, 4, 400, 210, "view/imagens/inimigo.png", "direita", true, 1));
		inimigosFT.add(new Inimigo(5, 142, 196, 3, 4, 40, 370, "view/imagens/inimigo.png", "direita", true, 2));
		inimigosFT.add(new Inimigo(5, 142, 196, 3, 4, 600, 500, "view/imagens/inimigo.png", "cima", true, 3));
		return inimigosFT;
	}

	public static ArrayList<Inimigo> criarInimigosFQ(){
		inimigosFQ.add(new Inimigo(5, 142, 196, 3, 4, 200, 200, "view/imagens/inimigo.png", "", true, 1));
		inimigosFQ.add(new Inimigo(5, 142, 196, 3, 4, 200, 200, "view/imagens/inimigo.png", "", true, 2));
		inimigosFQ.add(new Inimigo(5, 142, 196, 3, 4, 200, 200, "view/imagens/inimigo.png", "", true, 3));
		return inimigosFQ;
	}
	
}
