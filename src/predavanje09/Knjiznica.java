package predavanje09;

public class Knjiznica {
  public static void main(String[] args) {
    StrokovnaKnjiga k1 = new StrokovnaKnjiga("Tim Lindholm", "The JVM specification", 2012,
      "aload:179,371;arithmetic:45;arrays:55;attributes:101;binary:75");

    Leposlovje k2 = new Leposlovje("France Bevk", "Pestrna", 1939);
    k2.dodajMnenje("To je res lepa knjiga");
    k2.dodajMnenje("Brez veze, dolgčas");
    k2.dodajMnenje("Bravo France, še več takih knjig");

    Knjiga[] knjige = new Knjiga[2];
    knjige[0] = k1;
    knjige[1] = k2;

    if (knjige[1] instanceof Leposlovje) {
      System.out.println("Da, to je leposlovje");
      ((Leposlovje) knjige[1]).dodajMnenje("Juhuhu!");
    }

    try {
      ((Leposlovje) knjige[0]).dodajMnenje("Juhuhu!");
    } catch (Exception e) {
      System.out.println("Ni uspelo!");
    }
    System.out.println("Tu sem!");
  }

}
