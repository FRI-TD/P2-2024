package predavanje08;

import predavanje07.Student;

public class Studenti {
  public static void main(String[] args) {
    Student s1 = new Student("Janez", 63000001);
    s1.dodajOceno(10);
    s1.dodajOceno(9);
    s1.dodajOceno(9);
    s1.setIme("Štefan");

    System.out.println(s1.toString());
    System.out.println("Status studenta s1: " + s1.getStatus());

  }

}
