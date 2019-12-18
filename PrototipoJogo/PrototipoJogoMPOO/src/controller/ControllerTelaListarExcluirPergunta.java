package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GerenciarQuestoes;
import view.FramePrincipal;
import view.PanelListarExcluirPerguntas;

public class ControllerTelaListarExcluirPergunta {
	
	private FramePrincipal framePrincipal;
	private PanelListarExcluirPerguntas panelListarExcluirPerguntas;
	
	public ControllerTelaListarExcluirPergunta(FramePrincipal framePrincipal) {
		this.framePrincipal = framePrincipal;
		this.panelListarExcluirPerguntas = framePrincipal.getPanelListarExcluirPerguntas();
		control();
	}
	
	public void control() {
		panelListarExcluirPerguntas.getBtVoltar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				framePrincipal.show("pConfig");
			}
		});
		
		panelListarExcluirPerguntas.getBtExcluir().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("oi, estou no controlador");
				int qtdQuestoes = GerenciarQuestoes.pegarQuestoes().size();
				System.out.println(qtdQuestoes);
				int i = 0;
				while(i < qtdQuestoes) {
					System.out.println("oi de novo");
					if(panelListarExcluirPerguntas.getCbQuestaoExcluir().getSelectedIndex() == i) {
						System.out.println(i);
						GerenciarQuestoes.getInstance().deletarPorIndice(i);
						break;
					}
					
					i += 1;
						
				}
				panelListarExcluirPerguntas.getTxaListarQuestoes().setText("");
				panelListarExcluirPerguntas.getCbQuestaoExcluir().removeAllItems();
				ControllerTelaPrincipal.listarPerguntas();
			}
		});
	}

}
