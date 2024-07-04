package Adjustment_Event;

import java.awt.*;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdjustmentEventTest {

	public static void main(String[] args) {
		Frame frame = new Frame("AdjustmentEvent Example");
	    Label label = new Label("Welcome To the world of Java");
	    
	    Scrollbar hbar = 
	    		new Scrollbar(Scrollbar.HORIZONTAL, 30, 20, 0, 300);
	    Scrollbar vbar = 
	    		new Scrollbar(Scrollbar.VERTICAL, 30, 40, 0, 300);
	    
	    frame.setLayout(new BorderLayout());
	    frame.add(hbar, BorderLayout.SOUTH);
	    frame.add(vbar, BorderLayout.EAST);
	    frame.add(label, BorderLayout.CENTER);
	    
	    AdjustmentListener adjustmentListener = 
	    		new ListenerClass();
	    hbar.addAdjustmentListener(adjustmentListener);
	    vbar.addAdjustmentListener(adjustmentListener);
	    
	    frame.setSize(400, 400);
	    frame.setVisible(true);
	    
	    frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
		        System.exit(0);
		    }
		});
	  }
}
