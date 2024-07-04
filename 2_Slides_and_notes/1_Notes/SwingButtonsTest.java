

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class SwingButtonsTest extends JFrame{
	JToggleButton jtbn;
	JLabel jlab;
	JLabel jlab1;
	JButton jbtn;
	JRadioButton jr1;
	JRadioButton jr2;
	JRadioButton jr3;

	ButtonGroup bg;
	JButton jbtn1;

	public SwingButtonsTest() {
		super("Toggle Button Test");
		jtbn=new JToggleButton("On/Off");
		jtbn.setBounds(30, 60, 100, 30);
		add(jtbn);

		jlab = new JLabel("Button is OFF");
		jlab.setBounds(150, 60, 100, 30);
		add(jlab);

		jbtn=new JButton("On");
		jbtn.setBounds(30, 100, 100, 30);
		add(jbtn);

		jlab1 = new JLabel("Button is On");
		jlab1.setBounds(150, 100, 100, 30);
		add(jlab1);

		jr1 = new JRadioButton("red");
		jr2 = new JRadioButton("green");
		jr3 = new JRadioButton("yellow");
		bg = new ButtonGroup();

		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		jr1.setBounds(30, 150, 70, 30);
		jr2.setBounds(110, 150, 70, 30);
		jr3.setBounds(190, 150, 70, 30);

		
		jbtn1=new JButton("Reset");
		jbtn1.setBounds(250, 100, 100, 30);
		add(jbtn1);
		
		add(jr1);
		add(jr2);
		add(jr3);

		jtbn.addItemListener(listener);
		jbtn.addActionListener(btnListener);
		jbtn1.addActionListener(btnListener);

		int i = 0;
		bool b = i;
		
		setLayout(null);
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

	ActionListener btnListener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource() == jbtn) {
			jlab1.setText("Button Clicked..!");
			} else if (e.getSource() == jbtn1) {
				jbtn.setActionCommand("On");
				jlab1.setText("Button is On");
			}
		};
		
	};
	public static void main(String[] args) {
		SwingButtonsTest s = new SwingButtonsTest();
	}
}

