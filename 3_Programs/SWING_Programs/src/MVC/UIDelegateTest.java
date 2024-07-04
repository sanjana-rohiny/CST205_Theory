package MVC;


import javax.swing.*;
import javax.swing.plaf.basic.BasicCheckBoxUI;
import java.awt.*;

/*
 * UI-Delegate is explicitely handled.
 * It combines View and COntoller..!
 */
 class CustomCheckBoxExample extends JFrame {
    public CustomCheckBoxExample() {
        setTitle("Custom Checkbox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JCheckBox customCheckBox = new JCheckBox("Custom Checkbox");
        // Get the UI delegate and customize its appearance
        customCheckBox.setUI(new CustomCheckBoxUI());

        add(customCheckBox);

        setLocationRelativeTo(null);
        setVisible(true);
        setSize(500,500);
    }

    // Custom UI delegate for the checkbox
    static class CustomCheckBoxUI extends BasicCheckBoxUI {
        @Override
        public void installDefaults(AbstractButton button) {
            super.installDefaults(button);
            button.setOpaque(false); // Make checkbox transparent
            button.setForeground(Color.BLUE); // Change the text color
        }

        @Override
        public void paint(Graphics g, JComponent c) {
            AbstractButton button = (AbstractButton) c;
            ButtonModel model = button.getModel();
            Graphics2D g2 = (Graphics2D) g.create();
            // Custom rendering based on button's state
            if (model.isSelected()) {
                g2.setColor(Color.GREEN); // Checkbox checked color
            } else {
                g2.setColor(Color.RED); // Checkbox unchecked color
            }

            g2.fillRect(0, 0, c.getWidth(), c.getHeight());

            g2.dispose();
            super.paint(g, c);
        }
    }
}

public class UIDelegateTest {
	public static void main(String[] args) {
            new CustomCheckBoxExample();
    }
}
