

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdjustmentEventTest implements AdjustmentListener {

	Frame frame;
	Label label;
	Scrollbar hbar, vbar;
	
	AdjustmentEventTest() {
		frame = new Frame("AdjustmentEvent Example");
	    label = new Label("Welcome To the world of Java");
	    
	    hbar = new Scrollbar(Scrollbar.HORIZONTAL, 30, 20, 0, 300);
	    vbar = new Scrollbar(Scrollbar.VERTICAL, 30, 40, 0, 300);
	    
	    frame.setLayout(new BorderLayout());
	    frame.add(hbar, BorderLayout.SOUTH);
	    frame.add(vbar, BorderLayout.EAST);
	    frame.add(label, BorderLayout.CENTER);
	    
	    
	    hbar.addAdjustmentListener(this);
	    vbar.addAdjustmentListener(this);
	    
	    frame.setSize(400, 400);
	    frame.setVisible(true);
	    
	    frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
		        System.exit(0);
		    }
		});
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		System.out.println(e.getAdjustable());
		System.out.println(e.getValue());
		System.out.println(e.getAdjustmentType());
		System.out.println(e.paramString());
		System.out.println();
	}
	
	public static void main(String[] args) {
		AdjustmentEventTest test = new AdjustmentEventTest();
	}
	
}
