package predavanje05;

public class DN04 {
  public static void main(String[] args) {
    for (int i = 0; i < args[0].length()/8 ; i++ ) {
      int vC = 0;
      for (int j = 0; j<8; j++)
        vC += (args[0].charAt(i * 8 + j)-'0') *  (1 << (7-j));
      System.out.print((char)vC);
    }
  }
}
