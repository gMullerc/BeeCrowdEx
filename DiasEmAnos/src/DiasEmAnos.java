import java.io.IOException;
import java.util.Scanner; 

public class DiasEmAnos {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner scan = new Scanner(System.in);
    	
    	int diasVividos = scan.nextInt();
    	int auxiliar = diasVividos;
    
    	int horasEmMes = 30;
    	int horasEmAno = 365;
    	//anos vividos
    	
    	int anosVividos = auxiliar / 365;
    	auxiliar = auxiliar % 365;
    	
    	//meses vividos
    	
    	int mesesVividos = auxiliar / 30;
    	auxiliar = auxiliar % 30;
    	
    	System.out.println(String.format("%d ano(s)", anosVividos));
    	System.out.println(String.format("%d mes(es)", mesesVividos));    	
    	System.out.println(String.format("%d dia(s)", auxiliar));    	
    	
    	
    	scan.close();
    }
 
}