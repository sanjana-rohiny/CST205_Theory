package Question13;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;
public class Calculator {

	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton bplus, bmin, bmul, bdiv;
	JButton clear, equal;
	JTextField tf;

	JFrame f;
	JPanel p;
	
	private static final int ADD = 1;
	private static final int MIN = 2;
	private static final int MUL = 3;
	private static final int DIV = 4;
	
	int operationFlag = 0;
	String digit1, digit2;
	
	Calculator() {
		
		p = new JPanel();
		
		tf = new JTextField(20);
		tf.setPreferredSize(new Dimension(20,50));

		b0 = new JButton("0");
		b0.setPreferredSize(new Dimension(50,50));
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		
		bplus = new JButton("+");
		bmin = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		
		equal = new JButton("=");
		clear = new JButton("C");
		
		f = new JFrame();
		
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		
		p.add(bplus);
		p.add(bmin);
		p.add(bmul);
		p.add(bdiv);

		p.add(equal);
		p.add(clear);
		
		f.add(tf);
		
		f.setLayout(new FlowLayout());
		
		GridLayout g = new GridLayout(4, 4, 10, 20);
		p.setLayout(g);
		f.add(p);
		
		f.setSize(400,400);
		f.setVisible(true);
		
		b0.addActionListener(listener);
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);
		b7.addActionListener(listener);
		b8.addActionListener(listener);
		b9.addActionListener(listener);

		bplus.addActionListener(oprListener);
		bmin.addActionListener(oprListener);
		bmul.addActionListener(oprListener);
		bdiv.addActionListener(oprListener);
		
		equal.addActionListener(equalsListener);
		clear.addActionListener(equalsListener);
		
		// for close event..!
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
		        System.exit(0);
		    }
		});
	}
	
	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			
			String num = tf.getText();
			
			if (button == b0) {
				num = num + "0";
			}else if (button == b1) {
				num = num + "1";				
			}else if (button == b2) {
				num = num + "2";				
			}else if (button == b3) {
				num = num + "3";				
			}else if (button == b4) {
				num = num + "4";				
			}else if (button == b5) {
				num = num + "5";				
			}else if (button == b6) {
				num = num + "6";				
			}else if (button == b7) {
				num = num + "7";				
			}else if (button == b8) {
				num = num + "8";				
			}else if (button == b9) {
				num = num + "9";				
			}
			tf.setText(num);
		}
		
	};
	
	ActionListener oprListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			digit1 = tf.getText();
			tf.setText("");
			
			if (button == bplus) {
				operationFlag = ADD;
				System.out.println("First number = " + digit1);
			} else if (button == bmin) {
				operationFlag = MIN;
			} else if (button == bdiv) {
				operationFlag = DIV;
			} else if (button == bmul) {
				operationFlag = MUL;
			}
		}
	};
	
	ActionListener equalsListener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			if (button == equal) {
				digit2 = tf.getText();
				System.out.println("Second number  = " + digit2);
				
				if(operationFlag == ADD) {
					
					int sum = Integer.parseInt(digit1) + Integer.parseInt(digit2);
					tf.setText(String.valueOf(sum));
					
				} else if (operationFlag == MIN) {
					int sum = Integer.parseInt(digit1) - Integer.parseInt(digit2);
					tf.setText(String.valueOf(sum));
					
				} else if (operationFlag == DIV) {
					int div = Integer.parseInt(digit1) / Integer.parseInt(digit2);
					tf.setText(String.valueOf(div));

				} else if (operationFlag == MUL) {
					int mul = Integer.parseInt(digit1) * Integer.parseInt(digit2);
					tf.setText(String.valueOf(mul));

				}
				
			} else if (button == clear) {
				tf.setText("");
			}
		}
	};
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
	}
}
