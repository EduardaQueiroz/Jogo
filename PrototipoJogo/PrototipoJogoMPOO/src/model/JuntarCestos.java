package model;

import java.util.ArrayList;

public class JuntarCestos {
	
	private static ArrayList<Cesto> cestosFU = new ArrayList<>();
	private static ArrayList<Cesto> cestosFD = new ArrayList<>();
	private static ArrayList<Cesto> cestosFT = new ArrayList<>();
	private static ArrayList<Cesto> cestosFQ = new ArrayList<>();
	
	public static ArrayList<Cesto> criarCestosFU(){
		cestosFU.add(new Cesto(95, 350, true));
		cestosFU.add(new Cesto(700, 95, true));
		cestosFU.add(new Cesto(470, 540, true));
		return cestosFU;
	}
	
	public static ArrayList<Cesto> criarCestosFD(){
		cestosFD.add(new Cesto(410, 510, true));
		cestosFD.add(new Cesto(220, 90, true));
		cestosFD.add(new Cesto(630, 120, true));
		return cestosFD;
	}
	
	public static ArrayList<Cesto> criarCestosFT(){
		cestosFT.add(new Cesto(150, 510, true));
		cestosFT.add(new Cesto(460, 90, true));
		cestosFT.add(new Cesto(680, 530, true));
		return cestosFT;
	}
	
	public static ArrayList<Cesto> criarCestosFQ(){
		cestosFQ.add(new Cesto(95, 350, true));
		cestosFQ.add(new Cesto(200, 100, true));
		cestosFQ.add(new Cesto(500, 600, true));
		return cestosFQ;
	}

}
