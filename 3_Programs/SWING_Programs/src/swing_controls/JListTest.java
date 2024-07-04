package swing_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListTest extends JFrame{
	JList list;
	JLabel label;
	public JListTest() {
		super("JListTest");
		
		String colors[] = {"violet", "indigo", "blue", "green", "yellow", "Orange", "red"}; 
		list = new JList(colors);
		
		list.setPreferredSize(new Dimension(100,300));
		list.setVisible(true);
		list.setSelectedIndex(3);
		
		label = new JLabel("color");
		
		add(list);
		add(label);
		
		list.addListSelectionListener(listener);
		
		setLayout(new FlowLayout());
		setSize(400,400);
		setVisible(true);
	}
	
	ListSelectionListener listener = new ListSelectionListener() {

		@Override
		public void valueChanged(ListSelectionEvent e) {
			String str = ((JList)e.getSource()).getSelectedValue().toString();
			label.setText(str);
			
		}
		
	};
	public static void main(String[] args) {
		JListTest jt = new JListTest();
	}

}
