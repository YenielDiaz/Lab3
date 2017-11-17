import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame Yeniel = new JFrame("Hello, world!");
		Yeniel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Yeniel.setSize(220, 200);
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		Yeniel.setLocation(dim.width/2-Yeniel.getSize().width/2, dim.height/2-Yeniel.getSize().height/2);
		MyPanelClass myPanel = new MyPanelClass();
        Yeniel.getContentPane().add(myPanel);
		Yeniel.setVisible(true);
	}
}