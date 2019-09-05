package h04;

import java.awt.*;
import java.applet.*;

public class FlaggenstokH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(20, 80, 100, 30);
        g.setColor(Color.white);
        g.fillRect(20, 100, 100, 30);
        g.setColor(Color.blue);
        g.fillRect(20, 120, 100, 20);
        g.setColor(Color.darkGray);
        g.fillRect(20, 80, 5, 200);
    }
}
