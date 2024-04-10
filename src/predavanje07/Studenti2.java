package predavanje07;

import java.util.Scanner;

public class Studenti2 {

  public static void main(String[] args) {
    int n = 4;
    String[] ime = new String[n];
    int[]    id  = new int[n];

    Scanner sc = new Scanner(System.in);

    for(int i=0; i<n; i++) {
      System.out.println("Vpisi "+(i+1)+". ime: ");
      ime[i] = sc.nextLine();
      System.out.println("Vpisi "+(i+1)+". id: ");
      id[i] = sc.nextInt();
    }
  }
}
