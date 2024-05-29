package predavanje13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Poslusalec implements ActionListener {
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("Gumb pritisnjen!");
  }
}

public class GridBagLayoutTest {
  public static void main(String[] args) {
    JFrame okno = new JFrame();

    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension dim = tk.getScreenSize();
    okno.setSize(dim.width/2, dim.height/2);
    okno.setLocation(dim.width/4, dim.height/4);

    okno.setLayout(new GridBagLayout());

    JLabel imeL          = new JLabel("Ime:");
    JLabel priimekL      = new JLabel("Priimek:");
    JTextField imeTF     = new JTextField();
    JTextField priimekTF = new JTextField();
    JTextArea besediloTA = new JTextArea();

    JPanel gumbiP   = new JPanel();
    JButton okB     = new JButton("OK");
    JButton cancelB = new JButton("Cancel");
    JButton helpB   = new JButton("Cancel");
    gumbiP.setLayout(new FlowLayout(FlowLayout.CENTER));
    gumbiP.add(okB); gumbiP.add(cancelB); gumbiP.add(helpB);

    okB.addActionListener(new Poslusalec());

    cancelB.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String ime = imeTF.getText();
        besediloTA.setText(besediloTA.getText() +" "+ ime);
      }
    });

    okno.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        int odgovor = JOptionPane.showConfirmDialog(okno, "Ali res želiš zapreti?");
        if (odgovor == JOptionPane.YES_OPTION) {
          System.exit(0);
        }
      }
    });

    besediloTA.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        besediloTA.setText(String.format("(%d, %d)\n", x, y));
      }
    });

    GridBagConstraints gbc;

    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.insets = new Insets(10,10,0,0);
    okno.add(imeL, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 0;
    gbc.fill  = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1;
    gbc.insets = new Insets(10,10,0,10);
    okno.add(imeTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 1;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.insets = new Insets(10,10,0,0);
    okno.add(priimekL, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 1;
    gbc.gridy = 1;
    gbc.fill  = GridBagConstraints.HORIZONTAL;
    gbc.weightx = 1;
    gbc.insets = new Insets(10,10,0,10);
    okno.add(priimekTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 2;
    gbc.gridwidth = 2;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1;
    gbc.weighty = 1;
    gbc.insets = new Insets(10,10,0,10);
    okno.add(besediloTA, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 3;
    gbc.gridwidth = 2;
    gbc.insets = new Insets(10,10,10,10);
    okno.add(gumbiP, gbc);

    okno.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    okno.setVisible(true);
  }
}
