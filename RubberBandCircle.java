import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class RubberBandCircle extends JPanel{

private final int WIDTH = 600, HEIGHT = 600;

private Point point1 = null, point2 = null;

public RubberBandCircle(){

MousePointerListener listen = new MousePointerListener();
addMouseListener (listen);
addMouseMotionListener (listen);
setBackground (Color.blue);
}

public void paintComponent (Graphics g) {
super.paintComponent (g);

g.setColor (Color.yellow);
if (point1 != null && point2 != null){

int radius = (int) (Math.sqrt(Math.pow(point2.x-point1.x, 2)+Math.pow(point2.y-point1.y, 2)));
int top = (int) (point1.x - radius);
int left = (int) (point1.y - radius);
g.drawOval (top, left, 2*radius, 2*radius);
}

}



private class MousePointerListener implements MouseListener, MouseMotionListener{

public void mousePressed (MouseEvent event){
point1 = event.getPoint();
}

public void mouseDragged (MouseEvent event){
point2 = event.getPoint();
repaint();
}

public void mouseClicked (MouseEvent event) {}
public void mouseReleased (MouseEvent event) {}
public void mouseEntered (MouseEvent event) {}
public void mouseExited (MouseEvent event) {}
public void mouseMoved (MouseEvent event) {}

}
}