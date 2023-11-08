package calculadora.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

class TesteCalculadoraView {
	private JTextField field = new JTextField();

	@Test
	void testandoCarregamento() {
		CalculadoraView calculadora = new CalculadoraView();
		
		field.setText("2+2");
		calculadora = new CalculadoraView(field);
		assertEquals("2+2", calculadora.toString());
	}

}
