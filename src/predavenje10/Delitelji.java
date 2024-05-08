package predavenje10;

import java.util.Set;
import java.util.TreeSet;

public class Delitelji {
  static Set<Integer> delitelji(int x) {
    TreeSet<Integer> result = new TreeSet<>();
    for (int i=1; i<=x/2; i++)
      if (x % i == 0)
        result.add(i);
    result.add(x);
    return result;
  }

  public static void main(String[] args) {
    int x = 16;
    Set<Integer> d1 = delitelji(x);
    System.out.println(d1);

    int y = 128;
    Set<Integer> d2 = delitelji(y);
    System.out.println(d2);

    Set<Integer> unija = new TreeSet(d1); unija.addAll(d2);
    System.out.print("Stevila, ki delijo bodisi x bodisi y: ");
    System.out.println(unija);

    Set<Integer> presek = new TreeSet(d1); presek.retainAll(d2);
    System.out.print("Stevila, ki delijo x in y: ");
    System.out.println(presek);


  }
}
