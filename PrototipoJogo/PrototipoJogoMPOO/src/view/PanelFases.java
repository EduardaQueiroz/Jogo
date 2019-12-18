package view;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelFases extends JPanel{
	
	private ImageIcon imgBarraLateral, imgBtSair;
	
	private JTextArea txaNomeJogador, txaCestosColetados;
	//private String caminhoImgBarraLateral;
	
	private JButton btSair;
	
	public PanelFases(String caminhoImgBarraLateral) {
		
		setLayout(null);
		
		imgBarraLateral = new ImageIcon(getClass().getResource(caminhoImgBarraLateral));
		imgBtSair = new ImageIcon(getClass().getResource("imagens/sairMenor.png"));
		
		txaNomeJogador = new JTextArea("");
		txaNomeJogador.setEditable(false);
		txaNomeJogador.setFont(new Font("Times new Roman", Font.BOLD, 20));
		
		txaCestosColetados = new JTextArea("0/3");
		txaCestosColetados.setEditable(false);
		txaCestosColetados.setFont(new Font("Times new Roman", Font.BOLD, 20));
		
		btSair = new JButton(imgBtSair);
		
		txaNomeJogador.setOpaque(false);
		txaCestosColetados.setOpaque(false);
		
		txaNomeJogador.setBounds(860, 190, 300, 100);
		txaCestosColetados.setBounds(885, 272, 300, 100);
		
		btSair.setBounds(870, 500, 50, 50);
		
		add(txaNomeJogador);
		add(txaCestosColetados);
		add(btSair);
		
	}
	
	protected void paintComponent(Graphics g) {
		g.drawImage(imgBarraLateral.getImage(), 800, 0, null);
	}
	
	public JButton getBtSair() {
		return btSair;
	}

	public JTextArea getTxaNomeJogador() {
		return txaNomeJogador;
	}

	public JTextArea getTxaCestosColetados() {
		return txaCestosColetados;
	}

	public void setImgBarraLateral(String novoCaminho) {
		ImageIcon novaImagemBarraLateral = new ImageIcon(getClass().getResource(novoCaminho));
		this.imgBarraLateral = novaImagemBarraLateral;
	}
	
}