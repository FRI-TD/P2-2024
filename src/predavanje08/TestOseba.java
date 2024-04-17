package predavanje08;

class Clovek extends Oseba {
  String priimek;

  void izpisiDolzinoImena() {
    System.out.println(ime.length());
  }

  @Override
  public void izpisi() {
    super.izpisi();
    System.out.println("Priimek: " + this.priimek);
  }
}

public class TestOseba {
  public static void main(String[] args) {
    Oseba o = new Oseba();
    o.ime = "Janez";
    o.izpisi();

    Clovek c = new Clovek();
    c.ime = "Micka";
    c.priimek = "Novak";
    c.izpisi();
    c.izpisiDolzinoImena();
  }
}
