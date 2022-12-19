import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		Integer[] array = new Integer[val];
		if (val % 2 == 0) {
			for (int i = 2; i < val + 2; i += 2) {
				int quadrado = i * i;
				System.out.println(i + "^2" + " = " + quadrado);

			}
		} else if (val % 2 != 0) {
			val += 1;
			for (int i = 2; i < val + 2; i += 2) {
				int quadrado = i * i;
				System.out.println(i + "^2" + " = " + quadrado);

			}
		}

	}
}
