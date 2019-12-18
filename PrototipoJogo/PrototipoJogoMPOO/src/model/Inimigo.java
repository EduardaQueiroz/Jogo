package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.List;

public class Inimigo extends Sprite{
	
	private String direcao;
	private boolean isVisivel;
	private Rectangle rectangle;
	private int codigo;
	
	public Inimigo(int aparencia, int largura, int altura, int colunas, int linhas, int x, int y, String endereco, String direcao, boolean isVisivel, int codigo) {
		super(aparencia, largura, altura, colunas, linhas, x, y, endereco);
		this.direcao = direcao;
		this.isVisivel = isVisivel;
		this.codigo = codigo;
		
		rectangle = new Rectangle(x, y, largura, altura);
	}

	@Override
	public void animar(String direcao) {
		setAparencia(getAparencia() + 1);

		switch (direcao) {
		case "baixo":
			if (getAparencia() > 2)
				setAparencia(0);
			break;

		case "cima":
			if (getAparencia() > 11 || getAparencia() < 9)
				setAparencia(9);
			break;
			
		case "direita":
			if(getAparencia() > 8 || getAparencia() < 6)
				setAparencia(6);			
			break;
		
		case "esquerda":
			if(getAparencia() > 5 || getAparencia() < 3)
				setAparencia(3);			
			break;

		default:
			break;
		}
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(getSprites()[getAparencia()], getX(), getY(), null);
	}

	@Override
	public void mover(String direcao) {
		switch (direcao) {
		case "cima":
			setY(getY() - 5);
			break;
		case "baixo":
			setY(getY() + 5);
			break;
		case "esquerda":
			setX(getX() - 5);
			break;
		case "direita":
			setX(getX() + 5);
			break;
		}
		
		if (!direcao.equals(""))
			animar(direcao);
	}
	
	// metodos para tratar colisão
	public boolean collision(List<Rectangle> tmp, int x, int y) {
		Rectangle personagem = new Rectangle(getX() + x, getY() + y, getLarguraPersonagem(), getAlturaPersonagem());
		for (Rectangle rectangle : tmp) {
			if (rectangle.intersects(personagem)) {
				return true;
			}
		}
		return false;
	}
	
	public void trocarDirecao() {
		switch (this.direcao) {
		case "baixo":
			this.direcao = "cima";
			break;

		case "cima":
			this.direcao = "baixo";
			break;
			
		case "direita":
			this.direcao = "esquerda";			
			break;
		
		case "esquerda":
			this.direcao = "direita";	
			break;

		default:
			break;
		}

	}

		// metodos para tratar colisão Y
		@Override
	public void setX(int x) {
		if (!collision(MontarFase.retangulosColisao, x - getX(), 0))
			super.setX(x);// this.x = x;
		else
			trocarDirecao();
	}

		// metodos para tratar colisão X
		@Override
	public void setY(int y) {
		if (!collision(MontarFase.retangulosColisao, 0, y - getY()))
			super.setY(y);// this.y = y;
		else
			trocarDirecao();
	}

	public boolean isVisivel() {
		return isVisivel;
	}

	public void setVisivel(boolean isVisivel) {
		this.isVisivel = isVisivel;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public int getCodigo() {
		return codigo;
	}
	
	public String getDirecao() {
		return direcao;
	}
}


