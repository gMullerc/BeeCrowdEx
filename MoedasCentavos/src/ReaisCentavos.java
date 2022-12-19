import java.util.*;
public class ReaisCentavos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		double valor =  scan.nextDouble();
		double aux = valor;
		System.out.println("NOTAS:");	
		int NotasDeCem = (int)(aux) / 100;
		System.out.println(String.format("%d nota(s) de R$ 100.00", NotasDeCem));
		aux = aux % 100;
		
		int NotasDeCinquenta = (int)(aux) / 50;
		System.out.println(String.format("%d nota(s) de R$ 50.00", NotasDeCinquenta));
		aux = aux % 50;
		
		int NotasDeVinte = (int)(aux) / 20;
		aux = aux % 20;
		System.out.println(String.format("%d nota(s) de R$ 20.00", NotasDeVinte));
		
		int NotasDeDez = (int)(aux) / 10;
		aux = aux % 10;
		System.out.println(String.format("%d nota(s) de R$ 10.00", NotasDeDez));
		
		int NotasDeCinco = (int)(aux) / 5;
		aux = aux % 5;
		System.out.println(String.format("%d nota(s) de R$ 5.00", NotasDeCinco));
		
		int NotasDeDois = (int)(aux) / 2;
		aux = aux % 2;
		System.out.println(String.format("%d nota(s) de R$ 2.00", NotasDeDois));
		
		
		aux = aux * 100;
		System.out.println("MOEDAS:");	
		int MoedaDeCem = (int)(aux) / 100;
		System.out.println(MoedaDeCem + " moeda(s) de R$ 1.00");
		aux = aux % 100 + (float)0.0019531;
		
		int MoedaDeCinquenta = (int)(aux) / 50;
		System.out.println(MoedaDeCinquenta + " moeda(s) de R$ 0.50");
		aux = aux % 50;
		
		int MoedaDeVinteECinco = (int)(aux) / 25;
		System.out.println( MoedaDeVinteECinco +" moeda(s) de R$ 0.25");
		aux = aux % 25;
		
		int MoedaDeDez = (int)(aux) / 9;
		System.out.println(MoedaDeDez +" moeda(s) de R$ 0.10");
		aux = aux % 10;
		
		int MoedaDeCinco = (int)(aux) / 5;
		System.out.println(MoedaDeCinco + " moeda(s) de R$ 0.05");
		aux = aux % 5;
		
		int MoedaDeUm = (int)(aux) / 1;
		System.out.println(MoedaDeUm + " moeda(s) de R$ 0.01");
		aux = aux % 1;
	}
}
