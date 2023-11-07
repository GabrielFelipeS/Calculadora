package calculadora.controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import calculadora.modelo.Conta;

public class CalculadoraController {

	private boolean operadorOuPontoNoFim = false;
	private boolean pontoIncluido = false;
	private boolean numeroNegativo	= false;
	private int quantidadeParentesesAbertos = 0;
	private int quantidadeParentesesFechados = 0;
	private int qtdOperadores = 0;
	
	private JTextField display;
	
	public CalculadoraController(JTextField display) {
		this.display = display;
	}
	
	public void adicionandoNumero(ActionEvent e) {
		String label = ((JButton) e.getSource()).getText();
		display.setText( display.getText() + label );
		operadorOuPontoNoFim = false;
		numeroNegativo = false;
		qtdOperadores = 0;
	}
	
	public void adicionarOperador(ActionEvent e) {
		if(qtdOperadores > 0) {
			numeroNegativo = true;
		}
		
		if(!operadorOuPontoNoFim || !numeroNegativo) {	
			String label = ((JButton) e.getSource()).getText();
			display.setText( display.getText() + label );
			operadorOuPontoNoFim = true;
			pontoIncluido = false;
			qtdOperadores++;
		}
	}
	public void adicionarOperadorDeSubtracao(ActionEvent e) {
		if(qtdOperadores == 1) {
			numeroNegativo = false;
		}
		
		if(pontoIncluido) {
			return;
		}
		
		if(!operadorOuPontoNoFim || !numeroNegativo) {	
			String label = ((JButton) e.getSource()).getText();
			display.setText( display.getText() + label );
			operadorOuPontoNoFim = true;
			pontoIncluido = false;
			numeroNegativo = true;
			qtdOperadores++;
		}
	}
	
	public void adicionarAberturaParenteses(ActionEvent e) {
		if(qtdOperadores == 0) {
			return;
		}
		
		if(qtdOperadores > 0) {
			numeroNegativo = true;
		}
		
		if(operadorOuPontoNoFim) {	
			String label = ((JButton) e.getSource()).getText();
			display.setText( display.getText() + label );
			operadorOuPontoNoFim = true;
			pontoIncluido = false;
			qtdOperadores++;
			quantidadeParentesesAbertos++;
		}
	}
	
	public void adicionarFechamentoParenteses(ActionEvent e) {
		if(quantidadeParentesesAbertos < quantidadeParentesesFechados + 1) {
			return;
		}
		
		if(qtdOperadores > 0) {
			numeroNegativo = true;
		}
		
		if(!operadorOuPontoNoFim || !numeroNegativo) {	
			String label = ((JButton) e.getSource()).getText();
			display.setText( display.getText() + label );
			pontoIncluido = false;
			qtdOperadores++;
			quantidadeParentesesFechados++;
		}
	}
	public void adicionarPonto(ActionEvent e) {
		if(!operadorOuPontoNoFim && !pontoIncluido) {	
			String label = ((JButton) e.getSource()).getText();
			
			if(display.getText().isEmpty()) {
				label = "0" + label;
			}
				
			
			display.setText( display.getText() + label );
			pontoIncluido = true;
			operadorOuPontoNoFim = true;
			numeroNegativo = true;
		}
	}
	
	public void limpar() {
		display.setText("");
		operadorOuPontoNoFim = false;
		pontoIncluido = false;
		numeroNegativo	= false;
		qtdOperadores = 0;
	}
	
	public String igual() {
		
		if(operadorOuPontoNoFim || quantidadeParentesesAbertos > quantidadeParentesesFechados) {
			return display.getText();
		}
		
		Conta conta = new Conta(display);
		
		String resposta = conta.resolverConta();
		
		int tamanho = (resposta.length() <= 13)? resposta.length() : 13;
		
		String substring = resposta.substring(0, tamanho);
		
		if(substring.contains(".")) {
			pontoIncluido = true;
		}
		
		return substring;
	}
	
}
