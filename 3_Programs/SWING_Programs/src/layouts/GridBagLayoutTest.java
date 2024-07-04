package layouts;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GridBagLayoutTest extends JFrame{
	JTextField tf1;
	JTextField tf2;
	JTextField tf3;

	JLabel l1;
	JLabel l2;
	JLabel l3;
	
	JButton add;
	JButton sub;
	
	public GridBagLayoutTest() {
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		
		l1 = new JLabel("Enter No 1");
		l2 = new JLabel("Enter No 2");
		l3 = new JLabel("Result");
		
		add = new JButton("add");
		sub = new JButton("sub");
		
		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(grid);
		
		/* Insets are used to define the margins or 
		 * padding around the edges of a component within a 
		 * layout manager. 
		 * They represent the amount of space between 
		 * the component's border and the component's content
		 */
					// top, left, bottom, right
		gbc.insets = new Insets(30, 0, 0, 0);

		// add one l1 and tf1 horizontally
		gbc.fill= GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0; // row 1
		gbc.gridy = 0; // col 1
		
		this.add(l1, gbc);
		gbc.gridx = 1; // row 2
		gbc.gridy = 0; // col 1
		this.add(tf1, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0; // row 1
		gbc.gridy = 1; // col 2
		this.add(l2, gbc);
		gbc.gridx = 1; // row 2
		gbc.gridy = 1; // col 1
		this.add(tf2, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0; // row 1
		gbc.gridy = 2; // col 3
		this.add(l3, gbc);
		gbc.gridx = 1; // ro2 2
		gbc.gridy = 2; // col 3
		this.add(tf3, gbc);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 3;
		this.add(add, gbc);
		gbc.gridx = 1;
		gbc.gridy = 3;
		this.add(sub, gbc);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	
	public static void main (String[] args) {
		GridBagLayoutTest a = new GridBagLayoutTest();
	}
}
