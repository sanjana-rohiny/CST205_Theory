package Swing_calculator;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator1 implements ActionListener{
	JFrame frame;
	JButton bdigits[]; 
	JButton bAdd, bSub, bDiv, bMul, equal, bc, dot;
	JTextField edit;
	int operator;
	boolean fraction = false;

	final int ADD = 1;
	final int SUB = 2;
	final int MUL = 3;
	final int DIV = 4;

	double num1, num2;
		
	Calculator1(String caption) {
		
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
		
		// create numeric buttons
		createDigitButtons();
				
		bAdd = new JButton("+");
		bAdd.setBounds(20, 190, 50, 30);
		frame.add(bAdd);
		
		bSub = new JButton("-");
		bSub.setBounds(100, 190, 50, 30);
		frame.add(bSub);
		
		bMul = new JButton("x");
		bMul.setBounds(180, 190, 50, 30);
		frame.add(bMul);
		
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
		
		
		//JComponent [] components = this.getContentPane().getComponents();
	    Component[] components = frame.getContentPane().getComponents();

	    for (Component component : components) {
	        if (component instanceof JButton) {
	            JButton button = (JButton) component;
	            System.out.println(button.getActionCommand());
	            //button.addActionListener(this);
	        }
	    }
	    
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void createDigitButtons() {
		int min_x = 20;
		int min_y = 70;
		int x_incr = 0;
		int y_incr = 0;
		
		// create digits
		int x,y;
		bdigits = new JButton[10];
		for (int i=0; i<10; i++) {
			x = min_x + x_incr;
			y = min_y + y_incr;
			bdigits[i] = new JButton(String.valueOf(i));
			bdigits[i].setBounds(x, y, 50, 30);
			if (y % 150 == 0) {
				y_incr = 0;
				x_incr += 80;
			} else {
				y_incr += 40;
			}
			frame.add(bdigits[i] );
			bdigits[i].addActionListener(this);
		}
	}
	
	public static void main(String[] args) {
		Calculator1 calc = new Calculator1("Calculator..!");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
