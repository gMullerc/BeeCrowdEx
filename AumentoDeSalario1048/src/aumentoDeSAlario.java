import java.util.*;

public class aumentoDeSAlario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float salario = sc.nextFloat();
		float novoSalario;
		if (salario > 0 && salario <= 400.00) {
			novoSalario = salario * (float) 0.15;
			salario += novoSalario;
			System.out.printf("Novo salario: %.2f\n", salario);

			System.out.printf("Reajuste ganho: %.2f\n", novoSalario);

			System.out.println("Em percentual: 15 %");
		} else if (salario > 400 && salario <= 800) {
			novoSalario = salario * (float) 0.12;
			salario += novoSalario;
			System.out.printf("Novo salario: %.2f\n", salario);

			System.out.printf("Reajuste ganho: %.2f\n", novoSalario);

			System.out.println("Em percentual: 12 %");
		} else if (salario > 800 && salario <= 1200) {
			novoSalario = salario * (float) 0.10;
			salario += novoSalario;
			System.out.printf("Novo salario: %.2f\n", salario);

			System.out.printf("Reajuste ganho: %.2f\n", novoSalario);

			System.out.println("Em percentual: 10 %");
		} else if (salario > 1200 && salario <= 2000) {
			novoSalario = salario * (float) 0.07;
			salario += novoSalario;
			System.out.printf("Novo salario: %.2f\n", salario);

			System.out.printf("Reajuste ganho: %.2f\n", novoSalario);

			System.out.println("Em percentual: 7 %");
		} else if (salario > 2000) {
			novoSalario = salario * (float) 0.04;
			salario += novoSalario;
			System.out.printf("Novo salario: %.2f\n", salario);

			System.out.printf("Reajuste ganho: %.2f\n", novoSalario);

			System.out.println("Em percentual: 4 %");
		}
		sc.close();
	}
}

/*
 * 0- 400 15% 400.01 - 800 12% 800.01 - 1200 10% 1200.01 - 2000 7% ACIMA DE 2000
 * 4%
 */