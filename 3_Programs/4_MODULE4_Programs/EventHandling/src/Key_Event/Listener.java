package Key_Event;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class Listener implements KeyListener {

	@Override
	public void keyPressed(KeyEvent arg0) {
		System.out.println("keyPressed...!");
		int mod = arg0.getModifiersEx();
		System.out.println(mod & arg0.ALT_DOWN_MASK);
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		System.out.println("keyReleased...!");
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		System.out.println("keyTyped...!");
	}
}
