package Text_event;

import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class TEXTListener implements TextListener {

	@Override
	public void textValueChanged(TextEvent arg0) {
		System.out.println("textValueChanged...!");
	}

}
