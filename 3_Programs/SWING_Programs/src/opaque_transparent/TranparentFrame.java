package opaque_transparent;
import javax.swing.*;
import java.awt.*;
/*
 * creating an opaque or transparent component involves 
 * setting the alpha (transparency) value of 
 * the component's background.
 */
public class TranparentFrame {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Transparent JFrame Example");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 255, 100)); 
        // Setting a semi-transparent blue color (alpha = 128)

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
