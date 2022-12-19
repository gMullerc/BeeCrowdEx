import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		float media = 0;
		for(int i = 0; i < 6; i++) {
		
			float joao[] = {1,2,3,4,5,6};
			joao[i] = sc.nextFloat();
			float jonas[] = {0,0,0,0,0,0};
			
			if(joao[i] > 0) {
				contador++;
				jonas[i] = joao[i];
				
			}
			media = media + jonas[i] ;
		}
		float result =media / contador;
		System.out.println(String.format("%d valores positivos", contador));
		System.out.println(String.format("%.1f",result));
		 
	}
	

}
