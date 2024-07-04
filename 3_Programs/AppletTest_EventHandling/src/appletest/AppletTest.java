package appletest;

import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class AppletTest extends Applet implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	TextField num1 = new TextField();
	TextField num2 = new TextField();
	TextField sum = new TextField();
	Button addButton = new Button("Add");
	Button subButton = new Button("Sub");

	public AppletTest() throws HeadlessException {
	
		System.out.println("---inside Constructor()");

		Label l1 = new Label("First number ");
		Label l2 = new Label("Second number ");
		Label l3 = new Label("Sum ");

		setLayout(new GridLayout(5,3));
		add(l1);
		add(num1);
		add(l2);
		add(num2);
		add(l3);
		add(sum);
		add(addButton);
		add(subButton);

		addButton.addActionListener(this);
		subButton.addActionListener(this);
	}
	
	public void init() {
		System.out.println("---inside init()");
	}
    public void start() {
		System.out.println("---inside start()");
	}
    
    public void stop() {
		System.out.println("---inside stop()");
	}
    
    public void paint(Graphics g) {
		System.out.println("---inside Paint()");
	}
    
    public void distroy() {
		System.out.println("---inside distroy()");
	}
    
	public void actionPerformed(ActionEvent e) {
		
		if( e.getSource() == addButton) {
			int sum = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
			this.sum.setText(String.valueOf(sum));
		} else if (e.getSource() == subButton) {
			int sum = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
			this.sum.setText(String.valueOf(sum));
		}
		
	}

}