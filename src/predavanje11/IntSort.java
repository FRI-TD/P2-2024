package predavanje11;

import java.util.Arrays;

public class IntSort {
  public static void main(String[] args) {
    int[] t = {4,3,8,1,2,5,9,0,6};

    System.out.println(Arrays.toString(t));
    Arrays.sort(t);
    System.out.println(Arrays.toString(t));
  }

}
