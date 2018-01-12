import java.util.ArrayList;
import java.util.List;

class Demo{
	public static void main(String[] args) {
		Team ajax = new Team();
		ajax.teamNaam = "Ajax";
		ajax.spelers.add(new Speler("klaaseen", 24));
		ajax.spelers.add(new Speler("janssen", 2));
		ajax.spelers.add(new Speler("kluiver", 4));
		for(Speler speler:ajax.spelers) {
//			System.out.println(speler.voorstellen());// ivm void returntype
			speler.voorstellen();
		}
		Team sparta = new Team();
		sparta.teamNaam = "Sparta";
		sparta.spelers.add(new Speler("Ronyo", 3));
		sparta.spelers.add(new Speler("Damen", 5));
		sparta.spelers.add(new Speler("Onyu", 6));
		for(int i=0;i < sparta.spelers.size();i++) {
			sparta.spelers.get(i).voorstellen();
		}
		Game game = new Game();
		game.thuisPloeg = ajax;
		game.uitPloeg = sparta;
		game.spelen();
		
	}	
}
class Game{
	Team thuisPloeg;
	Team uitPloeg;
	void spelen() {
		System.out.println("De wedstrijd is gestart "+thuisPloeg.teamNaam+ " tegen "+uitPloeg.teamNaam);
	}
}
class Team{
	String teamNaam;
	List<Speler> spelers = new ArrayList();
}
class Speler{
	public Speler(String naam, int rugnummer) {
		this.naam = naam;
		this.rugnummer = rugnummer;
	}
	String naam;
	int rugnummer;
	void voorstellen(){
		System.out.println("Ik ben speler "+ naam +" met rugnummer: "+rugnummer);
	}
}