package calculadora.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
			controller.adicionandoNumero(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		System.out.println(field.getText());
		assertEquals("0123456789", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSoma() {
		JButton botao = new JButton("+");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		System.out.println(field.getText());
		assertEquals("+", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSomaMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("+");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		System.out.println(field.getText());
		assertEquals("+", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorDivisao() {
		JButton botao = new JButton("/");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		System.out.println(field.getText());
		assertEquals("/", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorDivisaoMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("/");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		System.out.println(field.getText());
		assertEquals("/", field.getText());
	}
	
	
	@Test
	void testeAdicionandoOperadorMultiplicacao() {
		JButton botao = new JButton("*");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		System.out.println(field.getText());
		assertEquals("*", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorMultiplicacaoMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("*");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		System.out.println(field.getText());
		assertEquals("*", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorPotenciacao() {
		JButton botao = new JButton("^");
		controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		System.out.println(field.getText());
		assertEquals("^", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorPotenciacaoMultiplasVezes() {
		for(int i = 0;i < 3; i++) {
			JButton botao = new JButton("^");
			controller.adicionarOperador(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		System.out.println(field.getText());
		assertEquals("^", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSubtracao() {
		JButton botao = new JButton("-");
		controller.adicionarOperadorDeSubtracao(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));

		System.out.println(field.getText());
		assertEquals("-", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSubtracaoDuasVezesNoComeco() {

		JButton botao = new JButton("-");
		controller.adicionarOperadorDeSubtracao(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		
		botao = new JButton("-");
		controller.adicionarOperadorDeSubtracao(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
	
		System.out.println(field.getText());
		assertEquals("+", field.getText());
	}
	
	@Test
	void testeAdicionandoOperadorSubtracaoMultiplasVezes() {
		for(int i = 0;i < 2; i++) {
			JButton botao = new JButton("-");
			controller.adicionarOperadorDeSubtracao(new ActionEvent(botao, ActionEvent.ACTION_PERFORMED, null));
		}

		System.out.println(field.getText());
		assertEquals("+", field.getText());
	}
	
	
	

}
