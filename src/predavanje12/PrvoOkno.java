package predavanje12;

import javax.swing.*;
import java.awt.*;

public class PrvoOkno {
  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(1000,500);
    okno.setLocation(300,300);
    okno.setTitle("Prvo okno");
    //okno.setResizable(false);

    JPanel panel = new JPanel();
    //panel.setBackground(Color.red);
    panel.setBorder(BorderFactory.createTitledBorder("Naslov okvira"));
    okno.add(panel);

    JButton gumb1 = new JButton("OK");
    panel.add(gumb1);
    JButton gumb2 = new JButton("Cancel");
    panel.add(gumb2);
    JButton gumb3 = new JButton("Help");
    panel.add(gumb3);


    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
