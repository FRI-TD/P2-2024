package predavanje12;

import java.net.URL;
import java.util.Scanner;

public class Yahoo {
  public static void main(String[] args) throws Exception {
    URL url = new URL("https://yahoo.com");
    Scanner sc = new Scanner(url.openStream());
    while (sc.hasNextLine()) {
      System.out.println(sc.nextLine());
    }
    sc.close();
  }
}
