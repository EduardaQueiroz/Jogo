package model;

import java.util.ArrayList;

public class JuntarCamadas {
	
	private static ArrayList<Camada> camadasFU = new ArrayList<>();
	private static ArrayList<Camada> camadasFD = new ArrayList<>();
	private static ArrayList<Camada> camadasFT = new ArrayList<>();
	private static ArrayList<Camada> camadasFQ = new ArrayList<>();
	
	public static ArrayList<Camada> criarCamadasFU(){
		camadasFU.add(new Camada("camadaPisoFaseUm.txt"));
		camadasFU.add(new Camada("camadaColisaoFaseUm.txt"));
		camadasFU.add(new Camada("camadaColisaoCimaFaseUm.txt"));
		camadasFU.add(new Camada("camadaArvoreCimaFaseUm.txt"));
		return camadasFU;
	}
	
	public static ArrayList<Camada> criarCamadasFD(){
		camadasFD.add(new Camada("camadaPisoFaseDois.txt"));
		camadasFD.add(new Camada("camadaColisaoFaseDois.txt"));
		camadasFD.add(new Camada("camadaArvoreCimaFaseDois.txt"));
		return camadasFD;
	}
	
	public static ArrayList<Camada> criarCamadasFT(){
		camadasFT.add(new Camada("camadaPisoFaseTres.txt"));
		camadasFT.add(new Camada("camadaColisaoFaseTres.txt"));
		camadasFT.add(new Camada("camadaColisaoCimaFaseTres.txt"));
		camadasFT.add(new Camada("camadaArvoreCimaFaseTres.txt"));
		return camadasFT;
	}
	
	public static ArrayList<Camada> criarCamadasFQ(){
		camadasFQ.add(new Camada("camadaPisoFaseQuatro.txt"));
		camadasFQ.add(new Camada("camadaColisaoFaseQuatro.txt"));
		camadasFQ.add(new Camada("camadaColisaoCimaFaseQuatro.txt"));
		camadasFQ.add(new Camada("camadaArvoreCimaFaseQuatro.txt"));
		return camadasFQ;
	}

}
