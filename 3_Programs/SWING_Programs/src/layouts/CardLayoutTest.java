package layouts;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

public class CardLayoutTest extends JFrame{

	CardLayout card;
	JButton b1,b2,b3, b4, b5;
	Container panel;
	JPanel p;
	public CardLayoutTest() {
		panel = getContentPane();
		card=new CardLayout(4,30);
		this.setLayout(card);
		
		b1=new JButton("Apple");
		b2=new JButton("Boy");
		b3=new JButton("Cat");
		b4=new JButton("Alice");
		b5=new JButton("Bob");
		
		p = new JPanel();
		p.setLayout(new FlowLayout());
		p.add(b4);
		p.add(b5);
		
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(p);
		
		setSize(400, 400);
		setVisible(true);
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	ActionListener listener = new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			//card.next(panel);
			
			JButton b = (JButton)e.getSource();
			if (b == b4) {
				card.next(panel);
				return;
			}
			
			if (b == b5) {
				card.previous(panel);
				return;

			}
			card.next(panel);
		}
		
	};
	public static void main(String[] args) {
		CardLayoutTest c = new CardLayoutTest();
	}

}
