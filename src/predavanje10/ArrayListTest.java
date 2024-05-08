package predavanje10;

import java.util.ArrayList;

public class ArrayListTest {

  public static void main(String[] args) {
    ArrayList<String> imena = new ArrayList();

    imena.add("Miha");
    imena.add("Micka");
    imena.add("Polde");

    for(String ime: imena)
      System.out.println(ime);

    System.out.println("---------------------------");
    System.out.println(imena.get(0));

    imena.set(2, "Mojca");  // imena[2]="Mojca"
    System.out.println("---------------------------");
    for(String ime: imena)
      System.out.println(ime);


  }
}
