package predavanje07;

public class Student {
  static final int MAX_OCEN = 10;

  private String ime;
  public int id;

  private String status;

  public int stOcen;
  public int[] ocene;

  Student() {}

  public Student(String ime, int id) {
    this.ime = ime;
    this.id  = id;

    this.ocene = new int[MAX_OCEN];
    this.stOcen = 0;

    this.status = "Dober";
  }

  public String getIme() {
    return this.ime;
  }
  public void setIme(String ime) {
    this.ime = ime;
  }

  public double povprecje() {
    if (stOcen == 0) return 0;
    int vsota = 0;
    for(int i=0; i<stOcen; i++)
      vsota = vsota + ocene[i];
    return 1.0  * vsota / stOcen;
  }

  public void dodajOceno(int ocena) {
    if (stOcen < MAX_OCEN) {
      ocene[stOcen++] = ocena;
      if (povprecje() > 9)
        status = "Odličen";
      else
        status = "Dober";
    }
  }

  public String getStatus() {
    return status;
  }

  public String toString() {
    return String.format("Ime: %s,  ID: %d, Status: %s", ime, id, status);
  }
}