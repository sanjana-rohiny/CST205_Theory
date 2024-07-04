package PanelTst;

import javax.swing.*;
import java.awt.*;

class JFrameWithPanelsTest extends JFrame {
	public JFrameWithPanelsTest() {
		setTitle("JFrame with Two JPanels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		// Create two JPanels
		JPanel buttonPanel = new JPanel();
		JPanel textFieldPanel = new JPanel();

		// Add buttons to the buttonPanel
		buttonPanel.add(new JButton("Button 1"));
		buttonPanel.add(new JButton("Button 2"));
		buttonPanel.add(new JButton("Button 3"));

		// Add text fields to the textFieldPanel
		textFieldPanel.add(new JTextField(15));
		textFieldPanel.add(new JTextField(15));
		textFieldPanel.add(new JTextField(15));

		// Set layouts for the two panels (FlowLayout here, you can change it as needed)
		buttonPanel.setLayout(new FlowLayout());
		textFieldPanel.setLayout(new FlowLayout());
		// set size 
		buttonPanel.setPreferredSize(new Dimension(400, 100));
        textFieldPanel.setPreferredSize(new Dimension(400, 150));

		// Add the two panels to the JFrame
		add(buttonPanel, BorderLayout.NORTH);
		add(textFieldPanel, BorderLayout.CENTER);

		setLocationRelativeTo(null);
		setVisible(true);
		setSize(500, 300);
	}
}

public class Paneltest {
	public static void main(String[] args) {
		new JFrameWithPanelsTest();
	}
}
