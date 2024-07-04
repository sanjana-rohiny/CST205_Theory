package Adder_program;

import javax.swing.*;
import java.awt.event.*;

public class Adder_swing implements ActionListener {
	JFrame frame;
	JButton addButton;
	JButton subButton;
	JTextField num1, num2, result;

	Adder_swing(String caption) {

		frame = new JFrame(caption);
		frame.setLayout(null);
		frame.setSize(400, 300);

		addButton = new JButton("+");
		subButton = new JButton("-");
		num1 = new JTextField(60);
		num2 = new JTextField(60);
		result = new JTextField(60);

		addButton.setBounds(20, 50, 100, 30);
		subButton.setBounds(20, 90, 100, 30);
		num1.setBounds(140, 50, 150, 30);
		num2.setBounds(140, 90, 150, 30);
		result.setBounds(140, 130, 150, 30);

		frame.add(addButton);
		frame.add(subButton);
		frame.add(num1);
		frame.add(num2);
		frame.add(result);

		addButton.addActionListener(this);
		subButton.addActionListener(this);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Adder_swing("Adder ..!");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton b = (JButton) e.getSource();
		int val = 0;

		if (b == addButton) {
			try {
				val = Integer.parseInt(num1.getText()) + 
						Integer.parseInt(num2.getText());
			} catch(Exception ex) {
				System.out.println("Exception :" + ex.getMessage());
			}
			result.setText(String.valueOf(val));
		} else if (b == subButton) {
			try {
				val = Integer.parseInt(num1.getText()) - 
						Integer.parseInt(num2.getText());
			} catch(Exception ex) {
				System.out.println("Exception :" + ex.getMessage());
			}
			result.setText(String.valueOf(val));
		}
	}
}
