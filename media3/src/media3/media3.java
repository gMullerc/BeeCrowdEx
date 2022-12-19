package media3;
import java.util.*;
public class media3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float N1 = scan.nextFloat();
		float N2 = scan.nextFloat();
		float N3 = scan.nextFloat();
		float N4 = scan.nextFloat();
		
		float P1 = 2;
		float P2 = 3; 
		float P3 = 4;
		float P4 = 1;
		
		float MP = ((N1 * P1) + (N2 * P2) + (N3 * P3) + (N4 * P4)) / (P1 + P2 + P3 + P4);
		
		
		if(MP >= 7) {
			System.out.println(String.format("Media: %.1f",MP));
			System.out.println("Aluno aprovado.");
		}else if(MP < 5) {
			System.out.println(String.format("Media: %.1f",MP));
			System.out.println("Aluno reprovado.");
		}else if(MP >= 5 && MP <7) {
			System.out.println(String.format("Media: %.1f",MP));
			System.out.println("Aluno em exame.");
			float notaExame = scan.nextFloat();
			System.out.println(String.format("Nota do exame: %.1f",notaExame));
			float notaFinal = (MP + notaExame) / 2;
			if(notaFinal > 5) {
				System.out.println("Aluno aprovado.");
				System.out.println(String.format("Media final: %.1f",notaFinal));
			}else {
				System.out.println("Aluno reprovado.");
				System.out.println(String.format("Mediafinal: %.1f",notaFinal));
			}
		}
		//Mp = [(N1 x P1) + (N2 x P2) + (N3 x P3) + ... (Nx x Px)] ÷ (P1 + P2 + P3 + ... Px).
	}
}
