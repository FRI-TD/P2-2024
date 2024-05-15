package predavanje11;

import java.io.File;

public class ListFiles {

  static void izpisi(String imeMape, String presledki) {
    File f = new File(imeMape);
    for (String ime : f.list()) {
      System.out.println(presledki + ime);
      File nF = new File(imeMape, ime);
      if (nF.isDirectory())
        izpisi(nF.getAbsolutePath(), presledki + "  ");
    }
  }

  public static void main(String[] args) {
    izpisi("./out/production", "");
  }

}
