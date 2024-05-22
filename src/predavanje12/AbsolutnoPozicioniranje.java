package predavanje12;

import javax.swing.*;

public class AbsolutnoPozicioniranje {
  public static void main(String[] args) {
    JFrame okno = new JFrame();

    okno.setSize(300,150);
    okno.setLocation(500,500);

    JLabel napis        = new JLabel("Ime");
    JTextField imeTF    = new JTextField();
    JButton gumb        = new JButton("Išči");
    JTextArea vsebinaTA = new JTextArea();

    // komponente na oknu bomo razporejali sami!
    okno.getContentPane().setLayout(null);

    napis.setBounds(10, 10, 30 ,20);
    imeTF.setBounds(45, 10, 160, 20);
    gumb.setBounds(210, 10, 70, 20);
    vsebinaTA.setBounds(10, 40, 260, 50);

    okno.add(napis);
    okno.add(imeTF);
    okno.add(gumb);
    okno.add(vsebinaTA);

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
