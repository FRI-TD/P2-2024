package predavanje04;

import java.io.*;

public class Postevanka {

  public static void main(String[] args) {
    int n = 7;  // izpisujem postevanko stevila n
    int a = 3;  // spodnja meja izpisa
    int b = 6;  // zgornja meja izpisa

    try {
      PrintWriter pw = new PrintWriter(new File("viri/veckratniki.txt"));
      for (int i = a; i <= b; i = i + 1) {
        pw.printf("%d * %d = %d \n", i, n, i * n);
      }
      pw.close();
    } catch (Exception e) {
      System.out.println("Napaka pri delu z datoteko: " + e);
    }
  }
}
