package lesson3;

import javax.swing.*;

public class Sample0 {

	JFrame f;
	JLabel lab;
	public Sample0() {
		f = new JFrame("Container Frame..!");
		lab = new JLabel("Component label..!");

		f.add(lab);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main (String[] arg) {
		
		Sample0 s = new Sample0();


	}
}
