import java.util.*;
public class tempoEntre {

	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);
		System.out.print("Dia ");
		int diasIni = scan.nextInt();
		System.out.println();
		int horasIni = scan.nextInt(); System.out.print(":");
		int minutosIni = scan.nextInt();
		int segundosIni = scan.nextInt();
		System.out.print("Dia ");
		int diasFim = scan.nextInt();
		System.out.println();
		int horasFim = scan.nextInt();
		int minutosFim = scan.nextInt();
		int segundosFim = scan.nextInt();
		
		float tempoFinal = 0;
		float tempoFinal2 = 0;
		
		// começar tratando segundo para minutos e somando com os minutos
		tempoFinal = segundosIni / 60 + minutosIni;
		tempoFinal2 =  segundosFim / 60 + minutosFim;
		//tratar o resultado para horas e somando com as horas
		tempoFinal = tempoFinal / 60 + horasIni;
		tempoFinal2 = tempoFinal2 / 60 + horasFim;
		//tratar resultado para dias e somar com os mesmos;
		tempoFinal = tempoFinal / 24 + diasIni;
		tempoFinal2 = tempoFinal2 / 24 + diasFim;
		tempoFinal2 -= tempoFinal;
		// em seguida transformar o resultado em horas
		float horasTratadas = 0;
		float minutosTratados = 0;
		float segundosTratados = 0;
		
		float aux = 0;
		System.out.println(tempoFinal2);
		aux = tempoFinal2 / 24;
		System.out.println(aux);
		horasTratadas = aux / 24;
		aux = horasTratadas % 24;
		System.out.println(aux + "     2");
	
		minutosTratados = horasTratadas * 60;
		aux = minutosTratados * 60;
		
		segundosTratados = minutosTratados * 60;
		

	*/double aux = 38040 % 60;
	double TESTE = 38040 / 60;
	System.out.println(TESTE);
	System.out.println(aux);
	double teste2 = aux / 6;
	aux = TESTE % 6;
	

		System.out.println(teste2);
		System.out.println(aux);
	}

}
