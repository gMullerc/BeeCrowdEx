import java.util.*;

public class Pontos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float v1 = scan.nextFloat();
		float v2 = scan.nextFloat();
		
		
		if(v1 == 0 && v2 == 0) {
			System.out.println("Origem");
		}else if(v1 > 0 && v2 == 0 || v1 < 0 && v2 == 0) {
			System.out.println("Eixo X");
		}else if(v2 > 0 && v1 == 0 || v2 < 0 && v1 == 0) {
			System.out.println("Eixo Y");
		}else if(v1 > 0 && v2 > 0 ) {
			System.out.println("Q1");
		}else if(v1 < 0 && v2 > 0 ) {
			System.out.println("Q2");
		}else if(v1 < 0 && v2 < 0 ) {
			System.out.println("Q3");
		}else if(v1 > 0  && v2 < 0 ) {
			System.out.println("Q4");
		}
		
	}

}
