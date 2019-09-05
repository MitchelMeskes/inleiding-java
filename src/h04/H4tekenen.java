package h04;

import java.awt.*;
import java.applet.*;

public class H4tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 135, 75, 180);
        g.drawLine(20, 180, 75, 180);
        g.drawLine(20, 180, 50, 135);
    }
}


