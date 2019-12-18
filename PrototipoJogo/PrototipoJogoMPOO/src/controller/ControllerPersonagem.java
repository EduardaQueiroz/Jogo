package controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.HashMap;

import model.Cesto;
import model.Espantalho;
import model.Inimigo;
import model.GerenciarQuestoes;
import model.Mudinha;
import model.Personagem;
import view.FramePrincipal;
import view.FrameQuestoes;
import view.PanelFases;


public class ControllerPersonagem extends KeyAdapter {
	
	private Personagem personagem;
	private PanelFases panelFase; 
	
	private ArrayList<Cesto> cestos = new ArrayList<>();
	private ArrayList<Mudinha> mudinhas = new ArrayList<>();
	private ArrayList<Inimigo> inimigos = new ArrayList<>();
	private Espantalho espantalho;
	
	private int contadorCestos = 0;
	private int codigoFase;
	
	private ControllerQuestoes controllerQuestoes;
	private ControllerDesenharMapa controllerDesenharMapa;
	private FrameQuestoes frameQuestoes = new FrameQuestoes();
	private FramePrincipal framePrincipal;
	
	public ControllerPersonagem(FramePrincipal framePrincipal, PanelFases panelFase, Personagem personagem, ArrayList<Cesto> cestos, ArrayList<Mudinha> mudinhas, ArrayList<Inimigo> inimigos, Espantalho espantalho, ControllerDesenharMapa controllerDesenharMapa, int codigoFase) {
		super();
		this.personagem = personagem; 
		this.framePrincipal = framePrincipal;
		this.panelFase = panelFase;
		this.controllerDesenharMapa = controllerDesenharMapa;
		
		this.cestos = cestos;
		this.mudinhas = mudinhas;
		this.inimigos = inimigos;
		this.espantalho = espantalho;
		this.codigoFase = codigoFase;
		control();
	}
	
	public void control() {
		panelFase.addKeyListener(this);
		panelFase.requestFocus();
		
		if(personagem.getBounds().intersects(espantalho.getRectangle())) {
			if(contadorCestos == 3) {
				contadorCestos = 0;
				if(codigoFase == 1) {
					controllerDesenharMapa.stop();
					ControllerFases.abrirFaseDois();
				}else if(codigoFase == 2) {
					controllerDesenharMapa.stop();
					ControllerFases.abrirFaseTres();
				}else if (codigoFase == 3) {
					controllerDesenharMapa.stop();
					ControllerFases.abrirFaseQuatro();
				}
			}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		personagem.mover(direcoes.get(e.getKeyCode()));
		
		int codigo = e.getKeyCode();
		
		switch (codigo) {
		case KeyEvent.VK_UP:
			personagem.mover("cima");
			break;
			
		case KeyEvent.VK_DOWN:
			personagem.mover("baixo");
			break;
			
		case KeyEvent.VK_RIGHT:
			personagem.mover("direita");
			break;
		
		case KeyEvent.VK_LEFT:
			personagem.mover("esquerda");
			break;
			
		case KeyEvent.VK_ENTER:
			for(Mudinha mudinha : mudinhas) {
				if(personagem.getBounds().intersects(mudinha.getRectangle())) {
					for(Inimigo inimigo : inimigos) {
						if(mudinha.getCodInimigo() == inimigo.getCodigo()) {
							inimigo.setVisivel(false);
							inimigo.getRectangle().setBounds(0, 0, 0, 0);
						}
					}
					mudinha.setVisivel(false);
				}
			}
			
			for(Cesto cesto : cestos) {
				if(personagem.getBounds().intersects(cesto.getRectangle())) {
					controllerQuestoes = new ControllerQuestoes(framePrincipal, frameQuestoes, codigoFase);
					cesto.setVisivel(false);
					contadorCestos += 1;
					panelFase.getTxaCestosColetados().setText(contadorCestos+"/3");
				}
			}
			
		default:
			break;
		}
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		super.keyReleased(arg0);
	}

}
