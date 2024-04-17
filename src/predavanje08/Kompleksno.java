package predavanje08;

/**
 * Razred za delo s kompleksnimi stevili
 *
 */
public class Kompleksno extends Object {
   private double re;
   private double im;

   Kompleksno() {
     this(0,0);
   }

   Kompleksno(double re) {
     this(re, 0);
   }

   Kompleksno(int re) {
    this(re, 0);
   }


  Kompleksno(double re, double im) {
     this.re = re;
     this.im = im;
   }

   double getRe() {
     return re;
   }
   void setRe(double re) {
     this.re = re;
   }
  double getIm() {
    return im;
  }
  void setIm(double im) {
    this.im = im;
  }

  @Override
  public String toString() {
     return String.format("%.2f + %.2f i", this.re, this.im);
  }
}
