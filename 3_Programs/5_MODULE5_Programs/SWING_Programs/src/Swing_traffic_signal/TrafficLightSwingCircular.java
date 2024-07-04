package Swing_traffic_signal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightSwingCircular extends JPanel {

    JFrame frame;
    CirclePanel redLight, greenLight, yellowLight;
    JRadioButton redButton, greenButton, yellowButton;
    ButtonGroup buttonGroup;
    
    public TrafficLightSwingCircular() {
        // Create JFrame
        frame = new JFrame("Circular Traffic Light Example");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Create the traffic light panels with default color LIGHT_GRAY
        redLight = new CirclePanel(Color.LIGHT_GRAY);
        greenLight = new CirclePanel(Color.LIGHT_GRAY);
        yellowLight = new CirclePanel(Color.LIGHT_GRAY);

        // Create a panel to hold the lights
        JPanel lightPanel = new JPanel();
        lightPanel.setLayout(new GridLayout(3, 1, 10, 10));
        lightPanel.add(redLight);
        lightPanel.add(greenLight);
        lightPanel.add(yellowLight);
        
        // Create radio buttons
        redButton = new JRadioButton("Red");
        greenButton = new JRadioButton("Green");
        yellowButton = new JRadioButton("Yellow");

        // Group the buttons
        buttonGroup = new ButtonGroup();
        buttonGroup.add(redButton);
        buttonGroup.add(greenButton);
        buttonGroup.add(yellowButton);

        // Create a panel for the buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 10, 10));
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(yellowButton);

        // Register Action Listeners for buttons
        redButton.addActionListener(listener);
        greenButton.addActionListener(listener);
        yellowButton.addActionListener(listener);
        
        // Add panels to frame
        frame.add(lightPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }

    // Custom JPanel to draw a circle with a specific color
    class CirclePanel extends JPanel {
        private Color color;

        public CirclePanel(Color initialColor) {
            this.color = initialColor;
            this.setPreferredSize(new Dimension(100, 100));
        }

        public void setColor(Color color) {
            this.color = color;
            repaint();  // Repaint the panel when the color is changed
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            // Enable anti-aliasing for smoother edges
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            // Ensure the panel size remains square (for circles)
            int size = Math.min(getWidth(), getHeight()) - 20;
            
            // Set the color and draw the filled circle
            g2d.setColor(color);
            g2d.fillOval(10, 10, size, size);  // Circle shape inside the panel with padding
        }
    }

    // ActionListener for the radio buttons
    ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Reset all lights to gray
            redLight.setColor(Color.LIGHT_GRAY);
            greenLight.setColor(Color.LIGHT_GRAY);
            yellowLight.setColor(Color.LIGHT_GRAY);

            // Change the selected light color
            if (e.getSource() == redButton) {
                redLight.setColor(Color.RED);
            } else if (e.getSource() == greenButton) {
                greenLight.setColor(Color.GREEN);
            } else if (e.getSource() == yellowButton) {
                yellowLight.setColor(Color.YELLOW);
            }
        }
    };
    
    public static void main(String[] args) {
        new TrafficLightSwingCircular();
    }
}
