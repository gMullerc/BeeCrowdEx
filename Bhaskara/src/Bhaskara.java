import java.io.IOException;
import java.util.Scanner;
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class Bhaskara {
 
    public static void main(String[] args) throws IOException {
 
	Scanner scan = new Scanner(System.in);
	
	double A = scan.nextDouble();
	double B = scan.nextDouble();
	double C = scan.nextDouble();
	double delta = (B *B) - (4 * A *C);
	
	if (delta > 0 && A > 0) {
		double R1 = ((-B) - Math.sqrt(delta)) / (2*A);

		double R2 = ((-B) + Math.sqrt(delta))  / (2*A);
	
		System.out.println(String.format( "R1 = %.5f",R2));
		System.out.println(String.format( "R2 = %.5f",R1));
	}else {
		System.out.println("Impossivel calcular");
	}
	
	

	}
	


 
}