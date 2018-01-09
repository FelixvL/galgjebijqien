import java.util.Scanner;

public class Galgje {
	public static void main(String args[]) {
		System.out.println("Welkom Bij Galgje");
		System.out.println("Het te raden woord: ");
		
		String teRadenWoord = "Qien";
		
		System.out.println(teRadenWoord);
		Scanner sc = new Scanner(System.in);
	    String i = sc.nextLine();
	    System.out.println(i);
	    
	    if(teRadenWoord.contains(i)) {
	    	System.out.println("ja");
	    }else {
	    	System.out.println("nee");	    	
	    }	    
	    System.out.println("Het spel is klaar");
	}
}
