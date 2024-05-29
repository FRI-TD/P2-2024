package predavanje13;

import javax.swing.*;
import java.awt.*;

public class ColorChooser {

  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(500, 200);
    okno.setLocation(300,300);

    okno.add(new JColorChooser());

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
