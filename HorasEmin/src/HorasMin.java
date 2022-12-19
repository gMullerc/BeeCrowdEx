import java.util.*;
public class HorasMin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horasIniciais = sc.nextInt();
		int minutosIniciais = sc.nextInt();
		
		int hf = sc.nextInt();
		int mf = sc.nextInt();
		

		
		if( hf > horasIniciais) {
			horasIniciais  = horasIniciais * 60;
			horasIniciais = horasIniciais + minutosIniciais;
			
			hf  = hf * 60;
			hf = hf + mf;
			int result =  hf - horasIniciais;
			int aux = result / 60;
			int min = result % 60;
			System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", aux, min));
		}else if(horasIniciais > hf) {
			horasIniciais  = horasIniciais * 60;
			horasIniciais = horasIniciais + minutosIniciais;
			
			hf  = hf * 60;
			hf = hf + mf;
			int result =  horasIniciais - hf;
			
			int aux = result / 60;
			int TESTE = 24 - aux;
		
			int min = result % 60;
			
			System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", TESTE , min));
		}else {
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		}
		
		
 	}
}
