package controller;

import java.util.ArrayList;

import model.Cesto;
import model.GerenciarQuestoes;
import model.Personagem;
import model.Questao;
import model.Xml;
import view.FramePrincipal;
import view.FrameQuestoes;
import view.PanelQuestoes;

public class ControllerQuestoes {
	
	private FramePrincipal framePrincipal;
	private FrameQuestoes frameQuestoes;
	private PanelQuestoes panelQuestoes;
	private ControllerTelaQuestoes controllerTelaQuestoes;
	
	private int codigoFase;

	//private MontarQuestoes montarQuestoes;
	
	public ControllerQuestoes(FramePrincipal framePrincipal, FrameQuestoes frameQuestoes, int codigoFase) {
		this.framePrincipal = framePrincipal;
		this.frameQuestoes = frameQuestoes;
		this.panelQuestoes = frameQuestoes.getPanelQuestao();
		
		this.codigoFase = codigoFase;
		
		control();
	}
	
	public void control() {
		ArrayList<Questao> questoesTemp = GerenciarQuestoes.getInstance().pegarQuestoes();
		Questao questao = GerenciarQuestoes.getInstance().pegarQuestaoTemp(questoesTemp, codigoFase);
		System.out.println(questao);
		
		panelQuestoes.getLblEnunciado().setText(questao.getEnunciado());
		panelQuestoes.getRdbtOpUm().setText(questao.getOp1());
		panelQuestoes.getRdbtOpDois().setText(questao.getOp2());
		panelQuestoes.getRdbtOpTres().setText(questao.getOp3());
		
		controllerTelaQuestoes = new ControllerTelaQuestoes(framePrincipal, frameQuestoes, questao);
		frameQuestoes.setVisible(true);
		GerenciarQuestoes.getInstance().removerTemp(questoesTemp, codigoFase);
	}
}
