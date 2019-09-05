package h04;

import java.awt.*;
import java.applet.*;

public class dobbelsteenH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.white);
        g.fillRoundRect(100, 100, 400, 400, 100, 100);
        g.setColor(Color.black);
        g.fillOval(150, 150, 90, 90);
        g.fillOval(370, 150, 90, 90);
        g.fillOval(150, 370, 90, 90);
        g.fillOval(370, 370, 90, 90);

    }
}
