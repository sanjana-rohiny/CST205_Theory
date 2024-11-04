

import java.awt.event.*;
import javax.swing.*;

public class Calculator_Swing implements ActionListener{

	JFrame frame;
	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton bAdd, bSub, bDiv, bMul, bEqual, bCancel;
	JTextField edit;
	int operator;
	int num1, num2;
	final int ADD = 1;
	final int SUB = 2;
	final int MUL = 3;
	final int DIV = 4;
	
	Calculator_Swing(String caption) {
		operator = 0;
		num1 = 0;
		num2 = 0;
		
		frame = new JFrame(caption);
		frame.setSize(350, 300);
		frame.setLayout(null);

		edit = new JTextField();
		edit.setBounds(20, 20, 290, 40);
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

		bCancel = new JButton("C");
		bCancel.setBounds(260, 110, 50, 30);
		frame.add(bCancel);

		bDiv = new JButton("/");
		bDiv.setBounds(260, 150, 50, 30);
		frame.add(bDiv);

		// equal button
		bEqual = new JButton("=");
		bEqual.setBounds(260, 190, 50, 30);
		frame.add(bEqual);

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
		bCancel.addActionListener(this);

		bEqual.addActionListener(this);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(edit.getText());
		} catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		return num;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton b = (JButton) e.getSource();
		int result = 0;
		if (b == bEqual) {
			
			num2 = getNumber();

			if (operator == ADD) {
				result = num1 + num2;
			} else if (operator == SUB) {
				result = num1 - num2;
			} else if (operator == MUL) {
				result = num1 * num2;
			} else if (operator == DIV) {
				result = num1 / num2;
			}
			edit.setText(String.valueOf((int)result));
			
		} else if(b == bCancel){
			// cancel button
			
			edit.setText("");		
			num1 = 0;
			num2 = 0;
			operator = 0;
		} else if (b == bAdd) {
			// add button
			
			operator = ADD;
			num1 = getNumber();
			edit.setText("");
		} else if (b == bSub) {
			// sub button

			num1 = getNumber();
			operator = SUB;	
			edit.setText("");
		} else if (b == bMul) {
			// mul button

			num1 = getNumber();
			operator = MUL;
			edit.setText("");
		} else if (b == bDiv) {
			// div button

			num1 = getNumber();
			operator = DIV;
			edit.setText("");
		} else {
			// numbers, 0,1..9
			String digit = edit.getText();
			digit = digit + b.getActionCommand();
			edit.setText(digit);		
		}
	}
	
	public static void main(String[] args) {
		new Calculator_Swing("Calculator");	
	}
}
