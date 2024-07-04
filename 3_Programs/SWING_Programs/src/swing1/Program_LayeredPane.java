package swing1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Program_LayeredPane {
	public static void main(String[] args) {
		JFrame f = new JFrame("LayeredPane");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLayeredPane pane = f.getLayeredPane();
		
		JMenuBar menubar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem open, close;
		open = new JMenuItem("open");
		close = new JMenuItem("close");
		menu.add(open);
		menu.add(close);
		menubar.add(menu);
		pane.add(menubar);
		pane.setVisible(true);
		JButton button = new JButton("Press Me");
		
		// add action listener for button
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Button Click");
			}
		});
		
		// create action listener for menu
		ActionListener menuListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println(e.getSource());
				if (e.getSource() == open) {
					JOptionPane.showMessageDialog(null, "Menu open");
				} else if (e.getSource() == close) {
					JOptionPane.showMessageDialog(null, "Menu close");
				}
			}
		};
		
		// add action listener
		open.addActionListener(menuListener);
		close.addActionListener(menuListener);
		
		// add a button
		f.getContentPane().add(button);
		f.setSize(300, 200);
		f.setResizable(false);
		f.setVisible(true);
		
		
	}
}
