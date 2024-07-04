package lesson3;

import javax.swing.*;

public class Sample1 extends JFrame{

	JLabel lab;
	public Sample1() {
		lab = new JLabel("Component label..!");
		setTitle("Container Frame..!");
		add(lab);
		setSize(400,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main (String[] arg) {
		Sample1 s = new Sample1();
	}
}
