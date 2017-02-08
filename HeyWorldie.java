/**
 * @(#)HeyWorldie.java
 *
 * HeyWorldie Applet application
 *
 * @author 
 * @version 1.00 2017/2/8
 */
 
import java.awt.*;
import java.applet.*;

public class HeyWorldie extends Applet {
	
	public void init() {
		setSize(200,200);
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(0,0,200,200);
		g.setColor(Color.BLUE);
		g.drawString("Welcome to Java!!", 50, 60 );
		
	}
}