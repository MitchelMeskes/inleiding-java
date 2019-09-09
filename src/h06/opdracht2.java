package h06;

import java.awt.*;
import java.applet.*;


public class opdracht2 extends Applet {
    int uur, dag, jaar, sec;
    int uitkomstUur;
    int uitkomstDag;
    int uitkomstJaar;


    public void init() {
        uur = 60;
        dag = 24;
        jaar = 365;
        sec = 60;
        uitkomstUur = sec * uur ;
        uitkomstDag = sec * uur * dag ;
        uitkomstJaar = sec * uur * dag * jaar;

    }

    public void paint(Graphics g) {
        g.drawString("Er zitten zoveel seconden in een uur: " + uitkomstUur, 20, 20);
        g.drawString("Er zitten zoveel seconden in een dag: " + uitkomstDag, 20, 30);
        g.drawString("Er zitten zoveel seconden in een jaar: " + uitkomstJaar, 20, 40);
    }
}
