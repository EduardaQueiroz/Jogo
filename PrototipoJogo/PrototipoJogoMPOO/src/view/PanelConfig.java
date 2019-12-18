package view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelConfig extends JPanel{
	
	private JLabel lblBackground;
	
	private ImageIcon imgBackground, imgBtRanking, imgBtSobre, imgBtCreditos, imgBtControle, imgCadPerguntas, imgListarExcluirPerg, imgBtListarRespostas, imgBtVoltar;
	
	private JButton btRanking;
	private JButton btSobre;
	private JButton btCreditos;
	private JButton btControle;
	private JButton btCadPerguntas;
	private JButton btListarExcluirPerguntas, btListarRespostas;
	private JButton btVoltar;
	
	public PanelConfig() {
		
		setLayout(null);
		
		imgBackground = new ImageIcon(getClass().getResource("imagens/backConfig.png"));
		imgBtRanking = new ImageIcon(getClass().getResource("imagens/ranking.png"));
		imgBtSobre = new ImageIcon(getClass().getResource("imagens/sobre.png"));
		imgBtCreditos = new ImageIcon(getClass().getResource("imagens/creditos.png"));
		imgBtControle = new ImageIcon(getClass().getResource("imagens/controle.png"));
		imgCadPerguntas = new ImageIcon(getClass().getResource("imagens/cadastrarPerguntas.png"));
		imgListarExcluirPerg = new ImageIcon(getClass().getResource("imagens/listarExcluirPerg.png"));
		imgBtListarRespostas = new ImageIcon(getClass().getResource("imagens/listarRespostas.png"));
		imgBtVoltar = new ImageIcon(getClass().getResource("imagens/voltar.png"));
		
		btRanking = new JButton(imgBtRanking);
		btSobre = new JButton(imgBtSobre);
		btCreditos = new JButton(imgBtCreditos);
		btControle = new JButton(imgBtControle);
		btCadPerguntas = new JButton(imgCadPerguntas);
		btListarExcluirPerguntas = new JButton(imgListarExcluirPerg);
		btListarRespostas = new JButton(imgBtListarRespostas);
		btVoltar = new JButton(imgBtVoltar);
		
		btRanking.setBounds(250, 150, 200, 80);
		btSobre.setBounds(550, 150, 200, 80);
		btCreditos.setBounds(250, 250, 200, 80);
		btControle.setBounds(550, 250, 200, 80);
		btCadPerguntas.setBounds(250, 350, 200, 80);
		btListarExcluirPerguntas.setBounds(550, 350, 200, 80);
		btListarRespostas.setBounds(400, 450, 200, 80);
		btVoltar.setBounds(780, 520, 200, 80);
		
		add(btRanking);
		add(btSobre);
		add(btCreditos);
		add(btControle);
		add(btCadPerguntas);
		add(btListarExcluirPerguntas);
		add(btListarRespostas);
		add(btVoltar);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(imgBackground.getImage(), 0, 0, null);
	}

	public JButton getBtRanking() {
		return btRanking;
	}

	public JButton getBtSobre() {
		return btSobre;
	}

	public JButton getBtCreditos() {
		return btCreditos;
	}

	public JButton getBtControle() {
		return btControle;
	}
	
	public JButton getBtCadPerguntas() {
		return btCadPerguntas;
	}

	public JButton getBtListarExcluirPerguntas() {
		return btListarExcluirPerguntas;
	}

	public JButton getBtVoltar() {
		return btVoltar;
	}

	public JButton getBtListarRespostas() {
		return btListarRespostas;
	}
	
}
