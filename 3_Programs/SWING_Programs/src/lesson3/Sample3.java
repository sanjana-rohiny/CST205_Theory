package lesson3;

/* extending from Frame and implementing ActionListener */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sample3 extends JFrame {

	JButton b1;	
	JLabel label;
	
	public Sample3() {
		super("Container frame..!");
		
		label = new JLabel("Press a Button");
		b1 = new JButton("OK");
		
		add(label);
		add(b1);
		
		setLayout(new FlowLayout());
		setSize(500,400);
		setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane, 
						"Button pressed");
			}
		});
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main (String[] args) {
		Sample3 s3 = new Sample3();		
	}
}
