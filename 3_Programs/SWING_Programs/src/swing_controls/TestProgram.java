package swing_controls;


import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestProgram {
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;

	JLabel l1;
	JLabel l2;
	JLabel l3;
	
	JButton add;
	JButton sub;
	JFrame f;
	
	public TestProgram() {
		JFrame f = new JFrame("Gridlayout...!");
		
		// add image to label
		ImageIcon num1 = new ImageIcon("/u/sumesh/Image.jpg");
		ImageIcon num2 = new ImageIcon("/u/sumesh/Image1.jpg");

		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		
		l1 = new JLabel(num1);
		l1.setToolTipText("Enter number 1");
		l2 = new JLabel();
		l2.setIcon(num2);
		
		l3 = new JLabel();
		l3.setText("Result");
		
		add = new JButton("add");
		sub = new JButton("sub");

		f.add(l1); f.add(tf1);
		f.add(l2); f.add(tf2);
		f.add(l3); f.add(tf3);
		f.add(add); f.add(sub);
		GridLayout g = new GridLayout(5,3, 10,10);
		
		f.setLayout(g);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main (String[] args) {
		TestProgram s = new TestProgram();		
	}
}
