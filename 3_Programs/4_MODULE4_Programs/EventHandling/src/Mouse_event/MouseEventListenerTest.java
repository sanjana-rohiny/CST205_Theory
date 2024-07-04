package Mouse_event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import Key_Event.Listener;

public class MouseEventListenerTest {

	public static void main(String[] args) {
		Frame frame = new Frame("ActionEventExample");	    
		frame.setLayout(new GridLayout(5,3));

		TextField result = new TextField();
		TextField num1 = new TextField();
		TextField num2 = new TextField();

		Label l1 = new Label("First number ");
		Label l2 = new Label("Second number ");
		Label l3 = new Label("Result ");

		Button addButton = new Button("Add");
		Button subButton = new Button("Sub");
		frame.add(l1);
		frame.add(num1);
		frame.add(l2);
		frame.add(num2);
		frame.add(l3);
		frame.add(result);
		frame.add(addButton);
		frame.add(subButton);
		frame.setSize(400, 400);
		frame.setVisible(true);
	
		MouseListener ml = new MListener();
		num1.addMouseListener(ml);
		
		MouseWheelListener mw = new MWheelListener();
		result.addMouseWheelListener(mw);
		
		// register action listener for button1
		ActionListener add = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int sum = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
				result.setText(String.valueOf(sum));				
			}
		};
		addButton.addActionListener(add);

		// register action listener for button2
		ActionListener sub = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int sum = Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText());
				result.setText(String.valueOf(sum));
			}
		};
		subButton.addActionListener(sub);

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		frame.setSize(400, 400);
		frame.setVisible(true);

	}

}
