package pane;

import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {

	public MainFrame () {
		setTitle("Create a panel, set it as ContentPane");
		// add Menu Bar to frame
		MyMenuBar cyanMenuBar = new MyMenuBar();
		setJMenuBar(cyanMenuBar);
		// Reference a content Pane
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		//Reference 1st panel
		FirstPanel panel1 = new FirstPanel();
		panel.add(panel1,FlowLayout.LEFT);
		//Reference 2nd panel
		SecondPanel panel2 = new SecondPanel();
		panel.add(panel2,FlowLayout.CENTER);
		setContentPane(panel);   // essential to make this work!
	}
	
	public MainFrame (String msg) {
		setTitle("Create a panel and add it to ContentPane");
		// add Menu Bar to frame
		MyMenuBar cyanMenuBar = new MyMenuBar();
		setJMenuBar(cyanMenuBar);
		// Reference a content Pane
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		//Reference 1st panel
		FirstPanel panel1 = new FirstPanel();
		panel.add(panel1,FlowLayout.LEFT);
		//Reference 2nd panel
		SecondPanel panel2 = new SecondPanel();
		panel.add(panel2,FlowLayout.CENTER);
		this.getContentPane().add(panel);
	}
	
	public MainFrame (int msg) {
		setTitle("Get panel and Use it");
		// add Menu Bar to frame
		MyMenuBar cyanMenuBar = new MyMenuBar();
		setJMenuBar(cyanMenuBar);
		// Reference a content Pane
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new FlowLayout());
		
		//Reference 1st panel
		FirstPanel panel1 = new FirstPanel();
		panel.add(panel1,FlowLayout.LEFT);
		//Reference 2nd panel
		SecondPanel panel2 = new SecondPanel();
		panel.add(panel2,FlowLayout.CENTER);
	}
	
	public MainFrame (String str, String str1) {
		setTitle("Get panel and Use it");
		// add Menu Bar to frame
		MyMenuBar cyanMenuBar = new MyMenuBar();
		setJMenuBar(cyanMenuBar);
		// Reference a content Pane
		// 
		JPanel panel = (JPanel) this.getContentPane();
		panel.setLayout(new FlowLayout());
		
		//Reference 1st panel
		FirstPanel panel1 = new FirstPanel();
		panel.add(panel1,FlowLayout.LEFT);
		//Reference 2nd panel
		SecondPanel panel2 = new SecondPanel();
		panel.add(panel2,FlowLayout.CENTER);
		//this.getContentPane().add(panel);
	}
	
	public static void main(String[] srgs) {
		MainFrame frame = new MainFrame(123);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(300,300);
		frame.pack();
		frame.show();
	}
}
