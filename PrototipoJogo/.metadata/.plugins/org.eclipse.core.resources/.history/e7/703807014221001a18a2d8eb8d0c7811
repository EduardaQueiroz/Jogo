package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.GerenciarQuestoes;
import model.Questao;
import view.Avisos;
import view.FramePrincipal;
import view.PanelCadastrarPerguntas;

public class ControllerTelaCadPerguntas {
	
	private FramePrincipal framePrincipal;
	private PanelCadastrarPerguntas panelCadastrarPerguntas;
	
	public ControllerTelaCadPerguntas(FramePrincipal framePrincipal) {
		this.framePrincipal = framePrincipal;
		this.panelCadastrarPerguntas = framePrincipal.getPanelCadastrarPerguntas();
		control();
	}
	
	public void control() {
		panelCadastrarPerguntas.getBtSalvar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String enunciado = panelCadastrarPerguntas.getTxaPergunta().getText();
				String op1 = panelCadastrarPerguntas.getTfOpUm().getText();
				String op2 = panelCadastrarPerguntas.getTfOpDois().getText();
				String op3 = panelCadastrarPerguntas.getTfOpTres().getText();
				int fase = 0;
				String respostaCerta = "";
				
				if(panelCadastrarPerguntas.getCbFase().getSelectedItem().equals("Briófitas")) {
					fase = 1;
				}else if(panelCadastrarPerguntas.getCbFase().getSelectedItem().equals("Pteridófitas")) {
					fase = 2;
				}else if(panelCadastrarPerguntas.getCbFase().getSelectedItem().equals("Gimnospermas")) {
					fase = 3;
				}else {
					fase = 4;
				}
				
				if(panelCadastrarPerguntas.getCbRespostaCerta().getSelectedItem().equals("Opção 1")) {
					respostaCerta = op1;
				}else if(panelCadastrarPerguntas.getCbRespostaCerta().getSelectedItem().equals("Opção 2")) {
					respostaCerta = op2;
				}else{
					respostaCerta = op3;
				}
				
				if(enunciado.equalsIgnoreCase("") || op1.equalsIgnoreCase("") || op2.equalsIgnoreCase("") || op3.equalsIgnoreCase("")) {
					Avisos.messagemCamposVazios();
				}else {
					Questao questao = new Questao(enunciado, op1, op2, op3, fase, respostaCerta);
					GerenciarQuestoes.getInstance().salvarQuestao(questao);
					ControllerTelaPrincipal.verificarComboBox();
					
					panelCadastrarPerguntas.getTxaPergunta().setText("");
					panelCadastrarPerguntas.getTfOpUm().setText("");
					panelCadastrarPerguntas.getTfOpDois().setText("");
					panelCadastrarPerguntas.getTfOpTres().setText("");
				}
			}
		});
		
		panelCadastrarPerguntas.getBtVoltar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				framePrincipal.show("pConfig");
			}
		});
		
	}
	
	

}
