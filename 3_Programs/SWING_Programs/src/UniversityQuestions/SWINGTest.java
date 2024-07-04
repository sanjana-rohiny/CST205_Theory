package UniversityQuestions;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class SWINGTest {

	JFrame f;
	JButton b;
	JTextField input;
	JTextField tfPlus;
	JTextField tfMinus;
	boolean flag = false;

	SWINGTest() {
		f = new JFrame("Button handler test");
		b = new JButton("Click me");
		input = new JTextField();
		tfPlus = new JTextField();
		tfMinus = new JTextField();

		input.setBounds(20, 20, 100, 30);
		b.setBounds(20, 60, 100, 30);

		tfPlus.setBounds(160, 20, 100, 30);
		tfMinus.setBounds(160, 60, 100, 30);

		f.add(b);
		f.add(input);
		f.add(tfPlus);
		f.add(tfMinus);

		b.addActionListener(listener);
		input.getDocument().addDocumentListener(testListener);
		
		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	
	ActionListener listener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			try {
				if (flag == false) {
					int num = Integer.parseInt(input.getText());
					tfPlus.setText(String.valueOf((num+1)));
					tfMinus.setText(String.valueOf((num-1)));
					flag = true;
				} else {
					tfPlus.setText(String.valueOf((1+ Integer.parseInt(tfPlus.getText()))));
					tfMinus.setText(String.valueOf((Integer.parseInt(tfMinus.getText()))-1));
				}
			} catch (NumberFormatException ex) {

			}

		}
	};

	DocumentListener testListener = new DocumentListener() {
		private void textChanged() {
            System.out.println("Text changed1: " + input.getText());
        }

		public void changedUpdate(DocumentEvent arg0) {
		}

		public void insertUpdate(DocumentEvent arg0) {
            System.out.println("Text changed: " + input.getText());
			flag = false;
		}

		public void removeUpdate(DocumentEvent arg0) {
		}
	};
	
	public static void main(String[] args) {
		new SWINGTest();
	}
}
