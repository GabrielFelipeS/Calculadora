package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraPOG {
	private boolean operadorOuPontoNoFim = false;
	private boolean pontoIncluido = false;
	private boolean numeroNegativo	= false;
	private int quantidadeParentesesAbertos = 0;
	private int quantidadeParentesesFechados = 0;
	private int qtdOperadores = 0;
	
	private JFrame janela 	  = new JFrame("Calculadora");
	private JPanel pnlDisplay = new JPanel();
	private JPanel pnlButtons = new JPanel();
	private JTextField display = new  JTextField();
	private JButton btn7 	 = new JButton("7");
	private JButton btn8 	 = new JButton("8");
	private JButton btn9 	 = new JButton("9");
	private JButton btnSoma  = new JButton("+");
	private JButton btn4 	 = new JButton("4");
	private JButton btn5 	 = new JButton("5");
	private JButton btn6 	 = new JButton("6");
	private JButton btnSubtr = new JButton("-");
	private JButton btn1 	 = new JButton("1");
	private JButton btn2 	 = new JButton("2");
	private JButton btn3 	 = new JButton("3");
	private JButton btnMulti = new JButton("*");
	private JButton btn0 	 = new JButton("0");
	private JButton btnPonto = new JButton(".");
	private JButton btnIgual = new JButton("=");
	private JButton btnDiv   = new JButton("/");
	private JButton btnLimpar   = new JButton("c");
	private JButton btnPotencia   = new JButton("^");
	private JButton btnAberturaParenteses   = new JButton("(");
	private JButton btnFechaduraParenteses   = new JButton(")");
	
	public CalculadoraPOG() {

		this.janela.setBounds(200, 200, 400, 600);
		this.janela.setLayout(null);
		this.pnlDisplay.setBounds(
				0, 0, 
				this.janela.getWidth(),  
				(int) (this.janela.getHeight()*0.15) 
			);
		this.pnlDisplay.setBackground(Color.BLUE);
		this.pnlDisplay.setLayout(null);
		this.display.setBounds(
				0, 0, 
				(int) (this.pnlDisplay.getWidth() * 0.97), 
				this.pnlDisplay.getHeight()
			);
		
		Font defaultFont = new Font("Courier New", Font.BOLD , 48);
		this.display.setFont(defaultFont);
		
		this.display.setEditable(false);
		this.display.setHorizontalAlignment( JTextField.RIGHT );
		
		this.pnlDisplay.add(this.display);
		this.janela.add( this.pnlDisplay );
		this.pnlButtons.setBounds(
				0, 
				(int) (this.janela.getHeight()*0.15), 
				this.janela.getWidth(), 
				(int) (this.janela.getHeight()*0.80)  
			);
		
		
		this.btn7.setFont(defaultFont);
		this.btn8.setFont(defaultFont);
		this.btn9.setFont(defaultFont);
		this.btnSoma.setFont(defaultFont);
		this.btn4.setFont(defaultFont);
		this.btn5.setFont(defaultFont);
		this.btn6.setFont(defaultFont);
		this.btnSubtr.setFont(defaultFont);
		this.btn1.setFont(defaultFont);
		this.btn2.setFont(defaultFont);
		this.btn3.setFont(defaultFont);
		this.btnMulti.setFont(defaultFont);
		this.btn0.setFont(defaultFont);
		this.btnPonto.setFont(defaultFont);
		this.btnIgual.setFont(defaultFont);
		this.btnDiv.setFont(defaultFont);
		this.btnLimpar.setFont(defaultFont);
		this.btnPotencia.setFont(defaultFont);
		this.btnAberturaParenteses.setFont(defaultFont);
		this.btnFechaduraParenteses.setFont(defaultFont);
		
		
		this.pnlButtons.setBackground(Color.RED);
		this.pnlButtons.setLayout(new GridLayout(5,4));

		this.pnlButtons.add(btnLimpar);	
		this.pnlButtons.add(btnPotencia);	
		this.pnlButtons.add(btnAberturaParenteses);	
		this.pnlButtons.add(btnFechaduraParenteses);	
		this.pnlButtons.add(btn7);
		this.pnlButtons.add(btn8);
		this.pnlButtons.add(btn9);
		this.pnlButtons.add(btnSoma);
		this.pnlButtons.add(btn4);
		this.pnlButtons.add(btn5);
		this.pnlButtons.add(btn6);
		this.pnlButtons.add(btnSubtr);
		this.pnlButtons.add(btn1);
		this.pnlButtons.add(btn2);
		this.pnlButtons.add(btn3);
		this.pnlButtons.add(btnMulti);
		this.pnlButtons.add(btn0);
		this.pnlButtons.add(btnPonto);
		this.pnlButtons.add(btnIgual);
		this.pnlButtons.add(btnDiv);	
		
		
		
		this.btn0.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		this.btn1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		this.btn2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		this.btn3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		this.btn4.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		this.btn5.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		this.btn6.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		this.btn7.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		this.btn8.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		this.btn9.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorOuPontoNoFim = false;
				numeroNegativo = false;
				qtdOperadores = 0;
			}
		});
		
		this.btnPonto.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
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
//				if (display.getText().indexOf(".") < 0) {
//				String label = ((JButton) e.getSource()).getText();
//					display.setText( display.getText() + label );
//				}
			}
		});

		this.btnMulti.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
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
//				if(!display.getText().endsWith("*")) {	
//					String label = ((JButton) e.getSource()).getText();
//					display.setText( display.getText() + label );
//				}

				
				
			}
		});
		
		this.btnSoma.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
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
//				if(!display.getText().endsWith("+")) {	
//					String label = ((JButton) e.getSource()).getText();
//					display.setText( display.getText() + label );
//				}
			}
		});
		
		this.btnSubtr.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
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
				
