package model;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import controller.ControllerInimigo;
import controller.ControllerQuestoes;

public class Personagem extends Sprite {
	
	private ArrayList<Rectangle> inimigos = new ArrayList<>();
	
	private ControllerQuestoes controllerQuestoes;

	public Personagem(int aparencia, int largura, int altura, int colunas, int linhas, int x, int y, String endereco, ArrayList<Inimigo> inimigos) {
		super(aparencia, largura, altura, colunas, linhas, x, y, endereco);
		
		for(Inimigo inimigo : inimigos) {
			if(inimigo.isVisivel())
				this.inimigos.add(inimigo.getRectangle());
		}
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
		//System.out.println(direcao);
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
	
	// metodos para tratar colisão Y
	@Override
	public void setX(int x) {
		if (!collision(MontarFase.retangulosColisao, x - getX(), 0)) {
			//super.setX(x);// this.x = x;
			if(!collision(inimigos, x - getX(), 0)) {
				super.setX(x);
			}
		}
	}

	// metodos para tratar colisão X
	@Override
	public void setY(int y) {
		if (!collision(MontarFase.retangulosColisao, 0, y - getY())) {
			//super.setY(y);// this.y = y;
			if(!collision(inimigos, 0, y - getY())) {
				super.setY(y);
			}
		}
	}
}
