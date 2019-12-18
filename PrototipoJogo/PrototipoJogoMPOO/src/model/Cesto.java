package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Cesto{

	private int x, y, largura, altura;
	private String caminho;
	private Rectangle rectangle;
	private BufferedImage imagem;
	
	private boolean isVisivel;
	
	public Cesto(int x, int y, boolean isVisivel) {
		super();
		this.x = x;
		this.y = y;
		this.largura = 32;
		this.altura = 32;
		this.caminho = "view/imagens/cesto.png";
		this.isVisivel = isVisivel;
		
		try {
			imagem = ImageIO.read(getClass().getClassLoader().getResourceAsStream(caminho));
		} catch (IOException e) {
			// TODO Auto-generated catch block
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
	
}
