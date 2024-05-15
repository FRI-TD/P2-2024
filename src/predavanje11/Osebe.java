package predavanje11;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Oseba implements Comparable<Oseba> {
  String ime;
  int starost;

  public Oseba(String ime, int starost) {
    this.ime = ime;
    this.starost = starost;
  }

  @Override
  public int compareTo(Oseba o) {
    return this.ime.compareTo(o.ime);
  }

  public String toString() {
    return String.format("Ime: %s, starost: %d", this.ime, this.starost);
  }
}

class Primerjalnik implements Comparator<Oseba> {
  @Override
  public int compare(Oseba o1, Oseba o2) {
    return o1.starost - o2.starost;
  }
}

public class Osebe {
  public static void main(String[] args) {
    Oseba o1 = new Oseba("a", 15);
    Oseba o2 = new Oseba("b", 25);
    Oseba o5 = new Oseba("a", 7);
    Oseba o3 = new Oseba("c", 29);
    Oseba o4 = new Oseba("d", 13);
    Oseba o6 = new Oseba("a", 3);
    Oseba o7 = new Oseba("b", 15);

    Oseba[] osebe = new Oseba[4];
    osebe[0] = o4;
    osebe[1] = o3;
    osebe[2] = o1;
    osebe[3] = o2;

    for(Oseba o : osebe)
      System.out.print(o + " ");
    System.out.println();

    System.out.println("Urejeno po abecedi:");
    Arrays.sort(osebe);
    System.out.println(Arrays.toString(osebe));

    System.out.println("Urejeno po starosti: ");
    Arrays.sort(osebe, new Primerjalnik());
    System.out.println(Arrays.toString(osebe));

    Arrays.sort(osebe, new Comparator<Oseba>() {
      public int compare(Oseba o1, Oseba o2) {
        return o1.starost - o2.starost;
      }
    });

    ArrayList<Oseba> olist = new ArrayList<>();
    olist.add(o1);olist.add(o2);olist.add(o3);olist.add(o4);olist.add(o5);olist.add(o6);olist.add(o7);
    // urejanje po dveh kriterijih: najprej primerjamo po abecedi; esebe, ki so po
    // abecedi enake, primerjamo se po starosti
    olist.sort(new Comparator<Oseba>() {
      @Override
      public int compare(Oseba o1, Oseba o2) {
        int pP = -o1.ime.compareTo(o2.ime);
        if (pP == 0)
          return (o1.starost - o2.starost);
        else
          return pP;
      }
    });
    System.out.println(olist);
  }
}
