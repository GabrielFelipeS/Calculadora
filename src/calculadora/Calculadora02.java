package calculadora;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.JavaBean;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora02 {
	private JFrame janela 	  = new JFrame("Calculadora");
	private JPanel pnlDisplay = new JPanel();
	private JPanel pnlButtons = new JPanel();
	private JTextField display = new  JTextField();
	private ArrayList<JButton> JButtons = new ArrayList<JButton>();
	private String[] labels = new String[]{
			"7", "8", "9", "+",
			"4", "5", "6", ".",
			"1", "2", "3", "*",
			"0", ",", "=", "-"
	};
	
	private double acumularValue 		= 0;
	private String acumuladorOperador 	= "";
	private boolean flagClearDisplay 	= false;
	

	public Calculadora02() { 
		
		Font defaultFont = new Font("Courier New", Font.BOLD , 48);
		
		for(int i = 0; i < this.labels.length; i++) {
			//JButtons.in
			this.JButtons.add(new JButton(this.labels[i]));
			this.JButtons.get(i).setFont(defaultFont);
			this.pnlButtons.add(JButtons.get(i));
			this.JButtons.get(i).addActionListener(new ActionListener() {		
				public void actionPerformed(ActionEvent e) {
					String label = ((JButton) e.getSource()).getText();
					display.setText( display.getText() + label );

				}
			});
		}

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
				this.pnlDisplay.getWidth(), 
				this.pnlDisplay.getHeight()
			);
		
		
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
		
		this.pnlButtons.setBackground(Color.RED);
		this.pnlButtons.setLayout(new GridLayout(4,4));

		
		
		this.janela.add( this.pnlButtons );
		this.janela.setVisible(true);
	}
	
	protected void clickButton(ActionEvent e) {
		
		String values = "0123456789";
		String operador = "*/+-=";
		
		String label = ((JButton) e.getSource()).getText();
		
		if(values.contains(label)) {
			if (this.flagClearDisplay) {
				this.display.setText("");
				this.flagClearDisplay = false;
			}
			display.setText( display.getText() + label );
		} else {
			if( operador.contains(values)) {
				this.operador( label );
			} else {
				if(! display.getText().contains(".")) {
					display.setText(display.getText() + label);
				}
			}
		}
		
	}
	
	private void operador(String op) {
		if(op.equals(op)) {
			igual();
		} else {
			if (this.acumuladorOperador.equals("")) {
				this.acumuladorOperador = op;
				this.acumularValue = Double.parseDouble(this.display.getText());
				this.flagClearDisplay = true;
			} else {
				igual();
				
			}
		}
	}

	private void igual() {
		switch( this.acumuladorOperador) {
		case "+": {
			double value = 
			this.acumularValue + 
			Double.parseDouble(this.display.getText());
			this.display.setText( Double.toString(value));
		} break;
	}
	this.acumuladorOperador = "";
	this.acumularValue = 0;
	this.flagClearDisplay = true;
		
	}
}