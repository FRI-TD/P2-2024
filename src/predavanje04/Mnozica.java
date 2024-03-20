package predavanje04;

public class Mnozica {

  static int getPraznaMnožica() {
    return 0;
  }

  static int getBit(int element) {
    int c = element - 'a'; // 'a' -> 0, 'b' -> 1, ...
    return 1 << c;
  }

  // drugi parameter je en ali več int-ov; ustvari se tabela int[]
  static int dodajElement(int mnozica, char... elementi) {
    for(int i=0; i<elementi.length; i++) {
      mnozica = dodajElement(mnozica, elementi[i]);
    }
    return mnozica;
  }

  // metoda prejme mnozico in en element, ki ga doda mnozici;
  // rezultat je nova mnozica (ki vsebuje novi element)
  static int dodajElement(int mnozica, char element) {
    // element je, recimo, 'a'; spremenim ga v "bit" (1)
    int bit = getBit(element);

    return mnozica | bit;
  }

  static boolean vsebuje(int mnozica, char element) {
    int bit = getBit(element);
    return (mnozica & bit) == bit; // je bit prizgan?
  }

  static String toString(int mnozica) {
    String result = "";
    for(char c='a'; c <= 'z'; c++) {
      if (vsebuje(mnozica, c)) {
        result = result + (result.isEmpty() ? "" : ",") + c;
      }
    }
    return "["+result+"]";
  }

  public static void main(String[] args) {
    int mnozica1 = getPraznaMnožica();
    mnozica1 = dodajElement(mnozica1, 'a','i', 'e', 'z');
    System.out.printf("Mnozica1=%s\n", toString(mnozica1));

    int mnozica2 = getPraznaMnožica();
    mnozica2 = dodajElement(mnozica2, 'a', 'f','z', 'b');
    System.out.printf("Mnozica2=%s\n", toString(mnozica2));

//    int presek = presek(mnozica1, mnozica2);
//    int unija  = unija (mnozica1, mnozica2);
//    System.out.printf("presek(%s, %s)=%s\n",
//            toString(mnozica1), toString(mnozica2), toString(presek));
//    System.out.printf("inija (%s, %s)=%s\n",
//            toString(mnozica1), toString(mnozica2), toString (unija));

  }
}
