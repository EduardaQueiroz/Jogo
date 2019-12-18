package view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPrincipal extends JPanel{
	
	private ImageIcon imgBackground, imgBtJogar, imgBtConfig, imgBtSair;
	private JButton btJogar, btConfig, btSair;
	
	public PanelPrincipal() {
		setSize(1000, 608);
		setLayout(null);
		
		imgBackground = new ImageIcon(getClass().getResource("imagens/back.png"));
		imgBtJogar = new ImageIcon(getClass().getResource("imagens/jogar.png"));
		imgBtConfig = new ImageIcon(getClass().getResource("imagens/config.png"));
		imgBtSair = new ImageIcon(getClass().getResource("imagens/sair.png"));
		
		btJogar = new JButton(imgBtJogar);
		btConfig = new JButton(imgBtConfig);
		btSair = new JButton(imgBtSair);
		
		btJogar.setBounds(700, 500, 80, 80);
		btConfig.setBounds(800, 500, 80, 80);
		btSair.setBounds(900, 500, 80, 80);
		
		add(btJogar);
		add(btConfig);
		add(btSair);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(imgBackground.getImage(), 0, 0, null);
	}
	
	public JButton getBtJogar() {
		return btJogar;
	}

	public JButton getBtConfig() {
		return btConfig;
	}

	public JButton getBtSair() {
		return btSair;
	}

}
