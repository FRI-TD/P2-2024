package predavanje05;

import java.util.Scanner;

public class StringTest {

  public static void main(String[] args) {
    String n1 = "a";
    String n2;
    Scanner sc = new Scanner(System.in);
    n2 = sc.nextLine(); // uporabnik naj vpise znak a

    if (n1 == n2) {
      System.out.println("Sta enaka");
    } else {
      System.out.println("Nista enaka");
    }

    if (n1.equals(n2)) {
      System.out.println("equals: Sta enaka");
    } else {
      System.out.println("equals: Nista enaka");
    }

  }
}
