package predavanje13;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest {
  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(500, 200);
    okno.setLocation(300,300);

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout(FlowLayout.RIGHT)); // komponente na panelu naj razporeja FlowLayout razporejevalnik

    JButton gumb1 = new JButton("prvi");
    JButton gumb2 = new JButton("drugi");
    JButton gumb3 = new JButton("tretji");
    JButton gumb4 = new JButton("četrti");
    JButton gumb5 = new JButton("peti");

    gumb1.setPreferredSize(new Dimension(70,25));
    gumb2.setPreferredSize(new Dimension(70,25));
    gumb3.setPreferredSize(new Dimension(70,25));
    gumb4.setPreferredSize(new Dimension(70,25));
    gumb5.setPreferredSize(new Dimension(70,25));

    panel.add(gumb1);panel.add(gumb2);panel.add(gumb3);
    panel.add(gumb4);panel.add(gumb5);

    okno.add(panel);

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
