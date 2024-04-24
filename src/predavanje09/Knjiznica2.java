package predavanje09;

public class Knjiznica2 {

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

    // Knjiga k = new Knjiga("a", "n", 1000);

    for(int i=0; i<knjige.length; i++) {
      System.out.println("------------------------------");
      knjige[i].izpisi();
    }
  }
}
