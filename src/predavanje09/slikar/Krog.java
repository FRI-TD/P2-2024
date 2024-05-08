package predavanje09.slikar;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class Krog extends Lik {
  double r;

  public Krog(double x, double y, double r, Color barva) {
    super(x, y, barva);
    this.r = r;
  }

  @Override
  void narisi() {
    StdDraw.setPenColor(this.barva);
    StdDraw.circle(this.x, this.y, this.r);
  }

  @Override
  void spremeniVelikost(double faktor) {
    this.r *= faktor;
  }

  @Override
  boolean pripada(double x, double y) {
    return Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2) <= Math.pow(this.r, 2);
  }

  @Override
  void narisiOznake() {
    StdDraw.setPenColor(Color.lightGray);
    StdDraw.rectangle(this.x - this.r, this.y - this.r, 2,2);
    StdDraw.rectangle(this.x - this.r, this.y + this.r, 2,2);
    StdDraw.rectangle(this.x + this.r, this.y - this.r, 2,2);
    StdDraw.rectangle(this.x + this.r, this.y + this.r, 2,2);
  }
}
