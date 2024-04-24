package predavanje09;

abstract public class Knjiga extends Object {
  static int ID = 0;  // stevilo do sedaj izdelanih knjig

  private String naslov;
  private String avtor;
  private int letoIzdaje;
  private int zaporednaStevilka;

  Knjiga(String avtor, String naslov, int letoIzdaje) {
    this.zaporednaStevilka = ++Knjiga.ID;
    this.avtor  = avtor;
    this.naslov = naslov;
    this.letoIzdaje = letoIzdaje;
  }

  abstract public String getPodrobnosti();

  public String getNaslov() {
    return naslov;
  }

  public void setNaslov(String naslov) {
    this.naslov = naslov;
  }

  public String getAvtor() {
    return avtor;
  }

  public void setAvtor(String avtor) {
    this.avtor = avtor;
  }

  public int getLetoIzdaje() {
    return letoIzdaje;
  }

  public void setLetoIzdaje(int letoIzdaje) {
    this.letoIzdaje = letoIzdaje;
  }

  public void izpisi() {
    System.out.println("Knjiga " + this.zaporednaStevilka);
    System.out.println("Avtor : " + this.avtor);
    System.out.println("Naslov: " + this.naslov);
    System.out.println("Leto  : " + this.letoIzdaje);
    System.out.println(getPodrobnosti());
  }
}
