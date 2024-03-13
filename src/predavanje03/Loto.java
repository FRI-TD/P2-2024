package predavanje03;

import java.util.Random;

public class Loto {
  public static void main(String[] args) {
    // izpisimo 7 stevil z intervala [1, 49]

    // incializacija generatorja
    // Random rnd = new Random(0); // vedno isto zaporedje
    //Random rnd = new Random(System.currentTimeMillis()/1000); // za seme uporabim čas
    Random rnd = new Random(); // izbiro semena prepustim javi
    for (int i = 0; i < 7; i = i + 1) {
      int x = rnd.nextInt(49) + 1;
      System.out.print(" " + x);
    }
  }
}
