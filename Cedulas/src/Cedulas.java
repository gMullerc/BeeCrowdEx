import java.io.IOException;
import java.util.Scanner;

public class Cedulas {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner scan = new Scanner(System.in);
    	int valorInserido = scan.nextInt();
    	int auxiliar = valorInserido;
    	System.out.println(auxiliar);
    	//nota de 100
    	
    	int notaDe100 = auxiliar / 100;
    	auxiliar = auxiliar % 100;
    	System.out.println(String.format("%d nota (s) de R$ 100,00", notaDe100));
    	
    	//nota de 50
    	
    	int notaDe50 = auxiliar / 50;
    	auxiliar = auxiliar % 50;
    	System.out.println(String.format("%d nota (s) de R$ 50,00", notaDe50));

    	
    	//nota de 20
    	
    	int notaDe20 = auxiliar / 20;
    	auxiliar = auxiliar % 20;
    	System.out.println(String.format("%d nota (s) de R$ 20,00", notaDe20));
    	
    	// nota de 10
    	
    	int notaDe10 = auxiliar / 10;
    	auxiliar = auxiliar % 10;
    	System.out.println(String.format("%d nota (s) de R$ 10,00", notaDe10));
    	// nota de 5
    	
    	int notaDe5 = auxiliar / 5;
    	auxiliar = auxiliar % 5;
    	System.out.println(String.format("%d nota (s) de R$ 5,00", notaDe5));
    	
    	// nota de 2 
    	
    	int notaDe2 = auxiliar / 2;
    	auxiliar = auxiliar % 2;
    	System.out.println(String.format("%d nota (s) de R$ 2,00", notaDe2));
    	
    	// nota de 1
    	
    	int notaDe1 = auxiliar / 1;
    	auxiliar = auxiliar % 1;
    	System.out.println(String.format("%d nota (s) de R$ 1,00", notaDe1));
    	

    	scan.close();
 
    }
 
}