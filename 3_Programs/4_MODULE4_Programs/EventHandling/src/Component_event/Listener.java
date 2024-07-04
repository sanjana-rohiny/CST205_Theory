	package Component_event;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Listener implements ComponentListener {

	@Override
	public void componentHidden(ComponentEvent arg0) {
		// TODO Auto-generated method stub
	     int event = arg0.getID() & arg0.COMPONENT_HIDDEN;
	     System.out.println("componentHidden = " + event );
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		// TODO Auto-generated method stub
	     System.out.println("componentMoved");

	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		// TODO Auto-generated method stub
	     System.out.println("arg0.getID() = " + arg0.getID());

	     System.out.println("componentResized");

	}

	@Override
	public void componentShown(ComponentEvent arg0) {
		// TODO Auto-generated method stub
	     int event = arg0.getID() & arg0.COMPONENT_SHOWN;
	     System.out.println("arg0.getID() = " + arg0.getID());

	     System.out.println("componentShown = " + event);

	}

}
