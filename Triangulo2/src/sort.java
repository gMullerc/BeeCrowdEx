import java.util.*;
public class sort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float valor1 = scan.nextFloat();
		float valor2 = scan.nextFloat();
		float valor3 = scan.nextFloat();
		float maior;		

		float area = ((valor1 + valor2) * valor3) / 2;
		if(valor1 < valor2 + valor3) {
			System.out.println(String.format("Perimetro = %.1f",valor1 + valor2 + valor3));
		}else{
			System.out.println(String.format("Area = %.1f", area));
		}
		/*
		if(valor1 > valor2 && valor1 > valor3) {
			maior = valor1;
			if(maior < valor3 + valor2) {
				System.out.println(String.format("Perimetro = %.1f",valor1 + valor2 + valor3));
			}else{
				System.out.println(String.format("Area = %.1f", area));
			}
			
		}else if(valor2 > valor1 && valor2 > valor3) {
			maior = valor2;
			if(maior < valor1 + valor3) {
				System.out.println(String.format("Perimetro = %.1f",valor1 + valor2 + valor3));
			}else{
				System.out.println(String.format("Area = %.1f", area));
			}

		}else if(valor3 > valor2 && valor3 > valor1) {
			maior = valor3;
			if(maior < valor1 + valor2) {
				System.out.println(String.format("Perimetro = %.1f",valor1 + valor2 + valor3));
			}else{
				System.out.println(String.format("Area = %.1f", area));
			}

		}
*/
	scan.close();	
	}
	
}
