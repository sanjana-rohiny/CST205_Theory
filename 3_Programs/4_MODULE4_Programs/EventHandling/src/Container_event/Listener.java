package Container_event;

import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;

public class Listener implements ContainerListener {

	@Override
	public void componentAdded(ContainerEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("componentAdded");
		

	}

	@Override
	public void componentRemoved(ContainerEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("componentRemoved");

	}

}
