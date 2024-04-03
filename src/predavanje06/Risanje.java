package predavanje06;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Risanje {

  static void zacetek() {
    StdDraw.setXscale(0,100);
    StdDraw.setYscale(0,100);
    StdDraw.line(0,0, 50,50);
    StdDraw.circle(0,0, 71);
    StdDraw.circle(50,50,30);
  }

  public static void tarca() {
    StdDraw.clear(Color.black);
    StdDraw.setScale(-50,50);
    StdDraw.setPenColor(Color.yellow);
    for(int i=1; i<=10; i++) {
      StdDraw.circle(0, 0, i*5);
    }
  }

  static void mreza() {
    StdDraw.setScale(0,250);
    StdDraw.enableDoubleBuffering();
    for(int i=0; i<25; i++) {
      for(int j=0; j<25; j++) {
        StdDraw.setPenColor(new Color(10*i, 10*j, 0));
        StdDraw.filledRectangle(5 + 10*i, 5 + 10*j, 5, 5);
      }
    }
    StdDraw.show();
  }

  static void kvadratnaSpirala() {
    int[][] smeri = {{0,-1}, {-1,0}, {0,1}, {1,0}};
    int trSmer    = 0; // prva smer je "dol"
    int trX = 0, trY = 0; // zacnem v koordinatnem izhodiscu
    int dolzina   = 5;
    int deltaD    = 10;  // dolzino na vsakem koraku povecam za deltaD

    StdDraw.setScale(-100,100);

    for(int i=0; i<100; i++) {
      int nX = trX + dolzina * smeri[trSmer][0];
      int nY = trY + dolzina * smeri[trSmer][1];

      StdDraw.line(trX, trY, nX, nY);
      trX = nX;
      trY = nY;
      dolzina += deltaD;

      //trSmer = trSmer + 1;
      //if (trSmer > 3) trSmer = 0;
      trSmer = (trSmer + 1) % 4;
    }

  }

  static void spirala() {
    StdDraw.setScale(-100,100);
    double r  = 0.1;
    double deltaR = 1.01;
    double fi = 0;  // kot v stopinjah
    double trX = 0, trY = 0;

    for(int i=0; i<2000; i++) {
      double nX = r*Math.cos(Math.toRadians(fi));
      double nY = r*Math.sin(2*Math.PI*fi/360);

      StdDraw.line(trX, trY, nX, nY);
      trX = nX; trY = nY;

      fi = fi + 5;
      r  = r * deltaR;
    }
  }

  static void kazalec(double r, double fi) {
    double x = r * Math.cos(Math.toRadians(fi));
    double y = r * Math.sin(Math.toRadians(fi));
    StdDraw.line(0,0, x,y);
  }

  static void radar() {
    StdDraw.setScale(-100,100);
    StdDraw.setPenColor(Color.green);
    StdDraw.setPenRadius(0.016);

    double fi = 0;
    double r = 80;

    StdDraw.enableDoubleBuffering();
    while (true) {
      StdDraw.clear(Color.black);

      for(int i=20; i<=80; i=i+20){
        StdDraw.circle(0,0, i);
      }

      kazalec(r, fi);
      fi = fi + 1;

      StdDraw.show();
      StdDraw.pause(50);
    }
  }

  static void ura() {
    StdDraw.setScale(-100,100);
    DateTimeFormatter f    = DateTimeFormatter.ofPattern("HH:mm:ss");

    for(;;) {
      StdDraw.clear(Color.white);
      LocalDateTime time = LocalDateTime.now();
      String cas = time.format(f);

      double fi = 60;
      for (int i=1; i<=12; i++) {
        double x = 90 * Math.cos(Math.toRadians(fi));
        double y = 90 * Math.sin(Math.toRadians(fi));
        StdDraw.text(x,y,Integer.toString(i));
        fi = fi - 30;
      }

      StdDraw.text(-80, 90, cas);
      StdDraw.pause(1000);
    }
  }

  public static void main(String[] args) {
    //zacetek();
    //tarca();
    //mreza();
    //kvadratnaSpirala();
    //spirala();
    // radar();
    ura();
  }
}