//				if(!display.getText().endsWith("-")) {	
//					String label = ((JButton) e.getSource()).getText();
//					display.setText( display.getText() + label );
//				}
			}
		});
		
		this.btnDiv.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
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


		});
		
		this.btnPotencia.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
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
//				if(!display.getText().endsWith("+")) {	
//					String label = ((JButton) e.getSource()).getText();
//					display.setText( display.getText() + label );
//				}
			}
		});
		
		this.btnLimpar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				display.setText("");
				operadorOuPontoNoFim = false;
				pontoIncluido = false;
				numeroNegativo	= false;
				qtdOperadores = 0;
				
//				String texto = display.getText();
//			
//				int tamanho = 0;
//				if(!texto.isEmpty()) {
//					tamanho = texto.length();
//					
//					display.setText(texto.substring(0, tamanho - 1));
//					char[] arrayCaracter = texto.substring(tamanho - 2).toCharArray();
//					Character caractereFim = arrayCaracter[0];
//					int hashCode = caractereFim.hashCode();
//					
//					if(hashCode > 47 || hashCode == 46 ) {
//					
//					} else {
//					
//					}
//				}
//				
			
			}
		});
		
		this.btnAberturaParenteses.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
//				if(!display.getText().endsWith("+")) {	
//					String label = ((JButton) e.getSource()).getText();
//					display.setText( display.getText() + label );
//				}
			}
		});
		
		this.btnFechaduraParenteses.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
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
//				if(!display.getText().endsWith("+")) {	
//					String label = ((JButton) e.getSource()).getText();
//					display.setText( display.getText() + label );
//				}
			}
		});
		
		this.btnIgual.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				igual();
			}


		});
		
		this.janela.add( this.pnlButtons );
		this.janela.setVisible(true);
	}
	

	
	private void igual() {
		
		//System.out.println(teste.replace("(9 + 9 + 9 + 9)", "36"));
		
		if(operadorOuPontoNoFim || quantidadeParentesesAbertos > quantidadeParentesesFechados) {
			return;
		}
		
		String texto = display.getText();
		System.out.println(texto);
		
		if(texto.indexOf('(') != -1) {
			texto = parentesesSolution(texto);
			display.setText(texto);
		}
		
		
		
		System.out.println(texto.indexOf('('));
		
		ArrayList<Double> listaNumeros = pendas();
		
		
		listaNumeros.forEach(v -> System.out.println(v));
		
		String resposta = resposta(listaNumeros);
		
		int tamanho = (resposta.length() <= 13)? resposta.length() : 13;
		display.setText(resposta.substring(0, tamanho));
	}
	
	//9+(9+9+(5*2))
	private String parentesesSolution(String texto) {
		int indexParenteses = texto.indexOf("(");
		String parenteses = null;
		String resultado = null;
		//System.out.println(texto);
		
		if(indexParenteses != -1) {
			parenteses = texto.substring(indexParenteses + 1);
			resultado = parentesesSolution(parenteses);
			System.out.println(parenteses);
			texto = texto.replace("(" + parenteses, resultado);
			return texto;
		}
		
		String fechamentoParenteses = texto.substring(0, texto.indexOf(")"));
		//System.out.println(fechamentoParenteses);
		//System.out.println("ta passando?");
		
		ArrayList<Double> listaNumeros = pendas(fechamentoParenteses);
		
		listaNumeros.forEach(v -> System.out.println(v));
		
		String resposta = resposta(listaNumeros);
		
		int tamanho = (resposta.length() <= 13)? resposta.length() : 13;
		
		return resposta.substring(0, tamanho);
	}
	
	private ArrayList<Double> pendas() {
		return pendas(display.getText());
	}

	
	private ArrayList<Double> pendas(String texto) {
		ArrayList<Double> listaNumeros = new ArrayList<Double>();
		ArrayList<Character> listaOperadores = new ArrayList<Character>();
		dividirEntreArryas(listaNumeros, listaOperadores, texto);
		while(!listaOperadores.isEmpty()) {
			int index = indexOperadores(listaNumeros, listaOperadores);
			double conta = conta(listaNumeros, listaOperadores, index);
			
			if(!listaOperadores.isEmpty()) {
				listaNumeros.set(index, conta);
				listaNumeros.remove(index + 1);
				listaOperadores.remove(index);
			}
			
		}
		
		return listaNumeros;
	}

	String resposta(ArrayList<Double> listaNumeros) {
		String resposta = Double.toString(listaNumeros.get(0));
		System.out.println("Resposta: " + resposta);
		
		if(resposta.substring(resposta.indexOf('.') + 1).replace("0", "").length() == 0) {
			int resp = Integer.parseInt(resposta.substring(0, resposta.indexOf('.')));
			System.out.println(resp);
			
			resposta = String.valueOf(resp);
			System.out.println(resposta);
		} else {
			pontoIncluido = true;		
		}	
	
		return resposta;
	}

	// 9 + (9+9 + (5 * 2))



	private void dividirEntreArryas(ArrayList<Double> listaNumeros, ArrayList<Character> listaOperadores, String texto) {
		String string = "";
		//String texto = display.getText();
		//System.out.println(texto);
		boolean operador = true;
		for(char c : texto.toCharArray()) {
			int hashCode = Character.hashCode(c);
			//System.out.println(hashCode);
			// Se maior significa que é um numero
			if((hashCode > 47 || hashCode == 46 || operador) && hashCode != 94) {
				string += c;
				operador = false;
			} else {
				listaNumeros.add(Double.parseDouble(string));
				listaOperadores.add(c);
				operador = true;
				string = "";
			}
		}
		listaNumeros.add(Double.parseDouble(string));
		
		System.out.print("Lista de numeros: ");
		for(Object c : listaNumeros.toArray()) {
			System.out.print(c + " ");
		}
		
		System.out.print("\nLista de operadores: ");
		for(Object c : listaOperadores.toArray()) {
			System.out.print(c + " ");
		}
	}
	
	private int indexOperadores(ArrayList<Double> listaNumeros, ArrayList<Character> listaOperadores) {
		int potenciaIndex = listaOperadores.indexOf('^');
		int multIndex = listaOperadores.indexOf('*');
		int divisaoIndex = listaOperadores.indexOf('/');
		int somaIndex = listaOperadores.indexOf('+');
		int subtracaoIndex = listaOperadores.indexOf('-');
		int index;
		
		
		if(potenciaIndex != -1) {
			index = potenciaIndex;
		} else if(multIndex != -1 || divisaoIndex != -1) {
			if(multIndex != -1 && (multIndex < divisaoIndex || divisaoIndex == -1)) {
				index = multIndex;
			} else {
				index = divisaoIndex;
			}
		} else {
			if(somaIndex != -1 && (somaIndex < subtracaoIndex || subtracaoIndex == -1)) {
				index = somaIndex;
			} else {
				index = subtracaoIndex;
			}
		}
		
		System.out.println("\nMultiIndex: " +  multIndex);
		System.out.println("DivIndex: " + divisaoIndex);
		System.out.println("SomaIndex: " +  somaIndex);
		System.out.println("SubtracaoIndex: " + subtracaoIndex);
		
		return index;
	}

	private double conta(ArrayList<Double> listaNumeros, ArrayList<Character> listaOperadores, int index) {
		double value1 = (double) listaNumeros.get(index);
		double value2 = (double) listaNumeros.get(index + 1);
		char operador = (char) listaOperadores.get(index);
		
		
		switch(operador) {
			case '*':
				return value1 * value2;
			case '/':
				if(value2 == 0) {
					JOptionPane.showMessageDialog(null, "Encontramos uma divisão por 0, por favor faça outra conta", "Divisao por zero", JOptionPane.WARNING_MESSAGE);
					display.setText("");
					listaOperadores.removeAll(listaOperadores);
					return 0;
				}
				return value1 / value2;
			case '-':
				return value1 - value2;
			case '+':
				return value1 + value2;
			case '^':
				return Math.pow(value1, value2);
		}
		
		return 0;
	}


//	@Override
//	public void keyPressed(KeyEvent ek) {
//		System.out.println(ek.getKeyCode());
//		if(ek.getKeyCode() == KeyEvent.VK_BACK_SLASH) {
//			String texto = display.getText();
//			texto = texto.substring(0, texto.length() - 1);
//			display.setText(texto);
//		}
//	}

//	@Override
//	public void keyTyped(KeyEvent e) {}
//
//	
//	@Override
//	public void keyReleased(KeyEvent e) {}
//	
}