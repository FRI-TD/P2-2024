package predavanje02;

public class Argumenti {
    public static void main(String[] args) {
        // za namene testiranja prepisem tabelo args
        // args = new String[]{"1","2","3"};

        System.out.println("Stevilo argumentov: " + args.length);
        for (int i=0; i<args.length; i=i+1) {
            System.out.printf("Argumnet %d: %s\n", i+1, args[i]);
        }
    }
}
