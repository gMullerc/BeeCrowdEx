import java.util.*;

public class Animal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String CaracteristicaUm = sc.next();
		String CaracteristicaDois = sc.next();
		String CaracteristicaTres = sc.next();

		switch (CaracteristicaUm) {
		// vertebrado
		case "vertebrado": {

			switch (CaracteristicaDois) {
			// ave
			case "ave": {
				switch (CaracteristicaTres) {
				case "carnivoro": {
					System.out.println("aguia");
					break;
				}
				case "onivoro": {
					System.out.println("pomba");
					break;
				}
				default:
					
				}
				break;
			}
			// mamifero
			case "mamifero": {

				switch (CaracteristicaTres) {
				case "onivoro": {
					System.out.println("homem");
					break;
				}
				case "herbivoro": {
					System.out.println("vaca");
					break;
				}
				default:
					
				}
				break;

				
			}
			default:

			}

			break;
		}

		// invertebrado
		case "invertebrado": {

			switch (CaracteristicaDois) {
			// inseto
			case "inseto": {
				switch (CaracteristicaTres) {
				case "hematofago": {
					System.out.println("pulga");
					break;
				}
				case "herbivoro": {
					System.out.println("lagarta");
					break;
				}
				default:
					System.out.println("Valor");
				}
				break;
			}

			//anelideo
			case "anelideo": {

				switch (CaracteristicaTres) {
				case "hematofago": {
					System.out.println("sanguessuga");
					break;
				}
				case "onivoro": {
					System.out.println("minhoca");
					break;
				}
				default:
					System.out.println("Valor");
				}
			
				break;

			
			}
			default:
				System.out.println("Valor");
			}
		}
			break;
		}

	}
}