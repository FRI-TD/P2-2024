package predavanje04;

public class Biti {

  static int steviloBitov(int stevilo) {
    int stBitov=0;
    while (stevilo > 0) {
      int b = stevilo & 1;
      if (b==1) stBitov++;

      stevilo = stevilo >> 1;
    }
    return stBitov;
  }

  public static void main(String[] args) {
    int x = 42;
    int b = steviloBitov(x);
    System.out.printf("Stevilo prizganih bitov v stevilu %d je %d\n", x, b);
  }

}
