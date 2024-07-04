package Focus_event;

import java.awt.Button;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Listener implements FocusListener {

	@Override
	public void focusGained(FocusEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("focusGained for Button");
		System.out.println("OppositeComponent " +((Button)arg0.getOppositeComponent()).getActionCommand());
	}

	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("focusLost for Button");
		System.out.println("OppositeComponent " +((Button)arg0.getOppositeComponent()).getActionCommand());

	}

}
