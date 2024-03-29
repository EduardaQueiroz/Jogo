package model;

import java.util.ArrayList;

public class Questao {
	
	private String enunciado, op1, op2, op3;
	private int fase;
	private String respostaCerta;
	
	public Questao(String enunciado, String op1, String op2, String op3, int fase, String respostaCerta) {
		this.enunciado = enunciado;
		this.op1 = op1;
		this.op2 = op2;
		this.op3 = op3;
		this.fase = fase;
		this.respostaCerta = respostaCerta;
	}
	
	public String getEnunciado() {
		return enunciado;
	}

	public String getOp1() {
		return op1;
	}

	public String getOp2() {
		return op2;
	}

	public String getOp3() {
		return op3;
	}

	public int getFase() {
		return fase;
	}

	public String getRespostaCerta() {
		return respostaCerta;
	}
	
	@Override
	public String toString() {
		return "Pergunta: "+ enunciado + "   -   " + "Fase: " + fase;
	}

}
