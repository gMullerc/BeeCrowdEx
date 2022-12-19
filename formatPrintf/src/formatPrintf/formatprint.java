package formatPrintf;
import java.util.Arrays;
import java.util.Scanner;
public class formatprint {

    public static void main(String[] args) {
    	
    	
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        int x=sc.nextInt();
        String jonas[] = new String[18];
        String jogar = "" + x ; 
        
        System.out.println(jogar.length());

        
        
        
        String espacos[] = {"     ", "      ","       ","        ","         ","          ","           ","            ","             ","              "};
        char TESTE[] = s1.toCharArray();

        if(jogar.length() == 2) {
        	
        	String retornar = "0"+ jogar; 
        	System.out.println(jogar);
        	
	        	if(TESTE.length == 1) {
	                System.out.printf("%s%s%s",s1, espacos[9], retornar);
	            }else if(TESTE.length == 2) {
	                System.out.printf("%s%s%s",s1, espacos[8], retornar);
	            }else if(TESTE.length == 3) {
	                System.out.printf("%s%s%s",s1, espacos[7], retornar);
	            }else if(TESTE.length == 4) {
	                System.out.printf("%s%s%s",s1, espacos[6], retornar);
	            }else if(TESTE.length == 5) {
	                System.out.printf("%s%s%s",s1, espacos[5], retornar);
	            }else if(TESTE.length == 6) {
	                System.out.printf("%s%s%s",s1, espacos[4], retornar);
	            }else if(TESTE.length == 7) {
	                System.out.printf("%s%s%s",s1, espacos[3], retornar);
	            }else if(TESTE.length == 8) {
	                System.out.printf("%s%s%s",s1, espacos[2], retornar);
	            }else if(TESTE.length == 9) {
	                System.out.printf("%s%s%s",s1, espacos[1], retornar);
	            }else if(TESTE.length == 10) {
	                System.out.printf("%s%s%s",s1, espacos[0], retornar);
	            }
	            
        	
        }else if(jogar.length() == 1){
        	
        	String retornar = "00"+jogar; 
        	System.out.println(retornar);
            if(TESTE.length == 1) {
                System.out.printf("%s%s%s",s1, espacos[9], retornar);
            }else if(TESTE.length == 2) {
                System.out.printf("%s%s%s",s1, espacos[8], retornar);
            }else if(TESTE.length == 3) {
                System.out.printf("%s%s%s",s1, espacos[7], retornar);
            }else if(TESTE.length == 4) {
                System.out.printf("%s%s%s",s1, espacos[6], retornar);
            }else if(TESTE.length == 5) {
                System.out.printf("%s%s%s",s1, espacos[5], retornar);
            }else if(TESTE.length == 6) {
                System.out.printf("%s%s%s",s1, espacos[4], retornar);
            }else if(TESTE.length == 7) {
                System.out.printf("%s%s%s",s1, espacos[3], retornar);
            }else if(TESTE.length == 8) {
                System.out.printf("%s%s%s",s1, espacos[2], retornar);
            }else if(TESTE.length == 9) {
                System.out.printf("%s%s%s",s1, espacos[1], retornar);
            }else if(TESTE.length == 10) {
                System.out.printf("%s%s%s",s1, espacos[0], retornar);
            }
            
        }else if(jogar.length() == 3){
        	
        	String retornar = jogar; 
        	System.out.println(retornar);
            if(TESTE.length == 1) {
                System.out.printf("%s%s%s",s1, espacos[9], retornar);
            }else if(TESTE.length == 2) {
                System.out.printf("%s%s%s",s1, espacos[8], retornar);
            }else if(TESTE.length == 3) {
                System.out.printf("%s%s%s",s1, espacos[7], retornar);
            }else if(TESTE.length == 4) {
                System.out.printf("%s%s%s",s1, espacos[6], retornar);
            }else if(TESTE.length == 5) {
                System.out.printf("%s%s%s",s1, espacos[5], retornar);
            }else if(TESTE.length == 6) {
                System.out.printf("%s%s%s",s1, espacos[4], retornar);
            }else if(TESTE.length == 7) {
                System.out.printf("%s%s%s",s1, espacos[3], retornar);
            }else if(TESTE.length == 8) {
                System.out.printf("%s%s%s",s1, espacos[2], retornar);
            }else if(TESTE.length == 9) {
                System.out.printf("%s%s%s",s1, espacos[1], retornar);
            }else if(TESTE.length == 10) {
                System.out.printf("%s%s%s",s1, espacos[0], retornar);
            }
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.println(TESTE.length);
        
  
        
        
        
       /* for(int z = 0; z < TESTE.length; z++) {
        	TESTE[z] = s1.charAt(z);

        	System.out.println(TESTE[z]);
        }
        */
        
        
        

    }
}

