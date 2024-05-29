package predavanje13;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutWithTextArea {
  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(500, 200);
    okno.setLocation(300,300);

    okno.setLayout(new BorderLayout()); // nepotrebno, saj je BorderLayout privzet razporejevalnik za JFrame

    JTextArea urejevalnikTA = new JTextArea();
    JButton okB     = new JButton("OK");
    JButton cancelB = new JButton("Cancel");

    JPanel gumbiP   = new JPanel();
    gumbiP.setLayout(new FlowLayout(FlowLayout.RIGHT));
    gumbiP.add(okB); gumbiP.add(cancelB);

    JScrollPane jsc = new JScrollPane(urejevalnikTA);

    okno.add(jsc); // BorderLayout.CENTER ni potrebno dodati
    okno.add(gumbiP, BorderLayout.PAGE_END);

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
