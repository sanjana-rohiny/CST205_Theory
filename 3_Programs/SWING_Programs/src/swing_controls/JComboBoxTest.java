package swing_controls;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JComboBoxTest extends JFrame {

	
	JComboBox  combo1;
	JLabel label;

	public JComboBoxTest() {
		super("JCombo Box Test");
		String colors[] = {"violet", "indigo", "blue", "green", "yellow", "Orange", "red"}; 
		combo1 = new JComboBox(colors);
		label = new JLabel("color");

		add(combo1);
		add(label);
		
		combo1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox c = (JComboBox) e.getSource();
				String str = (String)c.getItemAt(c.getSelectedIndex());
				label.setText(str);
			}
		});
		
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JComboBoxTest jc = new JComboBoxTest();
	}

}
