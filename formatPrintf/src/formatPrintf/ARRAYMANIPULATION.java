package formatPrintf;
import java.util.*;

public class ARRAYMANIPULATION {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        for(int i=0 ; i<3; i++){
            String s1 = scan.next();
            int x = scan.nextInt();
            HashSet<String> gui = new HashSet<String>();
            Integer auxiliar = x;
            //String guardar = jonas.toString();
            


            String[] array = new String[18];

            if (x > 100 && x <= 999) {
            	
            	String[] palavra = s1.split("");
            	System.out.println(palavra);
            	for(int w = 0; w < palavra.length; w++) {
            		array[w] = palavra[w]; 
            		System.out.println(array[w]);
            	}
            	
                //array[15] = "0";
            	int centena = auxiliar / 100; 
            	auxiliar = auxiliar % 100;
            	array[15] = ""+ centena;
            	int dezena = auxiliar / 10; 
            	auxiliar = auxiliar % 10;
            	array[16] = ""+dezena;
            	int unidade = auxiliar / 1; 
            	auxiliar = auxiliar % 1;
            	array[17] = ""+unidade;
            	

            	
            	for (int z = 0; z < s1.length(); z++) {

            		array = s1.split("");
                
            	}
            	
            	for(int o = 0; o < 18; o++ ) {
            		System.out.printf("%s", array[o]);	
            	}
            	

            } else if (x > 10 && x <= 99) {
            	
            	String[] palavra = s1.split("");
            	
            	for(int w = 0; w < palavra.length; w++) {
            		array[w] = palavra[w]; 
            	}
            	
                array[15] = "0";
                int dezena = auxiliar / 10; 
            	auxiliar = auxiliar % 10;
            	array[16] = ""+dezena;
            	int unidade = auxiliar / 1; 
            	auxiliar = auxiliar % 1;
            	array[17] = ""+unidade;
            	

            	
            	for(int z = 0; z < 18 ; z++) {
            		if(array[z] == null) {
            			array[z] = " ";
            			
            		}

            		
            	}
            	for(int o = 0; o < 18; o++ ) {
            		System.out.printf("%s", array[o]);	
            	}

            }else if (x > 1 && x <= 9) {
            	
            	String[] palavra = s1.split("");
            	
            	for(int w = 0; w < palavra.length; w++) {
            		array[w] = palavra[w]; 
            	}
          
                array[15] = "0";
                array[16] = "0";
            	int unidade = auxiliar / 1; 
            	auxiliar = auxiliar % 1;
            	array[17] = ""+unidade;
            	
          	
            	for(int z = 0; z < 18 ; z++) {
            		if(array[z] == null) {
            			array[z] = " ";
            			
            		}

            		
            	}
            	for(int o = 0; o < 18; o++ ) {
            		System.out.printf("%s", array[o]);	
            	}
        
        }
                      
    }
       
  }
}
    
