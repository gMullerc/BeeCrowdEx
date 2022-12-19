package valoresEntre1072;
import java.util.*;
public class valoresEntre {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidade = sc.nextInt();
		Integer[] array = new Integer[quantidade];
		int contpos = 0;
		int contneg = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
			if(array[i] >= 10 && array[i] <=20 ) {
				contpos++;
			}else {
				contneg++;
			}
		}
		System.out.println(contpos +" in");
		System.out.println(contneg+ " out");
		
	}
}
