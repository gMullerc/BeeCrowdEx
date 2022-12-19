import java.io.IOException;
import java.util.Scanner; 

public class ConversaoDeTempo {
 
    public static void main(String[] args) throws IOException {
 
    	Scanner scan = new Scanner(System.in);
 
    	int valorEmSeg = scan.nextInt();
    	int auxiliar = valorEmSeg;
    	
    	//Horas
    	
    	
    	int valorEmHoras = auxiliar / 3600;
    	auxiliar = auxiliar % 3600;

    	//minutos 
    	int valorEmMinutos = auxiliar / 60;
    	auxiliar = auxiliar % 60;
    	
    	
    
    	System.out.println(String.format("%d:%d:%d", valorEmHoras, valorEmMinutos, auxiliar));
  
    	
    	
    	
    	scan.close();
    	
    }
 
}
