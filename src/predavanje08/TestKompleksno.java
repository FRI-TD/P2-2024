package predavanje08;

public class TestKompleksno {

  public static void main(String[] args) {
    Kompleksno w = new Kompleksno(3, 5);
    System.out.println(w); // == System.out.println(w.toString());

    Kompleksno z = new Kompleksno();

    Kompleksno x = new Kompleksno(5.0);
  }
}
