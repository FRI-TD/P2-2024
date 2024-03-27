package predavanje05;

import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Sudoku {

  static char[][] preberiSudoku(String imeDatoteke) {
    char[][] sudoku = new char[9][9];
    try {
      Scanner sc = new Scanner(new File(imeDatoteke));
      Random rnd = new Random();
      int v = rnd.nextInt(50); // 0 ... 49
      // preskocim v vrstic
      while (v-- > 0) sc.nextLine();
      String vrstica = sc.nextLine();
      for(int i=0; i<9; i++) {
        for (int j = 0; j < 9; j++) {
          sudoku[i][j] = vrstica.charAt(i*9+j);
        }
      }
      sc.close();
    } catch (Exception e) {
      System.out.println("Napaka pri branju datoteke: " + e);
    }
    return sudoku;
  }

  public static void main(String[] args) {
    char[][] sudoku = preberiSudoku("viri/sudoku.txt");

    for (int i=0; i<9; i++) {
      if (i%3 == 0) {
        for (int k = 0; k < 35; k++) System.out.print("-");
        System.out.println();
      }
      for(int j=0; j<9; j++) {
        System.out.printf("| %c ", sudoku[i][j]=='0' ? '.' : sudoku[i][j]);
      }
      System.out.println();
    }
  }

}
