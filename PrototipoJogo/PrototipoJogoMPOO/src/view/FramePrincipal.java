package view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FramePrincipal extends JFrame{
	
	private PanelPrincipal panelPrincipal;
	private PanelConfig panelConfig;
	private PanelRanking panelRanking;
	private PanelSobre panelSobre;
	private PanelCreditos panelCreditos;
	private PanelControle panelControle;
	private PanelCadastrarPerguntas panelCadastrarPerguntas;
	private PanelListarExcluirPerguntas panelListarExcluirPerguntas;
	private PanelListarRespostasJogadores panelListarRespostasJogadores;
	
	private PanelEscolherJogador panelEscolherJogador;
	
	private PanelFases panelFase;
	private PanelFases panelFaseDois;
	
	private CardLayout cardLayout;
		
	public FramePrincipal() {
		
		cardLayout = new CardLayout();
		
		setSize(1000, 608);
		setLayout(cardLayout);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setUndecorated(true);
		
		panelPrincipal = new PanelPrincipal();
		panelConfig = new PanelConfig();
		panelRanking = new PanelRanking();
		panelSobre = new PanelSobre();
		panelCreditos = new PanelCreditos();
		panelControle = new PanelControle();
		panelCadastrarPerguntas = new PanelCadastrarPerguntas();
		panelListarExcluirPerguntas = new PanelListarExcluirPerguntas();
		panelListarRespostasJogadores = new PanelListarRespostasJogadores();
		panelEscolherJogador = new PanelEscolherJogador();
		panelFase = new PanelFases("imagens/barraLateral1.png");
		panelFaseDois = new PanelFases("imagens/barraLateral2.png");
		
		
		add(panelPrincipal, "pPrinci");
		add(panelConfig, "pConfig");
		add(panelRanking, "pRank");
		add(panelSobre, "pSbr");
		add(panelCreditos, "pCred");
		add(panelControle, "pContr");
		add(panelCadastrarPerguntas, "pCadPerg");
		add(panelListarExcluirPerguntas, "pListExcPerg");
		add(panelListarRespostasJogadores, "pListResp");
		add(panelEscolherJogador, "pEscJog");
		
		add(panelFase, "pfu");
		
		cardLayout.show(getContentPane(), "pPrinci");
		
		setVisible(true);
	}
	
	public void show(String indice) {
		cardLayout.show(getContentPane(), indice);
	}

	public PanelPrincipal getPanelPrincipal() {
		return panelPrincipal;
	}

	public PanelConfig getPanelConfig() {
		return panelConfig;
	}

	public PanelRanking getPanelRanking() {
		return panelRanking;
	}
	
	public PanelSobre getPanelSobre() {
		return panelSobre;
	}

	public PanelCreditos getPanelCreditos() {
		return panelCreditos;
	}

	public PanelControle getPanelControle() {
		return panelControle;
	}
	
	public PanelCadastrarPerguntas getPanelCadastrarPerguntas() {
		return panelCadastrarPerguntas;
	}
	
	public PanelListarExcluirPerguntas getPanelListarExcluirPerguntas() {
		return panelListarExcluirPerguntas;
	}

	public PanelFases getPanelFase() {
		return panelFase;
	}
	
	public PanelEscolherJogador getPanelEscolherJogador() {
		return panelEscolherJogador;
	}

	public PanelListarRespostasJogadores getPanelListarRespostasJogadores() {
		return panelListarRespostasJogadores;
	}
	

}
