import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
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
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
                        
                        /*g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        
                        g.setColor(Color.BLACK);
                        g.drawRect(x1 + 4 , y1 + 4, width -7, height -7);
                        */
                        
                       /*  //lines
                        g.setColor(Color.BLACK);
                        g.drawLine(x1, y1, x2, y2);
                        
                        g.setColor(Color.BLACK);
                        g.drawLine(x2/2, y1, x1, y2);
                        */
                        
                        //Oval
                        /*
                        g.setColor(Color.LIGHT_GRAY);
                        g.fillOval((width - 55)/2, (height - 55)/2, 55, 55);
                        */
                        
                        //polygons
                        /*
                        Polygon p = new Polygon();
                        p.addPoint(x1 + 5, y1 + 25);
                        p.addPoint(x1 + 20, y1 + 10);
                        p.addPoint(x1 + 35, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 25);
                        p.addPoint(x1 + 25, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 45);
                        p.addPoint(x1 + 15, y1 + 25);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p);
                        */
                        
                   
                        
                        
                        // flag
                        
                        //rectangles
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1  + 70, width, height - 350);
                        
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1  + 290, width, height - 350);
                        
                        //triangle
                        
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(width - 500, height - 250);
                        p3.addPoint(x1, y1 + height);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        //star
                     
                       
                        
                        Polygon p5 = new Polygon();
                        p5.addPoint(width - 715, height - 287);
                        p5.addPoint(width - 699, height - 287);
                        p5.addPoint(width - 693, height - 302);
                        p5.addPoint(width - 687, height - 287);
                        p5.addPoint(width - 671, height - 287);
                        p5.addPoint(width - 684, height - 277);
                        p5.addPoint(width - 679, height - 262);
                        p5.addPoint(width - 693, height - 272);
                        p5.addPoint(width - 706, height - 262);
                        p5.addPoint(width - 702, height - 277);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p5);
            }
}