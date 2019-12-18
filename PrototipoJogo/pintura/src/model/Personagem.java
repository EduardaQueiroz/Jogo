package model;

public class Personagem {
	
	private int px, py;

	public Personagem(int px, int py) {
		super();
		this.px = px;
		this.py = py;
	}
	
	
	public void andar(String direcao) {
		switch (direcao) {
		case "cima":{
			py--;
			break;
		}
		case "baixo":{
			py++;
			break;
		}
		case "direita":{
			px++;
			break;
		}
		case "esquerda":{
			px--;
			break;
		}

		default:
			break;
		}
		
	}
	
	
	public int getPx() {
		return px;
	}
	
	public int getPy() {
		return py;
	}
}
