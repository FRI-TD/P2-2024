package predavanje05;

public class StringBufferTest {

  public static void main(String[] args) {
    String niz1 = new String("abc");
    String niz2 = "abc";
    System.out.println(niz1);
    if (niz1.contains("a"))
      System.out.println("Vsebuje a.");
    //niz1.setCharAt(0, 'C');
    //niz1.reverse();


    StringBuffer b1 = new StringBuffer("abc");
    // StringBuffer b2 = "abc";
    System.out.println(b1);
    if (b1.indexOf("a")>=0) // isto kot niz.contains("a")
      System.out.println("Vsebuje a");
    b1.reverse();
    System.out.println(b1);
    b1.setCharAt(0, 'C');
    System.out.println(b1);
    b1.append('X');
    System.out.println(b1);
  }
}
