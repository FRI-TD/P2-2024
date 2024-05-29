package predavanje13;

import javax.swing.*;
import java.awt.*;

public class Kalkulator {

  public static void main(String[] args) {
    JFrame okno = new JFrame();
    okno.setSize(500, 100);
    okno.setLocation(300,300);

    JTextField aTF = new JTextField();
    JTextField bTF = new JTextField();
    JTextField rTF = new JTextField();
    JTextField opTF = new JTextField(2);
    JLabel enacajL = new JLabel("=");
    JButton racunajB = new JButton("Izračunaj");

    JPanel panel = new JPanel();
    panel.setLayout(new GridBagLayout());
    GridBagConstraints gbc;

    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1.0/3;
    panel.add(aTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=0;
    panel.add(opTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=2;
    gbc.gridy=0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1.0/3;
    panel.add(bTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=3;
    gbc.gridy=0;
    panel.add(enacajL, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=4;
    gbc.gridy=0;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1.0/3;
    panel.add(rTF, gbc);

    JPanel razteg = new JPanel();
    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=1;
    gbc.fill = GridBagConstraints.VERTICAL;
    gbc.weighty=1;
    panel.add(razteg, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=2;
    gbc.gridwidth=5;
    gbc.fill = GridBagConstraints.HORIZONTAL;
    gbc.weightx=1;
    panel.add(racunajB, gbc);

    okno.add(panel);
    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
