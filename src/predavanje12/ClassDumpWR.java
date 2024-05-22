package predavanje12;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;
import java.math.BigInteger;

public class ClassDumpWR {

  // demonstracija uporabe try-with-resources bloka
  public static void main(String[] args) {
    String imeDatoteke="out/production/P2/Obresti.class";
    try
      // vse, kar se odpre v "try-with-resources" bloku (v oklepajih za try in pred {)
      // so bo ob koncu try bloka avtomatsko zaprlo
      (DataInputStream dis = new DataInputStream(new FileInputStream(imeDatoteke));
       PrintWriter pw = new PrintWriter("bla.txt");
      )
    {
      byte[] magic = new byte[4];
      dis.read(magic); // preberem 4 bajte v tabelo
      for (int i=0; i<4; i++) System.out.printf("%x", magic[i]);
    } catch (Exception e) {
      System.out.println("Napaka: " + e);
    }
  }
}
