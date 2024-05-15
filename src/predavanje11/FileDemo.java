package predavanje11;

import java.io.File;

public class FileDemo {

  public static void main(String[] args) {
    File f = new File("viri\\medo.bmp");
    System.out.println(f.exists());
    System.out.println(f.length());
    f.delete();

    File v = new File(".");
    String[] datoteke = v.list();
    for(String d : datoteke)
      System.out.println(d);
  }
}
