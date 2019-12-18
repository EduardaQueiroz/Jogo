package controller;

import java.awt.Rectangle;
import java.util.ArrayList;

import model.Cesto;
import model.Inimigo;
import model.MontarFase;
import model.Personagem;
import view.PanelFases;

public class ControllerInimigo {
	
	public  ArrayList<Inimigo> inimigos;
	private PanelFases tela; 
	
	public ControllerInimigo(ArrayList<Inimigo> inimigos, PanelFases tela) {
		this.inimigos = inimigos;
		this.tela = tela;
	
		new Movimento().start();
		
	}
	
	public class Movimento extends Thread{
		
		@Override
		public void run() {
			while(true) {
				try {
					sleep(90);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for(Inimigo inimigo : inimigos) {
					if(inimigo.isVisivel())
						inimigo.mover(inimigo.getDirecao());
				}
			}
		}
	}
}
