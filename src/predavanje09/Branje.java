package predavanje09;

public class Branje {

  static void preberi(String imeDatoteke) {
    try {
      java.util.Scanner sc = new java.util.Scanner(new java.io.File(imeDatoteke));
    } catch (Exception e) {
      // ...
    }
  }

}
