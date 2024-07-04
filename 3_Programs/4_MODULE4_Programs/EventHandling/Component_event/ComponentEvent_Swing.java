

import javax.swing.*;
import java.awt.event.*;

public class ComponentEvent_Swing implements ItemListener, ComponentListener {
	JFrame frame;
	JCheckBox checkbox;
	JTextField textField;

	public ComponentEvent_Swing() {
		frame = new JFrame("Hello World Program");	    
		frame.setLayout(null); 

		// Initialize the button and text field
		checkbox = new JCheckBox("Click Me");
		textField = new JTextField();

		// Position the gui with (x, y, width, height)
		checkbox.setBounds(50, 50, 100, 30); 
		textField.setBounds(160, 50, 200, 30);

		// Add components to the frame
		frame.add(checkbox);
		frame.add(textField);

		// register event to button	
		checkbox.addItemListener(this);
		textField.addComponentListener(this);
		
		frame.setSize(400, 200);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == 1) {
			textField.setVisible(false);
		} else {
			textField.setVisible(true);
		}		
	}

	public static void main(String[] args) {
		ComponentEvent_Swing test = new ComponentEvent_Swing();
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
	     int event = arg0.getID() & arg0.COMPONENT_HIDDEN;
	     System.out.println("componentHidden ");
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
	     System.out.println("componentMoved ");
	}

	@Override
	public void componentResized(ComponentEvent arg0) {
	     System.out.println("componentResized ");
	}

	@Override
	public void componentShown(ComponentEvent arg0) {
	     System.out.println("componentShown ");
	}
}
