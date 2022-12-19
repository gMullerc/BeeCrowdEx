import java.util.*;
public class sort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		int valor3 = scan.nextInt();
		int maior;
		int medio;
		int menor;
		
		if(valor1 < valor2 && valor1 < valor3) {
			menor = valor1;
			System.out.println(menor);
		}else if(valor2 < valor1 && valor2 < valor3) {
			menor = valor2;
			System.out.println(menor);
		}else if(valor3 < valor1 && valor3 < valor2) {
			menor = valor3;
			System.out.println(menor);
		}
		
		if(valor1 > valor2 && valor1 < valor3 || valor1 < valor2 && valor1 > valor3) {
			medio = valor1;
			System.out.println(medio);
		}else if(valor2 > valor1 && valor2 < valor3 || valor2 < valor1 && valor2 > valor3) {
			medio = valor2;
			System.out.println(medio);
		}else if(valor3 > valor1 && valor3 < valor2 || valor3 < valor1 && valor3 > valor2) {
			medio = valor3;
			System.out.println(medio);
		}
		

		if(valor1 > valor2 && valor1 > valor3) {
			maior = valor1;
			System.out.println(maior);
		}else if(valor2 > valor1 && valor2 > valor3) {
			maior = valor2;
			System.out.println(maior);

		}else if(valor3 > valor2 && valor3 > valor1) {
			maior = valor3;
			System.out.println(maior);

		}
		System.out.println();
		System.out.println(valor1);
		System.out.println(valor2);
		System.out.println(valor3);
		
		

	scan.close();	
	}
	
}
