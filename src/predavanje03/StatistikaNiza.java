package predavanje03;

public class StatistikaNiza {

    static void statistikaNiza(String niz) {
        System.out.println("Niz:              " + niz);
        System.out.printf("Prva crka niza:   %c\n", niz.charAt(0));

        int len = niz.length();
        System.out.printf("Zadnja crka niza: %c\n", niz.charAt(len-1));

        String brezPresledkov = niz.replaceAll(" ","");
        System.out.printf("Niz brez presledkov: %s\n", brezPresledkov);

        int steviloBesed = niz.length() - brezPresledkov.length() + 1;
        System.out.printf("Stevilo besed: %d\n", steviloBesed);

        System.out.print("Obrnjen niz: ");
        for(int i=niz.length() - 1; i >= 0; i = i -1) {
            System.out.printf("%c", niz.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String niz = "Danes je lep dan!";
        statistikaNiza(niz);

        statistikaNiza("ABRAKADABRA");
    }
}
