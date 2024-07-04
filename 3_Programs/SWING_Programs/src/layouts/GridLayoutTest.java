package layouts;

import javax.swing.JButton;

import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridLayoutTest {
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;

	JLabel l1;
	JLabel l2;
	JLabel l3;
	
	JButton add;
	JButton sub;
	JFrame f;
	public GridLayoutTest() {
		JFrame f = new JFrame("Gridlayout...!");
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		
		l1 = new JLabel("Enter No 1");
		l2 = new JLabel("Enter No 2");
		l3 = new JLabel("Result");
		
		add = new JButton("add");
		sub = new JButton("sub");

		f.add(l1); f.add(tf1);
		f.add(l2); f.add(tf2);
		f.add(l3); f.add(tf3);
		f.add(add); f.add(sub);
		GridLayout g = new GridLayout(4,2, 20,20);
		
		f.setLayout(g);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public static void main (String[] args) {
		GridLayoutTest s = new GridLayoutTest();		
	}
}
