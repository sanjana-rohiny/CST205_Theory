package layouts;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class FlowLayoutTest {

	JFrame f;
	JButton b1;
	JButton b2;
	JLabel label;
	
	public FlowLayoutTest() {
		f = new JFrame("Container frame..!");
		f.setLayout(new FlowLayout());
		//f.setLayout(new FlowLayout(FlowLayout.LEFT));
		//f.setLayout(new FlowLayout(FlowLayout.LEFT, 50,50));

		label = new JLabel("Press a Button");
		b1 = new JButton("OK");
		b2 = new JButton("Cancel");

		f.add(label);
		f.add(b1);
		f.add(b2);

		f.setSize(300,300);
		f.setVisible(true);
		
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	ActionListener listener = new ActionListener () {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == b1) {
				label.setText("OK Pressed..!");
			}
			
			if(e.getSource() == b2) {
				label.setText("Cancel Pressed..!");
			}
		}
	};
	

	public static void main (String[] args) {
		FlowLayoutTest s = new FlowLayoutTest();		
	}

}
