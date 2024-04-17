package predavanje08;

public class Knjiga {
  private String naslov;
  private String avtor;
  private int letoIzdaje;

  public void setAvtor(String avtor) {
    this.avtor = avtor;
  }
  public String getAvtor() {
    return this.avtor;
  }
  public void setNaslov(String naslov) {
    this.naslov = naslov;
  }
  public String getNaslov() {
    return this.naslov;
  }
  public void setLetoIzdaje(int letoIzdaje) {
    this.letoIzdaje = letoIzdaje;
  }
  public int getLetoIzdaje() {
    return this.letoIzdaje;
  }
}
