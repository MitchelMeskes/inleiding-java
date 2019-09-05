package h04;


import java.awt.*;
import java.applet.*;

public class HuisH4 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.darkGray);
        g.fillRect(20, 20, 300, 400);
        g.setColor(Color.lightGray);
        g.fillRect(30, 220, 100, 200);
        g.setColor(Color.gray);
        g.fillRect(200, 200, 100, 100);
    }
}
