package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import model.Personagem;
import view.Tela;

public class ControllerPersonagem extends KeyAdapter {
	
	private Personagem personagem;
	
	private Tela tela;
	
	
	
	public ControllerPersonagem(Personagem personagem, Tela tela) {
		super();
		this.personagem = personagem;
		this.tela = tela;
		control();
	}
	
	public void control() {
		tela.addKeyListener(this);
	}

	private static HashMap<Integer, String> direcoes = new HashMap<>();
	static{
		direcoes.put(KeyEvent.VK_W, "cima");
		direcoes.put(KeyEvent.VK_S, "baixo");
		direcoes.put(KeyEvent.VK_D, "direita");
		direcoes.put(KeyEvent.VK_A, "esquerda");
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		personagem.andar(direcoes.get(e.getKeyCode()));
		System.out.println("andasd");
	}
}
