package calculadora.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JTextField;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteCalculadoraController {
	private CalculadoraController controller;
	private JTextField field;
	
	@BeforeEach
	void iniciar() {
		field = new JTextField();
		controller = new CalculadoraController(field);
	}
	
	@Test
	void testeAdicionandoNumero() {
		for(int i = 0; i < 10; i++) {
			String numero = String.valueOf(i);
			JButton botao = new JButton(numero);
			controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		assertEquals("0123456789", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSoma() {
		JButton botao = new JButton("+");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		assertEquals("+", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSomaMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("+");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		assertEquals("+", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorDivisao() {
		JButton botao = new JButton("/");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		assertEquals("/", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorDivisaoMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("/");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		assertEquals("/", field.getText());
	}
	
	
	@Test
	void testeAdicionandoOperadorMultiplicacao() {
		JButton botao = new JButton("*");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		assertEquals("*", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorMultiplicacaoMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("*");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		assertEquals("*", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorPotenciacao() {
		JButton botao = new JButton("^");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		assertEquals("^", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorPotenciacaoMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("^");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		assertEquals("^", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSubtracao() {
		JButton botao = new JButton("-");
		controller.adicionarOperadorDeSubtracao(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		assertEquals("-", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSubtracaoDuasVezesNoComeco() {

		JButton botao = new JButton("-");
		controller.adicionarOperadorDeSubtracao(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("-");
		controller.adicionarOperadorDeSubtracao(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
	
		assertEquals("+", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSubtracaoMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("-");
			controller.adicionarOperadorDeSubtracao(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		assertEquals("+", field.getText());
	}
	
	@Test
	void testarAdicionarPonto() {
		JButton botao = new JButton(".");
		controller.adicionarPonto(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		assertEquals("0.", field.getText());
	}
	
	@Test
	void testarAdicionarPontoMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton(".");
			controller.adicionarPonto(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}
		assertEquals("0.", field.getText());
	}
	
	@Test
	void testarAdicionarAberturaParenteses() {
		for(int i = 0;i < 2; i++) {
			JButton botao = new JButton("2");
			controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
			botao = new JButton("+");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}
		
		JButton botao = new JButton("(");
		controller.adicionarAberturaParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		assertEquals("2+2+(", field.getText());
	}
	
	@Test
	void testarAdicionarAberturaParentesesMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			for(int x = 0;x < 2; x++)  {
				JButton botao = new JButton("2");
				controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
				botao = new JButton("+");
				controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
			}
			JButton botao = new JButton("(");
			controller.adicionarAberturaParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}
			
		assertEquals("2+2+(2+2+(2+2+(", field.getText());
	}
	
	@Test
	void testarAdicionarAberturaParentesesSemValoresAntes() {

		JButton botao = new JButton("(");
		controller.adicionarAberturaParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		assertNotEquals("(", field.getText());
	}
	
	@Test
	void testarAdicionarAberturaParentesesMultiplasVezesSemValoresAntes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("(");
			controller.adicionarAberturaParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}
		assertNotEquals("(", field.getText());
	}
	
	@Test
	void testarAdicionarFechamentoParenteses() {
		for(int i = 0;i < 2; i++) {
			JButton botao = new JButton("2");
			controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
			botao = new JButton("+");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}
		
		JButton botao = new JButton("(");
		controller.adicionarAberturaParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("2");
		controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("+");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("2");
		controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton(")");
		controller.adicionarFechamentoParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		
		assertEquals("2+2+(2+2)", field.getText());
	}
	
	@Test
	void testarAdicionarFechamentoParentesesComOperadorNoFim() {
		for(int i = 0;i < 2; i++) {
			JButton botao = new JButton("2");
			controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
			botao = new JButton("+");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}
		
		JButton botao = new JButton("(");
		controller.adicionarAberturaParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("2");
		controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("+");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton(")");
		controller.adicionarFechamentoParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		
		assertEquals("2+2+(2+", field.getText());
	}
	
	
	@Test
	void testarAdicionarFechamentoParentesesSemValoresAntes() {

		JButton botao = new JButton(")");
		controller.adicionarFechamentoParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		assertEquals("", field.getText());
	}
	
	@Test
	void testarAdicionarFechamentoParentesesMultiplasVezesSemValoresAntes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton(")");
			controller.adicionarFechamentoParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}
		assertEquals("", field.getText());
	}
	
	@Test
	void testarLimpar() {
		for(int i = 0;i < 2; i++) {
			JButton botao = new JButton("2");
			controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
			botao = new JButton("+");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}
		controller.limpar();
		JButton botao = new JButton("+");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		assertEquals("2+2++", field.getText());
	}
	
	@Test
	void testarIgual() {
		for(int i = 0;i < 2; i++) {
			JButton botao = new JButton("2");
			controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
			botao = new JButton("+");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}
		
		JButton botao = new JButton("(");
		controller.adicionarAberturaParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("3");
		controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("*");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("3");
		controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton(")");
		controller.adicionarFechamentoParenteses(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		String resposta = controller.igual();
		assertEquals("13", resposta);
	}
	
	@Test
	void testarIgualComPonto() {
		JButton botao = new JButton("2");
		controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
	
		botao = new JButton(".");
		controller.adicionarPonto(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("5");
		controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("*");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("3");
		controller.adicionarNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		String resposta = controller.igual();
		System.out.println(resposta);
		assertEquals("7.5", resposta);
	}
	
	@Test
	void testarIgualComPontoNoFim() {
		JButton botao = new JButton(".");
		controller.adicionarPonto(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
	
		String resposta = controller.igual();
		System.out.println(resposta);
		assertEquals("0.", resposta);
	}
	
	

}
