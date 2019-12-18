package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import model.Camada;
import model.Cesto;
import model.Espantalho;
import model.Inimigo;
import model.JuntarCamadas;
import model.JuntarCestos;
import model.JuntarInimigos;
import model.JuntarMudinhas;
import model.MontarFase;
import model.GerenciarQuestoes;
import model.Mudinha;
import model.Personagem;
import view.FramePrincipal;
import view.PanelFases;

public class ControllerFases {
	
	private static FramePrincipal framePrincipal;
	
	private static PanelFases panelFase;
	
	private static ControllerPersonagem controllerPersonagem;
	private static ControllerInimigo controllerInimigo;
	private static ControllerDesenharMapa controllerDesenharMapa;
	
	private static String caminhoPersonagem;

	private static String nomeJogador;
	
	public ControllerFases() {
		
	}
	
	public ControllerFases(FramePrincipal framePrincipal, String caminhoPersonagem, String nomeJogador) {
		
		this.framePrincipal = framePrincipal;
		this.caminhoPersonagem = caminhoPersonagem;
		
		this.panelFase = framePrincipal.getPanelFase();
		
		this.nomeJogador = nomeJogador;
		
		control();
	}
	
	public static void abrirFaseUm() {
		framePrincipal.show("pfu");
		
		panelFase.getTxaNomeJogador().setText(nomeJogador);
		
		ArrayList<Camada> camadas = JuntarCamadas.criarCamadasFU();
		ArrayList<Cesto> cestos = JuntarCestos.criarCestosFU();
		ArrayList<Mudinha> mudinhas = JuntarMudinhas.criarMudinhasFU();
		ArrayList<Inimigo> inimigos = JuntarInimigos.criarInimigosFU();
		
		Personagem personagem = new Personagem(7, 143, 192, 3, 4, 40, 185, caminhoPersonagem, inimigos);
		Espantalho espantalho = new Espantalho(730, 345);
		
		MontarFase mapaFaseUm = new MontarFase(camadas, personagem, cestos, inimigos, mudinhas, espantalho);
		
		controllerDesenharMapa = new ControllerDesenharMapa(mapaFaseUm, panelFase);
		controllerDesenharMapa.start();
		
		controllerPersonagem = new ControllerPersonagem(framePrincipal, panelFase, personagem, cestos, mudinhas, inimigos, espantalho, controllerDesenharMapa, 1);
		controllerInimigo = new ControllerInimigo(inimigos, panelFase);
		
	}
	
	public static void abrirFaseDois() {
		framePrincipal.show("pfu");
		
		panelFase.getTxaNomeJogador().setText(nomeJogador);
		
		ArrayList<Camada> camadas = JuntarCamadas.criarCamadasFD();
		ArrayList<Cesto> cestos = JuntarCestos.criarCestosFD();
		ArrayList<Mudinha> mudinhas = JuntarMudinhas.criarMudinhasFD();
		ArrayList<Inimigo> inimigos = JuntarInimigos.criarInimigosFD();
		
		Personagem personagem = new Personagem(10, 143, 192, 3, 4, 170, 510, caminhoPersonagem, inimigos);
		Espantalho espantalho = new Espantalho(340, 60);
		
		MontarFase mapaFaseDois = new MontarFase(camadas, personagem, cestos, inimigos, mudinhas, espantalho);
		
		controllerDesenharMapa = new ControllerDesenharMapa(mapaFaseDois, panelFase);
		controllerDesenharMapa.start();
		
		controllerPersonagem = new ControllerPersonagem(framePrincipal, panelFase, personagem, cestos, mudinhas, inimigos, espantalho, controllerDesenharMapa, 2);
		controllerInimigo = new ControllerInimigo(inimigos, panelFase);
	}
	
	public static void abrirFaseTres() {
		framePrincipal.show("pfu");
		
		ArrayList<Camada> camadas = JuntarCamadas.criarCamadasFT();
		ArrayList<Cesto> cestos = JuntarCestos.criarCestosFT();
		ArrayList<Mudinha> mudinhas = JuntarMudinhas.criarMudinhasFT();
		ArrayList<Inimigo> inimigos = JuntarInimigos.criarInimigosFT();
		
		Personagem personagem = new Personagem(4, 143, 192, 3, 4, 700, 60, caminhoPersonagem, inimigos);
		Espantalho espantalho = new Espantalho(60, 60);
		
		MontarFase mapaFaseDois = new MontarFase(camadas, personagem, cestos, inimigos, mudinhas, espantalho);
		
		controllerDesenharMapa = new ControllerDesenharMapa(mapaFaseDois, panelFase);
		controllerDesenharMapa.start();
		
		controllerPersonagem = new ControllerPersonagem(framePrincipal, panelFase, personagem, cestos, mudinhas, inimigos, espantalho, controllerDesenharMapa, 3);
		controllerInimigo = new ControllerInimigo(inimigos, panelFase);
	}
	
	public static void abrirFaseQuatro() {
		ArrayList<Camada> camadas = JuntarCamadas.criarCamadasFQ();
		ArrayList<Cesto> cestos = JuntarCestos.criarCestosFQ();
		ArrayList<Mudinha> mudinhas = JuntarMudinhas.criarMudinhasFQ();
		ArrayList<Inimigo> inimigos = JuntarInimigos.criarInimigosFQ();
		
		Personagem personagem = new Personagem(10, 143, 192, 3, 4, 170, 510, caminhoPersonagem, inimigos);
		Espantalho espantalho = new Espantalho(340, 60);
		
		MontarFase mapaFaseDois = new MontarFase(camadas, personagem, cestos, inimigos, mudinhas, espantalho);
		
		controllerDesenharMapa = new ControllerDesenharMapa(mapaFaseDois, panelFase);
		controllerDesenharMapa.start();
		
		controllerPersonagem = new ControllerPersonagem(framePrincipal, panelFase, personagem, cestos, mudinhas, inimigos, espantalho, controllerDesenharMapa, 4);
		controllerInimigo = new ControllerInimigo(inimigos, panelFase);
	}
	
	public void control() {
		panelFase.getBtSair().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controllerDesenharMapa.stop();
				framePrincipal.show("pPrinci");
			}
		});
	}

}
