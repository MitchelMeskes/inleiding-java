package h06;

import java.awt.*;
import java.applet.*;


public class opdracht1 extends Applet {
    int geheelbedrag, deelbedrag ;
    double uitkomst;


    public void init() {
        geheelbedrag = 113;
        deelbedrag = 4;
        uitkomst = geheelbedrag / deelbedrag;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: ",20, 20);
        g.drawString("Jan: " + uitkomst, 20, 40);
        g.drawString("Ali : " + uitkomst, 20, 50);
        g.drawString("Jeannette : " + uitkomst, 20, 60);
        g.drawString("Mitchel : " + uitkomst, 20, 70);

    }
}
