package controller;

import javax.swing.JFrame;

import model.Fase;
import view.Tela;

public class Controlador extends Thread{
	
	private Fase fase;
	private JFrame tela;
	
	public Controlador(Fase fase, JFrame tela) {
		this.fase = fase;
		this.tela = tela;
	}
	
	@Override
	public void run() {
		//super.run();
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tela.getGraphics().drawImage(fase.gerarIamgem(), 0, 0, null);
			tela.repaint();
		}
	}
	

}
