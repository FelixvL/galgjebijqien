import java.util.ArrayList;
import java.util.Random;

class Demo{
	public static void main(String[] args) {
		MonoPoly mp = new MonoPoly();
		mp.init();
		mp.starten();
	}
}

class MonoPoly{
	ArrayList<Stad> steden = new ArrayList();
	void starten() {
		toonBordspel();
		toonStraat();
	}
	void toonStraat() {
		int getal = dobbelsteenGooien(steden.size());
		System.out.println("STAD GEWORPEN");
		System.out.println(steden.get(getal).naam);
		int getalstraat = dobbelsteenGooien(steden.get(getal).straten.size());
		Straat deStraat = steden.get(getal).straten.get(getalstraat);
		deStraat.gekocht = true;
		toonBordspel();
		
	}
	int dobbelsteenGooien(int aantal) {
		Random random = new Random();
		return (random.nextInt(aantal));
	}
	void init() {
		Stad stadamsterdam = new Stad("Amsterdam");
		stadamsterdam.straten.add(new Straat("Kalverstraat", 100));
		stadamsterdam.straten.add(new Straat("Leidsche Plein", 90));
		steden.add(stadamsterdam);
		Stad stadUtrecht = new Stad("Utrecht");
		stadUtrecht.straten.add(new Straat("Neude", 80));
		stadUtrecht.straten.add(new Straat("Vreedenburg", 0));
		steden.add(stadUtrecht);
	}
	void toonBordspel() {
		for(Stad stad : steden) {
			System.out.println(stad.naam);
			for(Straat straat : stad.straten) {
				straat.oplezen();
			}
		}
	}
}

class Speler{
	
}
class Stad{
	String naam;
	ArrayList<Straat> straten = new ArrayList();
	Stad(String naam){this.naam = naam;}
}
class Straat{
	boolean gekocht = false;
	String straatnaam;
	int prijs;
	Straat(String straatnaam, int prijs){
		this.straatnaam = straatnaam;
		this.prijs = prijs;
	}
	void oplezen() {
		if(gekocht) {System.out.print("GEKOCHT: ");}
		System.out.println("Naam Straat: "+ straatnaam + " prijs "+ prijs);
	}
}