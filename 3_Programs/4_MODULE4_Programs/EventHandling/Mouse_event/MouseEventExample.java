

import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample implements MouseListener {
    JFrame frame;
    JButton button;

    public MouseEventExample() {
        frame = new JFrame("MouseListener Example");
        button = new JButton("Hover or Click Me");

        // Set button bounds
        button.setBounds(50, 50, 200, 30);

        // Add MouseListener to the button
        button.addMouseListener(this);

        // Add components to the frame
        frame.add(button);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited!");
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}










