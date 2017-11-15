import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame Yeniel = new JFrame("Hello, world!");
		Yeniel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Yeniel.setLocation(850, 400);
		Yeniel.setSize(200, 200);
		MyPanelClass myPanel = new MyPanelClass();
        Yeniel.getContentPane().add(myPanel);
		Yeniel.setVisible(true);
		
	}
}