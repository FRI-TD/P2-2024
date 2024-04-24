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
}
