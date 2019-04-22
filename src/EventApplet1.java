
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Mouse" width=500 height=500>
</applet>
*/
public class EventApplet1 extends Applet
implements MouseListener,MouseMotionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int X=0,Y=0;
	String msg="";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		setBackground(Color.white);
		setForeground(Color.black);
	}
	public void mouseEntered(MouseEvent m)
	{
		
	}
	public void mouseExited(MouseEvent m)
	{
		
	}
	public void mousePressed(MouseEvent m)
	{
		X=10;
		Y=20;
		msg="Sachin";
		
	}
	public void mouseReleased(MouseEvent m)
	{
		
	}
	public void mouseMoved(MouseEvent m)
	{
		
	}
	public void mouseDragged(MouseEvent m)
	{
		
	}
	public void mouseClicked(MouseEvent m)
	{
			}
	public void paint(Graphics g)
	{
		g.drawString(msg,X,Y);
	}
}
