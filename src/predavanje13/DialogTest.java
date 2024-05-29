package predavanje13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class DialogTest {
  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(500, 200);
    okno.setLocation(300,300);

    JLabel napisL = new JLabel("Vpisi starost: ");
    JButton odpriB = new JButton("Odpri dialog");
    JLabel odgovorL = new JLabel("Odgovor: ");
    JTextField odgovorTF = new JTextField(10);

    JPanel panel = new JPanel(); // privzet razporejavalnik je FlowLayout
    panel.add(napisL);panel.add(odpriB);panel.add(odgovorL);panel.add(odgovorTF);

    odpriB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String starost = JOptionPane.showInputDialog(okno, "Vpiši starost: ");
        odgovorTF.setText(starost);
      }
    });

    JPanel spodajP = new JPanel();
    JButton gumb = new JButton("Odpri");
    JTextField imeDatotekeTF = new JTextField(30);
    spodajP.add(imeDatotekeTF);spodajP.add(gumb);
    gumb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFileChooser jfc = new JFileChooser();
        jfc.showOpenDialog(okno);
        File sf = jfc.getSelectedFile();
      }
    });

    okno.add(spodajP, BorderLayout.PAGE_END);

    okno.add(panel);

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }}
