package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora01 {
	private boolean operadorOuPonto = false;
	private boolean pontoJaColocado = false;
	private boolean operadorNoFim	= false;

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
	
	public Calculadora01() {
		this.janela.setBounds(220, 200, 400, 600);
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
				(int) (this.pnlDisplay.getWidth() * 0.96), 
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
				(int) (this.janela.getHeight()*0.75)  
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
		
		this.pnlButtons.setBackground(Color.RED);
		this.pnlButtons.setLayout(new GridLayout(4,4));
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
				operadorNoFim = false;
			}
		});
		this.btn1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorNoFim = false;
			}
		});
		this.btn2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorNoFim = false;
			}
		});
		this.btn3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorNoFim = false;
			}
		});
		this.btn4.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
			}
		});
		this.btn5.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorNoFim = false;
			}
		});
		this.btn6.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
			}
		});
		this.btn7.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorNoFim = false;
			}
		});
		this.btn8.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorNoFim = false;
			}
		});
		this.btn9.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				display.setText( display.getText() + label );
				operadorNoFim = false;
			}
		});
		
		this.btnPonto.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String label = ((JButton) e.getSource()).getText();
				
				if(operadorNoFim) {
					return;
				}
				
				
				if (display.getText().indexOf(".") < 0) {
					display.setText( display.getText() + label );
					pontoJaColocado = true;
				}
			}
		});

		this.btnMulti.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(operadorNoFim) {
					return;
				}
				
				if(operadorOuPonto) {
					igual();
					operadorOuPonto = false;
				}
				
				if(!display.getText().endsWith("*")) {	
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
					operadorNoFim = true;
					operadorOuPonto = true;
					pontoJaColocado = false;
				}

				
				
			}
		});
		
		this.btnSoma.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(operadorNoFim) {
					return;
				}
				
				if(operadorOuPonto) {
					igual();
					operadorOuPonto = false;
				}
				
				if(!display.getText().endsWith("+")) {	
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
					operadorNoFim = true;
					operadorOuPonto = true;
					pontoJaColocado = false;
				}
			}
		});
		
		this.btnSubtr.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(operadorNoFim) {
					return;
				}
				
				if(operadorOuPonto) {
					igual();
					operadorOuPonto = false;
				}
				
				if(!display.getText().endsWith("-")) {	
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
					operadorNoFim = true;
					operadorOuPonto = true;
					pontoJaColocado = false;
				}
			}
		});
		
		this.btnDiv.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				if(operadorNoFim) {
					return;
				}
				
				if(operadorOuPonto) {
					igual();
					operadorOuPonto = false;
				}
				
				
				String texto = display.getText();
				if(!texto.endsWith("/")) {	
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );
					operadorNoFim = true;
					operadorOuPonto = true;
					pontoJaColocado = false;
				}
			}
		});
		
		this.btnIgual.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
	
				if(operadorOuPonto) {
					igual();
					operadorOuPonto = false;
					operadorNoFim = false;
				}
			
					
			}


		});
		
		this.janela.add( this.pnlButtons );
		this.janela.setVisible(true);
	}
	
	private void igual() {
		
		String texto = display.getText();
		int multIndex = texto.indexOf('*');
		int divIndex = texto.indexOf('/');
		int somaIndex = texto.indexOf('+');
		int subIndex = texto.indexOf('-');
		int index = 0;
		
		if(multIndex != -1) {
			index = multIndex;
		} else if(divIndex != -1) {
			index = divIndex;
		} else if(somaIndex != -1) {
			index = somaIndex;
		} else if(subIndex != -1) {
			index = subIndex;
		}
		
		double n1 = Double.parseDouble(texto.substring(0, index));
		double n2 = Double.parseDouble(texto.substring(index + 1));
		System.out.println(index);
		char c = texto.charAt(index);
		System.out.println(c);
		switch(c) {
			case '*':
				display.setText(String.valueOf((n1 * n2)));
				break;
			case '/':
				if(n2 == 0) {
					JOptionPane.showMessageDialog(null, "Encontramos uma divisão por 0, por favor faça outra conta", "Divisao por zero", JOptionPane.WARNING_MESSAGE);
					display.setText("");
				}
				
				display.setText(String.valueOf((n1 / n2)));
				break;
			case '-':
				display.setText(String.valueOf((n1 - n2)));
				break;
				
			case '+':
				System.out.println("a");
				display.setText(String.valueOf((n1 + n2)));
				break;
		}
		
		String resposta = display.getText();
		if(resposta.substring(resposta.indexOf('.') + 1).replace("0", "").length() == 0) {
			int resp = Integer.parseInt(resposta.substring(0, resposta.indexOf('.')));
			System.out.println(resp);
			resposta = String.valueOf(resp);
			System.out.println(resposta);
			display.setText(resposta);
		} else {
			display.setText(resposta);
		}	
	}
}