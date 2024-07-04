package lesson3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class Sample5 {

	JFrame f;
	JButton b1;
	JButton b2;
	JLabel label;

	public Sample5() {
		f = new JFrame("Container frame..!");

		label = new JLabel("Press a Button");
		label.setBounds(20, 20, 150, 30);
		b1 = new JButton("OK");
		b1.setBounds(20, 60, 100, 30);
		b2 = new JButton("Cancel");
		b2.setBounds(20, 100, 100, 30);

		f.add(label);
		f.add(b1);
		f.add(b2);

		f.setLayout(null);
		f.setSize(300, 300);
		f.setVisible(true);

		b1.addActionListener(listener);
		b2.addActionListener(listener);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	ActionListener listener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				JOptionPane.showMessageDialog(f, "Ok pressed");
			}

			if (e.getSource() == b2) {
				JOptionPane.showMessageDialog(f, "Cancel pressed");
			}
		}
	};

	public static void main(String[] args) {
		Sample5 s4 = new Sample5();
	}
}