package HelloWorld;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestSwing {

	JFrame frame; 
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;
	
	JButton b1;
	
	
	TestSwing() {
		frame  = new JFrame("Sample program ..!");
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		b1  = new JButton("Clck me");
		
		b1.addActionListener(listener);
		
		frame.setLayout(new GridLayout(3,2));
		
		frame.add(tf1);
		frame.add(tf2);
		frame.add(tf3);
		frame.add(b1);
		
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	ActionListener listener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			JButton b = (JButton)e.getSource();
			System.out.println("Caption  = " + b.getActionCommand());

			
			int data = Integer.parseInt(tf1.getText());
			System.out.println("Data  = " + data);
			
			tf2.setText(String.valueOf((data+1)));
		}
	};
	
	public static void main(String[] args) {
		TestSwing test = new TestSwing();
				
	}

}
