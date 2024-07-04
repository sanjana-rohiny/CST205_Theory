package pane;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GlassFrame extends JFrame{

	public GlassFrame() {
		setTitle("Get panel and Use it");
		// add Menu Bar to frame
		MyMenuBar cyanMenuBar = new MyMenuBar();
		setJMenuBar(cyanMenuBar);
		// Reference a content Pane
		JPanel panel = (JPanel) this.getGlassPane();
		panel.setLayout(new FlowLayout());

		//Reference 1st panel
		FirstPanel panel1 = new FirstPanel();
		panel1.setVisible(true);
		panel.add(panel1,FlowLayout.LEFT);
		
		//Reference 2nd panel
		SecondPanel panel2 = new SecondPanel();
		panel2.setVisible(true);
		panel.add(panel2,FlowLayout.CENTER);
		
		panel.setVisible(true);
		this.getContentPane().add(panel);
	}
	
	public static void main(String[] srgs) {
		GlassFrame frame = new GlassFrame();		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setResizable(false);
		frame.setVisible(true);
		
	}
}
