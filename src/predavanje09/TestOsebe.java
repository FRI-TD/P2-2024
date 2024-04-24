package predavanje09;

public class TestOsebe {

  public static void main(String[] args) {
    Oseba o1 = new Oseba("Janez");
    o1.izpisi();

    Oseba o2 = new Oseba("Micka") {
      public void izpisi() {
        System.out.println("Ime: " + ime);
      }
    };
    o2.izpisi();
  }
}
