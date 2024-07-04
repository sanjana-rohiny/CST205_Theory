
//1. initialize color to gray
//2. create frame and sey layout to null
//3. create radio button and group
//4. add to panel.
//5. set panle size.
//6. add to frame
//7. set frame size and visible 
		
//8. draw Circles (light)
//9. override paintComponent		

//10. handle event on radio button
//11. repaint with selected color from listener

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLight_Swing  extends JPanel implements ActionListener {
	
	JFrame frame;
	JRadioButton bRed, bGreen, bYellow;
	ButtonGroup bg;
	Color  red, green, yellow;
	
	TrafficLight_Swing(String caption) {
			
		//1. initialize color to gray
		red = green =  yellow = Color.LIGHT_GRAY;

		//2. create frame and set layout to null
		frame = new JFrame(caption);
		frame.setLayout(null);
		
		//3. create radio button and add to group
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
		
		//4. add components to panel container.
		this.add(bRed);
		this.add(bGreen);
		this.add(bYellow);
		
		//5. set panle size.
		this.setSize(400, 400);
		
		//6. add panel to frame
		frame.add(this);
		
		//7. set frame size and visible 
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	// override paint(), the graphix objct can be used to draw anything
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
	
	// repainting from event listener, setting the preferd color 
	@Override
	public void actionPerformed(ActionEvent e) {
		JRadioButton b = (JRadioButton) e.getSource();
		red = green =  yellow = Color.LIGHT_GRAY;

		//10. handle event on radio button
		if (b == bRed) {
			red = Color.RED;
		} else if (b == bGreen) {
			green = Color.GREEN;
		} if (b == bYellow) {
			yellow = Color.YELLOW;
		}
		//11. repaint with selected color from listener
		repaint();			

	}
	public static void main(String[] args) {
		new TrafficLight_Swing("Traffic Light");
	}
}

