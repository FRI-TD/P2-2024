package predavanje07;

public class Racunanje {

  static void izpis(double x) {
    System.out.println(x);
  }

  public static void main(String[] args) {
    int y = Matematika.kvadrat(16);

    izpis(Matematika.PHI);

    double z = Math.sin(0);

    predavanje06.Risanje.graf();
  }

}
