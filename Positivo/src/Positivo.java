import java.util.*;
public class Positivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		for(int i = 0; i < 6; i++) {
		
			float joao[] = {1,2,3,4,5,6};
			joao[i] = sc.nextFloat();
			if(joao[i] > 0) {
				contador++;
			}
			
		}
		System.out.println(String.format("%d valores positivos",contador));
	}
	

}
