import java.lang.Math; 

public class Obresti {
	
	public static void main(String[] args) {
		double glavnica     = 1000;
		int    steviloLet   = 10;
		double obrestnaMera = 5.0;

		double koncniZnesek = glavnica * Math.pow(1+obrestnaMera/100, steviloLet);

		System.out.println("Glavnica: "      + glavnica);
		System.out.println("Število let: "   + steviloLet);
		System.out.println("Obrestna mera: " + obrestnaMera);
		System.out.println("Končni znesek: " + koncniZnesek);
	}
}