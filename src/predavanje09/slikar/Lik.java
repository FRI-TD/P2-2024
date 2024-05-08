package predavanje09.slikar;

import java.awt.Color;

abstract public class Lik {
  double x;  // x koordinata centra
  double y;  // y koordinata centra
  Color barva;
  boolean oznacen; // true, ce je lik oznacen

  public Lik(double x, double y, Color barva) {
    this.x = x;
    this.y = y;
    this.barva = barva;
    this.oznacen = false;
  }

  abstract void narisi();
  abstract void spremeniVelikost(double faktor);
  abstract boolean pripada(double x, double y);
  abstract void narisiOznake();

  void paint() {
    narisi();
    if (oznacen)
      narisiOznake();
  }

  void premakni(double dX, double dY) {
    this.x += dX;
    this.y += dY;
  }
}
