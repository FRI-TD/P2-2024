package predavanje03;

public class DN02 {
    public static void main(String[] args) {
        int n = (int) Math.ceil(Math.sqrt(args[0].length()));
        String niz = args[0] + ".".repeat(n*n-args[0].length());
        System.out.println(niz.replaceAll("(.{"+n+"})", "$1\n").replaceAll("(.)", " $1 "));
    }
}