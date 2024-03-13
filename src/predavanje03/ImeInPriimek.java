package predavanje03;

import java.util.*;

public class ImeInPriimek {

  public static void main(String[] args) {
    // inicializacija bralnika
    Scanner sc = new Scanner(System.in);

    System.out.print("Vpiši ime in priimek: ");
    String ime = sc.nextLine();

    int starost = 0;
    boolean starostOK = false;
    while (starostOK == false) {
      try {
        System.out.print("Vpiši starost: ");
        starost = sc.nextInt();
        starostOK = true;
      } catch (Exception e) {
        System.out.println("Napačen vpis starosti!");
        sc.nextLine();
      }
    }

    System.out.printf("Pozdravljen, %s, star si %d let.\n", ime, starost);
  }
}
