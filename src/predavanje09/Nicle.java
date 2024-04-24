package predavanje09;

class Poli1 extends Funkcija {
  @Override
  public double vrednost(double x) {
    return x*x-3*x-4;
  }
  @Override
  public double odvod(double x) {
    return 2*x - 3;
  }
}

public class Nicle {
  public static void main(String[] args) {
    double x = Newton.nicla(0.5, new Sinus(), 3);
    System.out.println(x);
    System.out.println(Math.PI);

    System.out.println("----------------------");
    x = Newton.nicla(1.5, new Poli1(), 5);
    System.out.println(x);

    System.out.println("----------------------");
    x = Newton.nicla(3, new Funkcija() {
      public double vrednost(double x) {
        return x*x-3*x-5;
      }
      public double odvod(double x) {
        return 2*x-3;
      }
    }, 5);
    System.out.println(x);
  }
}
