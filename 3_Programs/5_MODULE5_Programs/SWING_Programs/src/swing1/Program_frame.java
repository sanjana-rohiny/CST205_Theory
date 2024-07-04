package swing1;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Program_frame {

	public static void main(String[] args) {
		
		// create frame container
		JFrame frame = new JFrame("Panel");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// add few components
		JTextField tf1 = new JTextField(5);
		JTextField tf2 = new JTextField(5);
		JTextField tf3 = new JTextField(5);
		JButton sum = new JButton("ADD");

		// set frame 
		frame.setSize(300, 200);
		frame.setResizable(false);
		frame.setVisible(true);

		// create Panel
		JPanel panel = new JPanel();
		
		// add component to container
		panel.add(tf1);
		panel.add(tf2);
		panel.add(tf3);
		panel.add(sum);
			
		// add panel to frame
		frame.add(panel);
		
		//add listener as innerclass
		ActionListener listner = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int sum = Integer.parseInt(tf1.getText()) + 
						  Integer.parseInt(tf2.getText());
				tf3.setText(String.valueOf(sum));
			}
		};
		
		// add action listener for button
		sum.addActionListener(listner);
	
	}

}
