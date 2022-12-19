import java.util.*;
public class horas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int tempoTotal = 24;
		
	
		if(a == b){
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}else if(a > b) {
			int duracao = tempoTotal - a + b; 
			System.out.println(String.format("O JOGO DUROU %d HORA(S)",duracao));
		}else {
			int duracao = b - a ; 
			System.out.println(String.format("O JOGO DUROU %d HORA(S)",duracao));

		}
		//se valor inicial for maior
		//total de horas do dia - tempo inicial + finalizado 
		//se valor incial menor
		//maior pelo menor 
	}
}
