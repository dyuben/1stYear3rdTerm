import java.applet.*;
import java.awt.*;//abstrat windows toolkit

public class quizapplet extends Applet//intitialization
{
	Font small = new Font("Verdana", Font.PLAIN,18);
	
	public void init()
	{
		setBackground(Color.cyan);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.setFont(small);
		int[]x={5,90,200};
		int[]y={190,60,190};
		g.drawPolygon(x,y,3);
		g.drawString("I LOVE APPLET",50,50);
		g.setColor(Color.black);
		g.drawLine(30,190,400,190);
		g.setColor(Color.black);
		g.fillOval(300,40,50,50);
		g.setColor(Color.yellow);
		g.drawArc(310,60,10,5,0,180);
		g.drawArc(320,60,10,5,0,180);
		g.drawArc(310,70,30,10,0,-180);
		g.setColor(Color.red);
		g.fillRect(310,160,50,20);
		g.setColor(Color.blue);
		g.fillRect(325,140,30,20);
		
		g.setColor(Color.black);
		g.fillOval(345,180,12,12);
		
		g.setColor(Color.black);
		g.fillOval(320,180,12,12);
	}
}