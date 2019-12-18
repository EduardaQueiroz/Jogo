package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.Avisos;
import view.FramePrincipal;
import view.PanelEscolherJogador;

public class ControllerEscolherPersonagem implements MouseListener{
	
	private FramePrincipal framePrincipal;
	private PanelEscolherJogador panelEscolherJogador;
	private ControllerFases controllerFases;
	private String caminhoPersonagem;
	private String nomeJogador;
	
	public ControllerEscolherPersonagem(FramePrincipal framePrincipal) {
		this.framePrincipal = framePrincipal;
		this.panelEscolherJogador = framePrincipal.getPanelEscolherJogador();
		
		control();
	}
	
	public void control() {
		
		panelEscolherJogador.getLblPersoMenina().addMouseListener(this);
		panelEscolherJogador.getLblPersoMenino().addMouseListener(this);
		
		panelEscolherJogador.getBtJogar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				nomeJogador = panelEscolherJogador.getTfNomeJogador().getText();
				
				if(panelEscolherJogador.getLblMoldura().isVisible() || panelEscolherJogador.getLblMoldura2().isVisible()) {
					controllerFases = new ControllerFases(framePrincipal, caminhoPersonagem, nomeJogador);
					controllerFases.abrirFaseUm();
				}else {
					panelEscolherJogador.requestFocus();
					Avisos.avisoTelaPersonagem();
				}
				
			}
		});
		
		panelEscolherJogador.getBtVoltar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				framePrincipal.show("pPrinci");
				
			}
		});
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource() == panelEscolherJogador.getLblPersoMenina()) {
			caminhoPersonagem = "view/imagens/persoMenina.png";
			panelEscolherJogador.getLblMoldura().setVisible(true);
			panelEscolherJogador.getLblMoldura2().setVisible(false);
			
		}
		
		if(e.getSource() == panelEscolherJogador.getLblPersoMenino()) {
			System.out.println("oi");
			caminhoPersonagem = "view/imagens/persoMenino.png";
			panelEscolherJogador.getLblMoldura2().setVisible(true);
			panelEscolherJogador.getLblMoldura().setVisible(false);
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

}
