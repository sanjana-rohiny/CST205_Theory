package Question14;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLight_swing extends JPanel{
	JFrame f;
	Color redSign, greenSign, yellowSign;
	JRadioButton red, green, yellow;
	ButtonGroup buttonGroup;
	
	public TrafficLight_swing() {
		f = new JFrame();
		
		buttonGroup = new ButtonGroup();
		
		red = new JRadioButton("red");
		green = new JRadioButton("green");
		yellow = new JRadioButton("yellow");

		f.setSize(400,400);
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void start() {
		buttonGroup.add(red);
		buttonGroup.add(green);
		buttonGroup.add(yellow);
		
		this.add(red);
		this.add(green);
		this.add(yellow);

		this.setSize(400,400);
		f.add(this);
		
		redSign = greenSign =  yellowSign = Color.LIGHT_GRAY;
		red.addActionListener(listener);
		green.addActionListener(listener);
		yellow.addActionListener(listener);
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
		
		g.drawOval(20, 230, 50, 50);
		g.setColor(yellowSign);
		g.fillOval(20, 230, 50, 50);
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
		tl.start();
	}

}
