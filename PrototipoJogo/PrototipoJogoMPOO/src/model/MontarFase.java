package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class MontarFase {

	ArrayList<Camada> camadas = new ArrayList<>();
	ArrayList<Cesto> cestos = new ArrayList<>();
	ArrayList<Inimigo> inimigos = new ArrayList<>();
	ArrayList<Mudinha> mudinhas = new ArrayList<>();
	public static ArrayList<Rectangle> retangulosColisao;
	
	private Personagem personagem;
	private Espantalho espantalho;
	BufferedImage faseImagem;
	Graphics pincelFase;
	
	public MontarFase(ArrayList<Camada> camadas, Personagem personagem, ArrayList<Cesto> cestos, ArrayList<Inimigo> inimigos, ArrayList<Mudinha> mudinhas, Espantalho espantalho) {
		super();
		this.camadas = camadas;
		this.personagem = personagem;
		this.inimigos = inimigos;
		this.cestos = cestos;
		this.mudinhas = mudinhas;
		this.espantalho = espantalho;
		
		faseImagem = new BufferedImage(camadas.get(0).getLarguraMapa(), camadas.get(0).getAlturaMapa(), BufferedImage.TYPE_4BYTE_ABGR);
		pincelFase = faseImagem.createGraphics();
		
		retangulosColisao = (ArrayList<Rectangle>) camadas.get(1).montarColisao();
		retangulosColisao.addAll(camadas.get(2).montarColisao());
	}

	public BufferedImage gerarImagem() {
		for(Camada camada : camadas) {
			pincelFase.drawImage(camada.getMapa(), 0, 0, null);
		}
		
		for(Cesto cesto : cestos) {
			if(cesto.isVisivel())
				cesto.draw(pincelFase);
		}
		
		for(Mudinha mudinha : mudinhas) {
			if(mudinha.isVisivel())
				mudinha.draw(pincelFase);
		}
	
		personagem.draw(pincelFase);
		
		for(Inimigo inimigo : inimigos) {
			if(inimigo.isVisivel())
				inimigo.draw(pincelFase);
		}
		
		espantalho.draw(pincelFase);
		
//		pincelFase.fillRect(personagem.getPx(),personagem.getPy(), 50, 50);
		return faseImagem;
	}

}
