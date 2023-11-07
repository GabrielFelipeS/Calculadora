package calculadora.view;

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

import calculadora.controller.CalculadoraController;

public class CalculadoraView {	
	private CalculadoraController calculadora;
	
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
	
	
	
	public CalculadoraView() {
		calculadora = new CalculadoraController(display); 
		
		
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
				calculadora.adicionandoNumero(e);
			}
		});
		this.btn1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionandoNumero(e);
			}
		});
		this.btn2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionandoNumero(e);
			}
		});
		this.btn3.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionandoNumero(e);
			}
		});
		this.btn4.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionandoNumero(e);
			}
		});
		this.btn5.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionandoNumero(e);
			}
		});
		this.btn6.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionandoNumero(e);
			}
		});
		this.btn7.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionandoNumero(e);
			}
		});
		this.btn8.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionandoNumero(e);
			}
		});
		this.btn9.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionandoNumero(e);
			}
		});
		
		this.btnPonto.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionarPonto(e);
			}
		});

		this.btnMulti.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionarOperador(e);
			}
		});
		
		this.btnSoma.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionarOperador(e);
			}
		});
		
		this.btnSubtr.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionarOperadorDeSubtracao(e);
			}
		});
		
		this.btnDiv.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionarOperador(e);
			}


		});
		
		this.btnPotencia.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionarOperador(e);
			}
		});
		
		this.btnLimpar.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.limpar();
			}
		});
		
		this.btnAberturaParenteses.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionarAberturaParenteses(e);
			}
		});
		
		this.btnFechaduraParenteses.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.adicionarFechamentoParenteses(e);
			}
		});
		
		this.btnIgual.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				calculadora.igual();
			}
		});
		
		this.janela.add( this.pnlButtons );
		this.janela.setVisible(true);
	}
}