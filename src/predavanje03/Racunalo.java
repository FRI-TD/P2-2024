package predavanje03;

public class Racunalo {
  public static void main(String[] args) {
    if (args.length != 2) {
      System.out.println("Uporaba: java Racunalo x y");
      System.exit(1);
    }
    
    int x = 0;
    try {
      x = Integer.parseInt(args[0]);
    } catch (Exception e) {
      // ce pridem sem, je pri pretvorbi prislo do napake
      System.out.println("Napačen prvi argument");
      System.exit(2);
    }

    int y = 0;
    try {
      y = Integer.parseInt(args[1]);
    } catch (Exception e) {
      // ce pridem sem, je pri pretvorbi prislo do napake
      System.out.println("Napačen drugi argument");
      System.exit(3);
    }

    System.out.printf("%d + %d = %d \n", x, y, x + y);
  }
}
