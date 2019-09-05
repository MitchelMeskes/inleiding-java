package h04;

import java.awt.*;
import java.applet.*;

public class stoplichtH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.darkGray);
        g.fillRect(140,350, 50,500);
        g.setColor(Color.gray);
        g.fillRect(90, 70,150, 250);
        g.fillOval(90, 20,150,100);
        g.fillOval(90, 272,150,100);
        g.setColor(Color.green);
        g.fillOval(115, 260, 100, 100);
        g.setColor(Color.orange);
        g.fillOval(115, 150, 100, 100);
        g.setColor(Color.red);
        g.fillOval(115, 40, 100, 100);
    }
}