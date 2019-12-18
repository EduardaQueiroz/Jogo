package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.GerenciarRespostasJogadores;
import model.Questao;
import model.RespostaJogador;
import view.Avisos;
import view.FramePrincipal;
import view.FrameQuestoes;
import view.PanelFases;
import view.PanelPrincipal;
import view.PanelQuestoes;

public class ControllerTelaQuestoes {
	
	private FramePrincipal framePrincipal;
	private PanelFases panelFases;
	private FrameQuestoes frameQuestoes;
	private PanelQuestoes panelQuestoes;
	
	private Questao questao;
	
	public ControllerTelaQuestoes(FramePrincipal framePrincipal, FrameQuestoes frameQuestoes, Questao questao) {
		this.framePrincipal = framePrincipal;
		this.panelFases = framePrincipal.getPanelFase();
		this.frameQuestoes = frameQuestoes;
		this.panelQuestoes = frameQuestoes.getPanelQuestao();
		this.questao = questao;
		
		control();
	}
	
	public void control() {
		panelQuestoes.getBtResponder().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(questao);
				
				String nomeJogador = framePrincipal.getPanelEscolherJogador().getTfNomeJogador().getText();
				String pergunta = questao.getEnunciado();
				System.out.println(pergunta);
				
				if(panelQuestoes.getRdbtOpUm().isSelected()) {
					String resposta = panelQuestoes.getRdbtOpUm().getText();
					RespostaJogador respostaJogador = new RespostaJogador(nomeJogador, resposta, pergunta);
					System.out.println("oi");
					GerenciarRespostasJogadores.getInstance().salvarResposta(respostaJogador);
					
				}else if(panelQuestoes.getRdbtOpDois().isSelected()) {
					String resposta = panelQuestoes.getRdbtOpDois().getText();
					RespostaJogador respostaJogador = new RespostaJogador(nomeJogador, resposta, pergunta);
					GerenciarRespostasJogadores.getInstance().salvarResposta(respostaJogador);
						
				}else if(panelQuestoes.getRdbtOpTres().isSelected()) {
					String resposta = panelQuestoes.getRdbtOpTres().getText();
					RespostaJogador respostaJogador = new RespostaJogador(nomeJogador, resposta, pergunta);
					GerenciarRespostasJogadores.getInstance().salvarResposta(respostaJogador);
				}else {
					Avisos.mensagemNadaSelecionado();
				}
				
				panelQuestoes.getRdbtOpUm().setSelected(false);
				panelQuestoes.getRdbtOpDois().setSelected(false);
				panelQuestoes.getRdbtOpTres().setSelected(false);
				frameQuestoes.setVisible(false);
				//panelQuestoes.setarDefault();
			}
		});
	}
	
	

}
