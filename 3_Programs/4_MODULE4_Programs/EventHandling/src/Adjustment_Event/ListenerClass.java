package Adjustment_Event;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ListenerClass implements
AdjustmentListener {

	@Override
	public void adjustmentValueChanged(
			AdjustmentEvent arg0) {

		
		System.out.println(arg0.getAdjustable());
		System.out.println(arg0.getValue());
		System.out.println(arg0.getAdjustmentType());
		System.out.println(arg0.getValueIsAdjusting());
		System.out.println(arg0.paramString());
	}

}
