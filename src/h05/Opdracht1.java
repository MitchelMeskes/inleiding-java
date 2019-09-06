package h05;

import java.awt.*;
import java.applet.*;

public class Opdracht1 extends Applet{
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(lijnkleur);
        g.drawLine(10, 10,200, 10);
        g.drawString("Lijn", 75, 30);
        g.drawRect(10, 50,breedte,hoogte);
        g.drawString("Rechthoek", 70, 170);
        g.drawRoundRect(10, 200, breedte, hoogte, 30,30);
        g.drawString(" Afgeronde Rechthoek", 50, 315);
        g.setColor(opvulkleur);
        g.fillArc(460,50,breedte,hoogte,0,45);
        g.fillOval(240,200,breedte,hoogte);
        g.fillRect(240, 50,breedte,hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde Rechthoek Met Ovaal", 260, 170);
        g.drawOval(240,50,breedte,hoogte);
        g.drawString("Gevulde Ovaal", 300, 315);
        g.drawOval(460,50,breedte,hoogte);
        g.drawString("Taartpunt Met Ovaal Eromheen", 480, 170);
        g.drawOval(500,200, 75,75);
        g.drawString("Cirkel", 520, 315);
    }
}

