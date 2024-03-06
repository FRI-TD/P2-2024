package predavanje02;

public class Srecke {
    public static void main(String[] args) {
        System.out.println("Stevilo sreck | Cena (EUR)");
        System.out.println("--------------------------");

        double cenaEneSrecke = 1.25;

        for(int i=1; i <= 10; i = i + 1) {
            System.out.printf("%4d          |  %6.2f\n", i, i*cenaEneSrecke);
        }
    }
}
