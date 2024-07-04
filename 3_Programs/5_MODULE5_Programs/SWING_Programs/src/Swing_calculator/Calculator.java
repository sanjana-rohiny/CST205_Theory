package Swing_calculator;

import javax.swing.*;
import java.awt.event.*;


public class Calculator implements ActionListener {

	JFrame frame;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton bAdd, bSub, bDiv, bMul, equal, bc, dot;
	JTextField edit;
	int operator;
	boolean fraction = false;

	final int ADD = 1;
	final int SUB = 2;
	final int MUL = 3;
	final int DIV = 4;

	double num1, num2;
	Calculator(String caption) {

		operator = 0;
		num1 = 0d; 
		num2 = 0d;
		fraction = false;
		frame = new JFrame(caption);
		frame.setSize(400, 300);
		frame.setLayout(null);

		edit = new JTextField();
		edit.setBounds(20, 20, 350, 40);
		frame.add(edit);

		// first col	
		b0 = new JButton("0");
		b0.setBounds(20, 70, 50, 30);
		frame.add(b0);

		b1 = new JButton("1");
		b1.setBounds(20, 110, 50, 30);
		frame.add(b1);

		b2 = new JButton("2");
		b2.setBounds(20, 150, 50, 30);
		frame.add(b2);

		bAdd = new JButton("+");
		bAdd.setBounds(20, 190, 50, 30);
		frame.add(bAdd);

		// second col	
		b3 = new JButton("3");
		b3.setBounds(100, 70, 50, 30);
		frame.add(b3);

		b4 = new JButton("4");
		b4.setBounds(100, 110, 50, 30);
		frame.add(b4);

		b5 = new JButton("5");
		b5.setBounds(100, 150, 50, 30);
		frame.add(b5);

		bSub = new JButton("-");
		bSub.setBounds(100, 190, 50, 30);
		frame.add(bSub);

		// third col	
		b6 = new JButton("6");
		b6.setBounds(180, 70, 50, 30);
		frame.add(b6);

		b7 = new JButton("7");
		b7.setBounds(180, 110, 50, 30);
		frame.add(b7);

		b8 = new JButton("8");
		b8.setBounds(180, 150, 50, 30);
		frame.add(b8);

		bMul = new JButton("x");
		bMul.setBounds(180, 190, 50, 30);
		frame.add(bMul);

		// fourth col	
		b9 = new JButton("9");
		b9.setBounds(260, 70, 50, 30);
		frame.add(b9);

		dot = new JButton(".");
		dot.setBounds(260, 110, 50, 30);
		frame.add(dot);

		bc = new JButton("C");
		bc.setBounds(260, 150, 50, 30);
		frame.add(bc);

		bDiv = new JButton("/");
		bDiv.setBounds(260, 190, 50, 30);
		frame.add(bDiv);

		// qual
		equal = new JButton("=");
		equal.setBounds(320, 70, 50, 150);
		frame.add(equal);

		// add action listeners
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		dot.addActionListener(this);
		bc.addActionListener(this);

		equal.addActionListener(this);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
		Calculator calc = new Calculator("Calculator");
	}

	double getNumber() {
		double num = 0d;
		try {
			num = Double.parseDouble(edit.getText());
		} catch(NumberFormatException e) {

		}
		return num;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		double result = 0d;
		JButton b = (JButton) e.getSource();
		if( b == equal) {
			
			if (operator != 0) {
				num2 = getNumber();
			} 
			
			if (operator == ADD) {
				result = num1 + num2;
			} else if (operator == SUB) {
				result = num1 - num2;
			} else if (operator == MUL) {
				result = num1 * num2;
			} else if (operator == DIV) {
				result = num1 / num2;
				fraction = true;
			}
			if (fraction == true)
				edit.setText(String.valueOf(result));
			else 
				edit.setText(String.valueOf((int)result));
			
		} else if (b == bAdd) {
			operator = ADD;
			num1 = getNumber();
			edit.setText("");
		} else if (b == bSub) {
			num1 = getNumber();
			operator = SUB;	
			edit.setText("");
		} else if (b == bMul) {
			num1 = getNumber();
			operator = MUL;
			edit.setText("");
		} else if (b == bDiv) {
			num1 = getNumber();
			operator = DIV;
			edit.setText("");
		} else if (b == bc) {
			edit.setText("");
			operator = 0;
			num1 = 0d; 
			num2 = 0d;
			fraction = false;
		} else if (b == dot) {
			if (fraction == false) {
				String digit = edit.getText();
				digit = digit + b.getActionCommand();
				edit.setText(digit);
				fraction = true;
			}
		} else {
			String digit = edit.getText();
			digit = digit + b.getActionCommand();
			edit.setText(digit);
		}
	}
}
