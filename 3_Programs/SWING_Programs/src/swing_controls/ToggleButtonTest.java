package swing_controls;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class ToggleButtonTest extends JFrame{
	JToggleButton jtbn;
	JLabel jlab;
	
	public ToggleButtonTest() {
		super("Toggle Button Test");
		jtbn=new JToggleButton("On/Off");
		add(jtbn);
		jlab = new JLabel("Button is OFF");
		add(jlab);

		jtbn.addItemListener(listener);
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
	}
	
	ItemListener listener = new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			JToggleButton btn = (JToggleButton) e.getSource();
			if (btn.isSelected()) {
				jlab.setText("Button is ON");
			} else {
				jlab.setText("Button is OFF");
			}
		}
	};
	
	public static void main(String[] args) {
		ToggleButtonTest s = new ToggleButtonTest();
	}
}
