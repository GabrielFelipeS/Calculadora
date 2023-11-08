package calculadora.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;

import javax.swing.JTextField;

import org.junit.jupiter.api.Test;

class TesteConta {
	private JTextField field = new JTextField();
	private Conta conta = new Conta(field);
	
	@Test
	void testeContaDeSoma() {
		field.setText("0+1+2+3+4+5+6+7+8+9");
		
		assertEquals("45", conta.resolverConta());
	}
	
	@Test
	void testeContaDeDivisao() {
		field.setText("25/5");
		
		assertEquals("5", conta.resolverConta());
	}
	
	@Test
	void testeContaDeDivisaoComZero() {
		field.setText("25/0");
		
		assertEquals("25", conta.resolverConta());
	}
	
	@Test
	void testeContaDeSubtracao() {
		field.setText("0-1-2-3-4-5-6-7-8-9");
		
		assertEquals("-45", conta.resolverConta());
	}

	@Test
	void testeContaDeMultiplicao() {
		field.setText("9*8*7*6*5*4");
		
		assertEquals("60480", conta.resolverConta());
	}
	
	@Test
	void testeContaDeMultiplicaoComZero() {
		field.setText("0*1*2*3*4*5*6*7*8*9");
		
		assertEquals("0", conta.resolverConta());
	}
	
	@Test
	void testeContaDeExpoente() {
		field.setText("9^7");
		
		assertEquals("4782969", conta.resolverConta());
	}
	
	@Test
	void testeContaDeExpoenteComZero() {
		field.setText("9^0");
		
		assertEquals("1", conta.resolverConta());
	}
	
	@Test
	void testeContaComParenteses() {
		field.setText("3+3+(3*5)");
		
		assertEquals("21", conta.resolverConta());
	}
	
	@Test
	void testeContaComParentesesEncadeados() {
		field.setText("3+3+(3*5+(5*2-(9-2)))");
		
		assertEquals("24", conta.resolverConta());
	}
	
	@Test
	void testeContaFalha() {
		field.setText("2~2");
		ArrayList<Double> listaNumeros = new ArrayList<Double>();
		listaNumeros.add(2.0);
		listaNumeros.add(2.0);
		
		ArrayList<Character> listaOperadores = new ArrayList<Character>();
		listaOperadores.add('~');
		
		assertEquals(0.0, conta.conta(listaNumeros, listaOperadores, 0));
	}
	
	@Test
	void testePendas1() {
		field.setText("2+2*4/2^2");
		
		assertEquals("4", conta.resolverConta());
	}
	
	@Test
	void testePendas2() {
		
		field.setText("2*4*2^2^3");
		
		assertEquals("512", conta.resolverConta());
	}
	
	@Test
	void testePendas3() {
		field.setText("6/3*2+6+(9+2*4)");
		
		assertEquals("27", conta.resolverConta());
	}
	
	@Test
	void testePendas4() {
		field.setText("2+22/2*4*2^2^3*2");
		
		assertEquals("5634", conta.resolverConta());
	}
	

	
}
