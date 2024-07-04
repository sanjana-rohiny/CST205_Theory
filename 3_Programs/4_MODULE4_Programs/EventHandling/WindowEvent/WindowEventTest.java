

import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class WindowEventTest implements WindowListener{
	JFrame frame;
	JButton button;
	JTextField textField;

	public WindowEventTest() {
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
		frame.addWindowListener(this);
		
		frame.setSize(400, 200);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new WindowEventTest();
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("windowActivated");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("windowClosed");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("windowClosing");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("windowDeactivated");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("windowDeiconified");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("windowIconified");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("windowOpened");
	}
}
