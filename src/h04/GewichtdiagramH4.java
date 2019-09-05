package h04;

import java.awt.*;
import java.applet.*;

public class GewichtdiagramH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.darkGray);
        g.fillRect(80, 80, 200, 200);
        g.setColor(Color.blue);
        g.fillRect(100, 240, 35, 40);
        g.setColor(Color.red);
        g.fillRect(160, 180, 35, 100);
        g.setColor(Color.yellow);
        g.fillRect(220, 200, 35, 80);
        g.setColor(Color.white);
        g.drawString("Valerie", 100, 300);
        g.drawString("Jeroen", 160, 300);
        g.drawString("Hans", 220, 300);
        g.drawString("0", 70, 290);
        g.drawString("20", 65, 270);
        g.drawString("40", 65, 250);
        g.drawString("60", 65, 230);
        g.drawString("80", 65, 210);
        g.drawString("100", 60, 190);
        g.drawString("120", 60, 170);
        g.drawString("140", 60, 150);
    }
}