package HelloWorld;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager.LookAndFeelInfo;
public class ChangeLookAndFeel extends JFrame implements ActionListener {
	private JRadioButton windows, metal, motif, nimbus, gtk;
	private ButtonGroup bg;
	public ChangeLookAndFeel() {
		setTitle("Look And Feels");
		windows = new JRadioButton("Windows");
		windows.addActionListener(this);
		metal = new JRadioButton("Metal");
		metal.addActionListener(this);
		motif = new JRadioButton("Motif");
		motif.addActionListener(this);
		gtk = new JRadioButton("Gtk");
		gtk.addActionListener(this);
		nimbus = new JRadioButton("Nimbus");
		nimbus.addActionListener(this);
		bg = new ButtonGroup();
		bg.add(windows);
		bg.add(metal);
		bg.add(motif);
		bg.add(nimbus);
		bg.add(gtk);

		setLayout(new FlowLayout());
		add(windows);
		add(metal);
		add(motif);
		add(nimbus);
		add(gtk);
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String LAF;
		if(ae.getSource() == windows)
			LAF = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
		else if(ae.getSource() == metal)
			LAF = "javax.swing.plaf.metal.MetalLookAndFeel";
		else if(ae.getSource() == nimbus)
			LAF = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
		else if(ae.getSource() == gtk)
			LAF = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
		else
			LAF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
		try {
			UIManager.setLookAndFeel(LAF);
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("Error setting the LAF..." + e);
		}
		
		/*UIManager uim = new UIManager();
		LookAndFeelInfo lfi[] = uim.getInstalledLookAndFeels();
		
		for (int i=0; i<lfi.length; i++) {
			System.out.println(lfi[i].toString());	
		}*/
		
	}
	public static void main(String args[]) {
		new ChangeLookAndFeel();
	}
}