package predavanje03;

import java.io.File;
import java.util.Scanner;

public class Bitcoin {
  public static void main(String[] args) {

    try {
      // odprem datoteko za branje
      Scanner sc = new Scanner(new File("viri/bitcoin.txt"));

      while (sc.hasNext()) {
        String vrstica = sc.next();

        System.out.println(vrstica);
      }

      // obvezno zapiranje datoteke
      sc.close();
    } catch (Exception e) {
      System.out.println("Napaka pri delu z datoteko");
    }
  }
}
