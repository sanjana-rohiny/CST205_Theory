package Mouse_event;

import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MWheelListener implements MouseWheelListener {

	@Override
	public void mouseWheelMoved(MouseWheelEvent arg0) {
		System.out.println("mouseWheelMoved...!");
	}
}
