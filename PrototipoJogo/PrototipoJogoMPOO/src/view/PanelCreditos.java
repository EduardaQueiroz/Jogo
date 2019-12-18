package view;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelCreditos extends JPanel{
	
	private ImageIcon imgBackground, imgBtVoltar;
	
	private JButton btVoltar;
	
	public PanelCreditos() {
		
		setLayout(null);
		
		imgBackground = new ImageIcon(getClass().getResource("imagens/backCreditos.png"));
		imgBtVoltar = new ImageIcon(getClass().getResource("imagens/voltar.png"));
		
		btVoltar = new JButton(imgBtVoltar);
		
		btVoltar.setBounds(750, 540, 200, 60);
		
		add(btVoltar);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(imgBackground.getImage(), 0, 0, null);
	}
	
	public JButton getBtVoltar() {
		return btVoltar;
	}

}
