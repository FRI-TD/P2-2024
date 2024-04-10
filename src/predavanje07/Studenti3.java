package predavanje07;

import java.util.Scanner;

public class Studenti3 {

  static void bla(Integer i) {
    System.out.println(i);
  }

  public static void main(String[] args) {
    int n = 4;

    /*
    Student s1, s2, s3;
    s1 = new Student();
    s1.ime = "Janez";
    s1.id  = 63000001;
    s2 = new Student();
    s2 ...
    */

    Student[] studenti = new Student[n];

    Scanner sc = new Scanner(System.in);

    /*
    for(int i=0; i<n; i++) {
      Student s = new Student();
      System.out.println("Vpisi "+(i+1)+". ime: ");
      s.ime = sc.nextLine();
      System.out.println("Vpisi "+(i+1)+". id: ");
      s.id = sc.nextInt();
      studenti[i] = s;
    }
    */

    for(int i=0; i<n; i++) {
      studenti[i] = new Student();
      System.out.println("Vpisi " + (i + 1) + ". ime: ");
      studenti[i].ime = sc.nextLine();
      System.out.println("Vpisi " + (i + 1) + ". id: ");
      studenti[i].id = sc.nextInt();
    }

    // skriti konstruktorji
    String a = "bla";        // String a = new String("bla");
    bla(5);                  // tu se bo 5 spremenila v new Integer("5")
  }
}
