package UniversityQuestions;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class TrafficLight_Swing  extends JPanel implements ActionListener {

	
	JFrame frame;
	JRadioButton bRed, bGreen, bYellow;
	ButtonGroup bg;
	Color  red, green, yellow;
	
	TrafficLight_Swing() {
		
//1. initialize color to gray
//2. create frame and sey layout to null
//3. create radio button and group
//4. add to panel.
//5. set panle size.
//6. add to frame
//7. set frame size and visible 
		
//8. draw Circles (light)
//9. override paintComponent		
		
		//1. initialize color to gray
		red = green =  yellow = Color.LIGHT_GRAY;

		//2. create frame and sey layout to null
		frame = new JFrame("Traffic Light");
		frame.setLayout(null);
		
		//3. create radio button and group
		bRed = new JRadioButton("Red");
		bGreen = new JRadioButton("Green");
		bYellow = new JRadioButton("Yellow");
		bg = new ButtonGroup();
		bg.add(bRed);
		bg.add(bGreen);
		bg.add(bYellow);
		
		// add listener
		bRed.addActionListener(this);
		bGreen.addActionListener(this);
		bYellow.addActionListener(this);
		
		//4. add to panel.
		this.add(bRed);
		this.add(bGreen);
		this.add(bYellow);
		
		//5. set panle size.
		this.setSize(400, 400);
		
		//6. set frame size and visible 
		frame.add(this);
		
		//7. set frame size and visible 
		frame.setSize(400, 400);
		frame.setVisible(true);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawOval(50, 50, 50, 50);
		g.setColor(red);
		g.fillOval(50, 50, 50, 50);
		
		g.drawOval(50, 110, 50, 50);
		g.setColor(green);
		g.fillOval(50, 110, 50, 50);
		
		g.drawOval(50, 170, 50, 50);
		g.setColor(yellow);
		g.fillOval(50, 170, 50, 50);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JRadioButton b = (JRadioButton) e.getSource();
		red = green =  yellow = Color.LIGHT_GRAY;

		if (b == bRed) {
			red = Color.RED;
			System.out.println("Color red");
		} else if (b == bGreen) {
			green = Color.GREEN;
			System.out.println("Color green");
		} if (b == bYellow) {
			yellow = Color.YELLOW;
			System.out.println("Color yellow");
		}
		repaint();			

	}
	public static void main(String[] args) {
		new TrafficLight_Swing();
	}

	

}
