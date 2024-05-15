package predavanje11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopy {

  public static void copyZnakPoZnaku() {
    try {
      FileInputStream  fis = new FileInputStream(new File("viri/volk.bmp"));
      FileOutputStream fos = new FileOutputStream(new File("viri/volk1.bmp"));

      // pocasno kopiranje vsakega znaka posebej
      while(fis.available() > 0) {
        int z = fis.read(); // z = prebrani bajt
        fos.write(z);
      }

      fos.close();
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka!");
    }
  }

  public static void copyBlokPoBloku() {
    try {
      FileInputStream  fis = new FileInputStream(new File("viri/volk.bmp"));
      FileOutputStream fos = new FileOutputStream(new File("viri/volk2.bmp"));

      byte[] mem = new byte[4096]; // medpomnilnik velikosti 4096

      // hitro kopiranje bloka podatkov
      while(fis.available() > 0) {
        int z = fis.read(mem); // z = stevilo prebranih bajtov
        fos.write(mem, 0, z);
      }

      fos.close();
      fis.close();
    } catch (Exception e) {
      System.out.println("Napaka!");
    }
    System.out.println("KONEC");
  }

  public static void main(String[] args) {
    copyBlokPoBloku();
  }
}
