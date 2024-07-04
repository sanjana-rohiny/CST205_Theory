package opaque_transparent;
import javax.swing.*;
import java.awt.*;

public class OpaqueFrame {
	public static void main(String[] args) {
        JFrame frame = new JFrame("Opaque JFrame Example");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE); // Setting a solid blue color as the background

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
