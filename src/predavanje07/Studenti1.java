package predavanje07;

import java.util.Scanner;

public class Studenti1 {

  public static void main(String[] args) {
    String ime1, ime2, ime3, ime4;
    int id1, id2, id3, id4;

    Scanner sc = new Scanner(System.in);

    System.out.println("Vpisi 1. ime: ");
    ime1 = sc.nextLine();
    System.out.println("Vpisi 1. id: ");
    id1 = sc.nextInt();

    System.out.println("Vpisi 2. ime: ");
    ime2 = sc.nextLine();
    System.out.println("Vpisi 2. id: ");
    id2 = sc.nextInt();

    System.out.println("Vpisi 3. ime: ");
    ime3 = sc.nextLine();
    System.out.println("Vpisi 3. id: ");
    id3 = sc.nextInt();

    System.out.println("Vpisi 4. ime: ");
    ime4 = sc.nextLine();
    System.out.println("Vpisi 4. id: ");
    id4 = sc.nextInt();

  }
}
