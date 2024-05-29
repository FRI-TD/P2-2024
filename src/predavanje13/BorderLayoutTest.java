package predavanje13;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {
  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(500, 200);
    okno.setLocation(300,300);

    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout()); // komponente na panelu naj razporeja FlowLayout razporejevalnik

    JButton gumb1 = new JButton("prvi");
    JButton gumb2 = new JButton("drugi");
    JButton gumb3 = new JButton("tretji");
    JButton gumb4 = new JButton("četrti");
    JButton gumb5 = new JButton("peti");

    gumb1.setPreferredSize(new Dimension(100,40));
    gumb2.setPreferredSize(new Dimension(100,40));
    gumb3.setPreferredSize(new Dimension(100,40));
    gumb4.setPreferredSize(new Dimension(100,40));
    gumb5.setPreferredSize(new Dimension(100,40));

    panel.add(gumb1, BorderLayout.PAGE_START);
    panel.add(gumb2, BorderLayout.LINE_START);
    panel.add(gumb3, BorderLayout.LINE_END);
    panel.add(gumb4, BorderLayout.PAGE_END);
    panel.add(gumb5, BorderLayout.CENTER);

    okno.add(panel);

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
