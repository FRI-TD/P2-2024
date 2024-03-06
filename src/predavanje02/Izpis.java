package predavanje02;

import java.util.Locale;

public class Izpis {

    public static void main(String[] args) {
        int x = 1024;
        // izpis v sestnajstiskega stevila
        System.out.printf("x po desetisko: %d, x po sestnajstiski: %x\n", x, x);

        // za izpis z angleškimi znaki (npr. . za decimalno ločilo)
        //Locale.setDefault(Locale.ENGLISH);

        // za izpis s slovenskimi znaki (npr. , za decimalno ločilo)
        Locale.setDefault(new Locale("sl", "si"));
        System.out.printf("%f\n", Math.PI);
    }
}
