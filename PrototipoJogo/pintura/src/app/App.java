package app;

import java.util.ArrayList;

import controller.Controlador;
import controller.ControllerPersonagem;
import model.Camada;
import model.Fase;
import model.Personagem;
import view.Tela;

public class App {

	public static void main(String[] args) {
		ArrayList<Camada> camadas = new ArrayList<>();
		camadas.add(new Camada("camadaPisoFaseUm.txt"));
		camadas.add(new Camada("camadaColisaoFaseUm.txt"));
		camadas.add(new Camada("camadaColisaoCimaFaseUm.txt"));
		camadas.add(new Camada("camadaArvoreCimaFaseUm.txt"));
		
		Personagem personagem = new Personagem(100, 100);
		Fase fase = new Fase(camadas, personagem );
		Tela tela = new Tela();
		
		Controlador controlador = new Controlador(fase, tela);
		controlador.start();
		new ControllerPersonagem(personagem, tela);
	}
	
}
