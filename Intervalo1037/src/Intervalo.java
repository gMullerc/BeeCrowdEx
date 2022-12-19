import java.util.*;
public class Intervalo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double inserido = scan.nextDouble();
		
	    if (inserido >= 0 && inserido <= 25) {
	    	System.out.println("Intervalo [0,25]");
	    }else if(inserido > 25 && inserido <= 50) {
	    	System.out.println("Intervalo (25,50]");
	    }else if(inserido > 50 && inserido <= 75) {
	    	System.out.println("Intervalo (50,75]");
	    }else if(inserido > 75 && inserido <= 100) {
	    	System.out.println("Intervalo (75,100]");
	    }else {
	    	System.out.println("Fora de intervalo");
	    }
	}
}
