package predavanje09.slikar;

import java.awt.Color;

abstract public class Lik {
  double x;  // x koordinata centra
  double y;  // y koordinata centra
  Color barva;

  public Lik(double x, double y, Color barva) {
    this.x = x;
    this.y = y;
    this.barva = barva;
  }

  abstract void narisi();

  void premakni(double dX, double dY) {
    this.x += dX;
    this.y += dY;
  }
}
