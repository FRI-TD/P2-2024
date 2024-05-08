package predavanje10;

public class Drzava {
  private String kratica;
  private String glavnoMesto;
  private int steviloPrebivalcev;

  public Drzava(String kratica, String glavnoMesto, int steviloPrebivalcev) {
    this.kratica = kratica;
    this.glavnoMesto = glavnoMesto;
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  public String getKratica() {
    return kratica;
  }

  public void setKratica(String kratica) {
    this.kratica = kratica;
  }

  public String getGlavnoMesto() {
    return glavnoMesto;
  }

  public void setGlavnoMesto(String glavnoMesto) {
    this.glavnoMesto = glavnoMesto;
  }

  public int getSteviloPrebivalcev() {
    return steviloPrebivalcev;
  }

  public void setSteviloPrebivalcev(int steviloPrebivalcev) {
    this.steviloPrebivalcev = steviloPrebivalcev;
  }

  @Override
  public String toString() {
    return String.format("Drzava: %s, glavno mesto: %s, stevilo prebivalcev: %d",
             this.kratica, this.glavnoMesto, this.steviloPrebivalcev);
  }
}
