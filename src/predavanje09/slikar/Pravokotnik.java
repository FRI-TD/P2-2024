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

  @Override
  void spremeniVelikost(double faktor) {
    this.a *= faktor;
    this.b *= faktor;
  }

  @Override
  boolean pripada(double x, double y) {
    return (Math.abs(this.x - x) <= this.a) &&  (Math.abs(this.y - y) <= this.b);
  }

  @Override
  void narisiOznake() {
    StdDraw.setPenColor(Color.lightGray);
    StdDraw.rectangle(this.x - this.a, this.y - this.b, 2,2);
    StdDraw.rectangle(this.x - this.a, this.y + this.b, 2,2);
    StdDraw.rectangle(this.x + this.a, this.y - this.b, 2,2);
    StdDraw.rectangle(this.x + this.a, this.y + this.b, 2,2);
  }
}
