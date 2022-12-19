import java.util.*;
public class imparparposneg1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int recebe[] =  {0,0,0,0,0};
		int contpar = 0;
		int contimp = 0;
		int contpos = 0;
		int contneg = 0;
		for (int i = 0; i<5;i++) {
			recebe[i] = sc.nextInt();
		}
		for (int i = 0; i<5;i++) {
			if(recebe[i] < 0) {
				contneg++;
			}else {
				contpos++;
			}
			if(recebe[i] % 2 == 0) {
				contpos++;
			}else {
				contimp++;
			}

			
		}

		System.out.println(String.format("%d valor(es) par(es)", contpar));
	}
}
