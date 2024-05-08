package predavenje10;

import java.util.*;

public class Dnevi {
  public static void main(String[] args) {
    Set<String> dnevi = new TreeSet();

    dnevi.add("PON");
    dnevi.add("TOR");
    dnevi.add("SRE");
    dnevi.add("CET");
    dnevi.add("PET");

    System.out.println(dnevi.contains(("SOBOTA")));
    System.out.println(dnevi.size());

    dnevi.add("CET");
    System.out.println(dnevi.size());

    dnevi.remove("CET");
    System.out.println(dnevi.size());

    // sprehod po podatkih (mnozici) z iteratorjem
    Iterator<String> it = dnevi.iterator();
    while (it.hasNext()) {
      String dan = it.next();
      System.out.println(dan);
    }

    // sprehod po podatkih (mnozici) s foreach zanko
    System.out.println("--------------------");
    for (String dan : dnevi) {
      System.out.println(dan);
    }

    int[]  tabela = {3,2,5,4,7,9,4};
    for (int x : tabela)
      System.out.println(x);

  }
}
