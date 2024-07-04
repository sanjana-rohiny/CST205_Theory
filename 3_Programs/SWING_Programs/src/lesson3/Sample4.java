package lesson3;
/* Using Set bounds...! */

/* extending from Frame and implementing ActionListener */

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Sample4 extends JFrame implements ActionListener {

	JButton b1;
	JLabel label;
	
	public Sample4() {
		super("Container frame..!");
		
		label = new JLabel("Press a Button");
		b1 = new JButton("OK");
		
		add(label);
		add(b1);
		
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
		
		b1.addActionListener(this);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			JOptionPane.showMessageDialog(rootPane, 
					"Button pressed");		}
		
		
	}
	
	public static void main (String[] args) {
		new Sample4();		
	}
}

