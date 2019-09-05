package h04;

import java.awt.*;
import java.applet.*;

public class praktijkopdrachtH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(10, 10,150, 10);
        g.drawString("Lijn", 75, 30);
        g.drawRect(10, 50,150,75);
        g.drawString("Rechthoek", 55, 140);
        g.drawRoundRect(10, 160, 150, 75, 30,30);
        g.drawString(" Afgeronde Rechthoek", 20, 250);
        g.setColor(Color.MAGENTA);
        g.fillArc(350,50,150,75,0,45);
        g.fillOval(180,160,150,75);
        g.fillRect(180, 50,150,75);
        g.setColor(Color.black);
        g.drawOval(180,50,150,75);
        g.drawString("Gevulde Rechthoek Met Ovaal", 170, 140);
        g.drawString("Gevulde Ovaal", 210, 250);
        g.drawOval(350,50,150,75);
        g.drawString("Taartpunt Met Ovaal Eromheen", 340, 140);
        g.drawOval(375,160, 75,75);
        g.drawString("Cirkel", 395, 250);
    }
}
