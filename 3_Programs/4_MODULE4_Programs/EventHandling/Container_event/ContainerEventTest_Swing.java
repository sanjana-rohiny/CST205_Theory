

import javax.swing.*;
import java.awt.event.*;

public class ContainerEventTest_Swing implements ItemListener, ContainerListener {
	JFrame frame;
	JCheckBox checkbox;
	JTextField textField;

	public ContainerEventTest_Swing() {
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
		frame.addContainerListener(this);
		
		frame.setSize(400, 200);
		frame.setVisible(true); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == 1) {
			frame.remove(textField);
			componentRemoved(new ContainerEvent(frame, ContainerEvent.COMPONENT_REMOVED, textField));
		} else {
			frame.add(textField);
			componentAdded(new ContainerEvent(frame, ContainerEvent.COMPONENT_ADDED, textField));
		}	
		
		frame.revalidate();
        frame.repaint();
	}

	public static void main(String[] args) {
		ContainerEventTest_Swing test = new ContainerEventTest_Swing();
	}

	@Override
	public void componentAdded(ContainerEvent e) {
		System.out.println("componentAdded");
	}

	@Override
	public void componentRemoved(ContainerEvent e) {
		System.out.println("componentRemoved");
	}

	
}
