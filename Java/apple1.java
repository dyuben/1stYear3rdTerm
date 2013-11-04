import java.applet.*;
import java.awt.*;//abstrat windows toolkit

public class apple1 extends Applet//intitialization
{
	Font small = new Font("Comic Sans MS", Font.PLAIN,18);
	
	public void init()
	{
		setBackground(Color.gray);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.cyan);
		g.setFont(small);
		g.drawString("Hello World!",85,85);
		g.drawLine(80,90,200,90);
		g.setColor(Color.cyan);g.fillRect(100,100,40,80);
		g.setColor(Color.cyan);g.fillOval(160,120,60,60);
		g.drawArc(100,220,30,55,0,180);
		g.drawArc(140,220,30,55,0,180);
		g.drawArc(100,260,70,40,0,-180);
		int[]x={30,60,90};
		int[]y={90,10,90};
		g.drawPolygon(x,y,3);
	}
}