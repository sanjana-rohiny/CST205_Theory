package Swing_traffic_signal;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight_swing extends JPanel {

	JFrame frame;
	Color redSign, greenSign, yellowSign;
	JRadioButton red, green, yellow;
	ButtonGroup buttonGroup;
	
	public TrafficLight_swing() {
		// initialize default color
		redSign = greenSign =  yellowSign = Color.LIGHT_GRAY;
		
		frame = new JFrame();
		
		// create button and buttongroup
		buttonGroup = new ButtonGroup();
		red = new JRadioButton("red");
		green = new JRadioButton("green");
		yellow = new JRadioButton("yellow");
		buttonGroup.add(red);
		buttonGroup.add(green);
		buttonGroup.add(yellow);
		
		// add buttons to Panel
		this.add(red);
		this.add(green);
		this.add(yellow);
		this.setSize(400,400);
		
		// add panel to frame
		frame.add(this);
		
		// register listeners 
		red.addActionListener(listener);
		green.addActionListener(listener);
		yellow.addActionListener(listener);
		
		frame.setSize(400,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(20, 100, 50, 50);
		g.setColor(redSign);
		g.fillOval(20, 100, 50, 50);
		
		g.drawOval(20, 160, 50, 50);
		g.setColor(greenSign);
		g.fillOval(20, 160, 50, 50);
		
		g.drawOval(20, 220, 50, 50);
		g.setColor(yellowSign);
		g.fillOval(20, 220, 50, 50);
		
		
	}

	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			redSign = greenSign =  yellowSign = Color.LIGHT_GRAY;
			if (e.getSource() == red) {
				redSign = Color.red;
			} else if (e.getSource() == green) {
				greenSign = Color.green;
			} if (e.getSource() == yellow) {
				yellowSign = Color.yellow;
			}
			repaint();			
		}
	};
	
	public static void main(String[] args) {
		TrafficLight_swing tl = new TrafficLight_swing();
	}

}