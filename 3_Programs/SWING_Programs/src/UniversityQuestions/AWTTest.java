package UniversityQuestions;

import java.awt.*;
import java.awt.event.*;

public class AWTTest {

	Frame f;
	Button b;
	TextField input;
	TextField tfPlus;
	TextField tfMinus;
	boolean flag = false;

	AWTTest() {
		f = new Frame("Button handler test");
		b = new Button("Click me");
		input = new TextField();
		tfPlus = new TextField();
		tfMinus = new TextField();

		input.setBounds(20, 20, 100, 30);
		b.setBounds(20, 60, 100, 30);

		tfPlus.setBounds(160, 20, 100, 30);
		tfMinus.setBounds(160, 60, 100, 30);

		f.add(b);
		f.add(input);
		f.add(tfPlus);
		f.add(tfMinus);

		b.addActionListener(listener);
		input.addTextListener(textListenre);

		f.setLayout(null);
		f.setSize(400, 400);
		f.setVisible(true);

		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	ActionListener listener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				if (flag == false) {
					int num = Integer.parseInt(input.getText());
					tfPlus.setText(String.valueOf((num + 1)));
					tfMinus.setText(String.valueOf((num - 1)));
					flag = true;
				} else {
					tfPlus.setText(String.valueOf((1 + Integer.parseInt(tfPlus.getText()))));
					tfMinus.setText(String.valueOf((Integer.parseInt(tfMinus.getText())) - 1));
				}
			} catch (NumberFormatException ex) {

			}
		}
	};

	TextListener textListenre = new TextListener() {
		public void textValueChanged(TextEvent e) {
			System.out.println("Text changed: " + input.getText());
			flag = false;
		}

	};
}
