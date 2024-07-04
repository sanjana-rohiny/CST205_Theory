

import javax.swing.*;
import java.awt.event.*;

public class KeyEventListenerTest_Swing implements KeyListener{
	JFrame frame;
	JLabel label;
	JTextField textField;

	KeyEventListenerTest_Swing() {
	frame = new JFrame("Hello World Program");	    
		frame.setLayout(null); 

		// Initialize the button and text field
		label = new JLabel("Enter data :");
		textField = new JTextField();

		// Position the gui with (x, y, width, height)
		label.setBounds(50, 50, 100, 30); 
		textField.setBounds(160, 50, 200, 30);

		// Add components to the frame
		frame.add(label);
		frame.add(textField);

		// register event to textfield	
		textField.addKeyListener(this);
		
		frame.setSize(400, 200);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	public static void main(String[] args) {
		new KeyEventListenerTest_Swing();
	}

	@Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyCode());
    }

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
}
