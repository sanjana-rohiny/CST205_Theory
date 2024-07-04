

import javax.swing.*;
import java.awt.event.*;

public class KeyEventExample implements KeyListener {
    JFrame frame;
    JTextField textField;

    public KeyEventExample() {
        frame = new JFrame("KeyListener Example");
        textField = new JTextField(20);

        // Add KeyListener to the text field
        textField.addKeyListener(this);

        // Add components to the frame
        frame.add(textField);
        frame.setSize(300, 200);
        frame.setLayout(new java.awt.FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyCode());
    }

    public static void main(String[] args) {
        new KeyEventExample();
    }
}
