package predavanje03;

import java.util.Scanner;

public class Povprecje {
  public static void main(String[] args) {
    int n = 0;      // stevilo prebranih ocen
    int vsota = 0;  // vsota vseh prebranih ocen
    int x = -1;     // trenutna vpisana ocena

    Scanner sc = new Scanner(System.in);

    while (x != 0) {
      System.out.print("Vpiši oceno: ");
      x = sc.nextInt();
      if (x != 0) {
        vsota = vsota + x;
        n = n + 1;
      }
    }

    if (n == 0) {
      System.out.println("Ok.");
    } else {
      System.out.printf("Povprecje %d prebranih ocen je %.2f\n", n, 1.0 * vsota / n);
    }
    //System.out.println("Povprecje prebranih ocen je " + (1.0*vsota / n));
  }
}
