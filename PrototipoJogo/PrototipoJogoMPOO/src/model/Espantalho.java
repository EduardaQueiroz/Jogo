package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Espantalho {
	
	private int x, y, largura, altura;
	private String caminho;
	private Rectangle rectangle;
	private BufferedImage imagem;
	
	public Espantalho(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		this.largura = 33;
		this.altura = 49;
		this.caminho = "view/imagens/espantalho.png";
		
		
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

}
