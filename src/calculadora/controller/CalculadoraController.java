package calculadora.controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import calculadora.modelo.Conta;

public class CalculadoraController {

	private boolean operadorOuPontoNoFim = false;
	private boolean pontoIncluido = false;
	private boolean possibilidadeDeNumeroNegativo	= false;
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
		possibilidadeDeNumeroNegativo = false;
		qtdOperadores = 0;
	}
	
	public void adicionarOperador(ActionEvent e) {
		if(qtdOperadores > 0) {
			possibilidadeDeNumeroNegativo = true;
		}
		
		if(!operadorOuPontoNoFim || !possibilidadeDeNumeroNegativo) {	
			String label = ((JButton) e.getSource()).getText();
			display.setText( display.getText() + label );	
			operadorOuPontoNoFim = true;
			pontoIncluido = false;
			qtdOperadores++;
		}
	}
	public void adicionarOperadorDeSubtracao(ActionEvent e) {
		
		if(qtdOperadores == 1) {
			possibilidadeDeNumeroNegativo = false;
		}
		
		if(!operadorOuPontoNoFim || !possibilidadeDeNumeroNegativo) {	
			String label = ((JButton) e.getSource()).getText();
			display.setText( display.getText() + label );
			operadorOuPontoNoFim = true;
			pontoIncluido = false;
			possibilidadeDeNumeroNegativo = true;
			qtdOperadores++;
		}
	}
	
	public void adicionarAberturaParenteses(ActionEvent e) {
		if(qtdOperadores == 0) {
			return;
		}
		
		if(qtdOperadores > 0) {
			possibilidadeDeNumeroNegativo = true;
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
			possibilidadeDeNumeroNegativo = true;
		}
		
		if(!operadorOuPontoNoFim || !possibilidadeDeNumeroNegativo) {	
			String label = ((JButton) e.getSource()).getText();
			display.setText( display.getText() + label );
			pontoIncluido = false;
			qtdOperadores++;
			quantidadeParentesesFechados++;
		}
	}
	
	public void adicionarPonto(ActionEvent e) {
		if(!pontoIncluido) {	
			String label = ((JButton) e.getSource()).getText();
			
			if(display.getText().isEmpty() || operadorOuPontoNoFim) {
				label = "0" + label;
			}

			display.setText( display.getText() + label );
			pontoIncluido = true;
			operadorOuPontoNoFim = true;
			possibilidadeDeNumeroNegativo = true;
		}
	}
	
	public void limpar() {
		operadorOuPontoNoFim = false;
		pontoIncluido = false;
		possibilidadeDeNumeroNegativo	= false;
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

	void viewDadosControle() {
		System.out.println("operadorOuPontoNoFim: " + operadorOuPontoNoFim);
		System.out.println("pontoIncluido: " + pontoIncluido);
		System.out.println("possibilidadeDeNumeroNegativo: " + possibilidadeDeNumeroNegativo);
		System.out.println("quantidadeParentesesAbertos: " + quantidadeParentesesAbertos);
		System.out.println("quantidadeParentesesFechados: " + quantidadeParentesesFechados);
		System.out.println("qtdOperadores: " + qtdOperadores);
	}
}
