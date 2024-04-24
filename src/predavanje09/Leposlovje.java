package predavanje09;

import java.util.Arrays;

public class Leposlovje extends Knjiga {
  static final int MAX_MNENJ = 10;

  private String[] mnenja;
  private int      stMnenj;

  Leposlovje(String avtor, String naslov, int letoIzdaje) {
    super( avtor,  naslov,  letoIzdaje) ;

    this.mnenja = new String[MAX_MNENJ];
    this.stMnenj=0;
  }

  @Override
  public String getPodrobnosti() {
    return Arrays.toString(mnenja);
  }

  public void dodajMnenje(String mnenje) {
    if (this.stMnenj < MAX_MNENJ) {
      this.mnenja[this.stMnenj++] = mnenje;
    }
  }

}
