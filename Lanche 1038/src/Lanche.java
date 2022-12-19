import java.util.*;
public class Lanche {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Codigo = scan.nextInt();
		int Quantidade = scan.nextInt();
		switch(Codigo) {
		case 1:
			float valor =  (float)4.00 * Quantidade;
			System.out.println(String.format("Total: R$ %.2f", valor));
			break;
		case 2: 
			float valor1 =  (float)4.50 * Quantidade;
			System.out.println(String.format("Total: R$ %.2f", valor1));
			break;

		case 3: 
			float valor2 =  (float)5.00 * Quantidade;
			System.out.println(String.format("Total: R$ %.2f", valor2));
			break;
		case 4: 
			float valor3 =  (float)2.00 * Quantidade;
			System.out.println(String.format("Total: R$ %.2f", valor3));
			break;
		case 5: 
			float valor4 =  (float)1.50 * Quantidade;
			System.out.println(String.format("Total: R$ %.2f", valor4));
			break;			
		}
		
		
	}

}
