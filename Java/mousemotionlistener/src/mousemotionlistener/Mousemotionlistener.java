/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mousemotionlistener;

/**
 *
 * @author Informatics
 */
        import java.applet.*;
        import java.awt.*;
        import java.awt.event.*;

public class Mousemotionlistener extends Applet implements MouseMotionListener 
{
    int ballx = 50;
    int bally = 300;
    int wallx = 150;
    int wally = 250;
    int ballwidth = 30;
    int ballheight = 30;
    int wallwidth = 50;
    int wallheight = 100;
    
    String status = " ";
    public void init ()
    {
        
        addMouseMotionListener(this);
        
    }
     
        public void mouseMoved(MouseEvent e)
        
        {
            if (((ballx+ballwidth)>=wallx) && (ballx<=(wallx+wallwidth)) 
                    && ((bally+ballheight)>= wally) && bally<=(wally+wallheight))
                    {
                        status = "collision deleted.";
                    }
                    else
        {
            ballx = e.getX();
            bally = e.getY();
        }
            repaint();
                        
        }
public void mouseDragged(MouseEvent e){}

public void paint (Graphics g)
{
    g.drawString(status, 10, 10);
    g.setColor(Color.green);
    g.fillRect(wallx,wally,wallwidth,wallheight);
    g.setColor(Color.blue);
    g.fillOval(ballx,bally,ballwidth,ballheight);
}
    

}
