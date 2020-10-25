// java.applet.Applet has been depreciated :-P

import java.awt.Graphics;

public class HelloWorldApplet extends java.applet.Applet {

    public void paint(Graphics g) {
    
        g.drawString("Hello world!", 5, 25);
    }

}
