package pane;

import java.awt.*;

import javax.swing.*;

public class FirstPanel extends JPanel {

	public FirstPanel() {
		this.setName("FirstPanel");
		setLayout(new GridLayout(4,3,10,10));
		for (int i=1; i<=9; i++)
		add(new JButton(i + ""));
		add(new JButton("*"));
		add(new JButton("0"));
		add(new JButton("#"));
	}
}
