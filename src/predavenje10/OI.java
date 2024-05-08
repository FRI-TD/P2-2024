package predavenje10;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OI {
  public static Map<String, Drzava> preberiDrzave(String imeDatoteke) {
    Map<String, Drzava> result = new HashMap();
    try {
      Scanner sc = new Scanner(new File(imeDatoteke));
      while(sc.hasNextLine()) {
        String v = sc.nextLine();
        String[] deli = v.split(":");
        Drzava d = new Drzava(deli[0], deli[1], Integer.parseInt(deli[2])); // "3581656"
        result.put(deli[0], d);
      }
      sc.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e.toString());
    }
    return result;
  }

  public static void main(String[] args) {
    preberiDrzave("viri/drzave.txt");
  }
}
