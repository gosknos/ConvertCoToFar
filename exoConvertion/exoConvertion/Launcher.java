package exoConvertion;


import exo5.*;
import javax.swing.SwingUtilities;

public class Launcher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				ConvertionGUI fact = new ConvertionGUI();
				fact.setVisible(true);
			}
		});
	}
}