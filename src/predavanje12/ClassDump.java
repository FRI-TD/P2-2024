package predavanje12;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.util.Arrays;

public class ClassDump {

  public static void main(String[] args) {
    String imeDatoteke="out/production/P2/Obresti.class";
    try {
      FileInputStream fis = new FileInputStream(imeDatoteke);
      BufferedInputStream bis = new BufferedInputStream(fis);
      DataInputStream dis = new DataInputStream(bis);
      byte[] magic = new byte[4];
      dis.read(magic); // preberem 4 bajte v tabelo
      for (int i=0; i<4; i++) System.out.printf("%x", magic[i]);
      System.out.println();

      // lahko ustvarim objekt tipa BigInteger ...
      BigInteger bi = new BigInteger(1,magic); // 1 pomeni, da naj število interpretira kot nepredznačeno (pozitivno) število
      // ... in ga izpišem kot zaporedje bajtov v šestnajstiškem sistemu
      System.out.println(bi.toString(16));

      short minor = dis.readShort();
      short major = dis.readShort();
      short conspoolcount = dis.readShort();

      System.out.println("Major: " + major);
      System.out.println("Constant pool count: " + conspoolcount);

      dis.close();
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }
}
