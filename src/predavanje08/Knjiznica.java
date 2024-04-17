package predavanje08;

public class Knjiznica {
  public static void main(String[] args) {
    StrokovnaKnjiga k1 = new StrokovnaKnjiga();
    k1.setNaslov("The JVM specification");
    k1.setAvtor("Tim Lindholm");
    k1.setLetoIzdaje(2012);
    k1.setIndex("aload:179,371;arithmetic:45;arrays:55;attributes:101;binary:75");

    Leposlovje k2 = new Leposlovje();
    k2.setAvtor("France Bevk");
    k2.setNaslov("Pestrna");
    k2.setLetoIzdaje(1939);
    k2.mnenja = new String[10];
    k2.stMnenj=0;
    k2.mnenja[k2.stMnenj++] = "To je res lepa knjiga";
    k2.mnenja[k2.stMnenj++] = "Brez veze, dolgčas";
    k2.mnenja[k2.stMnenj++] = "Bravo France, še več takih knjig";
  }

}
