package predavanje12;

import java.net.URL;
import java.util.Scanner;

public class KRIPTO {
  public static void main(String[] args) throws Exception {
    String from = "BTC";
    String to   = "EUR";
    String url  = String.format("https://min-api.cryptocompare.com/data/price?fsym=%s&tsyms=%s", from ,to);

    Scanner sc = new Scanner(new URL(url).openStream());
    String vrstica = sc.nextLine();
    String deli[] = vrstica.split(":");
    System.out.println(deli[1].substring(0, deli[1].length()-1));
    sc.close();
  }
}
