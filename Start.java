
public class Start {
	public static void main(String args[]) {
		System.out.println("Start");
		Douwe douwe = new Douwe(5);
		Douwe douwe2 = new Douwe("piet");
		new Start();
		
		Douwe douwe3 = new Douwe(new Start());
		optellen(14,16);
		optellen(32,42);
		optellen(12,1612);
//		optellen(13);
//		optellen(13, "254");
		Vrouw esther = new Vrouw(33, new Tas());
		esther.haarTas.merk = "Gucci";
		esther.bril = "";
		}
	static void optellen(int getal1, int getal2) {
		System.out.println(getal1 + getal2);
	}
}

class Vrouw{
	int leeftijd;
	Tas haarTas;
	String bril;
	Vrouw(int haarleeftijd, Tas deTasVanHaar){
		haarTas = deTasVanHaar;
	}
}
class Tas{
	String merk;
}




class Douwe{
	Start start;
	public static void main(String arts[]) {
	}
	public Douwe(int a){ // DIE
		this("hallo");
//		this(new Start());  // DIT KAN NIET OMDAT ER MAAR EEN andere constructor aanroep kan zijn
		System.out.println("");
	}
	public Douwe(String a) {  // DEZE	
	}
	public Douwe(Start a) {
		this.start = a;
	}  // HEMDAAR
	public Douwe(int a, int b) {}
}
