package controller;

import javax.swing.JPanel;

import model.MontarFase;
import view.PanelFases;

public class ControllerDesenharMapa extends Thread{
	
	private MontarFase fase;
	private PanelFases panel;
	
	public ControllerDesenharMapa(MontarFase fase, PanelFases panel) {
		this.fase = fase;
		this.panel = panel;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			panel.getGraphics().drawImage(fase.gerarImagem(), 0, 0, null);
//			panel.repaint();
		}
	}
	
	

}
