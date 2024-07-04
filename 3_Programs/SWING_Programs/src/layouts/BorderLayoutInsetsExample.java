package layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BorderLayoutInsetsExample {
	JFrame frame;

    public BorderLayoutInsetsExample() {
        frame = new JFrame("BorderLayout with Insets Example");

        JButton buttonNorth = new JButton("North");
        JButton buttonSouth = new JButton("South");
        JButton buttonEast = new JButton("East");
        JButton buttonWest = new JButton("West");
        JButton buttonCenter = new JButton("Center");

		/*
		 * buttonNorth.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30)); //
		 * Insets: top, left, bottom, right
		 * buttonSouth.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
		 * buttonEast.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
		 * buttonWest.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
		 * buttonCenter.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));
		 */
        frame.setLayout(new BorderLayout());

        frame.add(buttonNorth, BorderLayout.NORTH);
        frame.add(buttonSouth, BorderLayout.SOUTH);
        frame.add(buttonEast, BorderLayout.EAST);
        frame.add(buttonWest, BorderLayout.WEST);
        frame.add(buttonCenter, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new BorderLayoutInsetsExample();
    }
}
