package MVC;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*
 * The Model in this context might contain a boolean 
 * field that indicates whether the checkbox is 
 * checked or unchecked. This boolean field represents 
 * the state of the checkbox.
 */

/*
 * The View is the graphical representation or the 
 * user interface that displays the checkbox to the user. 
 * It includes the checkbox component itself, its appearance, 
 * and its position within the window or GUI.
 */

/*
 * the ActionListener interface is used to handle 
 * events triggered 
 * by the checkboxes (such as when they are checked or unchecked). 
 * This ActionListener interface serves as the Controller 
 * in this scenario.
 * 
 * This method bridges the interaction between the View (checkboxes) 
 * and the Model (checkbox states).
 */

/*
 * The UI delegate in Swing acts as a combined View and 
 * Controller for Swing components. It manages the visual 
 * representation (View) of a component and also handles 
 * user interactions and events (Controller).
 * 
 * In the provided checkbox example using Swing, 
 * the UI delegate for checkboxes, as well as for other 
 * Swing components, is part of the Swing library and is 
 * not explicitly referenced in the code. When you create a 
 * JCheckBox using new JCheckBox("Option 1"), 
 * Swing internally handles the creation of the UI delegate 
 * for the checkbox.
 */

class CheckboxExample extends JFrame {

	private JCheckBox checkBox1;
	private JCheckBox checkBox2;
	private JCheckBox checkBox3;
	private JLabel label;

	public CheckboxExample() {
		setTitle("Checkbox Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());

		checkBox1 = new JCheckBox("Option 1");

		label = new JLabel("Select options:");

		// Add checkboxes and label to the frame
		add(label);
		add(checkBox1);

		// Attach ActionListener to checkboxes
		checkBox1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedOptions = null;

				if (checkBox1.isSelected()) {
					selectedOptions = "Selected: " + checkBox1.getText() + " ";
				} else {
					selectedOptions = "Un Selected: " + checkBox1.getText();
				}

				// Display selected options in a dialog
				JOptionPane.showMessageDialog(getRootPane(), selectedOptions);
			}
		});

		// setLocationRelativeTo(null);
		setVisible(true);
		setSize(500, 300);

	}
}

// Application entry point
public class MVCSwingExample {
	public static void main(String[] args) {
		new CheckboxExample();
	}
}
