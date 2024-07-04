


import javax.swing.*;
import java.awt.event.*;

public class FocusEventTest_Swing implements ActionListener, FocusListener{
	JFrame frame;
	JButton button;
	JTextField textField;

	public FocusEventTest_Swing() {
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
		textField.addActionListener(this);
		button.addFocusListener(this);
		
		frame.setSize(400, 200);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			textField.setText("HELLO WORLD ...!");
		}
	}

	public static void main(String[] args) {
		new FocusEventTest_Swing();
	}

	@Override
	public void focusGained(FocusEvent arg0) {
		System.out.println("focusGained");	
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		System.out.println("focusLost");			
	}
}
