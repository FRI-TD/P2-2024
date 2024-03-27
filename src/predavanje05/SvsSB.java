package predavanje05;

public class SvsSB {

  static void S() {
    int n=300000;
    String a = "";
    long zacetek = System.currentTimeMillis();
    for (int i=0; i<n; i++) {
      a = a + "a";
    }
    long konec = System.currentTimeMillis();
    long cas = (konec-zacetek);
    System.out.println(a.length());
    System.out.println("Cas: " + cas + " milisekund.");
  }

  static void SB() {
    int n=300000;
    StringBuilder a = new StringBuilder();
    long zacetek = System.currentTimeMillis();
    for (int i=0; i<n; i++) {
      a.append("a");
    }
    long konec = System.currentTimeMillis();
    long cas = (konec-zacetek);
    System.out.println(a.length());
    System.out.println("Cas: " + cas + " milisekund.");
  }

  public static void main(String[] args) {
   SB();
  }
}
