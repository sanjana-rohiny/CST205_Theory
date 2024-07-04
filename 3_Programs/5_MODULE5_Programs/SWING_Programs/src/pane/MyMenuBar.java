package pane;

import java.awt.*;
import java.awt.Dimension;

import javax.swing.*;

public class MyMenuBar extends JMenuBar {
	public MyMenuBar(){
		setOpaque(true);
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(200, 20));
		
		JMenu menu = new JMenu("File");
		JMenuItem open, close;
		open = new JMenuItem("open");
		close = new JMenuItem("close");
		menu.add(open);
		menu.add(close);
		this.add(menu);
	}
}
