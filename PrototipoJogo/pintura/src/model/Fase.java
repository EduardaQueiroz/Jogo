package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Fase {

	ArrayList<Camada> camadas = new ArrayList<>();
	
	private Personagem personagem;


	public Fase(ArrayList<Camada> camadas, Personagem personagem) {
		super();
		this.camadas = camadas;
		this.personagem = personagem;
	}

	public BufferedImage gerarIamgem() {
		BufferedImage faseImagem = new BufferedImage(camadas.get(0).getLarguraMapa(), camadas.get(0).getAlturaMapa(), BufferedImage.TYPE_4BYTE_ABGR);
		Graphics pincelFase = faseImagem.createGraphics();
		for(Camada camada : camadas) {
			pincelFase.drawImage(camada.getMapa(), 0, 0, null);
		}
		pincelFase.fillRect(personagem.getPx(),personagem.getPy(), 50, 50);
		return faseImagem;
	}

}
