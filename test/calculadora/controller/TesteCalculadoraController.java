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
	void testandoAdicionandoNumero() {
		for(int i = 0; i < 10; i++) {
			String numero = String.valueOf(i);
			JButton meuBotao = new JButton(numero);
			controller.adicionandoNumero(new ActionEvent(meuBotao, ActionEvent.ACTION_PERFORMED, null));
		}

		System.out.println(field.getText());
		assertEquals("0123456789", field.getText());
	}

}
