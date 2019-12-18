package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mudinha {
	
	private int x, y, largura, altura;
	private String caminho;
	private Rectangle rectangle;
	private BufferedImage imagem;
	private int codInimigo;
	
	private boolean isVisivel;
	
	public Mudinha(int x, int y, boolean isVisivel, int codInimigo) {
		this.x = x;
		this.y = y;
		this.largura = 20;
		this.altura = 23;
		this.caminho = "view/imagens/mudinha.png";
		
		this.isVisivel = isVisivel;
		this.codInimigo = codInimigo;
		
		try {
			imagem = ImageIO.read(getClass().getClassLoader().getResourceAsStream(caminho));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		rectangle = new Rectangle(x, y, largura, altura);
	}
	
	public void draw(Graphics g) {
		g.drawImage(getImagem(), getX(), getY(), null);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getLargura() {
		return largura;
	}

	public int getAltura() {
		return altura;
	}

	public String getCaminho() {
		return caminho;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public BufferedImage getImagem() {
		return imagem;
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public int getCodInimigo() {
		return codInimigo;
	}
	
}
