package model;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.imageio.ImageIO;

public class Camada {
	
	private int colunasMapa;
	private int linhasMapa;
	private int tileAltura;
	private int tileLargura;
	private int camada[][];
	private int larguraMapa;
	private int alturaMapa;
	private BufferedImage tileSet;
	private BufferedImage mapa;
	private Graphics2D dbg;

	public Camada(String nomeMapaMatriz) {
		
		this.tileLargura = 32;
		this.tileAltura = 32;
		
		linhasMapa = 19;
		colunasMapa = 25;
		
		larguraMapa =  colunasMapa * tileLargura;
		alturaMapa = linhasMapa * tileAltura;
		
		mapa = new BufferedImage(larguraMapa, alturaMapa, BufferedImage.TYPE_4BYTE_ABGR);
		
		dbg = mapa.createGraphics();
		
		try {
			/*
			 * inicializa a imagem do tilset
			 */
			
			tileSet = ImageIO.read(getClass().getClassLoader().getResourceAsStream("res/tilesetJogo.png"));
			
		} catch (IOException e) {
			System.out.println("Não conseguiu ler o Tileset");
			e.printStackTrace();
		}
		
		camada = carregarMatriz(nomeMapaMatriz);
		
		montarMapa();

	}
	
	public void montarMapa() {

		int tile;
		int tileRow;
		int tileCol;
		int colunasTileSet=tileSet.getWidth()/tileLargura; //quantidade de colunas do seu tileset
		
		for (int i = 0; i < linhasMapa; i++) {
			for (int j = 0; j < colunasMapa; j++) {
				tile = (camada[i][j] != 0) ? (camada[i][j] - 1) : 82;
				tileRow = (tile / colunasTileSet) | 0;
				tileCol = (tile % colunasTileSet) | 0;
				dbg.drawImage(tileSet, (j * tileAltura), (i * tileLargura), (j * tileAltura) + tileAltura,
						(i * tileLargura) + tileLargura, (tileCol * tileAltura), (tileRow * tileLargura),
						(tileCol * tileAltura) + tileAltura, (tileRow * tileLargura) + tileLargura, null);

			}
		}
	}
	
	public List<Rectangle> montarColisao() {
		List<Rectangle> tmp = new ArrayList<Rectangle>();
		for (int i = 0; i < linhasMapa; i++) {
			for (int j = 0; j < colunasMapa; j++) {
				if(camada[i][j] != 0) {
					tmp.add(new Rectangle( (j * tileAltura), (i * tileLargura), tileLargura, tileAltura));
				}		
			}
		}
		return tmp;
	}
	
	public int[][] carregarMatriz(String nomeMapa) {
		int[][] matz = new int[linhasMapa][colunasMapa];

		InputStream input = getClass().getClassLoader().getResourceAsStream("res/"+nomeMapa);
		BufferedReader br = new BufferedReader(new InputStreamReader(input));

		List<String> linhas = new ArrayList<String>();
		String linha = "";

		try {
			while ((linha = br.readLine()) != null)
				linhas.add(linha);

			int coluna = 0;
			for (int i = 0; i < linhas.size(); i++) {
				StringTokenizer token = new StringTokenizer(linhas.get(i), ",");

				while (token.hasMoreElements()) {
					matz[i][coluna] = Integer.parseInt(token.nextToken());
					coluna++;
				}
				coluna = 0;
			}

		} catch (IOException e) {
			System.out.println("Não carregou Matriz");
			e.printStackTrace();
		}

		return matz;
	}
	
	public BufferedImage getMapa() {
		return mapa;
	}

	public int getLarguraMapa() {
		return larguraMapa;
	}
	
	public int getAlturaMapa() {
		return alturaMapa;
	}
	
}
