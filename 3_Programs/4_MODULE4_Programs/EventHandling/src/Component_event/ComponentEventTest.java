package Component_event;

import java.awt.*;
import java.awt.event.*;

public class ComponentEventTest {

	public static void main(String[] args) {
		Frame frame = new Frame("ComponentEventExample");
		TextArea txtArea = new TextArea();
		Checkbox checkbox1 = new Checkbox("Checkbox 1");
		Checkbox checkbox2 = new Checkbox("Checkbox 2");

		Panel p = new Panel();
		p.add(checkbox1);
		p.add(checkbox2);

		frame.add(txtArea, BorderLayout.CENTER);
		frame.add(checkbox1, BorderLayout.NORTH);
		frame.add(checkbox2, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);

		ComponentListener componentListener = 
				new Listener();
		txtArea.addComponentListener(componentListener);

		ItemListener il = new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (e.getStateChange() == 1) {
					txtArea.setVisible(false);
				} else {
					txtArea.setVisible(true);
				}
			}
		};
		checkbox1.addItemListener(il);
	
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

