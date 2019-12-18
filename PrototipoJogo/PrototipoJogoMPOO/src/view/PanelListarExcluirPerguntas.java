package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelListarExcluirPerguntas extends JPanel{
	
	private JTextArea txaListarQuestoes;
	private JTextField tfEscolha;
	private JComboBox<String> cbQuestaoExcluir;
	private JButton btExcluir, btVoltar;
	
	private ImageIcon imgBack, imgBtExcluir, imgBtVoltar;
	
	public PanelListarExcluirPerguntas() {
		setLayout(null);
		
		imgBtExcluir = new ImageIcon(getClass().getResource("imagens/excluir.png"));
		imgBack = new ImageIcon(getClass().getResource("imagens/backListarExcluirResposta.png"));
		imgBtVoltar = new ImageIcon(getClass().getResource("imagens/voltar.png"));
		
		txaListarQuestoes = new JTextArea(12, 3);
		tfEscolha = new JTextField(" Selecione uma pergunta:");
		cbQuestaoExcluir = new JComboBox<>();
		btExcluir = new JButton(imgBtExcluir);
		btVoltar = new JButton(imgBtVoltar);
		
		tfEscolha.setFont(new Font("Times new Roman", Font.BOLD, 20));
		tfEscolha.setEditable(false);
		
		txaListarQuestoes.setFont(new Font("Times new Roman", Font.BOLD, 20));
		txaListarQuestoes.setEditable(false);
		
		txaListarQuestoes.setBounds(100, 160, 800, 380);
		tfEscolha.setBounds(210, 120, 220, 30);
		cbQuestaoExcluir.setBounds(440, 120, 200, 30);
		btExcluir.setBounds(650, 120, 100, 30);
		btVoltar.setBounds(750, 545, 200, 50);
		
		add(txaListarQuestoes);
		add(tfEscolha);
		add(cbQuestaoExcluir);
		add(btExcluir);
		add(btVoltar);
		
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(imgBack.getImage(), 0, 0, null);
	}

	public JTextArea getTxaListarQuestoes() {
		return txaListarQuestoes;
	}

	public JComboBox<String> getCbQuestaoExcluir() {
		return cbQuestaoExcluir;
	}

	public JButton getBtExcluir() {
		return btExcluir;
	}

	public JButton getBtVoltar() {
		return btVoltar;
	}
	
}
