package view;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelEscolherJogador extends JPanel{
	
	private JLabel lblMoldura, lblMoldura2, lblPersoMenina, lblPersoMenino;
	private ImageIcon imgBackground, imgBtJogar, imgMoldura, imgMoldura2, imgPersoMenina, imgPersoMenino, imgBtVoltar;
	private JTextField tfNomeJogador;
	private JButton btJogar, btVoltar;
	
	public PanelEscolherJogador() {
		
		setSize(1000, 608);
		setLayout(null);
		
		imgMoldura = new ImageIcon(getClass().getResource("imagens/moldura.png"));
		imgMoldura2 = new ImageIcon(getClass().getResource("imagens/moldura.png"));
		imgPersoMenina = new ImageIcon(getClass().getResource("imagens/imgPersoMenina.png"));
		imgPersoMenino = new ImageIcon(getClass().getResource("imagens/imgPersoMenino.png"));
		imgBackground = new ImageIcon(getClass().getResource("imagens/backTelaEscolherJogador.png"));
		imgBtJogar = new ImageIcon(getClass().getResource("imagens/jogar_.png"));
		imgBtVoltar = new ImageIcon(getClass().getResource("imagens/voltar.png"));
		
		lblMoldura = new JLabel(imgMoldura);
		lblMoldura2 = new JLabel(imgMoldura);
		lblPersoMenina = new JLabel(imgPersoMenina);
		lblPersoMenino = new JLabel(imgPersoMenino);
		tfNomeJogador = new JTextField();
		btJogar = new JButton(imgBtJogar);
		btVoltar = new JButton(imgBtVoltar);
		
		tfNomeJogador.setFont(new Font("Times new Roman", Font.BOLD, 20));
		
		lblPersoMenina.setBounds(200, 180, 300, 230);
		lblPersoMenino.setBounds(500, 180, 300, 230);
		lblMoldura.setBounds(190, 170, 320, 250);
		lblMoldura2.setBounds(490, 170, 320, 250);
		tfNomeJogador.setBounds(400, 485, 300, 40);
		btJogar.setBounds(760, 530, 200, 60);
		btVoltar.setBounds(540, 530, 200, 60);
		
		lblMoldura.setVisible(false);
		lblMoldura2.setVisible(false);
		
		add(lblPersoMenina);
		add(lblPersoMenino);
		add(lblMoldura);
		add(lblMoldura2);
		add(tfNomeJogador);
		add(btJogar);
		add(btVoltar);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(imgBackground.getImage(), 0, 0, null);
	}
	
	public JTextField getTfNomeJogador() {
		return tfNomeJogador;
	}

	public JButton getBtJogar() {
		return btJogar;
	}

	public JLabel getLblMoldura() {
		return lblMoldura;
	}
	
	public JLabel getLblMoldura2() {
		return lblMoldura2;
	}

	public JLabel getLblPersoMenina() {
		return lblPersoMenina;
	}

	public JLabel getLblPersoMenino() {
		return lblPersoMenino;
	}

	public JButton getBtVoltar() {
		return btVoltar;
	}

}
