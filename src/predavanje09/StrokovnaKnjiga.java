package predavanje09;

public class StrokovnaKnjiga extends Knjiga {
  private String index;

  StrokovnaKnjiga(String avtor, String naslov, int letoIzdaje, String index)  {
    super(avtor, naslov, letoIzdaje);
    this.index = index;
  }

  @Override
  public String getPodrobnosti() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }
  public String getIndex() {
    return this.index;
  }
}
