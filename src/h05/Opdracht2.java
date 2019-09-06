package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet {
    int GewichtValerie;
    int HoogteXas;
    int GewichtJeroen;
    int GewichtHans;

    public void init() {
        setSize(400,400);
        HoogteXas = 250;
        setBackground(Color.white);
        GewichtValerie = 40;
        GewichtHans = 80;
        GewichtJeroen = 100;
    }

    public void paint(Graphics g) {
        g.drawLine(50,50,50,HoogteXas);
        g.drawLine(50,HoogteXas,HoogteXas,HoogteXas);
        // Stafen
        g.setColor(Color.gray);
        g.fillRect(60,HoogteXas - GewichtValerie,50, GewichtValerie);
        g.setColor(Color.lightGray);
        g.fillRect(120,HoogteXas - GewichtJeroen,50, GewichtJeroen);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(180,HoogteXas - GewichtHans,50,GewichtHans);
        // Numering
        g.drawString("0", 30, 260);
        g.drawString("20", 10, 240);
        g.drawString("40", 10, 220);
        g.drawString("60", 10, 200);
        g.drawString("80", 10, 180);
        g.drawString("100", 10, 160);
        g.drawString("120", 10, 140);
        g.drawString("140", 10, 120);
        g.drawString("Valerie", 65, 265);
        g.drawString("Jeroen", 125, 265);
        g.drawString("Hans", 192, 265);
    }

}
