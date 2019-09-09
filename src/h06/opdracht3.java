package h06;


import java.awt.*;
import java.applet.*;


public class opdracht3 extends Applet {
    int maxAantal;
    int uitkomst;


    public void init() {
        maxAantal = 2147483647;
        uitkomst = 2147483647 + 2147483647;
    }

    public void paint(Graphics g) {
        g.drawString("Positief plus positief is negatief.: " + uitkomst, 20, 20);
    }
}
