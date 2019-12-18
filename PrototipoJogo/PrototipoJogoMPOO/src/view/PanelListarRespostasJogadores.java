package view;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelListarRespostasJogadores extends JPanel {
	
	private JTextArea txaListarRespostas;
	private JTextField tfEscolha;
	private JComboBox<String> cbJogador;
	private JButton btListar, btVoltar;
	
	private ImageIcon imgBack, imgBtListar, imgBtVoltar;
	
	public PanelListarRespostasJogadores() {
		setLayout(null);
		
		imgBtListar = new ImageIcon(getClass().getResource("imagens/listar.png"));
		imgBack = new ImageIcon(getClass().getResource("imagens/backTelaListarRespostas.png"));
		imgBtVoltar = new ImageIcon(getClass().getResource("imagens/voltar.png"));
		
		txaListarRespostas = new JTextArea(12, 3);
		tfEscolha = new JTextField("  Selecione um jogador:");
		cbJogador = new JComboBox<>();
		btListar = new JButton(imgBtListar);
		btVoltar = new JButton(imgBtVoltar);
		
		tfEscolha.setFont(new Font("Times new Roman", Font.BOLD, 20));
		tfEscolha.setEditable(false);
		
		txaListarRespostas.setFont(new Font("Times new Roman", Font.BOLD, 20));
		txaListarRespostas.setEditable(false);
		
		txaListarRespostas.setBounds(100, 160, 800, 380);
		tfEscolha.setBounds(210, 120, 220, 30);
		cbJogador.setBounds(440, 120, 200, 30);
		btListar.setBounds(650, 120, 100, 30);
		btVoltar.setBounds(750, 545, 200, 50);
		
		txaListarRespostas.setEditable(false);
		
		add(txaListarRespostas);
		add(tfEscolha);
		add(cbJogador);
		add(btListar);
		add(btVoltar);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(imgBack.getImage(), 0, 0, null);
	}

	public JTextArea getTxaListarRespostas() {
		return txaListarRespostas;
	}

	public JTextField getTfEscolha() {
		return tfEscolha;
	}

	public JComboBox<String> getCbJogador() {
		return cbJogador;
	}

	public JButton getBtListar() {
		return btListar;
	}

	public JButton getBtVoltar() {
		return btVoltar;
	}
	
}
