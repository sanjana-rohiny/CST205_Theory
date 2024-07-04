package pane;

import java.awt.*;

import javax.swing.*;

public class SecondPanel extends JPanel {
	public SecondPanel() {
		this.setName("SecondPanel");
		setLayout(new BorderLayout());
		JLabel orangeLabel = new JLabel("");
		orangeLabel.setOpaque(true);
		orangeLabel.setBackground(Color.orange);
		orangeLabel.setPreferredSize(new Dimension(200, 180));
		add(orangeLabel, BorderLayout.SOUTH);
	}
}
