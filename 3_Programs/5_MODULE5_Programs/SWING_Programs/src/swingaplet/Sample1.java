package swingaplet;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Sample1 extends JApplet{

	JTextField tf1;
	JTextField tf2;
	JTextField tf3;

	JLabel l1;
	JLabel l2;
	JLabel l3;
	
	JButton add;
	JButton sub;
	
	public Sample1() {
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		
		l1 = new JLabel("Enter No 1");
		l2 = new JLabel("Enter No 2");
		l3 = new JLabel("Result");
		
		add = new JButton("add");
		sub = new JButton("sub");

		this.add(l1); this.add(tf1);
		this.add(l2); this.add(tf2);
		this.add(l3); this.add(tf3);
		this.add(add); this.add(sub);
		
		add.addActionListener(listener);
		sub.addActionListener(listener);
		
		System.out.println("---inside Constructor()");
	}
	
	public void init() {
		System.out.println("---inside init()");

		this.setLayout(new GridLayout(5,3));
		this.setSize(400,400);
		this.setVisible(true);
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
    
    ActionListener listener = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == add) {
				int sum = Integer.parseInt(tf1.getText()) + 
						Integer.parseInt(tf2.getText());
				
				tf3.setText(String.valueOf(sum));
			}
			
			if (e.getSource() == sub) {
				int sum = Integer.parseInt(tf1.getText()) - 
						Integer.parseInt(tf2.getText());
				
				tf3.setText(String.valueOf(sum));
			}
		}
	};
}
