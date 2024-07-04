

import javax.swing.*;
import java.awt.event.*;

public class ActionEvent_Swing implements ActionListener{
	JFrame frame;
	JButton button;
	JTextField textField;

	public ActionEvent_Swing() {
		frame = new JFrame("Hello World Program");	    
		frame.setLayout(null); 

		// Initialize the button and text field
		button = new JButton("Click Me");
		textField = new JTextField();

		// Position the gui with (x, y, width, height)
		button.setBounds(50, 50, 100, 30); 
		textField.setBounds(160, 50, 200, 30);

		// Add components to the frame
		frame.add(button);
		frame.add(textField);

		// register event to button	
		button.addActionListener(this);
		
		frame.setSize(400, 200);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			textField.setText("HELLO WORLD ...!");
			
			System.out.println("Functions are");
			System.out.println("getActionCommand() : " + e.getActionCommand());
			System.out.println("getModifiers() : " + e.getModifiers());
			System.out.println("getID() : " + e.getID());
			System.out.println("paramString() : " + e.paramString());
		}
	}

	public static void main(String[] args) {
		ActionEvent_Swing test = new ActionEvent_Swing();
	}
}
