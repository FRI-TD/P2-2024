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

    StdDraw.enableDoubleBuffering();
    while (true) {
      if (StdDraw.hasNextKeyTyped()) {
        char key = StdDraw.nextKeyTyped();
        switch (key) {
          case 'w': case 'a': case 's': case 'd':
            double dX = (key=='a' ? -5 : (key=='d'?5:0));
            double dY = (key=='w' ? 5 : (key=='s'?-5:0));
            for(int i=0; i<stLikov; i++)
              if (liki[i].oznacen)
                liki[i].premakni(dX, dY);
            break;
          case '+': case '-':
            double faktor=(key=='+' ? 1.1 : 0.9);
            for(int i=0; i<stLikov; i++)
              if (liki[i].oznacen)
                liki[i].spremeniVelikost(faktor);
        }
      }

      if (StdDraw.isMousePressed()) {
        double x = StdDraw.mouseX();
        double y = StdDraw.mouseY();
        for(int i=0; i<stLikov; i++)
          liki[i].oznacen = liki[i].pripada(x,y);
      }

      StdDraw.clear(Color.white);
      for (int i = 0; i < stLikov; i++) {
        liki[i].paint();
      }
      StdDraw.show();
      StdDraw.pause(100);
    }

  }
}
