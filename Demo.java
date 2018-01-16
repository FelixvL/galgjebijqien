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
		System.out.println(dobbelsteenGooien());
		toonBordspel();
	}
	int dobbelsteenGooien() {
		Random random = new Random();
		return (random.nextInt(6)+1);
	}
	void init() {
		steden.add(new Stad("Amsterdam"));
		steden.add(new Stad("Utrecht"));
		steden.add(new Stad("Ons Dorp"));
		steden.add(new Stad("Leiden"));
		steden.add(new Stad("Groningen"));
		steden.add(new Stad("Zwolle"));
	}
	void toonBordspel() {
		for(Stad stad : steden) {
			System.out.println(stad.naam);
		}
	}
}

class Speler{
	
}
class Stad{
	String naam;
	Stad(String naam){this.naam = naam;}
}
class Straat{
	
}