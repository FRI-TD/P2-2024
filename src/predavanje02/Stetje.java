package predavanje02;

public class Stetje {
    public static void main(String[] args) {
        String[] besede = {"pomlad", "jabolko","jesen", "zima", "lopar", "bor"};

        for(int i=0; i<besede.length; i=i+1) {
            System.out.println(besede[i]);
        }

        int[] crke = new int[26]; // v tabeli so same nicle
        for(int i=0; i<besede.length; i=i+1) {
            char c  = besede[i].charAt(0);
            int idx = c - 'a'; // 'a' -> 0, 'b' -> 1, ...
            crke[idx] = crke[idx] + 1;
        }

        for (int i=0; i<26; i=i+1) {
            char c = (char)('a' + i);
            System.out.printf("Stevilo besed na crko '%c': %d\n", c, crke[i]);
        }
    }
}
