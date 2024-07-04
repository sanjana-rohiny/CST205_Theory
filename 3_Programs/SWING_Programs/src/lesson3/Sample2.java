package lesson3;
/* NOT extending from Frame and NOT implementing ActionListener */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sample2 {

	JFrame f;
	JButton b1;
	JLabel label;
	public Sample2() {
		f = new JFrame("Container frame..!");	
		label = new JLabel("Press a Button");
		b1 = new JButton("OK");
		f.add(label);
		f.add(b1);
		
		f.setLayout(new FlowLayout());
		f.setSize(300,300);
		f.setVisible(true);
		
		b1.addActionListener(listener);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				JOptionPane.showMessageDialog(f, "Button presed");
			}
			
		}
	};

	public static void main (String[] args) {
		Sample2 s2 = new Sample2();		
	}
}
