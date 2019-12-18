package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import model.GerenciarQuestoes;
import model.Questao;

public class PanelQuestoes extends JPanel{
	
	private ImageIcon back;
	private Font fonte;
	
	private JTextArea lblEnunciado;
	private JRadioButton rdbtOpUm;
	private JRadioButton rdbtOpDois;
	private JRadioButton rdbtOpTres;
	private ButtonGroup btgrOpcoes;
	private JButton btResponder;
	
	public PanelQuestoes() {
		
		setLayout(null);
		setSize(400, 500);
		
		back = new ImageIcon(getClass().getResource("imagens/backQuestao.png"));
		fonte = new Font("Times new Roman", Font.BOLD, 16);
		
		lblEnunciado = new JTextArea("");
		lblEnunciado.setEditable(false);
		lblEnunciado.setLineWrap(true);
		
		rdbtOpUm = new JRadioButton("");
		rdbtOpDois = new JRadioButton("");
		rdbtOpTres = new JRadioButton("");
		
		btResponder = new JButton("Responder");
		
		lblEnunciado.setFont(new Font("Times new Roman", Font.BOLD, 20));
		rdbtOpUm.setFont(fonte);
		rdbtOpDois.setFont(fonte);
		rdbtOpTres.setFont(fonte);
		btResponder.setFont(new Font("Times new Roman", Font.BOLD, 24));
		
		lblEnunciado.setOpaque(false);
		
		rdbtOpUm.setBorderPainted(false);
		rdbtOpUm.setContentAreaFilled(false);
		rdbtOpDois.setBorderPainted(false);
		rdbtOpDois.setContentAreaFilled(false);
		rdbtOpTres.setBorderPainted(false);
		rdbtOpTres.setContentAreaFilled(false);
		
		btgrOpcoes = new ButtonGroup();
		btgrOpcoes.add(rdbtOpUm);
		btgrOpcoes.add(rdbtOpDois);
		btgrOpcoes.add(rdbtOpTres);
		
		lblEnunciado.setBounds(50, 50, 300, 100);
		rdbtOpUm.setBounds(100, 150, 200, 50);
		rdbtOpDois.setBounds(100, 200, 200, 50);
		rdbtOpTres.setBounds(100, 250, 200, 50);
		btResponder.setBounds(100, 350, 200, 60);
		
		add(lblEnunciado);
		add(rdbtOpUm);
		add(rdbtOpDois);
		add(rdbtOpTres);
		add(btResponder);
	
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(back.getImage(), 0, 0, null);
	}
	
	public void setarDefault() {
		rdbtOpUm.setSelected(false);
		rdbtOpDois.setSelected(false);
		rdbtOpTres.setSelected(false);
	}

	public JTextArea getLblEnunciado() {
		return lblEnunciado;
	}

	public JRadioButton getRdbtOpUm() {
		return rdbtOpUm;
	}

	public JRadioButton getRdbtOpDois() {
		return rdbtOpDois;
	}

	public JRadioButton getRdbtOpTres() {
		return rdbtOpTres;
	}

	public JButton getBtResponder() {
		return btResponder;
	}
	
}
