package h04;

import java.awt.*;
import java.applet.*;

public class ellipsH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(70, 70, 200, 100, 0, 360);
    }
}