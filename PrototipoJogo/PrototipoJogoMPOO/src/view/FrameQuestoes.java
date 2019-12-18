package view;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FrameQuestoes extends JFrame{
	
	PanelQuestoes panelQuestao;
	
	CardLayout cardLayout;
	
	public FrameQuestoes() {
		
		cardLayout = new CardLayout();
		
		setSize(400, 500);
		setLayout(cardLayout);
		setResizable(false);
		//setDefaultCloseOperation(FrameQuestoes.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setUndecorated(true);
				
		panelQuestao = new PanelQuestoes(); //LEMBRAR DE MUDAR DEPOIS 
		
		add(panelQuestao, "pQuestao");
		
		cardLayout.show(getContentPane(), "pQuestao");
		
		setVisible(false);
	}
	
	public void show(String indice) {
		cardLayout.show(getContentPane(), indice);
	}

	public PanelQuestoes getPanelQuestao() {
		return panelQuestao;
	}

}
