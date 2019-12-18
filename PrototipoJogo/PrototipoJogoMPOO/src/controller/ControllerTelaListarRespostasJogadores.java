package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.GerenciarRespostasJogadores;
import model.RespostaJogador;
import view.FramePrincipal;
import view.PanelListarRespostasJogadores;

public class ControllerTelaListarRespostasJogadores {
	
	private FramePrincipal framePrincipal;
	private static PanelListarRespostasJogadores panelListarRespostasJogadores;
	
	public ControllerTelaListarRespostasJogadores(FramePrincipal framePrincipal) {
		this.framePrincipal = framePrincipal;
		this.panelListarRespostasJogadores = framePrincipal.getPanelListarRespostasJogadores();
		control();
	}
	
	public void control() {
		
		addItemComboBoxJogador();
		
		panelListarRespostasJogadores.getBtVoltar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				framePrincipal.show("pConfig");
			}
		});
		
		panelListarRespostasJogadores.getBtListar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String jogador = (String) panelListarRespostasJogadores.getCbJogador().getSelectedItem();
				ArrayList<RespostaJogador> respostas = GerenciarRespostasJogadores.getInstance().pegarRespostas();
				for(RespostaJogador resposta : respostas) {
					if(resposta.getNomeJogador() == jogador)
						panelListarRespostasJogadores.getTxaListarRespostas().setText(resposta.toString());
				}
				
			}
		});
		
	}
	
	public static void addItemComboBoxJogador() {
		
		
		ArrayList<RespostaJogador> respostas = GerenciarRespostasJogadores.getInstance().pegarRespostas();
		
		for(RespostaJogador resposta : respostas) {
			if(panelListarRespostasJogadores.getCbJogador().getItemCount() == 0){
				panelListarRespostasJogadores.getCbJogador().addItem(resposta.getNomeJogador());
			}else {
				int i = 0;
				while(i < panelListarRespostasJogadores.getCbJogador().getItemCount()) {
					if (panelListarRespostasJogadores.getCbJogador().getItemAt(i) == resposta.getNomeJogador()) {
						i += 1;
					}else {
						panelListarRespostasJogadores.getCbJogador().addItem(resposta.getNomeJogador());
						i += 1;
					}	
				}
				
				
			}
		}
	}
}