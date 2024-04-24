package predavanje09.slikar;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Pravokotnik extends Lik {
  double a;
  double b;

  public Pravokotnik(double x, double y, double a, double b, Color barva) {
    super(x, y, barva);
    this.a = a;
    this.b = b;
  }

  @Override
  void narisi() {
    StdDraw.setPenColor(this.barva);
    StdDraw.rectangle(x,y,a,b);
  }
}
