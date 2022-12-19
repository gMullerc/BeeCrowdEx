package tipotriangulo;

import java.util.*;
public class tipos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float A = scan.nextFloat();
		float B = scan.nextFloat();
		float C = scan.nextFloat();
		
		if(A >= B + C ) {
			System.out.println("NAO FORMA TRIANGULO");
		}else if((A * A) == (B*B)+(C*C)) {
			System.out.println("TRIANGULO RETANGULO");
		}else if((A * A) > (B*B)+(C*C)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}else if((A * A) < (B*B)+(C*C)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}else if(A == B && A == C ) {
			System.out.println("TRIANGULO EQUILATERO");
		}else if(A == B && A != C || A == C && A != C) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		/*se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
	se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
	se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
	se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
	se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
	se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES*/
	}
}
