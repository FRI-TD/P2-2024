package predavanje09.slikar;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Slikar {

  public static void main(String[] args) {
    StdDraw.setScale(-100,100);

    Lik[] liki  = new Lik[10];
    int stLikov = 0;

    liki[stLikov++] = new Krog(0,0, 30, Color.red);
    liki[stLikov++] = new Pravokotnik(30,30, 20,20, Color.green);
    liki[stLikov++] = new Kvadrat(-30,-30, 20, Color.blue);

    for (int i=0; i<stLikov; i++)
      liki[i].narisi();


  }
}
