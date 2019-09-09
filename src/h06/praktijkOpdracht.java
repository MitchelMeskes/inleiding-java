package h06;

import java.awt.*;
import java.applet.*;


public class praktijkOpdracht extends Applet {
    double cijfer1, cijfer2, cijfer3,som, antwoord;
    double uitkomst;
    int geheel;
    double gebroken;

//Je moet het gemiddelde met 10 vermenigvuldigen en daarna converteren naar een int.
// Vervolgens terugconverteren naar een double en door 10 delen.
    public void init() {
        geheel = (int) gebroken;
        cijfer1 = 5.9 ;
        cijfer2 = 6.3;
        cijfer3 =6.9;
        uitkomst = ((cijfer1 + cijfer2 + cijfer3) / 3) * 10;
        som = (int) (uitkomst);
        antwoord = som / 10;
    }

    public void paint(Graphics g) {
        g.drawString("Het Gemiddelde cijfer: " + antwoord, 20, 20);
    }
}
