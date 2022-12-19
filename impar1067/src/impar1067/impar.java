package impar1067;

import java.util.Scanner;
public class impar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
		
		if (valor % 2 == 0) {
			valor += 1;
			for(int i = 0; i < 6; i++) {
				System.out.println(valor);
				valor +=2;
				
			}
		}else if(valor % 2 != 0) {
			for(int i = 0; i < 6; i++) {
				System.out.println(valor);
				valor +=2;
			}
			}
		}
		 
	}
	


