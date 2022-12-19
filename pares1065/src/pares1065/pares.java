package pares1065;

import java.util.Scanner;
public class pares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		float media = 0;
		for(int i = 0; i < 5; i++) {
		
			float joao[] = {1,2,3,4,5};
			joao[i] = sc.nextFloat();
			float jonas[] = {0,0,0,0,0};
			
			if(joao[i] % 2 == 0) {
				contador++;
				jonas[i] = joao[i];
				
			}
			media = media + jonas[i] ;
		}
		float result =media / contador;
		System.out.println(String.format("%d valores pares", contador));
		
		 
	}
	

}
