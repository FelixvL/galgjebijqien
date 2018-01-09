import java.util.Scanner;

public class Galgje {
	public static String teRadenWoord = "NogNietsIngevuld";
	public static void main(String args[]) {
		System.out.println("Welkom Bij Galgje");
		System.out.println("Het te raden woord: ");
		
		teRadenWoord = "Qien";
		
		System.out.println(teRadenWoord);
		Scanner sc = new Scanner(System.in);	    
	    for(int j=0; j<10 ; j++) {
		    String i = sc.nextLine();
		    checkenOfLetterBestaat(i);
	    }	    
	    System.out.println("Het spel is klaar");
	}
	public static void checkenOfLetterBestaat(String i2) {
		System.out.println("Uw ingevoerde letter is:"+ i2);
		if(teRadenWoord.contains(i2)) {
			System.out.println("ja, komt voor");
		}else {
			System.out.println("nee, komt niet voor");	    	
		}
	}
}



/*
	    
*/