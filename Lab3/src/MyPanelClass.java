import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;

public class MyPanelClass extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

	public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Compute interior coordinates
        Insets myInsets = this.getInsets();
        int x1 = myInsets.left;
        int y1 = myInsets.top;
        int x2 = getWidth() - myInsets.right - 1;
        int y2 = getHeight() - myInsets.bottom - 1;
        int width = x2 - x1;
        int height = y2 - y1;

       //Paint the background
        g.setColor(Color.WHITE);
        g.fillRect(x1, y1, width + 1, height + 1);
//        //Draw a border
//        g.setColor(Color.YELLOW);
//        g.drawRect(x1, y1, width, height);
//        //Draw Second Border
//        g.setColor(Color.blue);
//        g.drawRect(x1 +5, y1+ 5,width, height);
//        g.drawRect(x1 - 5, y1 - 5, width, height);
//        
//        g.setColor(Color.WHITE);
//        g.drawLine(x1, y1, x2, y2);
//        
//        g.setColor(Color.RED);
//        g.drawLine(0,height, width, 0);
        
//       g.setColor(Color.LIGHT_GRAY);
//       g.fillOval(getWidth()/2 - 55/2, getHeight()/2 - 55/2, 55, 55);
        
        
//        Polygon p = new Polygon();
//        p.addPoint(x1 + 5, y1 + 25);
//        p.addPoint(x1 + 20, y1 + 10);
//        p.addPoint(x1 + 35, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 25);
//        p.addPoint(x1 + 25, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 45);
//        p.addPoint(x1 + 15, y1 + 25);
//        g.setColor(Color.YELLOW);
//        g.fillPolygon(p);
        
        Polygon stripe1 = new Polygon();
        stripe1.addPoint(x1, y1);
        stripe1.addPoint(width, y1);
        stripe1.addPoint(width, y1 + 30);
        stripe1.addPoint(x1 + 41, y1 + 30);
        g.setColor(Color.RED);
        g.fillPolygon(stripe1);
        
        Polygon stripe2 = new Polygon();
        stripe2.addPoint(x1 + 85, y1 + 60);
        stripe2.addPoint(width, y1 + 60);
        stripe2.addPoint(width, y1 + 95);
        stripe2.addPoint(x1 + 95,  y1 + 95);
        g.fillPolygon(stripe2);
        
        Polygon stripe3 = new Polygon();
        stripe3.addPoint(x1 + 30, height - 30);
        stripe3.addPoint(width, height - 30);
        stripe3.addPoint(width, height);
        stripe3.addPoint(x1, height);
        g.fillPolygon(stripe3);
        
        Polygon tri = new Polygon();
        tri.addPoint(x1, y1);
        tri.addPoint(x1 + 115, y1 + 80);
        tri.addPoint(0, height);
        g.setColor(Color.BLUE);
        g.fillPolygon(tri);
        
        Polygon star = new Polygon();
        star.addPoint(x1 + 25, y1 + 73);
        star.addPoint(x1 + 41, y1 + 73);
        star.addPoint(x1 + 47, y1 + 58);
        star.addPoint(x1 + 53, y1 + 73);
        star.addPoint(x1 + 69, y1 + 73);
        star.addPoint(x1 + 56, y1 + 83);
        star.addPoint(x1 + 61, y1 + 98);
        star.addPoint(x1 + 47, y1 + 88);
        star.addPoint(x1 + 34, y1 + 98);
        star.addPoint(x1 + 38, y1 + 83);
        g.setColor(Color.WHITE);
        g.fillPolygon(star);
        
        
	}
}
	
