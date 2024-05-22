import java.applet.*;
import java.awt.*;

@SuppressWarnings("removal")
public class Hello extends Applet {
    public void paint(Graphics g) {
        g.drawString("Greeky Shows! ", 50, 20);
    }
}

/*
 <APPLET code = "Hello.class" width="200" height="700"></APPLET>
 */
