package predavanje10;

import java.util.*;

public class Meseci {
  public static void main(String[] args) {
    Map<String, Integer> meseci = new HashMap();

    meseci.put("JAN", 31);
    meseci.put("FEB", 28);
    meseci.put("MAR", 31);
    meseci.put("APR", 30);
    meseci.put("MAJ", 31);
    meseci.put("JUN", 30);
    meseci.put("JUL", 31);
    meseci.put("AVG", 31);
    meseci.put("SEP", 30);
    meseci.put("OKT", 31);
    meseci.put("NOV", 30);
    meseci.put("DEC", 31);

    meseci.remove("FEB");

    System.out.println("Vsebuje JAN? " + meseci.containsKey("JAN"));
    System.out.println("Vsebuje XYZ? " + meseci.containsKey("XYZ"));
    System.out.println("Stevilo mesecev: " + meseci.size());

    for(String kljuc : meseci.keySet()) {
      System.out.printf("Mesec: %s, stevilo dni %d\n", kljuc, meseci.get(kljuc));
    }


  }
}
